.class public final Ll/ۗۘ᩻;
.super Ljava/lang/Object;
.source "DAFW"


# static fields
.field public static final ֫:Ll/ᩴۤܳ;

.field private static final ᩻ۖۜ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x2c

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۘ᩻;->᩻ۖۜ:[S

    .line 100
    new-instance v0, Ll/ᩴۤܳ;

    new-instance v1, Ll/ۙۘ᩻;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v2, Ll/ۛܳ᩻;

    invoke-direct {v2}, Ll/ۛܳ᩻;-><init>()V

    invoke-direct {v0, v1, v2}, Ll/ᩴۤܳ;-><init>(Ll/ۗۖ֡;Ll/ۛܳ᩻;)V

    sput-object v0, Ll/ۗۘ᩻;->֫:Ll/ᩴۤܳ;

    return-void

    :array_0
    .array-data 2
        0x140bs
        0x55e8s
        0x55ebs
        0x55ees
        0x55f7s
        0x55e9s
        0x55f7s
        0x55e9s
        0x55f7s
        0x55e8s
        0x55aas
        0x55bfs
        0x55ads
        0x55a9s
    .end array-data
.end method

.method public static bridge synthetic ֫(Ll/᩵ᩴ᩻;)Ll/֫ۜۘ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۗۘ᩻;->ᩳ(Ll/᩵ᩴ᩻;)Ll/֫ۜۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֫ۜۘ;)V
    .locals 2

    .line 182
    :try_start_0
    sget-object v0, Ll/ۗۘ᩻;->֫:Ll/ᩴۤܳ;

    iget-object v1, p0, Ll/֫ۜۘ;->᩻֫:Ll/᩵ᩴ᩻;

    invoke-virtual {v0, v1, p0}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۧ(Ll/᩵ᩴ᩻;)Ll/֫ۜۘ;
    .locals 2

    .line 167
    :try_start_0
    sget-object v0, Ll/ۗۘ᩻;->֫:Ll/ᩴۤܳ;

    invoke-virtual {v0, p0}, Ll/ᩴۤܳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ۜۘ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 169
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 172
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 173
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_0

    .line 174
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 176
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 170
    :cond_1
    check-cast p0, Ljava/io/IOException;

    throw p0
.end method

.method public static ܽ(Ll/᩵ᩴ᩻;)V
    .locals 1

    .line 162
    sget-object v0, Ll/ۗۘ᩻;->֫:Ll/ᩴۤܳ;

    invoke-virtual {v0, p0}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static native ܿ(Ll/᩵ᩴ᩻;)Ll/۟ۢۘ;
.end method

.method public static ᩳ(Ll/᩵ᩴ᩻;)Ll/֫ۜۘ;
    .locals 24

    move-object/from16 v1, p0

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

    const v17, -0x40527b54

    sget v18, Ll/֫᩵;->ܶ᩻᩷:I

    sget v19, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v20, "\u0733\u06d9"

    invoke-static/range {v20 .. v20}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v20

    add-int v20, v20, v19

    mul-int/lit8 v20, v20, -0x2d

    xor-int v0, v20, v18

    mul-int/lit16 v0, v0, -0x6621

    const v22, -0x6e8e83f5

    xor-int v0, v0, v22

    const v22, -0x67734cbf

    xor-int v20, v20, v22

    move-object v3, v2

    move-object v5, v4

    move-object/from16 v17, v7

    move-object v11, v10

    move-object v13, v12

    move-object/from16 v16, v15

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v12, 0x0

    const v20, -0x40527b54

    const/16 v22, 0x0

    move-object v7, v6

    move-object v10, v9

    move-object v15, v14

    const/4 v6, 0x0

    const/4 v14, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v4, v20, v18

    mul-int/lit16 v4, v4, -0x2115

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v20, v21, v0

    sparse-switch v20, :sswitch_data_0

    move-object/from16 v21, v10

    move/from16 v4, v22

    sget-object v0, Ll/ۗۘ᩻;->᩻ۖۜ:[S

    const/4 v1, 0x1

    const/16 v2, 0x9

    invoke-static {v0, v1, v2, v8}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-static/range {p0 .. p0}, Ll/ۗۘ᩻;->ܿ(Ll/᩵ᩴ᩻;)Ll/۟ۢۘ;

    move-result-object v3

    .line 59
    invoke-static {v3}, Ll/ۢᩴ᩻;->֫(Ll/۟ۢۘ;)V

    goto/16 :goto_12

    :sswitch_0
    return-object v16

    .line 68
    :sswitch_1
    :try_start_0
    new-instance v0, Ll/֨ᩴ᩻;

    .line 69
    iget-boolean v4, v13, Ll/ۖۘ᩻;->ᩳ֫:Z

    if-eqz v4, :cond_0

    move-object/from16 v21, v10

    move-object/from16 v10, v17

    goto :goto_1

    :cond_0
    move-object/from16 v21, v10

    iget-object v10, v13, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    :goto_1
    if-eqz v4, :cond_1

    .line 70
    invoke-virtual {v13}, Ll/ۖۘ᩻;->ۢ()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_1
    move-object/from16 v4, v17

    :goto_2
    invoke-direct {v0, v10, v4}, Ll/֨ᩴ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v3, v0}, Ll/۟ۢۘ;->֫(Ll/ᩴۡۘ;)V

    .line 72
    invoke-virtual {v3}, Ll/۟ۢۘ;->֫()V

    .line 73
    iget-object v0, v1, Ll/᩵ᩴ᩻;->ۧ:Ljava/lang/String;

    iget v4, v1, Ll/᩵ᩴ᩻;->ۜ:I

    const/4 v10, 0x0

    .line 2308
    invoke-virtual {v3, v2, v10, v4, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;IILjava/lang/String;)I

    move-result v0

    .line 76
    new-instance v4, Ll/᩶᩷ۘ;

    invoke-direct {v4}, Ll/᩶᩷ۘ;-><init>()V

    iget-object v10, v1, Ll/᩵ᩴ᩻;->᩷:Ljava/lang/String;

    .line 20
    invoke-virtual {v4, v0, v10, v2}, Ll/᩶᩷ۘ;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/۟ۢۘ;

    move-result-object v4

    .line 21
    invoke-static {v4}, Ll/ۢᩴ᩻;->֫(Ll/۟ۢۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    :try_start_1
    invoke-virtual {v4, v3}, Ll/۟ۢۘ;->֫(Ll/۟ۢۘ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v11, v4

    move/from16 v4, v22

    goto/16 :goto_c

    :catch_0
    move-exception v0

    move-object v10, v0

    move-object v9, v4

    move/from16 v4, v22

    goto/16 :goto_11

    :sswitch_2
    move-object/from16 v21, v10

    .line 64
    :try_start_2
    iget-object v0, v13, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v13}, Ll/ۖۘ᩻;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Ll/۟ۢۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :sswitch_3
    move-object/from16 v21, v10

    .line 66
    iget-object v0, v13, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ll/۟ۢۘ;->ܽ(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    const-string v0, "\u1a74\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0xa71

    const v10, 0x217d4b6c

    xor-int/2addr v4, v10

    const v10, -0x347b7cd4    # -1.7368664E7f

    goto/16 :goto_9

    :catch_1
    move-exception v0

    move-object v9, v3

    goto/16 :goto_b

    :sswitch_4
    move-object/from16 v21, v10

    .line 80
    :try_start_3
    invoke-virtual {v11, v7, v15}, Ll/۟ۢۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_8

    :sswitch_5
    move-object/from16 v21, v10

    if-eqz v14, :cond_2

    const-string v0, "\u06eb\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v19

    mul-int/lit16 v4, v4, 0x891

    const v10, -0x1e510482

    xor-int/2addr v4, v10

    const v10, -0x65c620a

    goto/16 :goto_9

    :cond_2
    const-string v0, "\u073a\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0xd

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x68df

    const v10, -0x1025730

    xor-int/2addr v4, v10

    const v10, 0x26ad7a85

    goto/16 :goto_9

    :sswitch_6
    move-object/from16 v21, v10

    if-eqz v12, :cond_3

    move-object/from16 v15, v17

    goto :goto_4

    :cond_3
    move-object v15, v5

    :goto_4
    const-string v0, "\u06e4\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x2f

    xor-int v4, v0, v19

    mul-int/lit16 v4, v4, 0xb19

    const v10, -0x523c056

    xor-int/2addr v4, v10

    const v10, 0x5e05ae91

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v21, v10

    .line 84
    :try_start_4
    new-instance v0, Ll/֨ᩴ᩻;

    if-eqz v6, :cond_4

    move-object/from16 v4, v17

    goto :goto_5

    :cond_4
    move-object v4, v7

    :goto_5
    if-eqz v6, :cond_6

    .line 56
    invoke-static {v5}, Ll/۟;->᩻֡᩵(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    goto :goto_6

    :cond_5
    move-object v10, v5

    goto :goto_7

    :cond_6
    :goto_6
    move-object/from16 v10, v17

    .line 86
    :goto_7
    invoke-direct {v0, v4, v10}, Ll/֨ᩴ᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v11, v0}, Ll/۟ۢۘ;->֫(Ll/ᩴۡۘ;)V

    .line 88
    invoke-virtual {v11}, Ll/۟ۢۘ;->֫()V

    sget-object v0, Ll/ۗۘ᩻;->᩻ۖۜ:[S

    const/16 v4, 0xa

    const/4 v10, 0x4

    invoke-static {v0, v4, v10, v8}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v0

    .line 89
    invoke-virtual {v11, v0}, Ll/۟ۢۘ;->ۧ(Ljava/lang/String;)Ll/᩵᩻ۘ;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/֫ۜۘ;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 90
    :try_start_5
    iget-object v0, v1, Ll/᩵ᩴ᩻;->֫:Ljava/lang/String;

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/֫ۜۘ;->֫(Ljava/nio/charset/Charset;)V

    const/16 v0, 0x4e20

    .line 91
    invoke-virtual {v4, v0}, Ll/᩵᩻ۘ;->֫(I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    const-string v0, "\u06e4\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x7

    xor-int v10, v0, v19

    mul-int/lit16 v10, v10, -0x1e13

    const v16, 0xe6ef6ce

    xor-int v10, v10, v16

    const v16, -0x2ee60631

    xor-int v0, v0, v16

    move-object/from16 v16, v4

    goto/16 :goto_e

    :catch_2
    move-exception v0

    move-object/from16 v16, v4

    goto :goto_a

    :sswitch_8
    move-object/from16 v21, v10

    .line 56
    :try_start_6
    invoke-static {v5}, Ll/۟;->᩻֡᩵(Ljava/lang/Object;)Z

    move-result v12
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    const-string v0, "\u1a75\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x13

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0x794d

    const v10, 0x2d3ed712

    xor-int/2addr v4, v10

    const v10, -0x2d0ff5f0

    goto :goto_9

    :sswitch_9
    move-object/from16 v21, v10

    .line 82
    :try_start_7
    invoke-virtual {v11, v7}, Ll/۟ۢۘ;->ܽ(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :goto_8
    const-string v0, "\u0736\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v19

    mul-int/lit16 v4, v4, -0x6c61

    const v10, -0x5b6eff22

    xor-int/2addr v4, v10

    const v10, -0x1cbd0fb1

    :goto_9
    xor-int/2addr v0, v10

    move-object/from16 v10, v21

    move/from16 v21, v0

    move v0, v4

    goto/16 :goto_0

    :catch_3
    move-exception v0

    :goto_a
    move-object v9, v11

    :goto_b
    move/from16 v4, v22

    goto/16 :goto_10

    :sswitch_a
    move-object/from16 v21, v10

    .line 94
    invoke-virtual {v9}, Ll/۟ۢۘ;->ۧ()V

    .line 95
    throw v21

    :sswitch_b
    move-object/from16 v21, v10

    .line 62
    :try_start_8
    iget-object v0, v1, Ll/᩵ᩴ᩻;->ܽ:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    move/from16 v4, v22

    :try_start_9
    invoke-static {v4, v0}, Ll/᩵ᩴ᩻;->֫(ILjava/lang/String;)Ll/ۖۘ᩻;

    move-result-object v13

    .line 63
    iget-boolean v14, v13, Ll/ۖۘ᩻;->ᩳ֫:Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    const-string v0, "\u06e4\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x55

    xor-int v10, v0, v18

    mul-int/lit16 v10, v10, 0x6bf

    const v22, 0x49aaecb6    # 1400214.8f

    xor-int v10, v10, v22

    const v22, -0x51ba1c2d

    goto/16 :goto_d

    :catch_4
    move-exception v0

    move/from16 v4, v22

    goto/16 :goto_f

    :sswitch_c
    move-object/from16 v21, v10

    move/from16 v4, v22

    if-eqz v6, :cond_7

    const-string v0, "\u06ec\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v10, v0, v18

    mul-int/lit16 v10, v10, -0x5299

    const v22, 0x1f718179

    xor-int v10, v10, v22

    const v22, -0x77b5565a

    goto :goto_d

    :cond_7
    const-string v0, "\u06e8\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v10, v0, v19

    mul-int/lit16 v10, v10, -0x4a73

    const v22, -0x464a12b7

    xor-int v10, v10, v22

    const v22, -0x4ba53f40

    goto :goto_d

    :sswitch_d
    move-object/from16 v21, v10

    move/from16 v4, v22

    .line 61
    iget-object v5, v1, Ll/᩵ᩴ᩻;->ܿ:Ljava/lang/String;

    iget-boolean v6, v1, Ll/᩵ᩴ᩻;->ܳ:Z

    iget-object v7, v1, Ll/᩵ᩴ᩻;->᩻:Ljava/lang/String;

    const/4 v0, -0x1

    const/16 v17, 0x0

    if-eq v4, v0, :cond_8

    const-string v0, "\u06dc\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x4f

    xor-int v10, v0, v18

    mul-int/lit16 v10, v10, -0x4f13

    const v22, -0x2699d36a

    xor-int v10, v10, v22

    const v22, -0xb5c7209

    goto :goto_d

    :cond_8
    move-object v11, v3

    :goto_c
    const-string v0, "\u1a79\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v10, v0, v19

    mul-int/lit16 v10, v10, 0x5dfd

    const v22, 0x76f20d49

    xor-int v10, v10, v22

    const v22, 0x7a42f973

    :goto_d
    xor-int v0, v0, v22

    move/from16 v22, v4

    :goto_e
    move-object/from16 v23, v21

    move/from16 v21, v0

    move v0, v10

    move-object/from16 v10, v23

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v21, v10

    move/from16 v4, v22

    :try_start_a
    iget v0, v1, Ll/᩵ᩴ᩻;->ᩳ:I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    const-string v4, "\u06d9\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v19

    xor-int v10, v4, v18

    mul-int/lit16 v10, v10, -0x38b1

    const v22, 0x140ea3d5

    xor-int v10, v10, v22

    const v22, 0x1c88ceb3

    xor-int v4, v4, v22

    move/from16 v22, v0

    move v0, v10

    move-object/from16 v10, v21

    move/from16 v21, v4

    goto/16 :goto_0

    :catch_5
    move-exception v0

    :goto_f
    move-object v9, v3

    :goto_10
    move-object v10, v0

    :goto_11
    const-string v0, "\u1a77\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x7b71

    const v21, 0x636bef6

    xor-int v1, v1, v21

    const v21, 0x11062c7e

    xor-int v21, v0, v21

    move v0, v1

    move/from16 v22, v4

    goto/16 :goto_15

    :goto_12
    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x55

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1341

    const v10, -0x47089ff7

    xor-int/2addr v1, v10

    const v10, -0x1e4ebcc5

    goto :goto_14

    :sswitch_f
    move-object/from16 v21, v10

    move/from16 v4, v22

    const v0, 0xc010

    const v8, 0xc010

    goto :goto_13

    :sswitch_10
    move-object/from16 v21, v10

    move/from16 v4, v22

    const/16 v0, 0x55d9

    const/16 v8, 0x55d9

    :goto_13
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x51f3

    const v10, 0x3e6b8dd5

    xor-int/2addr v1, v10

    const v10, -0x1cae7161

    goto :goto_14

    :sswitch_11
    move-object/from16 v21, v10

    move/from16 v4, v22

    sget-object v0, Ll/ۗۘ᩻;->᩻ۖۜ:[S

    const/4 v1, 0x0

    aget-short v0, v0, v1

    mul-int/lit16 v1, v0, 0x134

    add-int/lit8 v0, v0, 0x4d

    mul-int v0, v0, v0

    sub-int/2addr v1, v0

    if-gtz v1, :cond_9

    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1b11

    const v10, 0x3151c4d5

    xor-int/2addr v1, v10

    const v10, 0x7acc1176

    :goto_14
    xor-int/2addr v0, v10

    move/from16 v22, v4

    move-object/from16 v10, v21

    move/from16 v21, v0

    move v0, v1

    :goto_15
    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06dc\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x6011

    const v10, -0x361787cb

    xor-int/2addr v1, v10

    const v10, -0x37368286

    goto :goto_14

    nop

    :sswitch_data_0
    .sparse-switch
        -0x65717587 -> :sswitch_c
        -0x50f6319d -> :sswitch_2
        -0x4a176659 -> :sswitch_7
        -0x44549501 -> :sswitch_6
        -0x3f3220fd -> :sswitch_11
        -0x38ff8a98 -> :sswitch_a
        -0x2f96590f -> :sswitch_e
        -0x2b92f53d -> :sswitch_b
        -0x29b7f1e2 -> :sswitch_5
        -0x290b4760 -> :sswitch_10
        -0x1d0f402f -> :sswitch_9
        -0x1a4dc730 -> :sswitch_8
        -0x186618f1 -> :sswitch_f
        -0xf801dcf -> :sswitch_d
        -0xaf1ecef -> :sswitch_7
        -0x37ab297 -> :sswitch_6
        -0x41295c -> :sswitch_5
        0x37ab748 -> :sswitch_3
        0xbe996ed -> :sswitch_1
        0x19c3d89d -> :sswitch_10
        0x27704cb2 -> :sswitch_1
        0x2e0e5559 -> :sswitch_3
        0x32e59aa8 -> :sswitch_2
        0x47641d17 -> :sswitch_11
        0x47afed1f -> :sswitch_a
        0x48bf3be9 -> :sswitch_4
        0x4deb55ab -> :sswitch_d
        0x4fb9ccfb -> :sswitch_e
        0x5ad2bfa2 -> :sswitch_c
        0x5ae9c73e -> :sswitch_b
        0x64bd8107 -> :sswitch_8
        0x66bf9ef5 -> :sswitch_9
        0x680f4f35 -> :sswitch_0
        0x7045e37c -> :sswitch_0
        0x769cc31b -> :sswitch_f
        0x76cdbc8b -> :sswitch_4
    .end sparse-switch
.end method
