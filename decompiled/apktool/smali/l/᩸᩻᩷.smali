.class public final Ll/᩸᩻᩷;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/֨᩻᩷;


# static fields
.field private static final ܽۖۛ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸᩻᩷;->ܽۖۛ:[S

    return-void

    :array_0
    .array-data 2
        0x1718s
        0x153ds
        0x1573s
        0x1561s
        0x1561s
        0x1577s
        0x1566s
        0x1561s
        0x153ds
        0x153cs
        0x157fs
        0x1566s
        0x157es
    .end array-data
.end method


# virtual methods
.method public final ֫(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x21364e64

    sget v11, Ll/֨۬;->۫ۙ᩺:I

    sget v12, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v13, "\u1a79\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x1b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x785

    const v15, 0x71bf9c88

    xor-int/2addr v14, v15

    const v15, 0x511ca43d

    :goto_0
    xor-int/2addr v13, v15

    const/4 v15, 0x0

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x10f5

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 353
    invoke-static {v15}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Ll/᩶᩻᩷;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    .line 152
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_0

    goto :goto_4

    :cond_0
    :goto_2
    move-object/from16 v0, p2

    goto/16 :goto_8

    .line 306
    :sswitch_1
    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v13, :cond_1

    goto :goto_4

    :cond_1
    move-object/from16 v0, p2

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object/from16 v0, p2

    goto/16 :goto_7

    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    :goto_4
    const-string v13, "\u06db\u073d"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x591b

    const v16, -0x7b1188d6

    xor-int v14, v14, v16

    const v16, 0x18782940

    goto/16 :goto_9

    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 v0, 0x0

    return-object v0

    .line 353
    :sswitch_5
    invoke-static {v15, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    sget v13, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v13, :cond_3

    goto :goto_3

    :cond_3
    const-string v13, "\u1a77\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x3d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3825

    const v16, -0x79412012

    xor-int v14, v14, v16

    const v16, 0xaf15e26

    goto/16 :goto_9

    :sswitch_6
    const/16 v1, 0x9

    const/4 v13, 0x4

    .line 353
    invoke-static {v9, v1, v13, v8}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    sget-boolean v13, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u06da\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x41

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x512f

    const v16, -0x61021f75

    xor-int v14, v14, v16

    const v16, 0x5bf3b93b

    goto/16 :goto_9

    :sswitch_7
    new-instance v15, Ljava/lang/StringBuilder;

    sget-object v13, Ll/᩸᩻᩷;->ܽۖۛ:[S

    const/4 v14, 0x1

    .line 349
    sget v16, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v16, :cond_5

    goto/16 :goto_2

    :cond_5
    const/16 v0, 0x8

    .line 353
    invoke-static {v13, v14, v0, v8}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v0

    .line 211
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v13

    if-eqz v13, :cond_6

    goto/16 :goto_2

    .line 353
    :cond_6
    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-static {v15, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v9, Ll/᩸᩻᩷;->ܽۖۛ:[S

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v13

    if-gtz v13, :cond_7

    const-string v13, "\u1a76\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x57

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x41d3

    const v16, 0x64079495    # 1.0004068E22f

    xor-int v14, v14, v16

    const v16, -0x3921f155

    goto/16 :goto_9

    :cond_7
    const-string v13, "\u06ec\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x33

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7b53

    const v16, 0x37a07fe7

    xor-int v14, v14, v16

    const v16, 0x2f40b196

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v0, p2

    const v8, 0x9058

    goto :goto_5

    :sswitch_9
    move-object/from16 v0, p2

    const/16 v8, 0x1512

    :goto_5
    const-string v13, "\u06e4\u05ab"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x18fd

    const v16, -0x7ed94b9c

    xor-int v14, v14, v16

    const v16, -0x1e1d3a00

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v0, p2

    add-int v13, v6, v7

    add-int/2addr v13, v13

    sub-int v13, v5, v13

    if-gtz v13, :cond_8

    const-string v13, "\u06d9\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5fd1

    const v16, -0xff0dc9f

    xor-int v14, v14, v16

    const v16, -0x40f6fb7d

    goto/16 :goto_9

    :cond_8
    const-string v13, "\u1a77\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x3d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5a41

    const v16, 0x1c34f9b

    xor-int v14, v14, v16

    const v16, 0x103439bb

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v0, p2

    const v7, 0x16259e9

    .line 275
    sget v13, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v13, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v13, "\u06ec\u06d8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x73

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2fcb

    const v16, -0x4c782dfa

    xor-int v14, v14, v16

    const v16, 0x1a19674f

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v0, p2

    add-int v5, v3, v4

    mul-int v5, v5, v5

    mul-int v6, v3, v3

    .line 329
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v13

    if-gtz v13, :cond_a

    goto/16 :goto_8

    :cond_a
    const-string v13, "\u1a75\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x61

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1fcb

    const v16, 0x23b94f23

    xor-int v14, v14, v16

    const v16, -0x2a161790

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v0, p2

    const/4 v3, 0x0

    aget-short v3, v2, v3

    const/16 v4, 0x12d3

    .line 48
    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_b

    :goto_6
    const-string v13, "\u06df\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x3b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4dc9

    const v16, -0xfdeb302

    xor-int v14, v14, v16

    const v16, 0x2fab2cf8

    goto/16 :goto_9

    :cond_b
    const-string v13, "\u06e4\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x2f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x156d

    const v16, -0xc071a18

    xor-int v14, v14, v16

    const v16, 0x54701105

    goto :goto_9

    :sswitch_e
    move-object/from16 v0, p2

    sget-object v2, Ll/᩸᩻᩷;->ܽۖۛ:[S

    .line 72
    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_c

    :goto_7
    const-string v13, "\u06e7\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2373

    const v16, -0x7bc349d9

    xor-int v14, v14, v16

    const v16, -0x7ce7f9fb

    goto :goto_9

    :cond_c
    const-string v13, "\u06db\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x3b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x57c9

    const v16, -0x1d130b98

    xor-int v14, v14, v16

    const v16, -0x1bd78466

    goto :goto_9

    :sswitch_f
    move-object/from16 v0, p2

    .line 47
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v13

    if-eqz v13, :cond_d

    :goto_8
    const-string v13, "\u06df\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1bbd

    const v15, -0x76266d31

    xor-int/2addr v14, v15

    const v15, -0x7c6addb5

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u05a8\u06e0"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x790b

    const v16, -0x7a50e3d8

    xor-int v14, v14, v16

    const v16, 0x308df7d0

    :goto_9
    xor-int v13, v13, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x74ee350a -> :sswitch_1
        -0x72bdf47a -> :sswitch_5
        -0x72013c0b -> :sswitch_a
        -0x65155e53 -> :sswitch_6
        -0x63a74266 -> :sswitch_0
        -0x5eefc2b8 -> :sswitch_f
        -0x48721210 -> :sswitch_9
        -0x444b9e34 -> :sswitch_0
        -0x42a3ac68 -> :sswitch_3
        -0x3b6aa1b5 -> :sswitch_e
        -0x2a2ebf8e -> :sswitch_3
        -0x29c6a57d -> :sswitch_6
        -0x266fd96d -> :sswitch_2
        -0x1bb5b172 -> :sswitch_d
        -0x198dd882 -> :sswitch_a
        -0x1699e571 -> :sswitch_7
        -0x11565823 -> :sswitch_b
        0x34a0d7d -> :sswitch_9
        0x4eeff94 -> :sswitch_8
        0x5e78630 -> :sswitch_4
        0x18b2bb63 -> :sswitch_7
        0x334d4281 -> :sswitch_c
        0x37025cf7 -> :sswitch_1
        0x38094620 -> :sswitch_e
        0x3ea0085a -> :sswitch_d
        0x4008cc10 -> :sswitch_b
        0x418351d9 -> :sswitch_8
        0x45757993 -> :sswitch_c
        0x48a741d3 -> :sswitch_f
        0x4eb16825 -> :sswitch_4
        0x76ff8237 -> :sswitch_5
        0x7db06641 -> :sswitch_2
    .end sparse-switch
.end method
