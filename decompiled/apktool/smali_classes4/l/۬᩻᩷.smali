.class public final Ll/۬᩻᩷;
.super Ll/ܶ᩻᩷;
.source "R3YJ"


# static fields
.field private static final ۨ۫᩹:[S


# instance fields
.field public final synthetic ֫:Ll/ۤ᩻᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬᩻᩷;->ۨ۫᩹:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x6a5s
        -0x722s
        -0x763s
        -0x77cs
        -0x764s
    .end array-data
.end method

.method public constructor <init>(Ll/ۤ᩻᩷;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/۬᩻᩷;->֫:Ll/ۤ᩻᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 20

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

    const v12, 0x78617b20

    sget v13, Ll/ۛ;->᩺᩻֫:I

    sget v14, Ll/֨۬;->۫ۙ᩺:I

    const-string v15, "\u06d9\u06eb"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x6f

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x6117

    const v17, -0x67a7a17

    xor-int v0, v0, v17

    const v17, -0x15fe423b

    xor-int v15, v15, v17

    move-object v4, v3

    move-object v12, v11

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v15, 0x78617b20

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x1d77

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v15

    const/4 v5, 0x0

    .line 31
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_b

    goto/16 :goto_6

    .line 7
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    move/from16 v16, v15

    goto/16 :goto_5

    :cond_1
    move/from16 v16, v15

    goto/16 :goto_7

    .line 55
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_0

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v16, v15

    goto/16 :goto_6

    .line 57
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    :goto_1
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x2f

    move/from16 v16, v15

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4e8f

    const v18, -0x66fd2dd0

    xor-int v15, v15, v18

    const v18, 0x64fb611d

    goto/16 :goto_8

    .line 65
    :sswitch_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 v0, 0x0

    return-object v0

    .line 80
    :sswitch_5
    invoke-static {v1, v3}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/۫᩻᩷;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :sswitch_6
    move/from16 v16, v15

    const/4 v0, 0x1

    const/4 v3, 0x4

    invoke-static {v12, v0, v3, v11}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v0

    if-ltz v0, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06eb\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x2b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x6cbb

    const v18, -0x233c8247

    xor-int v15, v15, v18

    const v18, -0x6b9d0039

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v0, p1

    move/from16 v16, v15

    .line 80
    invoke-static {v1, v0}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v12, Ll/۬᩻᩷;->ۨ۫᩹:[S

    .line 59
    sget v15, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v15, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v15, "\u06eb\u05ab"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, -0x31

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x4d8b

    const v18, 0x68671fd2

    xor-int v0, v0, v18

    const v18, -0x927246e

    goto :goto_2

    :sswitch_8
    move-object/from16 v0, p0

    move/from16 v16, v15

    .line 80
    iget-object v1, v0, Ll/۬᩻᩷;->֫:Ll/ۤ᩻᩷;

    invoke-static {v1}, Ll/ۤ᩻᩷;->֫(Ll/ۤ᩻᩷;)Ll/۫᩻᩷;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    sget v15, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v15, :cond_5

    goto/16 :goto_4

    .line 80
    :cond_5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    sget v15, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v15, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v15, "\u06eb\u05a1"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x73a9

    const v18, -0x126fdba9

    xor-int v0, v0, v18

    const v18, -0x4792d3c2

    :goto_2
    xor-int v15, v15, v18

    move/from16 v19, v16

    move/from16 v16, v15

    goto/16 :goto_9

    :sswitch_9
    move/from16 v16, v15

    const/16 v0, 0x746a

    const/16 v11, 0x746a

    goto :goto_3

    :sswitch_a
    move/from16 v16, v15

    const v0, 0xf8f0

    const v11, 0xf8f0

    :goto_3
    const-string v0, "\u06e8\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x258f

    const v18, 0x254a95a7

    xor-int v15, v15, v18

    const v18, -0x1d434158

    goto/16 :goto_8

    :sswitch_b
    move/from16 v16, v15

    add-int v0, v9, v10

    sub-int v0, v8, v0

    if-lez v0, :cond_7

    const-string v0, "\u06da\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x1573

    const v18, -0x34a15a5d    # -1.4591395E7f

    xor-int v15, v15, v18

    const v18, -0x87cd1ae

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u1a74\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x59

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0xed

    const v18, 0x5619d5ef

    xor-int v15, v15, v18

    const v18, 0x41d6c7aa

    goto/16 :goto_8

    :sswitch_c
    move/from16 v16, v15

    const v10, 0x7c28344

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u1a73\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x21

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x69e3

    const v18, -0x6c88887f

    xor-int v15, v15, v18

    const v18, -0x3c7252e9

    goto/16 :goto_8

    :sswitch_d
    move/from16 v16, v15

    mul-int v8, v6, v7

    mul-int v9, v6, v6

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_9

    :goto_4
    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x55bf

    const v15, -0x1f38d7ec

    xor-int/2addr v1, v15

    const v15, -0x6fbbb3eb

    xor-int/2addr v0, v15

    move/from16 v15, v16

    move/from16 v16, v0

    move v0, v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06d8\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x72a3

    const v18, -0x64dda2c0

    xor-int v15, v15, v18

    const v18, 0x3b0bfefa

    goto/16 :goto_8

    :sswitch_e
    move/from16 v16, v15

    aget-short v6, v4, v5

    const/16 v7, 0x5924

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_a

    :goto_5
    const-string v0, "\u06e0\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x22f7

    const v18, -0x409b0389

    xor-int v15, v15, v18

    const v18, -0x5c1fab86

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06e0\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x7443

    const v18, -0x7baae780

    xor-int v15, v15, v18

    const v18, 0x7f59595f

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u06eb\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x41

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x6401

    const v18, 0x3119ab94

    xor-int v15, v15, v18

    const v18, 0x192cb0a6

    goto :goto_8

    :sswitch_f
    move/from16 v16, v15

    sget-object v4, Ll/۬᩻᩷;->ۨ۫᩹:[S

    .line 1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u06da\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x35

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x48a7

    const v18, 0x1b7b6d5a

    xor-int v15, v15, v18

    const v18, -0x5cec3dd8    # -8.01E-18f

    goto :goto_8

    :cond_c
    const-string v0, "\u1a7a\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x36b3

    const v18, 0x78702d4

    xor-int v15, v15, v18

    const v18, -0x5ffd194f

    goto :goto_8

    :sswitch_10
    move/from16 v16, v15

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_7
    const-string v0, "\u1a75\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x3d91

    const v18, 0xed9a9b3

    xor-int v15, v15, v18

    const v18, 0x72944303

    goto :goto_8

    :cond_d
    const-string v0, "\u073a\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x87b

    const v18, 0x50697047

    xor-int v15, v15, v18

    const v18, 0x46f1792d

    :goto_8
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    :goto_9
    move/from16 v15, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x747ff733 -> :sswitch_5
        -0x6d97b74b -> :sswitch_0
        -0x6d915aa9 -> :sswitch_d
        -0x6bb70464 -> :sswitch_1
        -0x504f9b0a -> :sswitch_b
        -0x4f160820 -> :sswitch_7
        -0x4b0c51a6 -> :sswitch_c
        -0x461de5de -> :sswitch_6
        -0x456873d4 -> :sswitch_b
        -0x441102b8 -> :sswitch_8
        -0x3eaff84b -> :sswitch_9
        -0x2eaae89b -> :sswitch_e
        -0x131b48f9 -> :sswitch_f
        -0xbd0bc4c -> :sswitch_4
        0x5cdb076 -> :sswitch_5
        0x11959e66 -> :sswitch_4
        0x1ab4e0db -> :sswitch_9
        0x20b64bc6 -> :sswitch_7
        0x25b796d3 -> :sswitch_10
        0x302db2b7 -> :sswitch_8
        0x30ee7082 -> :sswitch_e
        0x38cffc42 -> :sswitch_3
        0x407ae9bb -> :sswitch_3
        0x45e9a117 -> :sswitch_d
        0x492198cb -> :sswitch_a
        0x4ed79bb7 -> :sswitch_2
        0x53f27626 -> :sswitch_a
        0x5b9fd7a3 -> :sswitch_10
        0x65b3185f -> :sswitch_c
        0x6e442aeb -> :sswitch_6
        0x70b5c113 -> :sswitch_2
        0x79486367 -> :sswitch_1
        0x7d53510b -> :sswitch_f
        0x7d738bdf -> :sswitch_0
    .end sparse-switch
.end method
