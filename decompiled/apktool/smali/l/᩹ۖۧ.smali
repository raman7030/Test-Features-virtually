.class public final Ll/᩹ۖۧ;
.super Ljava/lang/Object;
.source "U8RL"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 121
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "OpusHead"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 121
    sput-object v0, Ll/᩹ۖۧ;->ۧ:[B

    return-void
.end method

.method public static ֫(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static ֫(Ll/ᩳ֨֫;II)Landroid/util/Pair;
    .locals 18

    move-object/from16 v0, p0

    .line 2476
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    :goto_0
    sub-int v2, v1, p1

    move/from16 v3, p2

    if-ge v2, v3, :cond_10

    .line 2478
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2479
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v2, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    const-string v7, "childAtomSize must be positive"

    .line 2480
    invoke-static {v7, v6}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2481
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    const v7, 0x73696e66

    if-ne v6, v7, :cond_f

    add-int/lit8 v6, v1, 0x8

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v10

    :goto_2
    sub-int v10, v6, v1

    const/4 v13, 0x4

    if-ge v10, v2, :cond_4

    .line 2504
    invoke-virtual {v0, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2505
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    .line 2506
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v14

    const v15, 0x66726d61

    if-ne v14, v15, :cond_1

    .line 2508
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_3

    :cond_1
    const v15, 0x7363686d

    if-ne v14, v15, :cond_2

    .line 2510
    invoke-virtual {v0, v13}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 510
    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v13, v12}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v12

    goto :goto_3

    :cond_2
    const v13, 0x73636869

    if-ne v14, v13, :cond_3

    move v8, v6

    move v11, v10

    :cond_3
    :goto_3
    add-int/2addr v6, v10

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    const-string v10, "cenc"

    .line 2520
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "cbc1"

    .line 2521
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "cens"

    .line 2522
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "cbcs"

    .line 2523
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    :cond_5
    if-eqz v9, :cond_6

    const/4 v10, 0x1

    goto :goto_4

    :cond_6
    const/4 v10, 0x0

    :goto_4
    const-string v14, "frma atom is mandatory"

    .line 2524
    invoke-static {v14, v10}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    if-eq v8, v7, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    const-string v10, "schi atom is mandatory"

    .line 2525
    invoke-static {v10, v7}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    add-int/lit8 v7, v8, 0x8

    :goto_6
    sub-int v10, v7, v8

    if-ge v10, v11, :cond_c

    .line 2543
    invoke-virtual {v0, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2544
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    .line 2545
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v14

    const v15, 0x74656e63

    if-ne v14, v15, :cond_b

    .line 2547
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 2548
    invoke-static {v7}, Ll/᩹ۖۧ;->֫(I)I

    move-result v7

    .line 2549
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    if-nez v7, :cond_8

    .line 2553
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    goto :goto_7

    .line 2555
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    and-int/lit16 v8, v7, 0xf0

    shr-int/2addr v8, v13

    and-int/lit8 v7, v7, 0xf

    move/from16 v16, v7

    move v15, v8

    .line 2559
    :goto_7
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    if-ne v7, v5, :cond_9

    const/4 v5, 0x1

    const/4 v11, 0x1

    goto :goto_8

    :cond_9
    const/4 v5, 0x0

    const/4 v11, 0x0

    .line 2560
    :goto_8
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v13

    const/16 v5, 0x10

    new-array v14, v5, [B

    .line 2562
    invoke-virtual {v0, v4, v5, v14}, Ll/ᩳ֨֫;->֫(II[B)V

    if-eqz v11, :cond_a

    if-nez v13, :cond_a

    .line 2565
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    .line 2566
    new-array v6, v5, [B

    .line 2567
    invoke-virtual {v0, v4, v5, v6}, Ll/ᩳ֨֫;->֫(II[B)V

    :cond_a
    move-object/from16 v17, v6

    .line 2569
    new-instance v6, Ll/᩻ۘۧ;

    move-object v10, v6

    invoke-direct/range {v10 .. v17}, Ll/᩻ۘۧ;-><init>(ZLjava/lang/String;I[BII[B)V

    goto :goto_9

    :cond_b
    add-int/2addr v7, v10

    goto :goto_6

    :cond_c
    :goto_9
    if-eqz v6, :cond_d

    const/4 v4, 0x1

    :cond_d
    const-string v5, "tenc atom is mandatory"

    .line 2531
    invoke-static {v5, v4}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2532
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-static {v9, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    :cond_e
    if-eqz v6, :cond_f

    return-object v6

    :cond_f
    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_10
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ֫(Ll/֨֨֫;Ll/۟᩷ۧ;JLl/᩵ᩴ֫;ZZLl/ܽܶܺ;)Ljava/util/ArrayList;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v11, p4

    .line 156
    iget-object v12, v0, Ll/֨֨֫;->ۧ:Ljava/util/ArrayList;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v14, 0x0

    .line 157
    :goto_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v14, v1, :cond_9c

    .line 158
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ll/֨֨֫;

    .line 159
    iget v1, v15, Ll/ܶ֨֫;->֫:I

    const v2, 0x7472616b

    if-eq v1, v2, :cond_0

    move-object/from16 v3, p1

    move-object/from16 v0, p7

    move-object/from16 v35, v12

    move-object v2, v13

    move/from16 v36, v14

    goto/16 :goto_5b

    :cond_0
    const v1, 0x6d766864

    .line 167
    invoke-virtual {v0, v1}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x6d646961

    .line 343
    invoke-virtual {v15, v2}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x68646c72    # 4.3148E24f

    .line 346
    invoke-virtual {v2, v3}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    iget-object v3, v3, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v4, 0x10

    .line 996
    invoke-virtual {v3, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 997
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const v4, 0x736f756e

    const/4 v6, -0x1

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    const/4 v10, 0x1

    goto :goto_2

    :cond_1
    const v4, 0x76696465

    if-ne v3, v4, :cond_2

    const/4 v3, 0x2

    const/4 v10, 0x2

    goto :goto_2

    :cond_2
    const v4, 0x74657874

    if-eq v3, v4, :cond_5

    const v4, 0x7362746c

    if-eq v3, v4, :cond_5

    const v4, 0x73756274

    if-eq v3, v4, :cond_5

    const v4, 0x636c6370

    if-eq v3, v4, :cond_5

    const v4, 0x73756270

    if-ne v3, v4, :cond_3

    goto :goto_1

    :cond_3
    const v4, 0x6d657461

    if-ne v3, v4, :cond_4

    const/4 v3, 0x5

    const/4 v10, 0x5

    goto :goto_2

    :cond_4
    const/4 v3, -0x1

    const/4 v10, -0x1

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v3, 0x3

    const/4 v10, 0x3

    :goto_2
    if-ne v10, v6, :cond_6

    const/4 v1, 0x0

    const v2, 0x6d646961

    move-object/from16 v0, p7

    move-object/from16 v35, v12

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object v7, v15

    goto/16 :goto_5a

    :cond_6
    const v4, 0x746b6864

    .line 351
    invoke-virtual {v15, v4}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    iget-object v4, v4, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v7, 0x8

    .line 924
    invoke-virtual {v4, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 925
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    .line 926
    invoke-static {v8}, Ll/᩹ۖۧ;->֫(I)I

    move-result v8

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    const/16 v7, 0x10

    .line 928
    :goto_3
    invoke-virtual {v4, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 929
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v17

    const/4 v7, 0x4

    .line 931
    invoke-virtual {v4, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 933
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    if-nez v8, :cond_8

    const/16 v16, 0x4

    const/4 v5, 0x4

    goto :goto_4

    :cond_8
    const/16 v16, 0x8

    const/16 v5, 0x8

    :goto_4
    const/16 v16, 0x0

    const/4 v3, 0x0

    :goto_5
    const-wide/16 v26, 0x0

    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v3, v5, :cond_c

    .line 936
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v16

    add-int v18, v9, v3

    aget-byte v7, v16, v18

    if-eq v7, v6, :cond_b

    if-nez v8, :cond_9

    .line 946
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v5

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v5

    :goto_6
    cmp-long v3, v5, v26

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    move-wide/from16 v22, v5

    goto :goto_8

    :cond_b
    add-int/lit8 v3, v3, 0x1

    const/4 v7, 0x4

    goto :goto_5

    .line 943
    :cond_c
    invoke-virtual {v4, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    :goto_7
    move-wide/from16 v22, v28

    :goto_8
    const/16 v3, 0xa

    .line 954
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 955
    invoke-virtual {v4}, Ll/ᩳ֨֫;->ۗ()I

    move-result v18

    const/4 v3, 0x4

    .line 956
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 957
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    .line 958
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v6

    .line 959
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 960
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    .line 961
    invoke-virtual {v4}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    const/high16 v8, -0x10000

    const/high16 v9, 0x10000

    if-nez v5, :cond_e

    if-ne v6, v9, :cond_e

    if-eq v3, v8, :cond_d

    if-ne v3, v9, :cond_e

    :cond_d
    if-nez v7, :cond_e

    const/16 v3, 0x10

    const/16 v5, 0x5a

    const/16 v19, 0x5a

    goto :goto_9

    :cond_e
    if-nez v5, :cond_10

    if-ne v6, v8, :cond_10

    if-eq v3, v9, :cond_f

    if-ne v3, v8, :cond_10

    :cond_f
    if-nez v7, :cond_10

    const/16 v3, 0x10

    const/16 v5, 0x10e

    const/16 v19, 0x10e

    goto :goto_9

    :cond_10
    if-eq v5, v8, :cond_11

    if-ne v5, v9, :cond_12

    :cond_11
    if-nez v6, :cond_12

    if-nez v3, :cond_12

    if-ne v7, v8, :cond_12

    const/16 v3, 0x10

    const/16 v5, 0xb4

    const/16 v19, 0xb4

    goto :goto_9

    :cond_12
    const/16 v3, 0x10

    const/4 v5, 0x0

    const/16 v19, 0x0

    .line 980
    :goto_9
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 982
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֡()S

    move-result v20

    const/4 v3, 0x2

    .line 983
    invoke-virtual {v4, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 984
    invoke-virtual {v4}, Ll/ᩳ֨֫;->֡()S

    move-result v21

    .line 986
    new-instance v30, Ll/ܶۖۧ;

    move-object/from16 v16, v30

    invoke-direct/range {v16 .. v23}, Ll/ܶۖۧ;-><init>(IIIIIJ)V

    cmp-long v3, p2, v28

    if-nez v3, :cond_13

    .line 353
    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ۧ(Ll/ܶۖۧ;)J

    move-result-wide v3

    move-wide/from16 v16, v3

    goto :goto_a

    :cond_13
    move-wide/from16 v16, p2

    .line 355
    :goto_a
    iget-object v1, v1, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    invoke-static {v1}, Ll/᩹ۖۧ;->ܽ(Ll/ᩳ֨֫;)Ll/᩹֨֫;

    move-result-object v1

    iget-wide v8, v1, Ll/᩹֨֫;->ܽ:J

    cmp-long v1, v16, v28

    if-nez v1, :cond_14

    move-wide/from16 v31, v28

    goto :goto_b

    .line 360
    :cond_14
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v22, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v18, 0xf4240

    move-wide/from16 v20, v8

    invoke-static/range {v16 .. v22}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    move-wide/from16 v31, v3

    :goto_b
    const v1, 0x6d696e66

    .line 364
    invoke-virtual {v2, v1}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x7374626c

    .line 365
    invoke-virtual {v1, v3}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x6d646864

    .line 367
    invoke-virtual {v2, v3}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    iget-object v2, v2, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v3, 0x8

    .line 1026
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1027
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    .line 1028
    invoke-static {v3}, Ll/᩹ۖۧ;->֫(I)I

    move-result v3

    if-nez v3, :cond_15

    const/16 v4, 0x8

    goto :goto_c

    :cond_15
    const/16 v4, 0x10

    .line 1029
    :goto_c
    invoke-virtual {v2, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1030
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v4

    .line 1032
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    if-nez v3, :cond_16

    const/4 v7, 0x4

    goto :goto_d

    :cond_16
    const/16 v7, 0x8

    :goto_d
    const/16 v16, 0x0

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v7, :cond_1a

    .line 1035
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v16

    add-int v17, v6, v0

    move/from16 v18, v6

    aget-byte v6, v16, v17

    move-wide/from16 v33, v8

    const/4 v8, -0x1

    if-eq v6, v8, :cond_19

    if-nez v3, :cond_17

    .line 1045
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v6

    goto :goto_f

    :cond_17
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v6

    :goto_f
    move-wide/from16 v16, v6

    cmp-long v0, v16, v26

    if-nez v0, :cond_18

    goto :goto_10

    .line 1051
    :cond_18
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v22, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v18, 0xf4240

    move-wide/from16 v20, v4

    invoke-static/range {v16 .. v22}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v28

    goto :goto_10

    :cond_19
    add-int/lit8 v0, v0, 0x1

    move/from16 v6, v18

    move-wide/from16 v8, v33

    goto :goto_e

    :cond_1a
    move-wide/from16 v33, v8

    .line 1042
    invoke-virtual {v2, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    :goto_10
    move-wide/from16 v20, v28

    .line 1055
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    shr-int/lit8 v2, v0, 0xa

    and-int/lit8 v2, v2, 0x1f

    add-int/lit8 v2, v2, 0x60

    int-to-char v2, v2

    shr-int/lit8 v3, v0, 0x5

    and-int/lit8 v3, v3, 0x1f

    add-int/lit8 v3, v3, 0x60

    int-to-char v3, v3

    and-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x60

    int-to-char v0, v0

    const/4 v6, 0x3

    new-array v7, v6, [C

    const/4 v8, 0x0

    aput-char v2, v7, v8

    const/4 v2, 0x1

    aput-char v3, v7, v2

    const/4 v2, 0x2

    aput-char v0, v7, v2

    const/4 v0, 0x0

    :goto_11
    const/16 v2, 0x61

    if-ge v0, v6, :cond_1d

    .line 1067
    aget-char v3, v7, v0

    if-lt v3, v2, :cond_1c

    const/16 v2, 0x7a

    if-le v3, v2, :cond_1b

    goto :goto_12

    :cond_1b
    add-int/lit8 v0, v0, 0x1

    const/4 v6, 0x3

    goto :goto_11

    :cond_1c
    :goto_12
    const/4 v0, 0x0

    goto :goto_13

    .line 1072
    :cond_1d
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V

    :goto_13
    move-object/from16 v17, v0

    .line 1056
    new-instance v0, Ll/ᩴۖۧ;

    move-object/from16 v16, v0

    move-wide/from16 v18, v4

    invoke-direct/range {v16 .. v21}, Ll/ᩴۖۧ;-><init>(Ljava/lang/String;JJ)V

    const v2, 0x73747364

    .line 368
    invoke-virtual {v1, v2}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v1

    if-eqz v1, :cond_9b

    .line 373
    iget-object v9, v1, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    invoke-static {v0}, Ll/ᩴۖۧ;->֫(Ll/ᩴۖۧ;)Ljava/lang/String;

    move-result-object v8

    const/16 v1, 0xc

    .line 1092
    invoke-virtual {v9, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1093
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 1094
    new-instance v6, Ll/ۚۖۧ;

    invoke-direct {v6, v7}, Ll/ۚۖۧ;-><init>(I)V

    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 1095
    :goto_14
    iget-object v1, v6, Ll/ۚۖۧ;->ܿ:[Ll/᩻ۘۧ;

    if-ge v5, v7, :cond_8f

    .line 1096
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v4

    .line 1097
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-lez v3, :cond_1e

    const/4 v2, 0x1

    goto :goto_15

    :cond_1e
    const/4 v2, 0x0

    :goto_15
    const/16 v16, 0x61

    move/from16 v17, v7

    const-string v7, "childAtomSize must be positive"

    .line 1098
    invoke-static {v7, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1099
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    move/from16 v18, v10

    const v10, 0x61766331

    if-eq v2, v10, :cond_8e

    const v10, 0x61766333

    if-eq v2, v10, :cond_8e

    const v10, 0x656e6376

    if-eq v2, v10, :cond_8e

    const v10, 0x6d317620

    if-eq v2, v10, :cond_8e

    const v10, 0x6d703476

    if-eq v2, v10, :cond_8e

    const v10, 0x68766331

    if-eq v2, v10, :cond_8e

    const v10, 0x68657631

    if-eq v2, v10, :cond_8e

    const v10, 0x73323633

    if-eq v2, v10, :cond_8e

    const v10, 0x48323633

    if-eq v2, v10, :cond_8e

    const v10, 0x68323633

    if-eq v2, v10, :cond_8e

    const v10, 0x76703038

    if-eq v2, v10, :cond_8e

    const v10, 0x76703039

    if-eq v2, v10, :cond_8e

    const v10, 0x61763031

    if-eq v2, v10, :cond_8e

    const v10, 0x64766176

    if-eq v2, v10, :cond_8e

    const v10, 0x64766131

    if-eq v2, v10, :cond_8e

    const v10, 0x64766865

    if-eq v2, v10, :cond_8e

    const v10, 0x64766831

    if-eq v2, v10, :cond_8e

    const v10, 0x61707631

    if-ne v2, v10, :cond_1f

    goto/16 :goto_50

    :cond_1f
    const v10, 0x656e6361

    move-object/from16 v35, v12

    const v12, 0x6d703461

    if-eq v2, v12, :cond_30

    if-eq v2, v10, :cond_30

    const v10, 0x61632d33

    if-eq v2, v10, :cond_30

    const v10, 0x65632d33

    if-eq v2, v10, :cond_30

    const v10, 0x61632d34

    if-eq v2, v10, :cond_30

    const v10, 0x6d6c7061

    if-eq v2, v10, :cond_30

    const v10, 0x64747363

    if-eq v2, v10, :cond_30

    const v10, 0x64747365

    if-eq v2, v10, :cond_30

    const v10, 0x64747368

    if-eq v2, v10, :cond_30

    const v10, 0x6474736c

    if-eq v2, v10, :cond_30

    const v10, 0x64747378

    if-eq v2, v10, :cond_30

    const v10, 0x73616d72

    if-eq v2, v10, :cond_30

    const v10, 0x73617762

    if-eq v2, v10, :cond_30

    const v10, 0x6c70636d

    if-eq v2, v10, :cond_30

    const v10, 0x736f7774

    if-eq v2, v10, :cond_30

    const v10, 0x74776f73

    if-eq v2, v10, :cond_30

    const v10, 0x2e6d7032

    if-eq v2, v10, :cond_30

    const v10, 0x2e6d7033

    if-eq v2, v10, :cond_30

    const v10, 0x6d686131

    if-eq v2, v10, :cond_30

    const v10, 0x6d686d31

    if-eq v2, v10, :cond_30

    const v10, 0x616c6163

    if-eq v2, v10, :cond_30

    const v10, 0x616c6177

    if-eq v2, v10, :cond_30

    const v10, 0x756c6177

    if-eq v2, v10, :cond_30

    const v10, 0x4f707573

    if-eq v2, v10, :cond_30

    const v10, 0x664c6143

    if-eq v2, v10, :cond_30

    const v10, 0x69616d66

    if-eq v2, v10, :cond_30

    const v10, 0x6970636d

    if-eq v2, v10, :cond_30

    const v10, 0x6670636d

    if-ne v2, v10, :cond_20

    goto/16 :goto_1f

    :cond_20
    const v1, 0x73747070

    const v7, 0x77767474

    const v10, 0x74783367

    const v12, 0x54544d4c

    if-eq v2, v12, :cond_24

    if-eq v2, v10, :cond_24

    if-eq v2, v7, :cond_24

    if-eq v2, v1, :cond_24

    const v1, 0x63363038

    if-eq v2, v1, :cond_24

    const v1, 0x6d703473

    if-ne v2, v1, :cond_21

    goto :goto_17

    :cond_21
    const v1, 0x6d657474

    if-ne v2, v1, :cond_22

    .line 1177
    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v7

    add-int/lit8 v10, v4, 0x10

    .line 1915
    invoke-virtual {v9, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    if-ne v2, v1, :cond_23

    .line 1917
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    .line 1918
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 1920
    new-instance v2, Ll/֨ᩴ֫;

    invoke-direct {v2}, Ll/֨ᩴ֫;-><init>()V

    invoke-virtual {v2, v7}, Ll/֨ᩴ֫;->ܺ(I)V

    invoke-virtual {v2, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    iput-object v1, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    goto :goto_16

    :cond_22
    const v1, 0x63616d6d

    if-ne v2, v1, :cond_23

    .line 1179
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v2

    .line 1181
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܺ(I)V

    const-string v2, "application/x-camera-motion"

    .line 1182
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 1183
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    iput-object v1, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :cond_23
    :goto_16
    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    goto/16 :goto_1e

    :cond_24
    :goto_17
    add-int/lit8 v1, v4, 0x10

    .line 1198
    invoke-virtual {v9, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    const-string v1, "application/ttml+xml"

    const-wide v19, 0x7fffffffffffffffL

    if-ne v2, v12, :cond_25

    goto :goto_18

    :cond_25
    if-ne v2, v10, :cond_26

    add-int/lit8 v1, v3, -0x10

    .line 1210
    new-array v2, v1, [B

    const/4 v7, 0x0

    .line 1211
    invoke-virtual {v9, v7, v1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1212
    invoke-static {v2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    const-string v2, "application/x-quicktime-tx3g"

    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    goto/16 :goto_1c

    :cond_26
    if-ne v2, v7, :cond_27

    const-string v1, "application/x-mp4-vtt"

    goto :goto_18

    :cond_27
    const v7, 0x73747070

    if-ne v2, v7, :cond_28

    move-wide/from16 v19, v26

    goto :goto_18

    :cond_28
    const v1, 0x63363038

    if-ne v2, v1, :cond_29

    const/4 v1, 0x1

    .line 1221
    iput v1, v6, Ll/ۚۖۧ;->ᩳ:I

    const-string v1, "application/x-mp4-cea-608"

    :goto_18
    const/4 v2, 0x0

    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    move-wide/from16 v12, v19

    goto/16 :goto_1d

    :cond_29
    const v1, 0x6d703473

    if-ne v2, v1, :cond_2f

    .line 1223
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    const/4 v2, 0x4

    .line 1224
    invoke-virtual {v9, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1225
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    const v7, 0x65736473

    if-ne v2, v7, :cond_2d

    .line 1227
    invoke-static {v1, v9}, Ll/᩹ۖۧ;->֫(ILl/ᩳ֨֫;)Ll/ۖۖۧ;

    move-result-object v1

    .line 1228
    invoke-static {v1}, Ll/ۖۖۧ;->ۧ(Ll/ۖۖۧ;)[B

    move-result-object v2

    if-eqz v2, :cond_23

    invoke-static {v1}, Ll/ۖۖۧ;->ۧ(Ll/ۖۖۧ;)[B

    move-result-object v2

    array-length v2, v2

    const/16 v7, 0x40

    if-eq v2, v7, :cond_2a

    goto/16 :goto_16

    .line 1232
    :cond_2a
    invoke-static {v1}, Ll/ۖۖۧ;->ۧ(Ll/ۖۖۧ;)[B

    move-result-object v1

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ܳ(Ll/ܶۖۧ;)I

    move-result v2

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ܽ(Ll/ܶۖۧ;)I

    move-result v10

    .line 1257
    array-length v12, v1

    if-ne v12, v7, :cond_2b

    const/4 v7, 0x1

    goto :goto_19

    :cond_2b
    const/4 v7, 0x0

    :goto_19
    invoke-static {v7}, Ll/᩺֡֫;->ۧ(Z)V

    .line 1258
    new-instance v7, Ljava/util/ArrayList;

    const/16 v12, 0x10

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    move/from16 v36, v14

    .line 1259
    :goto_1a
    array-length v14, v1

    add-int/lit8 v14, v14, -0x3

    if-ge v12, v14, :cond_2c

    .line 1260
    aget-byte v14, v1, v12

    add-int/lit8 v16, v12, 0x1

    move-object/from16 v37, v13

    aget-byte v13, v1, v16

    add-int/lit8 v16, v12, 0x2

    move-object/from16 v21, v0

    aget-byte v0, v1, v16

    add-int/lit8 v16, v12, 0x3

    move-object/from16 v38, v15

    aget-byte v15, v1, v16

    invoke-static {v14, v13, v0, v15}, Ll/۬᩺ܺ;->֫(BBBB)I

    move-result v0

    shr-int/lit8 v13, v0, 0x10

    and-int/lit16 v13, v13, 0xff

    shr-int/lit8 v14, v0, 0x8

    and-int/lit16 v14, v14, 0xff

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v14, v14, -0x80

    const/16 v15, 0x36fb

    move-object/from16 v16, v1

    const/16 v1, 0x2710

    .line 1277
    invoke-static {v14, v15, v1, v13}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v1

    add-int/lit8 v0, v0, -0x80

    mul-int/lit16 v15, v0, 0xd7f

    move/from16 v22, v5

    const/16 v5, 0x2710

    .line 1278
    div-int/2addr v15, v5

    sub-int v15, v13, v15

    mul-int/lit16 v14, v14, 0x1c01

    div-int/2addr v14, v5

    sub-int/2addr v15, v14

    const/16 v14, 0x457e

    .line 1279
    invoke-static {v0, v14, v5, v13}, Ll/᩻ᩳᩴ;->֫(IIII)I

    move-result v0

    const/16 v5, 0xff

    const/4 v13, 0x0

    .line 1281
    invoke-static {v1, v13, v5}, Ll/ۘ֨֫;->֫(III)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    .line 1282
    invoke-static {v15, v13, v5}, Ll/ۘ֨֫;->֫(III)I

    move-result v14

    shl-int/lit8 v14, v14, 0x8

    or-int/2addr v1, v14

    .line 1283
    invoke-static {v0, v13, v5}, Ll/ۘ֨֫;->֫(III)I

    move-result v0

    or-int/2addr v0, v1

    .line 1261
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v13

    const-string v0, "%06x"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x4

    move-object/from16 v1, v16

    move-object/from16 v0, v21

    move/from16 v5, v22

    move-object/from16 v13, v37

    move-object/from16 v15, v38

    goto :goto_1a

    :cond_2c
    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move-object/from16 v38, v15

    const-string v0, "x"

    const-string v1, "\npalette: "

    const-string v5, "size: "

    .line 0
    invoke-static {v5, v2, v0, v1, v10}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    .line 1263
    invoke-static {v1}, Ll/ۜܶܺ;->֫(Ljava/lang/String;)Ll/ۜܶܺ;

    move-result-object v1

    invoke-virtual {v1, v7}, Ll/ۜܶܺ;->֫(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1233
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1076
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 1233
    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    const-string v1, "application/vobsub"

    goto :goto_1b

    :cond_2d
    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_1b
    move-object v2, v1

    move-object v1, v0

    :goto_1c
    move-wide/from16 v12, v19

    move-object/from16 v45, v2

    move-object v2, v1

    move-object/from16 v1, v45

    :goto_1d
    if-eqz v1, :cond_2e

    .line 1241
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v5

    .line 1243
    invoke-virtual {v0, v5}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 1244
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 1245
    invoke-virtual {v0, v8}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 1246
    invoke-virtual {v0, v12, v13}, Ll/֨ᩴ֫;->֫(J)V

    .line 1247
    invoke-virtual {v0, v2}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 1248
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    iput-object v0, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :cond_2e
    :goto_1e
    move/from16 v29, v3

    move/from16 v28, v4

    goto/16 :goto_4f

    .line 1237
    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_30
    :goto_1f
    move-object/from16 v21, v0

    move/from16 v22, v5

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    .line 1157
    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v0

    add-int/lit8 v5, v4, 0x10

    .line 1978
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v5, 0x6

    if-eqz p6, :cond_31

    .line 1982
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ۗ()I

    move-result v10

    .line 1983
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_20

    :cond_31
    const/16 v5, 0x8

    .line 1985
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v10, 0x0

    :goto_20
    const/16 v5, 0x20

    if-eqz v10, :cond_3d

    const/4 v12, 0x1

    if-ne v10, v12, :cond_32

    goto/16 :goto_24

    :cond_32
    const/4 v12, 0x2

    if-ne v10, v12, :cond_2e

    const/16 v10, 0x10

    .line 2009
    invoke-virtual {v9, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 500
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v12

    .line 2011
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v10, v12

    .line 2012
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩹()I

    move-result v12

    const/4 v13, 0x4

    .line 2014
    invoke-virtual {v9, v13}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2015
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩹()I

    move-result v13

    .line 2016
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩹()I

    move-result v14

    and-int/lit8 v15, v14, 0x1

    if-eqz v15, :cond_33

    const/4 v15, 0x1

    goto :goto_21

    :cond_33
    const/4 v15, 0x0

    :goto_21
    and-int/lit8 v14, v14, 0x2

    if-eqz v14, :cond_34

    const/4 v14, 0x1

    goto :goto_22

    :cond_34
    const/4 v14, 0x0

    :goto_22
    if-nez v15, :cond_3b

    const/16 v15, 0x8

    if-ne v13, v15, :cond_35

    const/4 v5, 0x3

    goto :goto_23

    :cond_35
    const/16 v15, 0x10

    if-ne v13, v15, :cond_37

    if-eqz v14, :cond_36

    const/high16 v5, 0x10000000

    goto :goto_23

    :cond_36
    const/4 v5, 0x2

    goto :goto_23

    :cond_37
    const/16 v15, 0x18

    if-ne v13, v15, :cond_39

    if-eqz v14, :cond_38

    const/high16 v5, 0x50000000

    goto :goto_23

    :cond_38
    const/16 v5, 0x15

    goto :goto_23

    :cond_39
    if-ne v13, v5, :cond_3c

    if-eqz v14, :cond_3a

    const/high16 v5, 0x60000000

    goto :goto_23

    :cond_3a
    const/16 v5, 0x16

    goto :goto_23

    :cond_3b
    if-ne v13, v5, :cond_3c

    const/4 v5, 0x4

    goto :goto_23

    :cond_3c
    const/4 v5, -0x1

    :goto_23
    const/16 v13, 0x8

    .line 2032
    invoke-virtual {v9, v13}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v13, 0x0

    goto :goto_25

    .line 1997
    :cond_3d
    :goto_24
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ۗ()I

    move-result v12

    const/4 v5, 0x6

    .line 1998
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2000
    invoke-virtual {v9}, Ll/ᩳ֨֫;->۠()I

    move-result v5

    .line 2002
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v13

    add-int/lit8 v13, v13, -0x4

    invoke-virtual {v9, v13}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2003
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    const/4 v14, 0x1

    if-ne v10, v14, :cond_3e

    const/16 v10, 0x10

    .line 2006
    invoke-virtual {v9, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_3e
    const/4 v10, -0x1

    move v10, v5

    const/4 v5, -0x1

    :goto_25
    const v14, 0x69616d66

    if-ne v2, v14, :cond_3f

    const/4 v12, -0x1

    const/4 v10, -0x1

    goto :goto_26

    :cond_3f
    const v14, 0x73616d72

    if-ne v2, v14, :cond_40

    const/4 v12, 0x1

    const/16 v10, 0x1f40

    goto :goto_26

    :cond_40
    const v14, 0x73617762

    if-ne v2, v14, :cond_41

    const/4 v12, 0x1

    const/16 v10, 0x3e80

    .line 2054
    :cond_41
    :goto_26
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    const v15, 0x656e6361

    if-ne v2, v15, :cond_44

    .line 2058
    invoke-static {v9, v4, v3}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;II)Landroid/util/Pair;

    move-result-object v15

    if-eqz v15, :cond_43

    .line 2060
    iget-object v2, v15, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v11, :cond_42

    const/16 v19, 0x0

    move-object/from16 v45, v19

    move/from16 v19, v2

    move-object/from16 v2, v45

    goto :goto_27

    :cond_42
    move/from16 v19, v2

    .line 2064
    iget-object v2, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ll/᩻ۘۧ;

    iget-object v2, v2, Ll/᩻ۘۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ll/᩵ᩴ֫;->֫(Ljava/lang/String;)Ll/᩵ᩴ֫;

    move-result-object v2

    .line 2065
    :goto_27
    iget-object v15, v15, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v15, Ll/᩻ۘۧ;

    aput-object v15, v1, v22

    move-object v1, v2

    move/from16 v2, v19

    goto :goto_28

    :cond_43
    move-object v1, v11

    .line 2067
    :goto_28
    invoke-virtual {v9, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_29

    :cond_44
    move-object v1, v11

    :goto_29
    const-string v15, "audio/mhm1"

    const-string v19, "audio/raw"

    move/from16 v20, v10

    const v10, 0x61632d33

    if-ne v2, v10, :cond_45

    const-string v10, "audio/ac3"

    goto/16 :goto_2e

    :cond_45
    const v10, 0x65632d33

    if-ne v2, v10, :cond_46

    const-string v10, "audio/eac3"

    goto/16 :goto_2e

    :cond_46
    const v10, 0x61632d34

    if-ne v2, v10, :cond_47

    const-string v10, "audio/ac4"

    goto/16 :goto_2e

    :cond_47
    const v10, 0x64747363

    if-ne v2, v10, :cond_48

    const-string v10, "audio/vnd.dts"

    goto/16 :goto_2e

    :cond_48
    const v10, 0x64747368

    if-eq v2, v10, :cond_5d

    const v10, 0x6474736c

    if-ne v2, v10, :cond_49

    goto/16 :goto_2d

    :cond_49
    const v10, 0x64747365

    if-ne v2, v10, :cond_4a

    const-string v10, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_2e

    :cond_4a
    const v10, 0x64747378

    if-ne v2, v10, :cond_4b

    const-string v10, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_2e

    :cond_4b
    const v10, 0x73616d72

    if-ne v2, v10, :cond_4c

    const-string v10, "audio/3gpp"

    goto/16 :goto_2e

    :cond_4c
    const v10, 0x73617762

    if-ne v2, v10, :cond_4d

    const-string v10, "audio/amr-wb"

    goto/16 :goto_2e

    :cond_4d
    const v10, 0x736f7774

    if-ne v2, v10, :cond_4e

    goto :goto_2a

    :cond_4e
    const v10, 0x74776f73

    if-ne v2, v10, :cond_4f

    const/high16 v5, 0x10000000

    goto :goto_2b

    :cond_4f
    const v10, 0x6c70636d

    if-ne v2, v10, :cond_51

    const/4 v10, -0x1

    if-ne v5, v10, :cond_50

    :goto_2a
    const/4 v5, 0x2

    :cond_50
    :goto_2b
    move-object/from16 v10, v19

    goto/16 :goto_2e

    :cond_51
    const v10, 0x2e6d7032

    if-eq v2, v10, :cond_5c

    const v10, 0x2e6d7033

    if-ne v2, v10, :cond_52

    goto :goto_2c

    :cond_52
    const v10, 0x6d686131

    if-ne v2, v10, :cond_53

    const-string v10, "audio/mha1"

    goto :goto_2e

    :cond_53
    const v10, 0x6d686d31

    if-ne v2, v10, :cond_54

    move-object v10, v15

    goto :goto_2e

    :cond_54
    const v10, 0x616c6163

    if-ne v2, v10, :cond_55

    const-string v10, "audio/alac"

    goto :goto_2e

    :cond_55
    const v10, 0x616c6177

    if-ne v2, v10, :cond_56

    const-string v10, "audio/g711-alaw"

    goto :goto_2e

    :cond_56
    const v10, 0x756c6177

    if-ne v2, v10, :cond_57

    const-string v10, "audio/g711-mlaw"

    goto :goto_2e

    :cond_57
    const v10, 0x4f707573

    if-ne v2, v10, :cond_58

    const-string v10, "audio/opus"

    goto :goto_2e

    :cond_58
    const v10, 0x664c6143

    if-ne v2, v10, :cond_59

    const-string v10, "audio/flac"

    goto :goto_2e

    :cond_59
    const v10, 0x6d6c7061

    if-ne v2, v10, :cond_5a

    const-string v10, "audio/true-hd"

    goto :goto_2e

    :cond_5a
    const v10, 0x69616d66

    if-ne v2, v10, :cond_5b

    const-string v10, "audio/iamf"

    goto :goto_2e

    :cond_5b
    const/4 v10, 0x0

    goto :goto_2e

    :cond_5c
    :goto_2c
    const-string v10, "audio/mpeg"

    goto :goto_2e

    :cond_5d
    :goto_2d
    const-string v10, "audio/vnd.dts.hd"

    :goto_2e
    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move v11, v14

    move-object/from16 v39, v28

    move v14, v12

    move/from16 v45, v20

    move/from16 v20, v5

    move-object/from16 v5, v23

    move/from16 v23, v45

    :goto_2f
    sub-int v12, v11, v4

    if-ge v12, v3, :cond_8a

    .line 2129
    invoke-virtual {v9, v11}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2130
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v12

    if-lez v12, :cond_5e

    const/16 v28, 0x1

    move/from16 v29, v3

    const/4 v3, 0x1

    goto :goto_30

    :cond_5e
    const/16 v28, 0x0

    move/from16 v29, v3

    const/4 v3, 0x0

    .line 2131
    :goto_30
    invoke-static {v7, v3}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2132
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    move/from16 v28, v4

    const v4, 0x6d686143

    if-ne v3, v4, :cond_61

    add-int/lit8 v3, v11, 0x8

    .line 2137
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v3, 0x1

    .line 2138
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2139
    invoke-virtual {v9}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    .line 2140
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2142
    invoke-static {v10, v15}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_5f

    .line 2143
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v39, 0x0

    aput-object v4, v3, v39

    const-string v4, "mhm1.%02X"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_31

    .line 2144
    :cond_5f
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    const/16 v39, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v3, v4, v39

    const-string v3, "mha1.%02X"

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_31
    move-object/from16 v39, v3

    .line 2145
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    .line 2146
    new-array v4, v3, [B

    move-object/from16 v40, v15

    const/4 v15, 0x0

    .line 2147
    invoke-virtual {v9, v15, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    if-nez v5, :cond_60

    .line 2150
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_32

    .line 2154
    :cond_60
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v4, v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_32

    :cond_61
    move-object/from16 v40, v15

    const v4, 0x6d686150

    if-ne v3, v4, :cond_64

    add-int/lit8 v3, v11, 0x8

    .line 2159
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2160
    invoke-virtual {v9}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    if-lez v3, :cond_63

    .line 2162
    new-array v4, v3, [B

    const/4 v15, 0x0

    .line 2163
    invoke-virtual {v9, v15, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    if-nez v5, :cond_62

    .line 2165
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_32

    .line 2170
    :cond_62
    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3, v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    :cond_63
    :goto_32
    move-object/from16 v44, v7

    move/from16 v43, v13

    move/from16 v4, v23

    :goto_33
    move/from16 v23, v2

    goto/16 :goto_4d

    :cond_64
    const v4, 0x65736473

    if-eq v3, v4, :cond_7d

    if-eqz p6, :cond_65

    const v4, 0x77617665

    if-ne v3, v4, :cond_65

    const v4, 0x65736473

    goto/16 :goto_45

    :cond_65
    const v4, 0x62747274

    if-ne v3, v4, :cond_66

    add-int/lit8 v3, v11, 0x8

    .line 2412
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v3, 0x4

    .line 2414
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2415
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v3

    move/from16 v41, v14

    .line 2416
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v14

    move-object/from16 v42, v5

    .line 2418
    new-instance v5, Ll/ۡۖۧ;

    invoke-direct {v5, v14, v15, v3, v4}, Ll/ۡۖۧ;-><init>(JJ)V

    move-object/from16 v25, v5

    move-object/from16 v5, v42

    goto/16 :goto_36

    :cond_66
    move-object/from16 v42, v5

    move/from16 v41, v14

    const v4, 0x64616333

    if-ne v3, v4, :cond_67

    add-int/lit8 v3, v11, 0x8

    .line 2204
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2206
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3, v8, v1}, Ll/ۛۜۧ;->֫(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    goto :goto_34

    :cond_67
    const v4, 0x64656333

    if-ne v3, v4, :cond_68

    add-int/lit8 v3, v11, 0x8

    .line 2208
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2210
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3, v8, v1}, Ll/ۛۜۧ;->ۧ(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    goto :goto_34

    :cond_68
    const v4, 0x64616334

    if-ne v3, v4, :cond_6a

    add-int/lit8 v3, v11, 0x8

    .line 2212
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2214
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3, v8, v1}, Ll/ܰۜۧ;->֫(Ll/ᩳ֨֫;Ljava/lang/String;Ljava/lang/String;Ll/᩵ᩴ֫;)Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :goto_34
    move-object/from16 v44, v7

    move/from16 v43, v13

    :cond_69
    move/from16 v5, v23

    move/from16 v4, v41

    goto/16 :goto_43

    :cond_6a
    const v4, 0x646d6c70

    if-ne v3, v4, :cond_6c

    if-lez v13, :cond_6b

    const/4 v14, 0x2

    move/from16 v23, v13

    move-object/from16 v5, v42

    goto :goto_37

    .line 2217
    :cond_6b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_6c
    const v4, 0x64647473

    if-eq v3, v4, :cond_7c

    const v4, 0x75647473

    if-ne v3, v4, :cond_6d

    goto/16 :goto_42

    :cond_6d
    const v4, 0x644f7073

    if-ne v3, v4, :cond_6e

    add-int/lit8 v3, v12, -0x8

    .line 2240
    sget-object v4, Ll/᩹ۖۧ;->ۧ:[B

    array-length v5, v4

    add-int/2addr v5, v3

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    add-int/lit8 v14, v11, 0x8

    .line 2241
    invoke-virtual {v9, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2242
    array-length v4, v4

    invoke-virtual {v9, v4, v3, v5}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2243
    invoke-static {v5}, Ll/ۘ۫ۡ;->֫([B)Ljava/util/ArrayList;

    move-result-object v3

    :goto_35
    move-object v5, v3

    goto :goto_36

    :cond_6e
    const v4, 0x64664c61

    if-ne v3, v4, :cond_6f

    add-int/lit8 v3, v12, -0xc

    add-int/lit8 v4, v12, -0x8

    .line 2246
    new-array v4, v4, [B

    const/16 v5, 0x66

    const/4 v14, 0x0

    .line 2247
    aput-byte v5, v4, v14

    const/16 v5, 0x4c

    const/4 v14, 0x1

    .line 2248
    aput-byte v5, v4, v14

    const/4 v5, 0x2

    .line 2249
    aput-byte v16, v4, v5

    const/16 v5, 0x43

    const/4 v14, 0x3

    .line 2250
    aput-byte v5, v4, v14

    add-int/lit8 v5, v11, 0xc

    .line 2251
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v5, 0x4

    .line 2252
    invoke-virtual {v9, v5, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2253
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    goto :goto_35

    :goto_36
    move/from16 v14, v41

    :goto_37
    move-object/from16 v42, v5

    move-object/from16 v44, v7

    move/from16 v43, v13

    :goto_38
    move/from16 v5, v20

    goto/16 :goto_44

    :cond_6f
    const v4, 0x616c6163

    if-ne v3, v4, :cond_70

    add-int/lit8 v3, v12, -0xc

    .line 2256
    new-array v4, v3, [B

    add-int/lit8 v5, v11, 0xc

    .line 2257
    invoke-virtual {v9, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v5, 0x0

    .line 2258
    invoke-virtual {v9, v5, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2262
    sget v3, Ll/ᩳۚ֫;->֫:I

    .line 82
    new-instance v3, Ll/ᩳ֨֫;

    invoke-direct {v3, v4}, Ll/ᩳ֨֫;-><init>([B)V

    const/16 v5, 0x9

    .line 83
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 84
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    const/16 v14, 0x14

    .line 85
    invoke-virtual {v3, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 86
    invoke-virtual {v3}, Ll/ᩳ֨֫;->᩹()I

    move-result v3

    .line 87
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    .line 2263
    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 2264
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 2265
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v4

    move/from16 v23, v2

    move v14, v3

    move-object/from16 v44, v7

    move/from16 v43, v13

    move/from16 v45, v5

    move-object v5, v4

    move/from16 v4, v45

    goto/16 :goto_4d

    :cond_70
    const v4, 0x69616362

    if-ne v3, v4, :cond_77

    add-int/lit8 v3, v11, 0x9

    .line 2267
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2269
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩶()I

    move-result v3

    .line 2270
    new-array v4, v3, [B

    const/4 v5, 0x0

    .line 2271
    invoke-virtual {v9, v5, v3, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2272
    sget v3, Ll/ᩳۚ֫;->֫:I

    .line 109
    new-instance v3, Ll/ᩳ֨֫;

    invoke-direct {v3, v4}, Ll/ᩳ֨֫;-><init>([B)V

    .line 700
    :goto_39
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_71

    goto :goto_39

    :cond_71
    const/4 v5, 0x4

    .line 112
    invoke-virtual {v3, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 113
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    .line 114
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    const/4 v15, 0x1

    .line 119
    invoke-virtual {v3, v15}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 700
    :goto_3a
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v15

    and-int/lit16 v15, v15, 0x80

    if-eqz v15, :cond_72

    goto :goto_3a

    :cond_72
    :goto_3b
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v15

    and-int/lit16 v15, v15, 0x80

    if-eqz v15, :cond_73

    goto :goto_3b

    .line 510
    :cond_73
    sget-object v15, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move/from16 v43, v13

    const/4 v13, 0x4

    invoke-virtual {v3, v13, v15}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v13

    const-string v15, "mp4a"

    .line 126
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_76

    .line 700
    :goto_3c
    invoke-virtual {v3}, Ll/ᩳ֨֫;->֨()I

    move-result v15

    and-int/lit16 v15, v15, 0x80

    if-eqz v15, :cond_74

    goto :goto_3c

    :cond_74
    const/4 v15, 0x2

    .line 128
    invoke-virtual {v3, v15}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 130
    new-instance v15, Ll/ܽ֨֫;

    invoke-direct {v15}, Ll/ܽ֨֫;-><init>()V

    .line 131
    invoke-virtual {v15, v3}, Ll/ܽ֨֫;->֫(Ll/ᩳ֨֫;)V

    const/4 v3, 0x5

    .line 132
    invoke-virtual {v15, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    move-object/from16 v44, v7

    const/16 v7, 0x1f

    if-ne v3, v7, :cond_75

    const/4 v3, 0x6

    .line 135
    invoke-virtual {v15, v3}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x20

    .line 137
    :cond_75
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ".40."

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_3d

    :cond_76
    move-object/from16 v44, v7

    .line 139
    :goto_3d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v3, v7, v14

    const/4 v3, 0x1

    aput-object v5, v7, v3

    const/4 v3, 0x2

    aput-object v13, v7, v3

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "iamf.%03X.%03X.%s"

    invoke-static {v3, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v39

    .line 2273
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    move-object/from16 v42, v5

    move/from16 v5, v20

    goto :goto_41

    :cond_77
    move-object/from16 v44, v7

    move/from16 v43, v13

    const v4, 0x70636d43

    if-ne v3, v4, :cond_69

    add-int/lit8 v3, v11, 0xc

    .line 2276
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2277
    invoke-virtual {v9}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_78

    .line 2278
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_3e

    :cond_78
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 2279
    :goto_3e
    invoke-virtual {v9}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    const v5, 0x6970636d

    if-ne v2, v5, :cond_79

    .line 2281
    invoke-static {v4, v3}, Ll/ۘ֨֫;->֫(ILjava/nio/ByteOrder;)I

    move-result v3

    const/4 v4, -0x1

    move v5, v3

    goto :goto_40

    :cond_79
    const v5, 0x6670636d

    const/16 v7, 0x20

    if-ne v2, v5, :cond_7a

    if-ne v4, v7, :cond_7a

    .line 2282
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2284
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7a

    const/4 v5, 0x4

    goto :goto_3f

    :cond_7a
    move/from16 v5, v20

    :goto_3f
    const/4 v4, -0x1

    :goto_40
    if-eq v5, v4, :cond_7b

    move-object/from16 v10, v19

    :cond_7b
    :goto_41
    move/from16 v14, v41

    goto :goto_44

    :cond_7c
    :goto_42
    move-object/from16 v44, v7

    move/from16 v43, v13

    .line 2227
    new-instance v3, Ll/֨ᩴ֫;

    invoke-direct {v3}, Ll/֨ᩴ֫;-><init>()V

    .line 2229
    invoke-virtual {v3, v0}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 2230
    invoke-virtual {v3, v10}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    move/from16 v4, v41

    .line 2231
    invoke-virtual {v3, v4}, Ll/֨ᩴ֫;->ᩳ(I)V

    move/from16 v5, v23

    .line 2232
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->۠(I)V

    .line 2233
    invoke-virtual {v3, v1}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    .line 2234
    invoke-virtual {v3, v8}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 2235
    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :goto_43
    move v14, v4

    move/from16 v23, v5

    goto/16 :goto_38

    :goto_44
    move/from16 v20, v5

    move/from16 v4, v23

    move-object/from16 v5, v42

    goto/16 :goto_33

    :cond_7d
    :goto_45
    move-object/from16 v42, v5

    move-object/from16 v44, v7

    move/from16 v43, v13

    move v4, v14

    move/from16 v5, v23

    const v7, 0x65736473

    if-ne v3, v7, :cond_7e

    move v3, v11

    move-object/from16 v14, v44

    goto :goto_49

    .line 2338
    :cond_7e
    invoke-virtual {v9}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    if-lt v3, v11, :cond_7f

    const/4 v7, 0x1

    goto :goto_46

    :cond_7f
    const/4 v7, 0x0

    :goto_46
    const/4 v13, 0x0

    .line 2339
    invoke-static {v13, v7}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    :goto_47
    sub-int v7, v3, v11

    if-ge v7, v12, :cond_82

    .line 2341
    invoke-virtual {v9, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2342
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    if-lez v7, :cond_80

    const/4 v13, 0x1

    goto :goto_48

    :cond_80
    const/4 v13, 0x0

    :goto_48
    move-object/from16 v14, v44

    .line 2343
    invoke-static {v14, v13}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2344
    invoke-virtual {v9}, Ll/ᩳ֨֫;->᩻()I

    move-result v13

    const v15, 0x65736473

    if-ne v13, v15, :cond_81

    goto :goto_49

    :cond_81
    add-int/2addr v3, v7

    move-object/from16 v44, v14

    goto :goto_47

    :cond_82
    move-object/from16 v14, v44

    const/4 v3, -0x1

    :goto_49
    const/4 v7, -0x1

    if-eq v3, v7, :cond_89

    .line 2180
    invoke-static {v3, v9}, Ll/᩹ۖۧ;->֫(ILl/ᩳ֨֫;)Ll/ۖۖۧ;

    move-result-object v24

    .line 2181
    invoke-static/range {v24 .. v24}, Ll/ۖۖۧ;->ܽ(Ll/ۖۖۧ;)Ljava/lang/String;

    move-result-object v10

    .line 2182
    invoke-static/range {v24 .. v24}, Ll/ۖۖۧ;->ۧ(Ll/ۖۖۧ;)[B

    move-result-object v3

    if-eqz v3, :cond_89

    const-string v7, "audio/vorbis"

    .line 2184
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_87

    .line 196
    new-instance v7, Ll/ᩳ֨֫;

    invoke-direct {v7, v3}, Ll/ᩳ֨֫;-><init>([B)V

    const/4 v13, 0x1

    .line 197
    invoke-virtual {v7, v13}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v13, 0x0

    .line 200
    :goto_4a
    invoke-virtual {v7}, Ll/ᩳ֨֫;->֫()I

    move-result v15

    if-lez v15, :cond_83

    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܳ()I

    move-result v15

    move/from16 v23, v2

    const/16 v2, 0xff

    if-ne v15, v2, :cond_84

    add-int/lit16 v13, v13, 0xff

    const/4 v2, 0x1

    .line 202
    invoke-virtual {v7, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    move/from16 v2, v23

    goto :goto_4a

    :cond_83
    move/from16 v23, v2

    .line 204
    :cond_84
    invoke-virtual {v7}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    add-int/2addr v2, v13

    const/4 v13, 0x0

    .line 207
    :goto_4b
    invoke-virtual {v7}, Ll/ᩳ֨֫;->֫()I

    move-result v15

    if-lez v15, :cond_85

    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܳ()I

    move-result v15

    move-object/from16 v44, v14

    const/16 v14, 0xff

    if-ne v15, v14, :cond_86

    add-int/lit16 v13, v13, 0xff

    const/4 v14, 0x1

    .line 209
    invoke-virtual {v7, v14}, Ll/ᩳ֨֫;->ܳ(I)V

    move-object/from16 v14, v44

    goto :goto_4b

    :cond_85
    move-object/from16 v44, v14

    .line 211
    :cond_86
    invoke-virtual {v7}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    add-int/2addr v14, v13

    .line 214
    new-array v13, v2, [B

    .line 215
    invoke-virtual {v7}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v7

    const/4 v15, 0x0

    .line 216
    invoke-static {v3, v7, v13, v15, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v7, v2

    add-int/2addr v7, v14

    .line 227
    array-length v2, v3

    sub-int/2addr v2, v7

    .line 228
    new-array v14, v2, [B

    .line 229
    invoke-static {v3, v7, v14, v15, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 235
    invoke-static {v13, v14}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v2

    move v14, v4

    move v4, v5

    move-object v5, v2

    goto :goto_4d

    :cond_87
    move/from16 v23, v2

    move-object/from16 v44, v14

    const/4 v2, 0x0

    const-string v7, "audio/mp4a-latm"

    .line 2188
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_88

    .line 195
    new-instance v4, Ll/ܽ֨֫;

    .line 48
    array-length v5, v3

    invoke-direct {v4, v3, v5}, Ll/ܽ֨֫;-><init>([BI)V

    .line 195
    invoke-static {v4, v2}, Ll/۫ۜۧ;->֫(Ll/ܽ֨֫;Z)Ll/۬ۜۧ;

    move-result-object v2

    .line 2193
    iget v4, v2, Ll/۬ۜۧ;->ܽ:I

    .line 2194
    iget v14, v2, Ll/۬ۜۧ;->֫:I

    .line 2195
    iget-object v2, v2, Ll/۬ۜۧ;->ۧ:Ljava/lang/String;

    move-object/from16 v39, v2

    goto :goto_4c

    :cond_88
    move v14, v4

    move v4, v5

    .line 2197
    :goto_4c
    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v5

    goto :goto_4d

    :cond_89
    move/from16 v23, v2

    move-object/from16 v44, v14

    move v14, v4

    move v4, v5

    move-object/from16 v5, v42

    :goto_4d
    add-int/2addr v11, v12

    move/from16 v2, v23

    move/from16 v3, v29

    move-object/from16 v15, v40

    move/from16 v13, v43

    move-object/from16 v7, v44

    move/from16 v23, v4

    move/from16 v4, v28

    goto/16 :goto_2f

    :cond_8a
    move/from16 v29, v3

    move/from16 v28, v4

    move-object/from16 v42, v5

    move v4, v14

    move/from16 v5, v23

    .line 2295
    iget-object v2, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    if-nez v2, :cond_8d

    if-eqz v10, :cond_8d

    .line 2296
    new-instance v2, Ll/֨ᩴ֫;

    invoke-direct {v2}, Ll/֨ᩴ֫;-><init>()V

    .line 2298
    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 2299
    invoke-virtual {v2, v10}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    move-object/from16 v0, v39

    .line 2300
    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    .line 2301
    invoke-virtual {v2, v4}, Ll/֨ᩴ֫;->ᩳ(I)V

    .line 2302
    invoke-virtual {v2, v5}, Ll/֨ᩴ֫;->۠(I)V

    move/from16 v5, v20

    .line 2303
    invoke-virtual {v2, v5}, Ll/֨ᩴ֫;->᩵(I)V

    move-object/from16 v5, v42

    .line 2304
    invoke-virtual {v2, v5}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 2305
    invoke-virtual {v2, v1}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    .line 2306
    invoke-virtual {v2, v8}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    if-eqz v24, :cond_8b

    .line 2310
    invoke-static/range {v24 .. v24}, Ll/ۖۖۧ;->֫(Ll/ۖۖۧ;)J

    move-result-wide v0

    .line 2311
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-static/range {v24 .. v24}, Ll/ۖۖۧ;->ᩳ(Ll/ۖۖۧ;)J

    move-result-wide v0

    .line 2312
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->֡(I)V

    goto :goto_4e

    :cond_8b
    if-eqz v25, :cond_8c

    .line 2314
    invoke-static/range {v25 .. v25}, Ll/ۡۖۧ;->֫(Ll/ۡۖۧ;)J

    move-result-wide v0

    .line 2315
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-static/range {v25 .. v25}, Ll/ۡۖۧ;->ۧ(Ll/ۡۖۧ;)J

    move-result-wide v0

    .line 2316
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/֨ᩴ֫;->֡(I)V

    .line 2319
    :cond_8c
    :goto_4e
    invoke-virtual {v2}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    iput-object v0, v6, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :cond_8d
    :goto_4f
    move-object v13, v6

    move-object v15, v8

    move-object v14, v9

    move/from16 v12, v22

    move/from16 v11, v28

    move/from16 v0, v29

    move-wide/from16 v22, v33

    goto :goto_51

    :cond_8e
    :goto_50
    move-object/from16 v21, v0

    move/from16 v29, v3

    move/from16 v28, v4

    move/from16 v22, v5

    move-object/from16 v35, v12

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    .line 1118
    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v5

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ܿ(Ll/ܶۖۧ;)I

    move-result v7

    move-object v1, v9

    move/from16 v0, v29

    move/from16 v3, v28

    move/from16 v11, v28

    move v4, v0

    move/from16 v12, v22

    move-object v13, v6

    move-object v6, v8

    move/from16 v14, v17

    move-object v15, v8

    move-wide/from16 v22, v33

    move-object/from16 v8, p4

    move-object v10, v9

    move-object v9, v13

    move-object v14, v10

    move v10, v12

    invoke-static/range {v1 .. v10}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;IIIILjava/lang/String;ILl/᩵ᩴ֫;Ll/ۚۖۧ;I)V

    :goto_51
    add-int v4, v11, v0

    .line 1185
    invoke-virtual {v14, v4}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int/lit8 v5, v12, 0x1

    move-object/from16 v11, p4

    move-object v6, v13

    move-object v9, v14

    move-object v8, v15

    move/from16 v7, v17

    move/from16 v10, v18

    move-object/from16 v0, v21

    move-wide/from16 v33, v22

    move-object/from16 v12, v35

    move/from16 v14, v36

    move-object/from16 v13, v37

    move-object/from16 v15, v38

    goto/16 :goto_14

    :cond_8f
    move-object/from16 v21, v0

    move/from16 v18, v10

    move-object/from16 v35, v12

    move-object/from16 v37, v13

    move/from16 v36, v14

    move-object/from16 v38, v15

    move-wide/from16 v22, v33

    move-object v13, v6

    const/4 v0, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x8

    const v4, 0x6d646961

    const/4 v5, 0x1

    if-nez p5, :cond_95

    const v6, 0x65647473

    move-object/from16 v7, v38

    .line 377
    invoke-virtual {v7, v6}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v6

    if-eqz v6, :cond_96

    const v8, 0x656c7374

    .line 1934
    invoke-virtual {v6, v8}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    if-nez v6, :cond_90

    move-object v2, v0

    goto :goto_55

    .line 1938
    :cond_90
    iget-object v6, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    .line 1939
    invoke-virtual {v6, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1940
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    .line 1941
    invoke-static {v3}, Ll/᩹ۖۧ;->֫(I)I

    move-result v3

    .line 1942
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩹()I

    move-result v8

    .line 1943
    new-array v9, v8, [J

    .line 1944
    new-array v10, v8, [J

    const/4 v11, 0x0

    :goto_52
    if-ge v11, v8, :cond_94

    if-ne v3, v5, :cond_91

    .line 1947
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v14

    goto :goto_53

    :cond_91
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v14

    :goto_53
    aput-wide v14, v9, v11

    if-ne v3, v5, :cond_92

    .line 1948
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v14

    goto :goto_54

    :cond_92
    invoke-virtual {v6}, Ll/ᩳ֨֫;->᩻()I

    move-result v12

    int-to-long v14, v12

    :goto_54
    aput-wide v14, v10, v11

    .line 1949
    invoke-virtual {v6}, Ll/ᩳ֨֫;->֡()S

    move-result v12

    if-ne v12, v5, :cond_93

    .line 1954
    invoke-virtual {v6, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_52

    .line 1952
    :cond_93
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1956
    :cond_94
    invoke-static {v9, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    :goto_55
    if-eqz v2, :cond_96

    .line 381
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, [J

    .line 382
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [J

    goto :goto_56

    :cond_95
    move-object/from16 v7, v38

    :cond_96
    move-object v2, v0

    move-object v3, v2

    .line 386
    :goto_56
    iget-object v6, v13, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    if-nez v6, :cond_97

    :goto_57
    move-object v1, v0

    const v2, 0x6d646961

    move-object/from16 v0, p7

    goto :goto_5a

    .line 390
    :cond_97
    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->֫(Ll/ܶۖۧ;)I

    move-result v0

    if-eqz v0, :cond_99

    .line 391
    new-instance v0, Ll/ۚ֨֫;

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->֫(Ll/ܶۖۧ;)I

    move-result v6

    invoke-direct {v0, v6}, Ll/ۚ֨֫;-><init>(I)V

    .line 393
    iget-object v6, v13, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    .line 396
    invoke-virtual {v6}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v6

    .line 398
    iget-object v8, v13, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    iget-object v8, v8, Ll/۠ᩴ֫;->ۤ:Ll/᩻᩵֫;

    if-eqz v8, :cond_98

    new-array v5, v5, [Ll/ܳ᩵֫;

    const/4 v9, 0x0

    aput-object v0, v5, v9

    .line 399
    invoke-virtual {v8, v5}, Ll/᩻᩵֫;->֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;

    move-result-object v0

    goto :goto_58

    :cond_98
    const/4 v8, 0x0

    .line 400
    new-instance v9, Ll/᩻᩵֫;

    new-array v5, v5, [Ll/ܳ᩵֫;

    aput-object v0, v5, v8

    invoke-direct {v9, v5}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    move-object v0, v9

    .line 397
    :goto_58
    invoke-virtual {v6, v0}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 401
    invoke-virtual {v6}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    goto :goto_59

    .line 403
    :cond_99
    iget-object v0, v13, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    :goto_59
    move-object/from16 v27, v0

    .line 405
    new-instance v0, Ll/ܳۘۧ;

    move-object/from16 v16, v0

    invoke-static/range {v30 .. v30}, Ll/ܶۖۧ;->ᩳ(Ll/ܶۖۧ;)I

    move-result v17

    invoke-static/range {v21 .. v21}, Ll/ᩴۖۧ;->ܽ(Ll/ᩴۖۧ;)J

    move-result-wide v19

    invoke-static/range {v21 .. v21}, Ll/ᩴۖۧ;->ۧ(Ll/ᩴۖۧ;)J

    move-result-wide v25

    iget v5, v13, Ll/ۚۖۧ;->ᩳ:I

    move/from16 v28, v5

    iget v5, v13, Ll/ۚۖۧ;->ܽ:I

    move/from16 v30, v5

    iget-boolean v5, v13, Ll/ۚۖۧ;->ۧ:Z

    move/from16 v33, v5

    move-wide/from16 v21, v22

    move-wide/from16 v23, v31

    move-object/from16 v29, v1

    move-object/from16 v31, v3

    move-object/from16 v32, v2

    invoke-direct/range {v16 .. v33}, Ll/ܳۘۧ;-><init>(IIJJJJLl/۠ᩴ֫;I[Ll/᩻ۘۧ;I[J[JZ)V

    goto :goto_57

    .line 164
    :goto_5a
    invoke-interface {v0, v1}, Ll/ܽܶܺ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۘۧ;

    if-nez v1, :cond_9a

    move-object/from16 v3, p1

    move-object/from16 v2, v37

    goto :goto_5b

    .line 178
    :cond_9a
    invoke-virtual {v7, v2}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x6d696e66

    .line 179
    invoke-virtual {v2, v3}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v3, 0x7374626c

    .line 180
    invoke-virtual {v2, v3}, Ll/֨֨֫;->ۧ(I)Ll/֨֨֫;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p1

    .line 181
    invoke-static {v1, v2, v3}, Ll/᩹ۖۧ;->֫(Ll/ܳۘۧ;Ll/֨֨֫;Ll/۟᩷ۧ;)Ll/᩷ۘۧ;

    move-result-object v1

    move-object/from16 v2, v37

    .line 182
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5b
    add-int/lit8 v14, v36, 0x1

    move-object/from16 v0, p0

    move-object/from16 v11, p4

    move-object v13, v2

    move-object/from16 v12, v35

    goto/16 :goto_0

    :cond_9b
    const/4 v0, 0x0

    const-string v1, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 370
    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0

    :cond_9c
    move-object v2, v13

    return-object v2
.end method

.method public static ֫(ILl/ᩳ֨֫;)Ll/ۖۖۧ;
    .locals 10

    add-int/lit8 p0, p0, 0xc

    .line 2355
    invoke-virtual {p1, p0}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 p0, 0x1

    .line 2357
    invoke-virtual {p1, p0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2358
    invoke-static {p1}, Ll/᩹ۖۧ;->ۧ(Ll/ᩳ֨֫;)I

    const/4 v0, 0x2

    .line 2359
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2361
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_0

    .line 2363
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_0
    and-int/lit8 v2, v1, 0x40

    if-eqz v2, :cond_1

    .line 2366
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_1
    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_2

    .line 2369
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2373
    :cond_2
    invoke-virtual {p1, p0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2374
    invoke-static {p1}, Ll/᩹ۖۧ;->ۧ(Ll/ᩳ֨֫;)I

    .line 2377
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 2378
    invoke-static {v0}, Ll/ۢ᩵֫;->֫(I)Ljava/lang/String;

    move-result-object v6

    const-string v0, "audio/mpeg"

    .line 2379
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "audio/vnd.dts"

    .line 2380
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "audio/vnd.dts.hd"

    .line 2381
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x4

    .line 2389
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2390
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    .line 2391
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    .line 2394
    invoke-virtual {p1, p0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2395
    invoke-static {p1}, Ll/᩹ۖۧ;->ۧ(Ll/ᩳ֨֫;)I

    move-result p0

    .line 2396
    new-array v7, p0, [B

    const/4 v4, 0x0

    .line 2397
    invoke-virtual {p1, v4, p0, v7}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2400
    new-instance p0, Ll/ۖۖۧ;

    const-wide/16 v4, -0x1

    const-wide/16 v8, 0x0

    cmp-long p1, v2, v8

    if-lez p1, :cond_4

    goto :goto_0

    :cond_4
    move-wide v2, v4

    :goto_0
    cmp-long p1, v0, v8

    if-lez p1, :cond_5

    move-wide v4, v0

    :cond_5
    move-object v1, p0

    .line 2404
    invoke-direct/range {v1 .. v7}, Ll/ۖۖۧ;-><init>(JJLjava/lang/String;[B)V

    return-object p0

    .line 2382
    :cond_6
    :goto_1
    new-instance p0, Ll/ۖۖۧ;

    const-wide/16 v2, -0x1

    const-wide/16 v4, -0x1

    const/4 v7, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/ۖۖۧ;-><init>(JJLjava/lang/String;[B)V

    return-object p0
.end method

.method public static ֫(Ll/ܳۘۧ;Ll/֨֨֫;Ll/۟᩷ۧ;)Ll/᩷ۘۧ;
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 434
    iget-object v3, v1, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    const v4, 0x7374737a

    invoke-virtual {v0, v4}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 436
    new-instance v5, Ll/֨ۖۧ;

    invoke-direct {v5, v4, v3}, Ll/֨ۖۧ;-><init>(Ll/۠֨֫;Ll/۠ᩴ֫;)V

    goto :goto_0

    :cond_0
    const v4, 0x73747a32

    .line 438
    invoke-virtual {v0, v4}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v4

    if-eqz v4, :cond_39

    .line 443
    new-instance v5, Ll/۠ۖۧ;

    invoke-direct {v5, v4}, Ll/۠ۖۧ;-><init>(Ll/۠֨֫;)V

    .line 446
    :goto_0
    invoke-interface {v5}, Ll/᩵ۖۧ;->ܽ()I

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_1

    .line 448
    new-instance v9, Ll/᩷ۘۧ;

    new-array v2, v6, [J

    new-array v3, v6, [I

    new-array v5, v6, [J

    new-array v6, v6, [I

    const-wide/16 v7, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ll/᩷ۘۧ;-><init>(Ll/ܳۘۧ;[J[II[J[IJ)V

    return-object v9

    .line 458
    :cond_1
    iget v6, v1, Ll/ܳۘۧ;->ۖ:I

    const/4 v7, 0x2

    const-wide/16 v8, 0x0

    if-ne v6, v7, :cond_2

    iget-wide v6, v1, Ll/ܳۘۧ;->᩻:J

    cmp-long v10, v6, v8

    if-lez v10, :cond_2

    int-to-float v10, v4

    long-to-float v6, v6

    const v7, 0x49742400    # 1000000.0f

    div-float/2addr v6, v7

    div-float/2addr v10, v6

    .line 460
    invoke-virtual {v3}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v3

    invoke-virtual {v3, v10}, Ll/֨ᩴ֫;->֫(F)V

    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    .line 461
    invoke-virtual {v1, v3}, Ll/ܳۘۧ;->֫(Ll/۠ᩴ֫;)Ll/ܳۘۧ;

    move-result-object v1

    .line 466
    :cond_2
    iget-object v3, v1, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    const v6, 0x7374636f

    invoke-virtual {v0, v6}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    if-nez v6, :cond_3

    const v6, 0x636f3634

    .line 469
    invoke-virtual {v0, v6}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 471
    :goto_1
    iget-object v6, v6, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const v10, 0x73747363

    .line 473
    invoke-virtual {v0, v10}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v10

    .line 155
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    iget-object v10, v10, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const v11, 0x73747473

    .line 475
    invoke-virtual {v0, v11}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v11

    .line 155
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    iget-object v11, v11, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const v12, 0x73747373

    .line 477
    invoke-virtual {v0, v12}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v12

    if-eqz v12, :cond_4

    .line 478
    iget-object v12, v12, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    const v13, 0x63747473

    .line 480
    invoke-virtual {v0, v13}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 481
    iget-object v0, v0, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    .line 484
    :goto_3
    new-instance v13, Ll/ܺۖۧ;

    invoke-direct {v13, v10, v6, v7}, Ll/ܺۖۧ;-><init>(Ll/ᩳ֨֫;Ll/ᩳ֨֫;Z)V

    const/16 v6, 0xc

    .line 487
    invoke-virtual {v11, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 488
    invoke-virtual {v11}, Ll/ᩳ֨֫;->᩹()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    .line 489
    invoke-virtual {v11}, Ll/ᩳ֨֫;->᩹()I

    move-result v10

    .line 490
    invoke-virtual {v11}, Ll/ᩳ֨֫;->᩹()I

    move-result v14

    if-eqz v0, :cond_6

    .line 497
    invoke-virtual {v0, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 498
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v15

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    :goto_4
    const/16 v16, 0x0

    if-eqz v12, :cond_8

    .line 504
    invoke-virtual {v12, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 505
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩹()I

    move-result v6

    if-lez v6, :cond_7

    .line 507
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩹()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    const/4 v9, -0x1

    .line 515
    :goto_6
    invoke-interface {v5}, Ll/᩵ۖۧ;->ۧ()I

    move-result v8

    const/16 v19, 0x1

    move/from16 p1, v9

    .line 516
    iget-object v9, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    move/from16 v20, v10

    const/4 v10, -0x1

    if-eq v8, v10, :cond_e

    const-string v10, "audio/raw"

    .line 519
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string v10, "audio/g711-mlaw"

    .line 520
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string v10, "audio/g711-alaw"

    .line 521
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    :cond_9
    if-nez v7, :cond_e

    if-nez v15, :cond_e

    if-nez v6, :cond_e

    .line 536
    iget v0, v13, Ll/ܺۖۧ;->ᩳ:I

    new-array v5, v0, [J

    .line 537
    new-array v6, v0, [I

    .line 538
    :goto_7
    invoke-virtual {v13}, Ll/ܺۖۧ;->֫()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 539
    iget v7, v13, Ll/ܺۖۧ;->ܽ:I

    iget-wide v9, v13, Ll/ܺۖۧ;->᩻:J

    aput-wide v9, v5, v7

    .line 540
    iget v9, v13, Ll/ܺۖۧ;->ܳ:I

    aput v9, v6, v7

    goto :goto_7

    :cond_a
    int-to-long v9, v14

    const/16 v7, 0x2000

    .line 74
    div-int/2addr v7, v8

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_8
    if-ge v11, v0, :cond_b

    .line 78
    aget v13, v6, v11

    .line 79
    invoke-static {v13, v7}, Ll/ۘ֨֫;->֫(II)I

    move-result v13

    add-int/2addr v12, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 82
    :cond_b
    new-array v11, v12, [J

    .line 83
    new-array v13, v12, [I

    .line 85
    new-array v14, v12, [J

    .line 86
    new-array v12, v12, [I

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v21, v3

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v0, :cond_d

    .line 92
    aget v20, v6, v3

    .line 93
    aget-wide v24, v5, v3

    move/from16 v37, v20

    move/from16 v20, v0

    move/from16 v0, v37

    move/from16 v38, v23

    move-object/from16 v23, v5

    move/from16 v5, v22

    move/from16 v22, v38

    :goto_a
    if-lez v0, :cond_c

    .line 96
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v26

    .line 98
    aput-wide v24, v11, v22

    move-object/from16 p0, v6

    mul-int v6, v8, v26

    .line 99
    aput v6, v13, v22

    add-int/2addr v2, v6

    .line 101
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    move/from16 p1, v5

    int-to-long v5, v15

    mul-long v5, v5, v9

    .line 102
    aput-wide v5, v14, v22

    .line 103
    aput v19, v12, v22

    .line 105
    aget v5, v13, v22

    int-to-long v5, v5

    add-long v24, v24, v5

    add-int v15, v15, v26

    sub-int v0, v0, v26

    add-int/lit8 v22, v22, 0x1

    move-object/from16 v6, p0

    move/from16 v5, p1

    goto :goto_a

    :cond_c
    move-object/from16 p0, v6

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, v20

    move/from16 v37, v22

    move/from16 v22, v5

    move-object/from16 v5, v23

    move/from16 v23, v37

    goto :goto_9

    :cond_d
    int-to-long v5, v15

    mul-long v9, v9, v5

    int-to-long v2, v2

    move-object v5, v1

    move-wide/from16 v19, v9

    move-object v15, v11

    move-object v0, v12

    goto/16 :goto_16

    :cond_e
    move-object/from16 v21, v3

    .line 553
    new-array v2, v4, [J

    .line 554
    new-array v3, v4, [I

    .line 555
    new-array v8, v4, [J

    .line 556
    new-array v9, v4, [I

    const/4 v10, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v10, p1

    move-object/from16 p0, v1

    move-object/from16 v28, v11

    const/4 v1, 0x0

    const/4 v11, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move/from16 v37, v15

    move v15, v14

    move/from16 v14, v20

    move/from16 v20, v37

    :goto_b
    if-ge v1, v4, :cond_17

    const/16 v32, 0x1

    :goto_c
    if-nez v30, :cond_f

    .line 563
    invoke-virtual {v13}, Ll/ܺۖۧ;->֫()Z

    move-result v32

    if-eqz v32, :cond_f

    move/from16 p1, v14

    move/from16 v33, v15

    .line 564
    iget-wide v14, v13, Ll/ܺۖۧ;->᩻:J

    move/from16 v34, v4

    .line 565
    iget v4, v13, Ll/ܺۖۧ;->ܳ:I

    move/from16 v30, v4

    move-wide/from16 v22, v14

    move/from16 v15, v33

    move/from16 v4, v34

    move/from16 v14, p1

    goto :goto_c

    :cond_f
    move/from16 v34, v4

    move/from16 p1, v14

    move/from16 v33, v15

    if-nez v32, :cond_10

    const-string v4, "Unexpected end of chunk data"

    .line 568
    invoke-static {v4}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 570
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    .line 571
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    .line 572
    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    .line 573
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    move-object v15, v2

    move-object v13, v3

    move-object v14, v4

    move-object v12, v5

    move/from16 v2, v31

    move v4, v1

    move/from16 v1, v30

    goto/16 :goto_10

    :cond_10
    if-eqz v0, :cond_12

    :goto_d
    if-nez v29, :cond_11

    if-lez v20, :cond_11

    .line 580
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v29

    .line 586
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v31

    add-int/lit8 v20, v20, -0x1

    goto :goto_d

    :cond_11
    add-int/lit8 v29, v29, -0x1

    :cond_12
    move/from16 v4, v31

    .line 592
    aput-wide v22, v2, v1

    .line 593
    invoke-interface {v5}, Ll/᩵ۖۧ;->֫()I

    move-result v14

    aput v14, v3, v1

    move-object v15, v2

    move-object/from16 v32, v3

    int-to-long v2, v14

    add-long v26, v26, v2

    if-le v14, v11, :cond_13

    move v11, v14

    :cond_13
    int-to-long v2, v4

    add-long v2, v24, v2

    .line 598
    aput-wide v2, v8, v1

    if-nez v12, :cond_14

    const/4 v2, 0x1

    goto :goto_e

    :cond_14
    const/4 v2, 0x0

    .line 601
    :goto_e
    aput v2, v9, v1

    if-ne v1, v10, :cond_15

    .line 603
    aput v19, v9, v1

    add-int/lit8 v6, v6, -0x1

    if-lez v6, :cond_15

    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    invoke-virtual {v12}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v10, v2

    :cond_15
    move/from16 v14, v33

    int-to-long v2, v14

    add-long v24, v24, v2

    add-int/lit8 v2, p1, -0x1

    if-nez v2, :cond_16

    if-lez v7, :cond_16

    .line 614
    invoke-virtual/range {v28 .. v28}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    .line 621
    invoke-virtual/range {v28 .. v28}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    add-int/lit8 v7, v7, -0x1

    goto :goto_f

    :cond_16
    move v3, v14

    :goto_f
    move v14, v2

    .line 625
    aget v2, v32, v1

    move/from16 p1, v3

    int-to-long v2, v2

    add-long v22, v22, v2

    add-int/lit8 v30, v30, -0x1

    add-int/lit8 v1, v1, 0x1

    move/from16 v31, v4

    move-object v2, v15

    move-object/from16 v3, v32

    move/from16 v4, v34

    move/from16 v15, p1

    goto/16 :goto_b

    :cond_17
    move-object v15, v2

    move-object/from16 v32, v3

    move/from16 v34, v4

    move/from16 p1, v14

    move-object v14, v8

    move-object v12, v9

    move/from16 v1, v30

    move/from16 v2, v31

    move-object/from16 v13, v32

    :goto_10
    int-to-long v2, v2

    add-long v9, v24, v2

    if-eqz v0, :cond_19

    :goto_11
    if-lez v20, :cond_19

    .line 635
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    if-eqz v2, :cond_18

    const/4 v0, 0x0

    goto :goto_12

    .line 639
    :cond_18
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    add-int/lit8 v20, v20, -0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x1

    :goto_12
    if-nez v6, :cond_1b

    if-nez p1, :cond_1b

    if-nez v1, :cond_1b

    if-nez v7, :cond_1b

    move/from16 v2, v29

    if-nez v2, :cond_1c

    if-nez v0, :cond_1a

    goto :goto_13

    :cond_1a
    move-object/from16 v5, p0

    move/from16 p0, v4

    move-wide/from16 v19, v9

    goto :goto_15

    :cond_1b
    move/from16 v2, v29

    .line 649
    :cond_1c
    :goto_13
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Inconsistent stbl box for track "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v5, p0

    iget v8, v5, Ll/ܳۘۧ;->ܳ:I

    move/from16 p0, v4

    const-string v4, ": remainingSynchronizationSamples "

    move-wide/from16 v19, v9

    const-string v9, ", remainingSamplesAtTimestampDelta "

    .line 0
    invoke-static {v3, v8, v4, v6, v9}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v4, ", remainingSamplesInChunk "

    const-string v6, ", remainingTimestampDeltaChanges "

    move/from16 v8, p1

    invoke-static {v3, v8, v4, v1, v6}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 649
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v0, :cond_1d

    const-string v0, ", ctts invalid"

    goto :goto_14

    :cond_1d
    const-string v0, ""

    .line 663
    :goto_14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 649
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    :goto_15
    move/from16 v4, p0

    move/from16 v22, v11

    move-object v0, v12

    move-wide/from16 v2, v26

    .line 667
    :goto_16
    iget-wide v10, v5, Ll/ܳۘۧ;->᩻:J

    const-wide/32 v23, 0x7fffffff

    const-wide/16 v17, 0x0

    cmp-long v1, v10, v17

    if-lez v1, :cond_1e

    const-wide/16 v6, 0x8

    mul-long v6, v6, v2

    const-wide/32 v8, 0xf4240

    .line 668
    sget-object v12, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 669
    invoke-static/range {v6 .. v12}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    cmp-long v3, v1, v17

    if-lez v3, :cond_1e

    cmp-long v3, v1, v23

    if-gez v3, :cond_1e

    .line 675
    invoke-virtual/range {v21 .. v21}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v3

    long-to-int v2, v1

    invoke-virtual {v3, v2}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 676
    invoke-virtual {v5, v1}, Ll/ܳۘۧ;->֫(Ll/۠ᩴ֫;)Ll/ܳۘۧ;

    move-result-object v1

    goto :goto_17

    :cond_1e
    move-object v1, v5

    .line 680
    :goto_17
    iget-wide v2, v1, Ll/ܳۘۧ;->ܺ:J

    iget-object v5, v1, Ll/ܳۘۧ;->ᩳ:Ll/۠ᩴ֫;

    iget v12, v1, Ll/ܳۘۧ;->ۖ:I

    iget-object v10, v1, Ll/ܳۘۧ;->ܽ:[J

    iget-object v11, v1, Ll/ܳۘۧ;->ۧ:[J

    .line 1955
    sget-object v21, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v8, 0xf4240

    move-wide/from16 v6, v19

    move-object/from16 v32, v10

    move-object/from16 v35, v11

    move-wide v10, v2

    move/from16 v33, v4

    move v4, v12

    move-object/from16 v12, v21

    invoke-static/range {v6 .. v12}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v25

    move-object/from16 v6, v35

    if-nez v6, :cond_1f

    .line 683
    invoke-static {v14, v2, v3}, Ll/ۘ֨֫;->֫([JJ)V

    .line 684
    new-instance v2, Ll/᩷ۘۧ;

    move-object v6, v2

    move-object v7, v1

    move-object v8, v15

    move-object v9, v13

    move/from16 v10, v22

    move-object v11, v14

    move-object v12, v0

    move-wide/from16 v13, v25

    invoke-direct/range {v6 .. v14}, Ll/᩷ۘۧ;-><init>(Ll/ܳۘۧ;[J[II[J[IJ)V

    return-object v2

    .line 695
    :cond_1f
    array-length v7, v6

    const/4 v8, 0x1

    if-ne v7, v8, :cond_22

    if-ne v4, v8, :cond_22

    array-length v7, v14

    const/4 v9, 0x2

    if-lt v7, v9, :cond_22

    .line 155
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    aget-wide v9, v32, v16

    .line 699
    aget-wide v25, v6, v16

    iget-wide v11, v1, Ll/ܳۘۧ;->ܺ:J

    move-wide/from16 v34, v9

    iget-wide v8, v1, Ll/ܳۘۧ;->ۜ:J

    move-wide/from16 v27, v11

    move-wide/from16 v29, v8

    move-object/from16 v31, v21

    .line 1955
    invoke-static/range {v25 .. v31}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    add-long v9, v34, v7

    .line 2613
    array-length v7, v14

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    const/4 v8, 0x4

    const/4 v11, 0x0

    .line 2614
    invoke-static {v8, v11, v7}, Ll/ۘ֨֫;->֫(III)I

    move-result v8

    .line 2615
    array-length v12, v14

    add-int/lit8 v12, v12, -0x4

    .line 2616
    invoke-static {v12, v11, v7}, Ll/ۘ֨֫;->֫(III)I

    move-result v7

    .line 2617
    aget-wide v11, v14, v11

    cmp-long v16, v11, v34

    if-gtz v16, :cond_20

    aget-wide v25, v14, v8

    cmp-long v8, v34, v25

    if-gez v8, :cond_20

    aget-wide v7, v14, v7

    cmp-long v16, v7, v9

    if-gez v16, :cond_20

    cmp-long v7, v9, v19

    if-gtz v7, :cond_20

    const/4 v7, 0x1

    goto :goto_18

    :cond_20
    const/4 v7, 0x0

    :goto_18
    if-eqz v7, :cond_22

    sub-long v7, v19, v9

    sub-long v25, v34, v11

    .line 705
    iget v9, v5, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v9, v9

    iget-wide v11, v1, Ll/ܳۘۧ;->ܺ:J

    move-wide/from16 v27, v9

    move-wide/from16 v29, v11

    move-object/from16 v31, v21

    .line 1955
    invoke-static/range {v25 .. v31}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    .line 708
    iget v11, v5, Ll/۠ᩴ֫;->ܽ֫:I

    int-to-long v11, v11

    move/from16 v34, v4

    move-object/from16 v16, v5

    iget-wide v4, v1, Ll/ܳۘۧ;->ܺ:J

    move-wide/from16 v25, v7

    move-wide/from16 v27, v11

    move-wide/from16 v29, v4

    .line 1955
    invoke-static/range {v25 .. v31}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v4

    const-wide/16 v7, 0x0

    cmp-long v11, v9, v7

    if-nez v11, :cond_21

    cmp-long v11, v4, v7

    if-eqz v11, :cond_23

    :cond_21
    cmp-long v7, v9, v23

    if-gtz v7, :cond_23

    cmp-long v7, v4, v23

    if-gtz v7, :cond_23

    long-to-int v7, v9

    move-object/from16 v8, p2

    .line 713
    iput v7, v8, Ll/۟᩷ۧ;->֫:I

    long-to-int v5, v4

    .line 714
    iput v5, v8, Ll/۟᩷ۧ;->ۧ:I

    .line 715
    invoke-static {v14, v2, v3}, Ll/ۘ֨֫;->֫([JJ)V

    const/4 v2, 0x0

    .line 716
    aget-wide v25, v6, v2

    const-wide/32 v27, 0xf4240

    iget-wide v2, v1, Ll/ܳۘۧ;->ۜ:J

    move-wide/from16 v29, v2

    move-object/from16 v31, v21

    .line 1955
    invoke-static/range {v25 .. v31}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 719
    new-instance v4, Ll/᩷ۘۧ;

    move-object v6, v4

    move-object v7, v1

    move-object v8, v15

    move-object v9, v13

    move/from16 v10, v22

    move-object v11, v14

    move-object v12, v0

    move-wide v13, v2

    invoke-direct/range {v6 .. v14}, Ll/᩷ۘۧ;-><init>(Ll/ܳۘۧ;[J[II[J[IJ)V

    return-object v4

    :cond_22
    move/from16 v34, v4

    move-object/from16 v16, v5

    .line 725
    :cond_23
    array-length v2, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_26

    aget-wide v2, v6, v4

    const-wide/16 v7, 0x0

    cmp-long v5, v2, v7

    if-nez v5, :cond_25

    .line 155
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    aget-wide v2, v32, v4

    const/4 v4, 0x0

    .line 730
    :goto_19
    array-length v5, v14

    if-ge v4, v5, :cond_24

    .line 731
    aget-wide v5, v14, v4

    sub-long v23, v5, v2

    iget-wide v5, v1, Ll/ܳۘۧ;->ܺ:J

    .line 1955
    sget-object v29, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v25, 0xf4240

    move-wide/from16 v27, v5

    invoke-static/range {v23 .. v29}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    .line 732
    aput-wide v5, v14, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_19

    :cond_24
    sub-long v5, v19, v2

    .line 735
    iget-wide v9, v1, Ll/ܳۘۧ;->ܺ:J

    .line 1955
    sget-object v11, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v7, 0xf4240

    invoke-static/range {v5 .. v11}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v2

    .line 737
    new-instance v4, Ll/᩷ۘۧ;

    move-object v6, v4

    move-object v7, v1

    move-object v8, v15

    move-object v9, v13

    move/from16 v10, v22

    move-object v11, v14

    move-object v12, v0

    move-wide v13, v2

    invoke-direct/range {v6 .. v14}, Ll/᩷ۘۧ;-><init>(Ll/ܳۘۧ;[J[II[J[IJ)V

    return-object v4

    :cond_25
    const/4 v3, 0x1

    :cond_26
    move/from16 v2, v34

    if-ne v2, v3, :cond_27

    const/4 v3, 0x1

    goto :goto_1a

    :cond_27
    const/4 v3, 0x0

    .line 751
    :goto_1a
    array-length v5, v6

    new-array v5, v5, [I

    .line 752
    array-length v7, v6

    new-array v7, v7, [I

    .line 155
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 754
    :goto_1b
    array-length v12, v6

    if-ge v9, v12, :cond_2d

    move-object v12, v5

    .line 755
    aget-wide v4, v32, v9

    const-wide/16 v19, -0x1

    cmp-long v21, v4, v19

    if-eqz v21, :cond_2c

    .line 757
    aget-wide v23, v6, v9

    move/from16 p1, v10

    move/from16 p2, v11

    iget-wide v10, v1, Ll/ܳۘۧ;->ܺ:J

    move-object/from16 v35, v6

    move-object/from16 v19, v7

    iget-wide v6, v1, Ll/ܳۘۧ;->ۜ:J

    .line 1955
    sget-object v29, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v25, v10

    move-wide/from16 v27, v6

    invoke-static/range {v23 .. v29}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    const/4 v10, 0x1

    .line 771
    invoke-static {v14, v4, v5, v10}, Ll/ۘ֨֫;->ۧ([JJZ)I

    move-result v10

    aput v10, v12, v9

    add-long/2addr v4, v6

    .line 779
    invoke-static {v14, v4, v5, v3}, Ll/ۘ֨֫;->֫([JJZ)I

    move-result v6

    aput v6, v19, v9

    .line 785
    aget v6, v12, v9

    .line 786
    :goto_1c
    aget v7, v12, v9

    if-ltz v7, :cond_28

    aget v10, v0, v7

    and-int/lit8 v10, v10, 0x1

    if-nez v10, :cond_28

    add-int/lit8 v7, v7, -0x1

    .line 787
    aput v7, v12, v9

    goto :goto_1c

    :cond_28
    if-gez v7, :cond_29

    .line 791
    aput v6, v12, v9

    .line 792
    :goto_1d
    aget v6, v12, v9

    aget v7, v19, v9

    if-ge v6, v7, :cond_29

    aget v7, v0, v6

    and-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_29

    add-int/lit8 v6, v6, 0x1

    .line 794
    aput v6, v12, v9

    goto :goto_1d

    :cond_29
    const/4 v6, 0x2

    if-ne v2, v6, :cond_2a

    .line 798
    aget v6, v12, v9

    aget v7, v19, v9

    if-eq v6, v7, :cond_2a

    .line 803
    :goto_1e
    aget v6, v19, v9

    array-length v7, v14

    add-int/lit8 v7, v7, -0x1

    if-ge v6, v7, :cond_2a

    add-int/lit8 v6, v6, 0x1

    aget-wide v10, v14, v6

    cmp-long v7, v10, v4

    if-gtz v7, :cond_2a

    .line 805
    aput v6, v19, v9

    goto :goto_1e

    .line 808
    :cond_2a
    aget v4, v19, v9

    aget v5, v12, v9

    sub-int v6, v4, v5

    add-int v6, v6, p2

    if-eq v8, v5, :cond_2b

    const/4 v5, 0x1

    goto :goto_1f

    :cond_2b
    const/4 v5, 0x0

    :goto_1f
    or-int v5, v5, p1

    move v8, v4

    move v10, v5

    move v11, v6

    goto :goto_20

    :cond_2c
    move-object/from16 v35, v6

    move-object/from16 v19, v7

    move/from16 p1, v10

    move/from16 p2, v11

    :goto_20
    add-int/lit8 v9, v9, 0x1

    move-object v5, v12

    move-object/from16 v7, v19

    move-object/from16 v6, v35

    const/4 v4, 0x0

    goto/16 :goto_1b

    :cond_2d
    move-object v12, v5

    move-object/from16 v35, v6

    move-object/from16 v19, v7

    move/from16 p1, v10

    move/from16 v4, v33

    if-eq v11, v4, :cond_2e

    const/4 v2, 0x1

    goto :goto_21

    :cond_2e
    const/4 v2, 0x0

    :goto_21
    or-int v2, p1, v2

    if-eqz v2, :cond_2f

    .line 816
    new-array v3, v11, [J

    goto :goto_22

    :cond_2f
    move-object v3, v15

    :goto_22
    if-eqz v2, :cond_30

    .line 817
    new-array v4, v11, [I

    goto :goto_23

    :cond_30
    move-object v4, v13

    :goto_23
    if-eqz v2, :cond_31

    const/16 v22, 0x0

    :cond_31
    if-eqz v2, :cond_32

    .line 819
    new-array v5, v11, [I

    goto :goto_24

    :cond_32
    move-object v5, v0

    .line 820
    :goto_24
    new-array v6, v11, [J

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v28, v6

    move/from16 v27, v22

    move-object/from16 v7, v35

    const/16 p0, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    .line 824
    :goto_25
    array-length v6, v7

    if-ge v9, v6, :cond_37

    .line 825
    aget-wide v29, v32, v9

    .line 826
    aget v6, v12, v9

    move-object/from16 p1, v12

    .line 827
    aget v12, v19, v9

    if-eqz v2, :cond_33

    move-object/from16 v35, v7

    sub-int v7, v12, v6

    .line 830
    invoke-static {v15, v6, v3, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 831
    invoke-static {v13, v6, v4, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 832
    invoke-static {v0, v6, v5, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_26

    :cond_33
    move-object/from16 v35, v7

    :goto_26
    move-object/from16 v31, v0

    move v7, v6

    move/from16 v0, v27

    move/from16 v6, p0

    :goto_27
    if-ge v7, v12, :cond_36

    move-object/from16 v33, v5

    move/from16 p0, v6

    .line 835
    iget-wide v5, v1, Ll/ܳۘۧ;->ۜ:J

    .line 1955
    sget-object v27, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v22, 0xf4240

    move-wide/from16 v20, v10

    move-wide/from16 v24, v5

    move-object/from16 v26, v27

    invoke-static/range {v20 .. v26}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    .line 836
    aget-wide v20, v14, v7

    sub-long v20, v20, v29

    move-object/from16 v36, v14

    move-object/from16 v34, v15

    iget-wide v14, v1, Ll/ܳۘۧ;->ܺ:J

    move-wide/from16 v24, v14

    .line 1955
    invoke-static/range {v20 .. v26}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v14

    const-wide/16 v17, 0x0

    cmp-long v20, v14, v17

    if-gez v20, :cond_34

    const/16 v20, 0x1

    goto :goto_28

    :cond_34
    move/from16 v20, p0

    :goto_28
    add-long/2addr v5, v14

    .line 842
    aput-wide v5, v28, v8

    if-eqz v2, :cond_35

    .line 843
    aget v5, v4, v8

    if-le v5, v0, :cond_35

    .line 844
    aget v0, v13, v7

    :cond_35
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v7, v7, 0x1

    move/from16 v6, v20

    move-object/from16 v5, v33

    move-object/from16 v15, v34

    move-object/from16 v14, v36

    goto :goto_27

    :cond_36
    move-object/from16 v33, v5

    move/from16 p0, v6

    move-object/from16 v36, v14

    move-object/from16 v34, v15

    const-wide/16 v17, 0x0

    .line 848
    aget-wide v5, v35, v9

    add-long/2addr v10, v5

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v12, p1

    move/from16 v27, v0

    move-object/from16 v0, v31

    move-object/from16 v5, v33

    move-object/from16 v7, v35

    goto/16 :goto_25

    :cond_37
    move-object/from16 v33, v5

    .line 850
    iget-wide v5, v1, Ll/ܳۘۧ;->ۜ:J

    .line 1955
    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v22, 0xf4240

    move-wide/from16 v20, v10

    move-wide/from16 v24, v5

    invoke-static/range {v20 .. v26}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v30

    if-eqz p0, :cond_38

    .line 853
    invoke-virtual/range {v16 .. v16}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩴ֫;->ۧ()V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    .line 854
    invoke-virtual {v1, v0}, Ll/ܳۘۧ;->֫(Ll/۠ᩴ֫;)Ll/ܳۘۧ;

    move-result-object v1

    :cond_38
    move-object/from16 v24, v1

    .line 856
    new-instance v0, Ll/᩷ۘۧ;

    move-object/from16 v23, v0

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v29, v33

    invoke-direct/range {v23 .. v31}, Ll/᩷ۘۧ;-><init>(Ll/ܳۘۧ;[J[II[J[IJ)V

    return-object v0

    :cond_39
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    .line 440
    invoke-static {v0, v1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/֨֨֫;)Ll/᩻᩵֫;
    .locals 14

    const v0, 0x68646c72    # 4.3148E24f

    .line 250
    invoke-virtual {p0, v0}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v0

    const v1, 0x6b657973

    .line 251
    invoke-virtual {p0, v1}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object v1

    const v2, 0x696c7374

    .line 252
    invoke-virtual {p0, v2}, Ll/֨֨֫;->ܽ(I)Ll/۠֨֫;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    if-eqz p0, :cond_8

    .line 253
    iget-object v0, v0, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v3, 0x10

    .line 996
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 997
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    const v3, 0x6d647461

    if-eq v0, v3, :cond_0

    goto/16 :goto_5

    .line 262
    :cond_0
    iget-object v0, v1, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v1, 0xc

    .line 263
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 264
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 265
    new-array v3, v1, [Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x8

    if-ge v5, v1, :cond_1

    .line 267
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    const/4 v8, 0x4

    .line 268
    invoke-virtual {v0, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    sub-int/2addr v7, v6

    .line 510
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v7, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v6

    .line 270
    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 274
    :cond_1
    iget-object p0, p0, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    .line 275
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 276
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 277
    :goto_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    if-le v5, v6, :cond_6

    .line 278
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    .line 279
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    .line 280
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ltz v8, :cond_4

    if-ge v8, v1, :cond_4

    .line 282
    aget-object v8, v3, v8

    add-int v9, v5, v7

    .line 235
    :goto_2
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    if-ge v10, v9, :cond_3

    .line 236
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v11

    .line 237
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v12

    const v13, 0x64617461

    if-ne v12, v13, :cond_2

    .line 239
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    .line 240
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    add-int/lit8 v11, v11, -0x10

    .line 242
    new-array v12, v11, [B

    .line 243
    invoke-virtual {p0, v4, v11, v12}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 244
    new-instance v11, Ll/֡֨֫;

    invoke-direct {v11, v10, v9, v8, v12}, Ll/֡֨֫;-><init>(IILjava/lang/String;[B)V

    goto :goto_3

    :cond_2
    add-int/2addr v10, v11

    .line 246
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_2

    :cond_3
    move-object v11, v2

    :goto_3
    if-eqz v11, :cond_5

    .line 287
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    const-string v9, "Skipped metadata with unknown key index: "

    .line 0
    invoke-static {v8, v9}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    :cond_5
    :goto_4
    add-int/2addr v5, v7

    .line 292
    invoke-virtual {p0, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_1

    .line 294
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_7

    goto :goto_5

    :cond_7
    new-instance p0, Ll/᩻᩵֫;

    invoke-direct {p0, v0}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_8
    :goto_5
    return-object v2
.end method

.method public static ֫(Ll/۠֨֫;)Ll/᩻᩵֫;
    .locals 15

    .line 194
    iget-object p0, p0, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    const/16 v0, 0x8

    .line 195
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 196
    new-instance v1, Ll/᩻᩵֫;

    const/4 v2, 0x0

    new-array v3, v2, [Ll/ܳ᩵֫;

    invoke-direct {v1, v3}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    .line 197
    :goto_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v3

    if-lt v3, v0, :cond_15

    .line 198
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    .line 199
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v4

    .line 200
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    const v6, 0x6d657461

    const/4 v7, 0x0

    if-ne v5, v6, :cond_5

    .line 202
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int v5, v3, v4

    .line 868
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 869
    invoke-static {p0}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;)V

    .line 870
    :goto_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    if-ge v6, v5, :cond_4

    .line 871
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v6

    .line 872
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v8

    .line 873
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    const v10, 0x696c7374

    if-ne v9, v10, :cond_3

    .line 875
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int/2addr v6, v8

    .line 885
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 886
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 887
    :cond_0
    :goto_2
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v8

    if-ge v8, v6, :cond_1

    .line 888
    invoke-static {p0}, Ll/ۤۖۧ;->ۧ(Ll/ᩳ֨֫;)Ll/ܳܺۧ;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 890
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 893
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    new-instance v7, Ll/᩻᩵֫;

    invoke-direct {v7, v5}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    goto :goto_3

    :cond_3
    add-int/2addr v6, v8

    .line 878
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܿ(I)V

    goto :goto_1

    .line 204
    :cond_4
    :goto_3
    invoke-virtual {v1, v7}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object v1

    goto/16 :goto_a

    :cond_5
    const v6, 0x736d7461

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-ne v5, v6, :cond_13

    .line 206
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    add-int v5, v3, v4

    const/16 v6, 0xc

    .line 74
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 75
    :goto_4
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    if-ge v10, v5, :cond_12

    .line 76
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    .line 77
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v11

    .line 78
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v12

    const v13, 0x73617574

    if-ne v12, v13, :cond_11

    const/16 v10, 0x10

    if-ge v11, v10, :cond_6

    goto/16 :goto_9

    :cond_6
    const/4 v10, 0x4

    .line 84
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    const/4 v10, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_5
    if-ge v11, v8, :cond_9

    .line 91
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v13

    .line 92
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    if-nez v13, :cond_7

    move v10, v14

    goto :goto_6

    :cond_7
    if-ne v13, v9, :cond_8

    move v12, v14

    :cond_8
    :goto_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_9
    const v8, -0x7fffffff

    if-ne v10, v6, :cond_a

    const/16 v5, 0xf0

    goto :goto_8

    :cond_a
    const/16 v11, 0xd

    if-ne v10, v11, :cond_b

    const/16 v5, 0x78

    goto :goto_8

    :cond_b
    const/16 v11, 0x15

    if-eq v10, v11, :cond_c

    goto :goto_7

    .line 130
    :cond_c
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v10

    if-lt v10, v0, :cond_f

    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    add-int/2addr v10, v0

    if-le v10, v5, :cond_d

    goto :goto_7

    .line 134
    :cond_d
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    .line 135
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    if-lt v5, v6, :cond_f

    const v5, 0x73726672

    if-eq v10, v5, :cond_e

    goto :goto_7

    .line 140
    :cond_e
    invoke-virtual {p0}, Ll/ᩳ֨֫;->۠()I

    move-result v5

    goto :goto_8

    :cond_f
    :goto_7
    const v5, -0x7fffffff

    :goto_8
    if-ne v5, v8, :cond_10

    goto :goto_9

    .line 105
    :cond_10
    new-instance v7, Ll/᩻᩵֫;

    new-instance v6, Ll/᩵ܺۧ;

    int-to-float v5, v5

    invoke-direct {v6, v5, v12}, Ll/᩵ܺۧ;-><init>(FI)V

    new-array v5, v9, [Ll/ܳ᩵֫;

    aput-object v6, v5, v2

    invoke-direct {v7, v5}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    goto :goto_9

    :cond_11
    add-int/2addr v10, v11

    .line 107
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_4

    .line 208
    :cond_12
    :goto_9
    invoke-virtual {v1, v7}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object v1

    goto :goto_a

    :cond_13
    const v6, -0x56878686

    if-ne v5, v6, :cond_14

    .line 899
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֡()S

    move-result v5

    .line 900
    invoke-virtual {p0, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 510
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v5, v6}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x2b

    .line 903
    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    const/16 v8, 0x2d

    .line 904
    invoke-virtual {v5, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    .line 905
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 907
    :try_start_0
    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    .line 909
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    sub-int/2addr v10, v9

    invoke-virtual {v5, v6, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    .line 910
    new-instance v6, Ll/᩻᩵֫;

    new-instance v10, Ll/᩸֨֫;

    invoke-direct {v10, v8, v5}, Ll/᩸֨֫;-><init>(FF)V

    new-array v5, v9, [Ll/ܳ᩵֫;

    aput-object v10, v5, v2

    invoke-direct {v6, v5}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v6

    .line 211
    :catch_0
    invoke-virtual {v1, v7}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object v1

    :cond_14
    :goto_a
    add-int/2addr v3, v4

    .line 213
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_15
    return-object v1
.end method

.method public static ֫(Ll/ᩳ֨֫;)V
    .locals 3

    .line 309
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    const/4 v1, 0x4

    .line 314
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 315
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x68646c72    # 4.3148E24f

    if-eq v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x4

    .line 318
    :cond_0
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;IIIILjava/lang/String;ILl/᩵ᩴ֫;Ll/ۚۖۧ;I)V
    .locals 40

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    add-int/lit8 v5, v1, 0x10

    .line 1300
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    const/16 v5, 0x10

    .line 1302
    invoke-virtual {v0, v5}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1303
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v5

    .line 1304
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v6

    const/16 v7, 0x32

    .line 1310
    invoke-virtual {v0, v7}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 1312
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v7

    const v8, 0x656e6376

    move/from16 v9, p1

    if-ne v9, v8, :cond_2

    .line 1316
    invoke-static {v0, v1, v2}, Ll/᩹ۖۧ;->֫(Ll/ᩳ֨֫;II)Landroid/util/Pair;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 1318
    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 1322
    :cond_0
    iget-object v10, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ll/᩻ۘۧ;

    iget-object v10, v10, Ll/᩻ۘۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v3, v10}, Ll/᩵ᩴ֫;->֫(Ljava/lang/String;)Ll/᩵ᩴ֫;

    move-result-object v3

    .line 1323
    :goto_0
    iget-object v10, v4, Ll/ۚۖۧ;->ܿ:[Ll/᩻ۘۧ;

    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ll/᩻ۘۧ;

    aput-object v8, v10, p9

    .line 1325
    :cond_1
    invoke-virtual {v0, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    :cond_2
    const v8, 0x6d317620

    const-string v10, "video/3gpp"

    if-ne v9, v8, :cond_3

    const-string v8, "video/mpeg"

    goto :goto_1

    :cond_3
    const v8, 0x48323633

    if-ne v9, v8, :cond_4

    move-object v8, v10

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, -0x1

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v20, -0x1

    const/16 v21, -0x1

    const/16 v22, -0x1

    const/16 v23, -0x1

    const/16 v24, 0x8

    const/16 v25, 0x8

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move/from16 v22, v5

    move/from16 v21, v6

    move-object/from16 p1, v10

    move-object/from16 p7, v14

    move-object/from16 v23, v15

    move-object/from16 v17, v16

    move-object/from16 v15, v28

    const/16 v5, 0x8

    const/16 v6, 0x8

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/high16 v18, 0x3f800000    # 1.0f

    const/16 v19, -0x1

    const/16 v30, -0x1

    const/16 v31, -0x1

    move-object/from16 v16, v3

    const/4 v3, -0x1

    :goto_2
    sub-int v14, v7, v1

    if-ge v14, v2, :cond_6d

    .line 1359
    invoke-virtual {v0, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1360
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v14

    move/from16 p9, v7

    .line 1361
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v7

    if-nez v7, :cond_5

    .line 1362
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v24

    move/from16 v25, v9

    sub-int v9, v24, v1

    if-ne v9, v2, :cond_6

    goto/16 :goto_47

    :cond_5
    move/from16 v25, v9

    :cond_6
    if-lez v7, :cond_7

    const/4 v9, 0x1

    goto :goto_3

    :cond_7
    const/4 v9, 0x0

    :goto_3
    const-string v1, "childAtomSize must be positive"

    .line 1366
    invoke-static {v1, v9}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1367
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    const v2, 0x61766343

    if-ne v9, v2, :cond_a

    if-nez v8, :cond_8

    const/4 v1, 0x1

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_4
    const/4 v2, 0x0

    .line 1369
    invoke-static {v2, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    add-int/lit8 v14, v14, 0x8

    .line 1371
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1372
    invoke-static/range {p0 .. p0}, Ll/۟ۜۧ;->֫(Ll/ᩳ֨֫;)Ll/۟ۜۧ;

    move-result-object v1

    .line 1373
    iget-object v2, v1, Ll/۟ۜۧ;->ۜ:Ljava/util/ArrayList;

    .line 1374
    iget v5, v1, Ll/۟ۜۧ;->ۢ:I

    iput v5, v4, Ll/ۚۖۧ;->ܽ:I

    if-nez v29, :cond_9

    .line 1376
    iget v11, v1, Ll/۟ۜۧ;->ۡ:F

    goto :goto_5

    :cond_9
    move/from16 v11, v18

    .line 1378
    :goto_5
    iget-object v5, v1, Ll/۟ۜۧ;->ܽ:Ljava/lang/String;

    .line 1379
    iget v6, v1, Ll/۟ۜۧ;->᩷:I

    .line 1380
    iget v8, v1, Ll/۟ۜۧ;->ܿ:I

    .line 1381
    iget v9, v1, Ll/۟ۜۧ;->ᩳ:I

    .line 1382
    iget v10, v1, Ll/۟ۜۧ;->ܳ:I

    .line 1383
    iget v12, v1, Ll/۟ۜۧ;->ۧ:I

    .line 1384
    iget v1, v1, Ll/۟ۜۧ;->֫:I

    const-string v13, "video/avc"

    move-object/from16 v14, p7

    move-object/from16 v23, v5

    move/from16 v30, v6

    move/from16 v18, v11

    move v6, v12

    move v5, v1

    move v12, v8

    move v11, v9

    move-object v8, v13

    move-object v13, v2

    goto/16 :goto_46

    :cond_a
    const v2, 0x68766343

    move/from16 v24, v3

    const-string v3, "video/hevc"

    if-ne v9, v2, :cond_e

    if-nez v8, :cond_b

    const/4 v1, 0x1

    goto :goto_6

    :cond_b
    const/4 v1, 0x0

    :goto_6
    const/4 v2, 0x0

    .line 1386
    invoke-static {v2, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    add-int/lit8 v14, v14, 0x8

    .line 1388
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1389
    invoke-static/range {p0 .. p0}, Ll/ۧۢۧ;->֫(Ll/ᩳ֨֫;)Ll/ۧۢۧ;

    move-result-object v1

    .line 1390
    iget-object v2, v1, Ll/ۧۢۧ;->᩷:Ljava/util/List;

    .line 1391
    iget v5, v1, Ll/ۧۢۧ;->ۖ:I

    iput v5, v4, Ll/ۚۖۧ;->ܽ:I

    if-nez v29, :cond_c

    .line 1393
    iget v11, v1, Ll/ۧۢۧ;->ۘ:F

    goto :goto_7

    :cond_c
    move/from16 v11, v18

    .line 1395
    :goto_7
    iget v5, v1, Ll/ۧۢۧ;->ۡ:I

    .line 1396
    iget v6, v1, Ll/ۧۢۧ;->ܺ:I

    .line 1397
    iget-object v8, v1, Ll/ۧۢۧ;->ܽ:Ljava/lang/String;

    .line 1398
    iget v9, v1, Ll/ۧۢۧ;->֡:I

    const/4 v10, -0x1

    if-eq v9, v10, :cond_d

    move/from16 v24, v9

    .line 1402
    :cond_d
    iget v9, v1, Ll/ۧۢۧ;->ۜ:I

    .line 1403
    iget v10, v1, Ll/ۧۢۧ;->᩻:I

    .line 1404
    iget v12, v1, Ll/ۧۢۧ;->ܿ:I

    .line 1405
    iget v13, v1, Ll/ۧۢۧ;->ᩳ:I

    .line 1406
    iget v14, v1, Ll/ۧۢۧ;->ܳ:I

    .line 1407
    iget v15, v1, Ll/ۧۢۧ;->ۧ:I

    move-object/from16 v19, v2

    .line 1408
    iget v2, v1, Ll/ۧۢۧ;->֫:I

    move/from16 v18, v2

    .line 1409
    iget-object v2, v1, Ll/ۧۢۧ;->ۚ:Ll/۟֨֫;

    .line 1410
    iget-boolean v1, v1, Ll/ۧۢۧ;->ᩴ:Z

    iput-boolean v1, v4, Ll/ۚۖۧ;->ۧ:Z

    move/from16 v30, v5

    move/from16 v31, v6

    move-object/from16 v23, v8

    move/from16 v20, v9

    move v6, v15

    move/from16 v5, v18

    move-object v15, v2

    move-object v8, v3

    move/from16 v18, v11

    move v11, v13

    move-object/from16 v13, v19

    move/from16 v3, v24

    move/from16 v19, v10

    move v10, v14

    move-object/from16 v14, p7

    goto/16 :goto_46

    :cond_e
    const v2, 0x6c687643

    move-object/from16 v28, v1

    const/4 v1, 0x2

    if-ne v9, v2, :cond_1b

    .line 1414
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "lhvC must follow hvcC atom"

    .line 1413
    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    if-eqz v15, :cond_f

    .line 1415
    iget-object v2, v15, Ll/۟֨֫;->֫:Ll/ܳ۬ܺ;

    .line 1416
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-lt v2, v1, :cond_f

    const/4 v1, 0x1

    goto :goto_8

    :cond_f
    const/4 v1, 0x0

    :goto_8
    const-string v2, "must have at least two layers"

    .line 1415
    invoke-static {v2, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    add-int/lit8 v14, v14, 0x8

    .line 1418
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 155
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    invoke-static {v0, v15}, Ll/ۧۢۧ;->֫(Ll/ᩳ֨֫;Ll/۟֨֫;)Ll/ۧۢۧ;

    move-result-object v1

    .line 1420
    iget-boolean v2, v1, Ll/ۧۢۧ;->֨:Z

    if-nez v2, :cond_10

    iget-boolean v2, v1, Ll/ۧۢۧ;->᩵:Z

    if-nez v2, :cond_10

    iget-boolean v2, v1, Ll/ۧۢۧ;->ۢ:Z

    if-nez v2, :cond_10

    const/4 v2, 0x1

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    :goto_9
    const-string v3, "invalid lhvC parameter sets"

    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1425
    iget v2, v4, Ll/ۚۖۧ;->ܽ:I

    iget v3, v1, Ll/ۧۢۧ;->ۖ:I

    if-ne v2, v3, :cond_11

    const/4 v2, 0x1

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    :goto_a
    const-string v3, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1431
    iget v2, v1, Ll/ۧۢۧ;->ܿ:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_13

    if-ne v12, v2, :cond_12

    const/4 v2, 0x1

    goto :goto_b

    :cond_12
    const/4 v2, 0x0

    :goto_b
    const-string v8, "colorSpace must be the same for both views"

    .line 1432
    invoke-static {v8, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1435
    :cond_13
    iget v2, v1, Ll/ۧۢۧ;->ᩳ:I

    if-eq v2, v3, :cond_15

    if-ne v11, v2, :cond_14

    const/4 v2, 0x1

    goto :goto_c

    :cond_14
    const/4 v2, 0x0

    :goto_c
    const-string v8, "colorRange must be the same for both views"

    .line 1436
    invoke-static {v8, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1439
    :cond_15
    iget v2, v1, Ll/ۧۢۧ;->ܳ:I

    if-eq v2, v3, :cond_17

    if-ne v10, v2, :cond_16

    const/4 v2, 0x1

    goto :goto_d

    :cond_16
    const/4 v2, 0x0

    :goto_d
    const-string v3, "colorTransfer must be the same for both views"

    .line 1440
    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1444
    :cond_17
    iget v2, v1, Ll/ۧۢۧ;->ۧ:I

    if-ne v6, v2, :cond_18

    const/4 v2, 0x1

    goto :goto_e

    :cond_18
    const/4 v2, 0x0

    :goto_e
    const-string v3, "bitdepthLuma must be the same for both views"

    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1447
    iget v2, v1, Ll/ۧۢۧ;->֫:I

    if-ne v5, v2, :cond_19

    const/4 v2, 0x1

    goto :goto_f

    :cond_19
    const/4 v2, 0x0

    :goto_f
    const-string v3, "bitdepthChroma must be the same for both views"

    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    if-eqz v13, :cond_1a

    .line 1454
    sget v2, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v2, Ll/֫۬ܺ;

    invoke-direct {v2}, Ll/֫۬ܺ;-><init>()V

    .line 1455
    invoke-virtual {v2, v13}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    iget-object v3, v1, Ll/ۧۢۧ;->᩷:Ljava/util/List;

    .line 1456
    invoke-virtual {v2, v3}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 1457
    invoke-virtual {v2}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v13

    goto :goto_10

    :cond_1a
    const-string v2, "initializationData must be already set from hvcC atom"

    const/4 v3, 0x0

    .line 1459
    invoke-static {v2, v3}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    :goto_10
    const/4 v2, 0x0

    .line 1462
    iget-object v1, v1, Ll/ۧۢۧ;->ܽ:Ljava/lang/String;

    .line 1463
    iput-boolean v2, v4, Ll/ۚۖۧ;->ۧ:Z

    const-string v2, "video/mv-hevc"

    move-object/from16 v14, p7

    move-object/from16 v23, v1

    move-object v8, v2

    move/from16 v3, v24

    goto/16 :goto_46

    :cond_1b
    const v1, 0x76657875

    const/4 v2, 0x5

    if-ne v9, v1, :cond_2a

    add-int/lit8 v1, v14, 0x8

    .line 2428
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2429
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    const/4 v2, 0x0

    :goto_11
    sub-int v3, v1, v14

    if-ge v3, v7, :cond_24

    .line 2432
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2433
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-lez v3, :cond_1c

    const/4 v9, 0x1

    goto :goto_12

    :cond_1c
    const/4 v9, 0x0

    :goto_12
    move-object/from16 v4, v28

    .line 2434
    invoke-static {v4, v9}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2435
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    move/from16 v28, v5

    const v5, 0x65796573

    if-ne v9, v5, :cond_23

    add-int/lit8 v2, v1, 0x8

    .line 2447
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2448
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v2

    :goto_13
    sub-int v5, v2, v1

    if-ge v5, v3, :cond_22

    .line 2450
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2451
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    if-lez v5, :cond_1d

    const/4 v9, 0x1

    goto :goto_14

    :cond_1d
    const/4 v9, 0x0

    .line 2452
    :goto_14
    invoke-static {v4, v9}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 2453
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v9

    move-object/from16 v32, v4

    const v4, 0x73747269

    if-ne v9, v4, :cond_21

    const/4 v2, 0x4

    .line 2455
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2456
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    .line 2457
    new-instance v4, Ll/ۘۖۧ;

    new-instance v5, Ll/֡ۖۧ;

    and-int/lit8 v9, v2, 0x1

    move/from16 v33, v6

    const/4 v6, 0x1

    if-ne v9, v6, :cond_1e

    const/4 v6, 0x1

    goto :goto_15

    :cond_1e
    const/4 v6, 0x0

    :goto_15
    and-int/lit8 v9, v2, 0x2

    move/from16 v34, v11

    const/4 v11, 0x2

    if-ne v9, v11, :cond_1f

    const/4 v9, 0x1

    goto :goto_16

    :cond_1f
    const/4 v9, 0x0

    :goto_16
    and-int/lit8 v2, v2, 0x8

    const/16 v11, 0x8

    if-ne v2, v11, :cond_20

    const/4 v2, 0x1

    goto :goto_17

    :cond_20
    const/4 v2, 0x0

    :goto_17
    invoke-direct {v5, v6, v9, v2}, Ll/֡ۖۧ;-><init>(ZZZ)V

    invoke-direct {v4, v5}, Ll/ۘۖۧ;-><init>(Ll/֡ۖۧ;)V

    move-object v2, v4

    goto :goto_18

    :cond_21
    move/from16 v33, v6

    move/from16 v34, v11

    add-int/2addr v2, v5

    move-object/from16 v4, v32

    goto :goto_13

    :cond_22
    move-object/from16 v32, v4

    move/from16 v33, v6

    move/from16 v34, v11

    const/4 v2, 0x0

    goto :goto_18

    :cond_23
    move-object/from16 v32, v4

    move/from16 v33, v6

    move/from16 v34, v11

    :goto_18
    add-int/2addr v1, v3

    move-object/from16 v4, p8

    move/from16 v5, v28

    move-object/from16 v28, v32

    move/from16 v6, v33

    move/from16 v11, v34

    goto/16 :goto_11

    :cond_24
    move/from16 v28, v5

    move/from16 v33, v6

    move/from16 v34, v11

    if-nez v2, :cond_25

    const/4 v1, 0x0

    goto :goto_19

    .line 2441
    :cond_25
    new-instance v1, Ll/᩸ۖۧ;

    invoke-direct {v1, v2}, Ll/᩸ۖۧ;-><init>(Ll/ۘۖۧ;)V

    :goto_19
    if-eqz v1, :cond_29

    if-eqz v15, :cond_26

    .line 1467
    iget-object v2, v15, Ll/۟֨֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_26

    .line 1470
    invoke-virtual {v1}, Ll/᩸ۖۧ;->֫()Z

    move-result v2

    const-string v3, "both eye views must be marked as available"

    .line 1469
    invoke-static {v3, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1475
    invoke-static {v1}, Ll/᩸ۖۧ;->֫(Ll/᩸ۖۧ;)Ll/ۘۖۧ;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۖۧ;->֫(Ll/ۘۖۧ;)Ll/֡ۖۧ;

    move-result-object v1

    invoke-static {v1}, Ll/֡ۖۧ;->֫(Ll/֡ۖۧ;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "for MV-HEVC, eye_views_reversed must be set to false"

    invoke-static {v2, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    goto :goto_1b

    :cond_26
    const/4 v2, -0x1

    move/from16 v3, v24

    if-ne v3, v2, :cond_28

    .line 1480
    invoke-static {v1}, Ll/᩸ۖۧ;->֫(Ll/᩸ۖۧ;)Ll/ۘۖۧ;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۖۧ;->֫(Ll/ۘۖۧ;)Ll/֡ۖۧ;

    move-result-object v1

    invoke-static {v1}, Ll/֡ۖۧ;->֫(Ll/֡ۖۧ;)Z

    move-result v1

    if-eqz v1, :cond_27

    const/4 v3, 0x5

    goto :goto_1a

    :cond_27
    const/4 v3, 0x4

    :cond_28
    :goto_1a
    move-object/from16 v14, p7

    move/from16 v1, v25

    goto/16 :goto_2e

    :cond_29
    :goto_1b
    move/from16 v3, v24

    goto :goto_1a

    :cond_2a
    move/from16 v28, v5

    move/from16 v33, v6

    move/from16 v34, v11

    move/from16 v3, v24

    const v1, 0x64766343

    if-eq v9, v1, :cond_6a

    const v1, 0x64767643

    if-eq v9, v1, :cond_6a

    const v1, 0x64767743

    if-ne v9, v1, :cond_2b

    goto/16 :goto_41

    :cond_2b
    const v1, 0x76706343

    const/4 v6, 0x7

    const/16 v11, 0xc

    if-ne v9, v1, :cond_31

    if-nez v8, :cond_2c

    const/4 v1, 0x1

    goto :goto_1c

    :cond_2c
    const/4 v1, 0x0

    :goto_1c
    const/4 v8, 0x0

    .line 1509
    invoke-static {v8, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    const v1, 0x76703038

    const-string v8, "video/x-vnd.on2.vp9"

    move/from16 v9, v25

    if-ne v9, v1, :cond_2d

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_1d

    :cond_2d
    move-object v1, v8

    :goto_1d
    add-int/lit8 v14, v14, 0xc

    .line 1511
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1513
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v10

    int-to-byte v10, v10

    .line 1514
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v12

    int-to-byte v12, v12

    .line 1515
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v14

    const/16 v24, 0x6

    shr-int/lit8 v5, v14, 0x4

    shr-int/lit8 v28, v14, 0x1

    const/16 v32, 0x3

    and-int/lit8 v4, v28, 0x7

    int-to-byte v4, v4

    .line 1519
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2e

    int-to-byte v8, v5

    .line 1522
    sget v13, Ll/ᩳۚ֫;->֫:I

    new-array v11, v11, [B

    const/4 v13, 0x0

    const/16 v28, 0x1

    aput-byte v28, v11, v13

    aput-byte v28, v11, v28

    const/4 v13, 0x2

    aput-byte v10, v11, v13

    aput-byte v13, v11, v32

    const/4 v10, 0x4

    aput-byte v28, v11, v10

    aput-byte v12, v11, v2

    aput-byte v32, v11, v24

    aput-byte v28, v11, v6

    const/16 v2, 0x8

    aput-byte v8, v11, v2

    const/16 v2, 0x9

    aput-byte v10, v11, v2

    const/16 v2, 0xa

    aput-byte v28, v11, v2

    const/16 v2, 0xb

    aput-byte v4, v11, v2

    .line 176
    invoke-static {v11}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    :cond_2e
    and-int/lit8 v2, v14, 0x1

    if-eqz v2, :cond_2f

    const/4 v2, 0x1

    goto :goto_1e

    :cond_2f
    const/4 v2, 0x0

    .line 1526
    :goto_1e
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v4

    .line 1527
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    .line 1528
    invoke-static {v4}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v4

    if-eqz v2, :cond_30

    const/4 v2, 0x1

    goto :goto_1f

    :cond_30
    const/4 v2, 0x2

    .line 1531
    :goto_1f
    invoke-static {v6}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v6

    move-object/from16 v14, p7

    move-object v8, v1

    move v11, v2

    move v12, v4

    move v10, v6

    move/from16 v25, v9

    move v6, v5

    goto/16 :goto_46

    :cond_31
    move/from16 v1, v25

    const v2, 0x61763143

    if-ne v9, v2, :cond_4c

    add-int/lit8 v2, v7, -0x8

    .line 1536
    new-array v4, v2, [B

    const/4 v5, 0x0

    .line 1537
    invoke-virtual {v0, v5, v2, v4}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1538
    invoke-static {v4}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    add-int/lit8 v14, v14, 0x8

    .line 1540
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1740
    new-instance v2, Ll/ۜᩴ֫;

    invoke-direct {v2}, Ll/ۜᩴ֫;-><init>()V

    .line 1741
    new-instance v4, Ll/ܽ֨֫;

    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v5

    .line 48
    array-length v6, v5

    invoke-direct {v4, v5, v6}, Ll/ܽ֨֫;-><init>([BI)V

    .line 1742
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v5

    mul-int/lit8 v5, v5, 0x8

    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ᩳ(I)V

    const/4 v5, 0x1

    .line 1746
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܳ(I)V

    const/4 v5, 0x3

    .line 1747
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    const/4 v6, 0x6

    .line 1748
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1749
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    .line 1750
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    const/4 v9, 0x2

    if-ne v5, v9, :cond_35

    if-eqz v6, :cond_34

    if-eqz v8, :cond_32

    const/16 v5, 0xc

    goto :goto_20

    :cond_32
    const/16 v5, 0xa

    .line 1752
    :goto_20
    invoke-virtual {v2, v5}, Ll/ۜᩴ֫;->ܿ(I)V

    if-eqz v8, :cond_33

    const/16 v5, 0xc

    goto :goto_21

    :cond_33
    const/16 v5, 0xa

    .line 1753
    :goto_21
    invoke-virtual {v2, v5}, Ll/ۜᩴ֫;->֫(I)V

    goto :goto_24

    :cond_34
    const/4 v9, 0x2

    :cond_35
    if-gt v5, v9, :cond_38

    if-eqz v6, :cond_36

    const/16 v5, 0xa

    goto :goto_22

    :cond_36
    const/16 v5, 0x8

    .line 1755
    :goto_22
    invoke-virtual {v2, v5}, Ll/ۜᩴ֫;->ܿ(I)V

    if-eqz v6, :cond_37

    const/16 v5, 0xa

    goto :goto_23

    :cond_37
    const/16 v5, 0x8

    .line 1756
    :goto_23
    invoke-virtual {v2, v5}, Ll/ۜᩴ֫;->֫(I)V

    :cond_38
    :goto_24
    const/16 v5, 0xd

    .line 1760
    invoke-virtual {v4, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1763
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܳ()V

    const/4 v6, 0x4

    .line 1764
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const/4 v8, 0x1

    if-eq v6, v8, :cond_39

    .line 1766
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unsupported obu_type: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1767
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    .line 1769
    :cond_39
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_3a

    const-string v4, "Unsupported obu_extension_flag"

    .line 1770
    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1771
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    .line 1773
    :cond_3a
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    .line 1774
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܳ()V

    if-eqz v6, :cond_3b

    const/16 v6, 0x8

    .line 1776
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const/16 v8, 0x7f

    if-le v6, v8, :cond_3b

    const-string v4, "Excessive obu_size"

    .line 1777
    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1778
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    :cond_3b
    const/4 v6, 0x3

    .line 1781
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    .line 1782
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܳ()V

    .line 1783
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_3c

    const-string v4, "Unsupported reduced_still_picture_header"

    .line 1784
    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1785
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    .line 1787
    :cond_3c
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_3d

    const-string v4, "Unsupported timing_info_present_flag"

    .line 1788
    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1789
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    .line 1791
    :cond_3d
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_3e

    const-string v4, "Unsupported initial_display_delay_present_flag"

    .line 1792
    invoke-static {v4}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 1793
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    goto/16 :goto_2c

    :cond_3e
    const/4 v8, 0x5

    .line 1795
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    const/4 v10, 0x0

    :goto_25
    if-gt v10, v9, :cond_40

    .line 1797
    invoke-virtual {v4, v11}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1798
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    const/4 v11, 0x7

    if-le v8, v11, :cond_3f

    .line 1800
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܳ()V

    :cond_3f
    add-int/lit8 v10, v10, 0x1

    const/4 v8, 0x5

    const/16 v11, 0xc

    goto :goto_25

    :cond_40
    const/4 v8, 0x4

    .line 1803
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 1804
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    add-int/lit8 v9, v9, 0x1

    .line 1805
    invoke-virtual {v4, v9}, Ll/ܽ֨֫;->ܿ(I)V

    add-int/lit8 v8, v8, 0x1

    .line 1806
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1807
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_41

    const/4 v8, 0x7

    .line 1808
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_26

    :cond_41
    const/4 v8, 0x7

    .line 1810
    :goto_26
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1811
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_42

    const/4 v9, 0x2

    .line 1813
    invoke-virtual {v4, v9}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1816
    :cond_42
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_43

    const/4 v9, 0x1

    const/4 v10, 0x2

    goto :goto_27

    :cond_43
    const/4 v9, 0x1

    .line 1818
    invoke-virtual {v4, v9}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    :goto_27
    if-lez v10, :cond_44

    .line 1820
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v10

    if-nez v10, :cond_44

    .line 1821
    invoke-virtual {v4, v9}, Ll/ܽ֨֫;->ܿ(I)V

    :cond_44
    if-eqz v8, :cond_45

    const/4 v8, 0x3

    .line 1825
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_28

    :cond_45
    const/4 v8, 0x3

    .line 1827
    :goto_28
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1829
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    const/4 v9, 0x2

    if-ne v6, v9, :cond_46

    if-eqz v8, :cond_46

    .line 1831
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܳ()V

    :cond_46
    const/4 v8, 0x1

    if-eq v6, v8, :cond_47

    .line 1834
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_47

    const/4 v6, 0x1

    goto :goto_29

    :cond_47
    const/4 v6, 0x0

    .line 1836
    :goto_29
    invoke-virtual {v4}, Ll/ܽ֨֫;->ܿ()Z

    move-result v8

    if-eqz v8, :cond_4b

    const/16 v8, 0x8

    .line 1837
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 1838
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    .line 1839
    invoke-virtual {v4, v8}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    if-nez v6, :cond_48

    const/4 v6, 0x1

    if-ne v9, v6, :cond_49

    if-ne v10, v5, :cond_49

    if-nez v8, :cond_49

    const/4 v4, 0x1

    goto :goto_2a

    :cond_48
    const/4 v6, 0x1

    .line 1846
    :cond_49
    invoke-virtual {v4, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v4

    .line 1848
    :goto_2a
    invoke-static {v9}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v5

    invoke-virtual {v2, v5}, Ll/ۜᩴ֫;->ܽ(I)V

    if-ne v4, v6, :cond_4a

    const/4 v4, 0x1

    goto :goto_2b

    :cond_4a
    const/4 v4, 0x2

    .line 1849
    :goto_2b
    invoke-virtual {v2, v4}, Ll/ۜᩴ֫;->ۧ(I)V

    .line 1851
    invoke-static {v10}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v4

    .line 1850
    invoke-virtual {v2, v4}, Ll/ۜᩴ֫;->ᩳ(I)V

    .line 1853
    :cond_4b
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v2

    .line 1543
    :goto_2c
    iget v6, v2, Ll/᩷ᩴ֫;->᩻:I

    .line 1544
    iget v5, v2, Ll/᩷ᩴ֫;->֫:I

    .line 1545
    iget v12, v2, Ll/᩷ᩴ֫;->ܽ:I

    .line 1546
    iget v11, v2, Ll/᩷ᩴ֫;->ۧ:I

    .line 1547
    iget v10, v2, Ll/᩷ᩴ֫;->ᩳ:I

    const-string v8, "video/av01"

    move/from16 v25, v1

    move-object/from16 v24, v15

    goto/16 :goto_38

    :cond_4c
    const v2, 0x636c6c69

    const/16 v4, 0x19

    if-ne v9, v2, :cond_4e

    if-nez p7, :cond_4d

    .line 1910
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v14

    goto :goto_2d

    :cond_4d
    move-object/from16 v14, p7

    :goto_2d
    const/16 v2, 0x15

    .line 1554
    invoke-virtual {v14, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1555
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v2

    invoke-virtual {v14, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1556
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v2

    invoke-virtual {v14, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    :goto_2e
    move/from16 v25, v1

    move/from16 v5, v28

    goto/16 :goto_45

    :cond_4e
    const v2, 0x6d646376

    if-ne v9, v2, :cond_50

    if-nez p7, :cond_4f

    .line 1910
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v14

    goto :goto_2f

    :cond_4f
    move-object/from16 v14, p7

    .line 1563
    :goto_2f
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v2

    .line 1564
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v4

    .line 1565
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v5

    .line 1566
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v6

    .line 1567
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v9

    .line 1568
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v11

    move/from16 v25, v1

    .line 1569
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v1

    move-object/from16 v24, v15

    .line 1570
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֡()S

    move-result v15

    .line 1571
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v35

    .line 1572
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v37

    move/from16 v32, v3

    const/4 v3, 0x1

    .line 1574
    invoke-virtual {v14, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1575
    invoke-virtual {v14, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1576
    invoke-virtual {v14, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1577
    invoke-virtual {v14, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1578
    invoke-virtual {v14, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1579
    invoke-virtual {v14, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1580
    invoke-virtual {v14, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1581
    invoke-virtual {v14, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1582
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v1, 0x2710

    .line 1583
    div-long v3, v35, v1

    long-to-int v4, v3

    int-to-short v3, v4

    invoke-virtual {v14, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1584
    div-long v1, v37, v1

    long-to-int v2, v1

    int-to-short v1, v2

    invoke-virtual {v14, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto/16 :goto_34

    :cond_50
    move/from16 v25, v1

    move/from16 v32, v3

    move-object/from16 v24, v15

    const v1, 0x64323633

    if-ne v9, v1, :cond_52

    if-nez v8, :cond_51

    const/4 v1, 0x1

    goto :goto_30

    :cond_51
    const/4 v1, 0x0

    :goto_30
    const/4 v2, 0x0

    .line 1586
    invoke-static {v2, v1}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    move-object/from16 v8, p1

    goto/16 :goto_40

    :cond_52
    const/4 v1, 0x0

    const v2, 0x65736473

    if-ne v9, v2, :cond_54

    if-nez v8, :cond_53

    const/4 v2, 0x1

    goto :goto_31

    :cond_53
    const/4 v2, 0x0

    .line 1589
    :goto_31
    invoke-static {v1, v2}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    .line 1590
    invoke-static {v14, v0}, Ll/᩹ۖۧ;->֫(ILl/ᩳ֨֫;)Ll/ۖۖۧ;

    move-result-object v27

    .line 1591
    invoke-static/range {v27 .. v27}, Ll/ۖۖۧ;->ܽ(Ll/ۖۖۧ;)Ljava/lang/String;

    move-result-object v8

    .line 1592
    invoke-static/range {v27 .. v27}, Ll/ۖۖۧ;->ۧ(Ll/ۖۖۧ;)[B

    move-result-object v1

    if-eqz v1, :cond_69

    .line 1594
    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    goto/16 :goto_40

    :cond_54
    const v2, 0x62747274

    if-ne v9, v2, :cond_55

    add-int/lit8 v14, v14, 0x8

    .line 2412
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v1, 0x4

    .line 2414
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 2415
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v1

    .line 2416
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v3

    .line 2418
    new-instance v5, Ll/ۡۖۧ;

    invoke-direct {v5, v3, v4, v1, v2}, Ll/ۡۖۧ;-><init>(JJ)V

    move-object/from16 v14, p7

    move-object/from16 v26, v5

    goto :goto_34

    :cond_55
    const v2, 0x70617370

    if-ne v9, v2, :cond_56

    add-int/lit8 v14, v14, 0x8

    .line 1960
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1961
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩹()I

    move-result v1

    .line 1962
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩹()I

    move-result v2

    int-to-float v1, v1

    int-to-float v2, v2

    div-float v11, v1, v2

    const/16 v29, 0x1

    move-object/from16 v14, p7

    goto :goto_35

    :cond_56
    const v2, 0x73763364

    if-ne v9, v2, :cond_59

    add-int/lit8 v2, v14, 0x8

    :goto_32
    sub-int v3, v2, v14

    if-ge v3, v7, :cond_58

    .line 2588
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2589
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    .line 2590
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v4

    const v5, 0x70726f6a

    if-ne v4, v5, :cond_57

    .line 2592
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v1

    add-int/2addr v3, v2

    invoke-static {v1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    goto :goto_33

    :cond_57
    add-int/2addr v2, v3

    goto :goto_32

    :cond_58
    :goto_33
    move-object/from16 v14, p7

    move-object/from16 v17, v1

    :goto_34
    move/from16 v11, v18

    :goto_35
    move-object/from16 v15, v23

    goto/16 :goto_44

    :cond_59
    const v1, 0x73743364

    if-ne v9, v1, :cond_5f

    .line 1604
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    const/4 v2, 0x3

    .line 1605
    invoke-virtual {v0, v2}, Ll/ᩳ֨֫;->ܳ(I)V

    if-nez v1, :cond_5e

    .line 1607
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    if-eqz v1, :cond_5d

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5c

    const/4 v3, 0x2

    if-eq v1, v3, :cond_5b

    if-eq v1, v2, :cond_5a

    goto :goto_36

    :cond_5a
    const/4 v3, 0x3

    goto :goto_37

    :cond_5b
    const/4 v3, 0x2

    goto :goto_37

    :cond_5c
    const/4 v3, 0x1

    goto :goto_37

    :cond_5d
    const/4 v3, 0x0

    goto :goto_37

    :cond_5e
    :goto_36
    move/from16 v3, v32

    :goto_37
    move/from16 v5, v28

    move/from16 v6, v33

    move/from16 v11, v34

    :goto_38
    move-object/from16 v14, p7

    move-object/from16 v15, v24

    goto/16 :goto_46

    :cond_5f
    const v1, 0x61707643

    if-ne v9, v1, :cond_64

    add-int/lit8 v1, v7, -0xc

    .line 1629
    new-array v2, v1, [B

    add-int/lit8 v14, v14, 0xc

    .line 1630
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    const/4 v3, 0x0

    .line 1631
    invoke-virtual {v0, v3, v1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 1632
    invoke-static {v2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v13

    .line 1634
    new-instance v1, Ll/ᩳ֨֫;

    invoke-direct {v1, v2}, Ll/ᩳ֨֫;-><init>([B)V

    .line 1868
    new-instance v2, Ll/ۜᩴ֫;

    invoke-direct {v2}, Ll/ۜᩴ֫;-><init>()V

    .line 1869
    new-instance v3, Ll/ܽ֨֫;

    invoke-virtual {v1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    .line 48
    array-length v5, v4

    invoke-direct {v3, v4, v5}, Ll/ܽ֨֫;-><init>([BI)V

    .line 1870
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    const/16 v4, 0x8

    mul-int/lit8 v1, v1, 0x8

    invoke-virtual {v3, v1}, Ll/ܽ֨֫;->ᩳ(I)V

    const/4 v1, 0x1

    .line 1872
    invoke-virtual {v3, v1}, Ll/ܽ֨֫;->ܳ(I)V

    .line 1873
    invoke-virtual {v3, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    const/4 v6, 0x0

    :goto_39
    if-ge v6, v5, :cond_63

    .line 1875
    invoke-virtual {v3, v1}, Ll/ܽ֨֫;->ܳ(I)V

    .line 1876
    invoke-virtual {v3, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v1

    const/4 v8, 0x0

    :goto_3a
    if-ge v8, v1, :cond_62

    const/4 v9, 0x6

    .line 1878
    invoke-virtual {v3, v9}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1880
    invoke-virtual {v3}, Ll/ܽ֨֫;->ܿ()Z

    move-result v9

    .line 1881
    invoke-virtual {v3}, Ll/ܽ֨֫;->ܳ()V

    const/16 v10, 0xb

    .line 1884
    invoke-virtual {v3, v10}, Ll/ܽ֨֫;->ܳ(I)V

    const/4 v10, 0x4

    .line 1885
    invoke-virtual {v3, v10}, Ll/ܽ֨֫;->ܿ(I)V

    .line 1886
    invoke-virtual {v3, v10}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v10

    add-int/lit8 v10, v10, 0x8

    .line 1887
    invoke-virtual {v2, v10}, Ll/ۜᩴ֫;->ܿ(I)V

    .line 1888
    invoke-virtual {v2, v10}, Ll/ۜᩴ֫;->֫(I)V

    const/4 v10, 0x1

    .line 1889
    invoke-virtual {v3, v10}, Ll/ܽ֨֫;->ܳ(I)V

    if-eqz v9, :cond_61

    .line 1891
    invoke-virtual {v3, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 1892
    invoke-virtual {v3, v4}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v11

    .line 1893
    invoke-virtual {v3, v10}, Ll/ܽ֨֫;->ܳ(I)V

    .line 1894
    invoke-virtual {v3}, Ll/ܽ֨֫;->ܿ()Z

    move-result v10

    .line 1896
    invoke-static {v9}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v9

    invoke-virtual {v2, v9}, Ll/ۜᩴ֫;->ܽ(I)V

    if-eqz v10, :cond_60

    const/4 v9, 0x1

    goto :goto_3b

    :cond_60
    const/4 v9, 0x2

    .line 1897
    :goto_3b
    invoke-virtual {v2, v9}, Ll/ۜᩴ֫;->ۧ(I)V

    .line 1899
    invoke-static {v11}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v9

    .line 1898
    invoke-virtual {v2, v9}, Ll/ۜᩴ֫;->ᩳ(I)V

    :cond_61
    add-int/lit8 v8, v8, 0x1

    goto :goto_3a

    :cond_62
    add-int/lit8 v6, v6, 0x1

    const/4 v1, 0x1

    goto :goto_39

    .line 1903
    :cond_63
    invoke-virtual {v2}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v1

    .line 1636
    iget v6, v1, Ll/᩷ᩴ֫;->᩻:I

    .line 1637
    iget v5, v1, Ll/᩷ᩴ֫;->֫:I

    .line 1638
    iget v2, v1, Ll/᩷ᩴ֫;->ܽ:I

    .line 1639
    iget v3, v1, Ll/᩷ᩴ֫;->ۧ:I

    .line 1640
    iget v1, v1, Ll/᩷ᩴ֫;->ᩳ:I

    const-string v8, "video/apv"

    goto :goto_3f

    :cond_64
    const v1, 0x636f6c72

    if-ne v9, v1, :cond_69

    const/4 v1, -0x1

    if-ne v12, v1, :cond_69

    if-ne v10, v1, :cond_69

    .line 1649
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x6e636c78

    if-eq v1, v2, :cond_66

    const v2, 0x6e636c63

    if-ne v1, v2, :cond_65

    goto :goto_3c

    .line 1668
    :cond_65
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported color type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_40

    .line 1653
    :cond_66
    :goto_3c
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    .line 1654
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v2

    const/4 v3, 0x2

    .line 1655
    invoke-virtual {v0, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    const/16 v3, 0x13

    if-ne v7, v3, :cond_67

    .line 1662
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_67

    const/4 v3, 0x1

    goto :goto_3d

    :cond_67
    const/4 v3, 0x0

    .line 1663
    :goto_3d
    invoke-static {v1}, Ll/᩷ᩴ֫;->ᩳ(I)I

    move-result v1

    if-eqz v3, :cond_68

    const/4 v3, 0x1

    goto :goto_3e

    :cond_68
    const/4 v3, 0x2

    .line 1666
    :goto_3e
    invoke-static {v2}, Ll/᩷ᩴ֫;->ܿ(I)I

    move-result v2

    move/from16 v5, v28

    move/from16 v6, v33

    move/from16 v39, v2

    move v2, v1

    move/from16 v1, v39

    :goto_3f
    move-object/from16 v14, p7

    move v10, v1

    move v12, v2

    move v11, v3

    move-object/from16 v15, v24

    move/from16 v3, v32

    goto :goto_46

    :cond_69
    :goto_40
    move-object/from16 v14, p7

    goto/16 :goto_34

    :cond_6a
    :goto_41
    move/from16 v32, v3

    move-object/from16 v24, v15

    add-int/lit8 v1, v7, -0x8

    .line 1489
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 1490
    invoke-virtual {v0, v3, v1, v2}, Ll/ᩳ֨֫;->֫(II[B)V

    if-eqz v13, :cond_6b

    .line 1494
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v1, Ll/֫۬ܺ;

    invoke-direct {v1}, Ll/֫۬ܺ;-><init>()V

    .line 1495
    invoke-virtual {v1, v13}, Ll/ۛۗܺ;->֫(Ljava/util/List;)V

    .line 1496
    invoke-virtual {v1, v2}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 1497
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v13

    goto :goto_42

    :cond_6b
    const-string v1, "initializationData must already be set from hvcC or avcC atom"

    .line 1499
    invoke-static {v1, v3}, Ll/᩹᩷ۧ;->֫(Ljava/lang/String;Z)V

    :goto_42
    add-int/lit8 v14, v14, 0x8

    .line 1502
    invoke-virtual {v0, v14}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 1503
    invoke-static/range {p0 .. p0}, Ll/᩵֨֫;->֫(Ll/ᩳ֨֫;)Ll/᩵֨֫;

    move-result-object v1

    if-eqz v1, :cond_6c

    .line 1505
    iget-object v15, v1, Ll/᩵֨֫;->֫:Ljava/lang/String;

    const-string v8, "video/dolby-vision"

    goto :goto_43

    :cond_6c
    move-object/from16 v15, v23

    :goto_43
    move-object/from16 v14, p7

    move/from16 v11, v18

    :goto_44
    move/from16 v18, v11

    move-object/from16 v23, v15

    move-object/from16 v15, v24

    move/from16 v5, v28

    move/from16 v3, v32

    :goto_45
    move/from16 v6, v33

    move/from16 v11, v34

    :goto_46
    add-int v7, p9, v7

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v4, p8

    move-object/from16 p7, v14

    move/from16 v9, v25

    goto/16 :goto_2

    :cond_6d
    :goto_47
    move/from16 v32, v3

    move/from16 v28, v5

    move/from16 v33, v6

    move/from16 v34, v11

    if-nez v8, :cond_6e

    return-void

    .line 1680
    :cond_6e
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    move/from16 v1, p4

    .line 1682
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܺ(I)V

    .line 1683
    invoke-virtual {v0, v8}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    move-object/from16 v15, v23

    .line 1684
    invoke-virtual {v0, v15}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    move/from16 v1, v22

    .line 1685
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۙ(I)V

    move/from16 v1, v21

    .line 1686
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۡ(I)V

    move/from16 v1, v20

    .line 1687
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۜ(I)V

    move/from16 v1, v19

    .line 1688
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->᩻(I)V

    move/from16 v11, v18

    .line 1689
    invoke-virtual {v0, v11}, Ll/֨ᩴ֫;->ۧ(F)V

    move/from16 v1, p6

    .line 1690
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֨(I)V

    move-object/from16 v1, v17

    .line 1691
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫([B)V

    move/from16 v3, v32

    .line 1692
    invoke-virtual {v0, v3}, Ll/֨ᩴ֫;->᩸(I)V

    .line 1693
    invoke-virtual {v0, v13}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    move/from16 v1, v30

    .line 1694
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ۘ(I)V

    move/from16 v1, v31

    .line 1695
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ᩴ(I)V

    move-object/from16 v3, v16

    .line 1696
    invoke-virtual {v0, v3}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    move-object/from16 v1, p5

    .line 1697
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    new-instance v1, Ll/ۜᩴ֫;

    invoke-direct {v1}, Ll/ۜᩴ֫;-><init>()V

    .line 1702
    invoke-virtual {v1, v12}, Ll/ۜᩴ֫;->ܽ(I)V

    move/from16 v11, v34

    .line 1703
    invoke-virtual {v1, v11}, Ll/ۜᩴ֫;->ۧ(I)V

    .line 1704
    invoke-virtual {v1, v10}, Ll/ۜᩴ֫;->ᩳ(I)V

    if-eqz p7, :cond_6f

    .line 1705
    invoke-virtual/range {p7 .. p7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    goto :goto_48

    :cond_6f
    const/4 v2, 0x0

    :goto_48
    invoke-virtual {v1, v2}, Ll/ۜᩴ֫;->֫([B)V

    move/from16 v6, v33

    .line 1706
    invoke-virtual {v1, v6}, Ll/ۜᩴ֫;->ܿ(I)V

    move/from16 v5, v28

    .line 1707
    invoke-virtual {v1, v5}, Ll/ۜᩴ֫;->֫(I)V

    .line 1708
    invoke-virtual {v1}, Ll/ۜᩴ֫;->֫()Ll/᩷ᩴ֫;

    move-result-object v1

    .line 1700
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֫(Ll/᩷ᩴ֫;)V

    if-eqz v26, :cond_70

    .line 1712
    invoke-static/range {v26 .. v26}, Ll/ۡۖۧ;->֫(Ll/ۡۖۧ;)J

    move-result-wide v1

    .line 1713
    invoke-static {v1, v2}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-static/range {v26 .. v26}, Ll/ۡۖۧ;->ۧ(Ll/ۡۖۧ;)J

    move-result-wide v1

    .line 1714
    invoke-static {v1, v2}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֡(I)V

    goto :goto_49

    :cond_70
    if-eqz v27, :cond_71

    .line 1716
    invoke-static/range {v27 .. v27}, Ll/ۖۖۧ;->֫(Ll/ۖۖۧ;)J

    move-result-wide v1

    .line 1717
    invoke-static {v1, v2}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܽ(I)V

    invoke-static/range {v27 .. v27}, Ll/ۖۖۧ;->ᩳ(Ll/ۖۖۧ;)J

    move-result-wide v1

    .line 1718
    invoke-static {v1, v2}, Ll/۬᩺ܺ;->ۧ(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->֡(I)V

    .line 1721
    :cond_71
    :goto_49
    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    move-object/from16 v1, p8

    iput-object v0, v1, Ll/ۚۖۧ;->֫:Ll/۠ᩴ֫;

    return-void
.end method

.method public static ۧ(Ll/ᩳ֨֫;)I
    .locals 3

    .line 2601
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    .line 2604
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static ܽ(Ll/ᩳ֨֫;)Ll/᩹֨֫;
    .locals 11

    const/16 v0, 0x8

    .line 225
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 226
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 227
    invoke-static {v0}, Ll/᩹ۖۧ;->֫(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 231
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    .line 232
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v0

    .line 235
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v2

    :goto_0
    move-wide v5, v0

    move-wide v7, v2

    .line 238
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v9

    .line 239
    new-instance p0, Ll/᩹֨֫;

    move-object v4, p0

    invoke-direct/range {v4 .. v10}, Ll/᩹֨֫;-><init>(JJJ)V

    return-object p0
.end method
