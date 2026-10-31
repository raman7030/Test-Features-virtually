.class public final synthetic Ll/ᩴ᩵ۡ;
.super Ljava/lang/Object;
.source "51RP"

# interfaces
.implements Ll/֫᩹᩵;


# static fields
.field private static final ܿܰ۠:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ᩵ۡ;->ܿܰ۠:[S

    return-void

    :array_0
    .array-data 2
        0x5e1s
        0x561as
        0x5618s
        0x5617s
        0x5618s
        0x560bs
        0x5600s
        0x560es
        0x5601s
        0x561cs
        0x564cs
        0x564cs
        0x5648s
        0x564bs
        0x564as
        0x5640s
        0x564bs
        0x561as
        0x564fs
        0x561ds
        0x5641s
        0x5649s
        0x564bs
        0x564cs
        0x5640s
        0x560es
        0x5601s
        0x561cs
        0x561bs
        0x561as
        0x564as
        0x561fs
        0x561bs
        0x561bs
        0x564es
        0x564es
        0x564ds
        0x5648s
        0x561as
        0x5648s
        0x564fs
        0x561as
        0x561cs
    .end array-data
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 22

    const/4 v1, 0x0

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

    const v16, 0x4785b8d2

    sget v17, Ll/֡۬;->۠֡᩶:I

    sget v18, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v19, "\u0730\u06e8"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    xor-int v0, v19, v18

    mul-int/lit16 v0, v0, 0x2df3

    const v21, 0x76f016f5

    xor-int v0, v0, v21

    const v21, 0x9cd3a76

    xor-int v19, v19, v21

    move-object/from16 v16, v2

    move-object v10, v9

    move-object v13, v12

    move-object v15, v14

    move/from16 v20, v19

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, 0x4785b8d2

    const/16 v21, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v4, v19, v18

    mul-int/lit16 v4, v4, -0xe47

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    .line 41
    invoke-static {v10, v11, v12, v9}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    .line 1182
    invoke-static {v1, v0, v4}, Ll/ۗۙ᩵;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\u1a75\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x223

    const v20, 0x3e296741

    xor-int v4, v4, v20

    const v20, 0x5ddbea77

    goto/16 :goto_7

    .line 942
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :sswitch_2
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-nez v0, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_2

    .line 135
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    const/4 v0, 0x0

    return-object v0

    .line 42
    :sswitch_5
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v2, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    .line 43
    invoke-interface {v0, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    return-object v0

    :sswitch_6
    const/16 v0, 0x12

    .line 1182
    invoke-static {v15, v3, v0, v9}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :sswitch_7
    sget-object v15, Ll/ᩴ᩵ۡ;->ܿܰ۠:[S

    const/16 v3, 0x19

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v0, "\u06dc\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x26f1

    const v20, -0x15d7379a

    xor-int v4, v4, v20

    const v20, 0x212ef4f6

    goto/16 :goto_7

    :sswitch_8
    const/16 v0, 0x12

    invoke-static {v13, v14, v0, v9}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v2, v0

    const-string v0, "\u06da\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x3d

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x2a0d

    const v20, -0x2310f891

    xor-int v4, v4, v20

    const v20, 0x191fd8d2

    goto/16 :goto_7

    :sswitch_9
    sget-object v13, Ll/ᩴ᩵ۡ;->ܿܰ۠:[S

    const/4 v14, 0x7

    .line 787
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u05a1\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x37

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x54a1

    const v20, -0x7e589d30

    xor-int v4, v4, v20

    const v20, -0x46ad74b0

    goto/16 :goto_7

    :cond_2
    const-string v0, "\u06d9\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x5f89

    const v20, 0xf247804

    xor-int v4, v4, v20

    const v20, 0x3a49e5cb

    goto/16 :goto_7

    :sswitch_a
    const/4 v12, 0x6

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_3

    :goto_2
    const-string v0, "\u073f\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x426b

    const v20, 0x78c4b539

    xor-int v4, v4, v20

    const v20, 0x3bdafd7e

    goto/16 :goto_7

    :cond_3
    const-string v0, "\u073d\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x5f

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0xb4b

    const v20, -0x3d8f6933

    xor-int v4, v4, v20

    const v20, 0x7a87b7ce

    goto/16 :goto_7

    :sswitch_b
    const/4 v11, 0x1

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u073a\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x3b

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0x4b3f

    const v20, 0x68cb876d

    xor-int v4, v4, v20

    const v20, 0x49a5919e    # 1356339.8f

    goto/16 :goto_7

    .line 41
    :sswitch_c
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v1

    sget-object v10, Ll/ᩴ᩵ۡ;->ܿܰ۠:[S

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u1a77\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x77e3

    const v20, 0x42baf63e

    xor-int v4, v4, v20

    const v20, 0x28fb00e8

    goto/16 :goto_7

    :sswitch_d
    const v0, 0xc798

    const v9, 0xc798

    goto :goto_3

    :sswitch_e
    const/16 v0, 0x5679

    const/16 v9, 0x5679

    :goto_3
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x41

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x59d

    const v20, -0x5a079479

    xor-int v4, v4, v20

    const v20, 0xe81abbe

    goto/16 :goto_7

    :sswitch_f
    mul-int v0, v5, v8

    sub-int/2addr v0, v7

    if-lez v0, :cond_6

    const-string v0, "\u0736\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0x716b

    const v20, -0x27a27220

    xor-int v4, v4, v20

    const v20, -0x35a4e31c    # -3589945.0f

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x41

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x3791

    const v20, -0x63cebe66

    xor-int v4, v4, v20

    const v20, 0x74688fac

    goto/16 :goto_7

    :sswitch_10
    const/16 v8, 0x6bcc

    .line 1102
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    :goto_4
    const-string v0, "\u06d9\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x30d

    const v20, -0x13d63af7

    xor-int v4, v4, v20

    const v20, -0x11712048

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06da\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x4f

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x6779

    const v20, 0x702bd3ff

    xor-int v4, v4, v20

    const v20, 0x7b6ae7bc

    goto/16 :goto_7

    :sswitch_11
    const v0, 0xb590aa4

    add-int v7, v6, v0

    .line 71
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_a

    :cond_9
    const-string v0, "\u06d7\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x7ecb

    const v20, 0x59fbc36b

    xor-int v4, v4, v20

    const v20, -0x2961867e

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u0730\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xf

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0x597d

    const v20, -0x21a06e7f

    xor-int v4, v4, v20

    const v20, 0x3ef79115

    goto/16 :goto_7

    :sswitch_12
    aget-short v5, v16, v21

    mul-int v6, v5, v5

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u06eb\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x65f3

    const v20, -0x37c5d354

    xor-int v4, v4, v20

    const v20, -0x5b180842    # -1.0059997E-16f

    goto :goto_7

    :sswitch_13
    const/16 v21, 0x0

    .line 792
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u06dc\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, -0x4d5f

    const v20, 0x1066eeec

    xor-int v4, v4, v20

    const v20, -0x22d6fb36

    goto :goto_7

    :cond_d
    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x4b

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x23d1

    const v20, -0xa867ee2

    xor-int v4, v4, v20

    const v20, 0x280d4da8

    goto :goto_7

    :sswitch_14
    sget-object v16, Ll/ᩴ᩵ۡ;->ܿܰ۠:[S

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_e

    :goto_6
    const-string v0, "\u06df\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0xf1f

    const v20, 0x756e0ed7

    xor-int v4, v4, v20

    const v20, 0x3ffba4ae

    goto :goto_7

    :cond_e
    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x4f

    xor-int v4, v0, v18

    mul-int/lit16 v4, v4, 0x6fd9

    const v20, 0x55f0ede0

    xor-int v4, v4, v20

    const v20, -0x5b496312

    :goto_7
    xor-int v20, v0, v20

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76d97bb6 -> :sswitch_14
        -0x73c7f96c -> :sswitch_2
        -0x707a33a6 -> :sswitch_a
        -0x6f3a2957 -> :sswitch_10
        -0x6e9a9a72 -> :sswitch_0
        -0x6b8dbb98 -> :sswitch_9
        -0x678ce741 -> :sswitch_13
        -0x66521367 -> :sswitch_12
        -0x5a7fc06b -> :sswitch_b
        -0x5a6462d8 -> :sswitch_12
        -0x55f16326 -> :sswitch_4
        -0x557fd7e3 -> :sswitch_3
        -0x53a9e17a -> :sswitch_6
        -0x4b39556a -> :sswitch_10
        -0x495dfcf4 -> :sswitch_4
        -0x48cec4dd -> :sswitch_9
        -0x47ca6571 -> :sswitch_3
        -0x318a2b02 -> :sswitch_1
        -0x31553ed5 -> :sswitch_e
        -0x2fc6cc59 -> :sswitch_b
        -0x2dd2bbc6 -> :sswitch_2
        -0x2bad62bf -> :sswitch_d
        -0x2a0ed426 -> :sswitch_f
        -0x2901f925 -> :sswitch_11
        -0x20a176ce -> :sswitch_1
        -0x175ef9d3 -> :sswitch_7
        0x2a8607f -> :sswitch_6
        0x837d3ca -> :sswitch_a
        0x11269ccf -> :sswitch_14
        0x1529bdcc -> :sswitch_13
        0x16c379b4 -> :sswitch_5
        0x1873ea41 -> :sswitch_8
        0x1ad1790e -> :sswitch_c
        0x220f440b -> :sswitch_8
        0x27103c4a -> :sswitch_0
        0x287a0b58 -> :sswitch_d
        0x299f2f83 -> :sswitch_11
        0x34c3187f -> :sswitch_f
        0x383623fa -> :sswitch_c
        0x45339279 -> :sswitch_7
        0x60262c7b -> :sswitch_e
        0x6f6ab418 -> :sswitch_5
    .end sparse-switch
.end method
