.class public final synthetic Ll/ۜ᩹᩷;
.super Ljava/lang/Object;
.source "650G"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۨۢܶ:[S


# instance fields
.field public final synthetic ᩸:Ll/֡ۚۢ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜ᩹᩷;->ۨۢܶ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1e0es
        0x3db6s
        0x28b2s
        0x5d3s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩹᩷;->᩸:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

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

    const v13, 0x3bb7f36b

    sget v14, Ll/ۨ;->᩺᩷ۚ:I

    sget v15, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v16, "\u06db\u06e1"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x5cf

    const v18, -0x1834535b

    xor-int v0, v0, v18

    const v18, 0x46c00ae2

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v11, v10

    move/from16 v17, v16

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x3bb7f36b

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v15

    mul-int/lit16 v4, v4, 0x7555

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    .line 104
    sget-object v11, Ll/ۜ᩹᩷;->ۨۢܶ:[S

    const/4 v12, 0x1

    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_3

    goto/16 :goto_1

    .line 47
    :sswitch_0
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-lez v0, :cond_9

    goto/16 :goto_1

    .line 6
    :sswitch_1
    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v0, :cond_d

    goto :goto_1

    :sswitch_2
    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_2

    goto/16 :goto_4

    .line 46
    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto/16 :goto_4

    .line 76
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 107
    :sswitch_5
    :try_start_0
    invoke-virtual {v1, v2}, Landroid/view/Window;->setWindowAnimations(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    .line 104
    :sswitch_6
    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v2, 0x7e8ad716

    xor-int/2addr v2, v0

    const-string v0, "\u1a77\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x71

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x3625

    const v17, 0x3dd67984

    xor-int v4, v4, v17

    const v17, -0x5deac07a

    goto/16 :goto_6

    :sswitch_7
    invoke-static {v11, v12, v13, v10}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 45
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x41

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x4037

    const v17, -0x7098e4ef

    xor-int v4, v4, v17

    const v17, 0x72a34c13

    goto/16 :goto_6

    :sswitch_8
    const/4 v13, 0x3

    .line 103
    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u073f\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x1075

    const v17, 0x5197d4b5

    xor-int v4, v4, v17

    const v17, 0x463db470

    goto/16 :goto_6

    :cond_2
    :goto_1
    const-string v0, "\u06ec\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x59

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x7bc1

    const v17, 0x19ffe488

    xor-int v4, v4, v17

    const v17, 0x508006c3

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u1a76\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x5d73

    const v17, -0x7db17d15

    xor-int v4, v4, v17

    const v17, -0x7305e71d

    goto/16 :goto_6

    :sswitch_9
    return-void

    :sswitch_a
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ۜ᩹᩷;->᩸:Ll/֡ۚۢ;

    .line 104
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܳ()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v4, "\u06da\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v15

    mul-int/lit8 v4, v4, -0x5d

    xor-int v0, v4, v14

    mul-int/lit16 v0, v0, -0x7169

    const v17, -0x518df4b2

    xor-int v0, v0, v17

    const v17, -0x5db7429f

    xor-int v17, v4, v17

    goto/16 :goto_0

    :catch_0
    :cond_4
    :goto_2
    const-string v0, "\u1a78\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x29

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x6489

    const v17, 0x31d52c39

    xor-int v4, v4, v17

    const v17, 0x5163a8a0

    goto/16 :goto_6

    :sswitch_b
    const v0, 0xaf27

    const v10, 0xaf27

    goto :goto_3

    :sswitch_c
    const/16 v0, 0x54a1

    const/16 v10, 0x54a1

    :goto_3
    const-string v0, "\u06e2\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0xb

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x435

    const v17, 0x78c69429

    xor-int v4, v4, v17

    const v17, -0x46fb224f

    goto/16 :goto_6

    :sswitch_d
    mul-int v0, v6, v9

    sub-int v0, v8, v0

    if-ltz v0, :cond_5

    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x5bd5

    const v17, -0x685ce0b3

    xor-int v4, v4, v17

    const v17, 0x62762c8d

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u1a77\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x1007

    const v17, -0x1feec3f6

    xor-int v4, v4, v17

    const v17, 0x770f5594

    goto/16 :goto_6

    :sswitch_e
    const/16 v9, 0x190

    .line 20
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u073d\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x41e5

    const v17, 0x54a09f2e

    xor-int v4, v4, v17

    const v17, 0x28886157

    goto/16 :goto_6

    :sswitch_f
    const v0, 0x9c40

    add-int v8, v7, v0

    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u1a75\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x7a51

    const v17, -0x6ac14e9c

    xor-int v4, v4, v17

    const v17, -0x3c68f4d1

    goto/16 :goto_6

    :sswitch_10
    aget-short v6, v18, v5

    mul-int v7, v6, v6

    .line 2
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_8

    const-string v0, "\u06d8\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x3d

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x731f

    const v17, 0x7f4755c9

    xor-int v4, v4, v17

    const v17, 0x701a5488

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a73\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x49

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x56bb

    const v17, -0x5650d51b

    xor-int v4, v4, v17

    const v17, 0x70081adb

    goto/16 :goto_6

    :sswitch_11
    const/4 v5, 0x0

    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_a

    :cond_9
    const-string v0, "\u06dc\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x390f

    const v17, 0x70a9c9ae

    xor-int v4, v4, v17

    const v17, 0x7f3a1c5d

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u1a7b\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x25

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3061

    const v17, -0x364e55c4    # -1455431.5f

    xor-int v4, v4, v17

    const v17, 0x7676a9ec

    goto/16 :goto_6

    .line 104
    :sswitch_12
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_b

    goto :goto_4

    :cond_b
    const-string v0, "\u073f\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x5efd

    const v17, 0x29844cec

    xor-int v4, v4, v17

    const v17, 0x36a63235

    goto :goto_6

    :sswitch_13
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_c

    :goto_4
    const-string v0, "\u05ab\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x2d77

    const v17, 0x58533929

    xor-int v4, v4, v17

    const v17, -0x1e2426c

    goto :goto_6

    :cond_c
    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, 0x668b

    const v17, -0x53d49235

    xor-int v4, v4, v17

    const v17, -0x2d4cce69

    goto :goto_6

    :sswitch_14
    sget-object v18, Ll/ۜ᩹᩷;->ۨۢܶ:[S

    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_e

    :cond_d
    :goto_5
    const-string v0, "\u1a7b\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v4, v0, v15

    mul-int/lit16 v4, v4, -0x2233

    const v17, -0x139b55e9

    xor-int v4, v4, v17

    const v17, -0x5b506ec2

    goto :goto_6

    :cond_e
    const-string v0, "\u1a79\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x47

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, -0x3217

    const v17, 0x5f5ca34c

    xor-int v4, v4, v17

    const v17, 0x15f22656

    :goto_6
    xor-int v17, v0, v17

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7081c6fa -> :sswitch_6
        -0x6d9b8e36 -> :sswitch_3
        -0x6d150948 -> :sswitch_14
        -0x6b9bdc38 -> :sswitch_3
        -0x68509e56 -> :sswitch_9
        -0x66e1fa6d -> :sswitch_7
        -0x5f9d1b93 -> :sswitch_4
        -0x5b220874 -> :sswitch_a
        -0x59513856 -> :sswitch_11
        -0x57d0b289 -> :sswitch_b
        -0x55d89b45 -> :sswitch_9
        -0x49d5005c -> :sswitch_10
        -0x42aa6305 -> :sswitch_c
        -0x414a71f5 -> :sswitch_12
        -0x1d730d8e -> :sswitch_11
        -0x174b0c02 -> :sswitch_13
        -0x13d708e9 -> :sswitch_e
        -0xfb1916d -> :sswitch_f
        -0xdae0626 -> :sswitch_2
        -0x9bfaeb9 -> :sswitch_13
        0x69a5876 -> :sswitch_12
        0xa1d46ab -> :sswitch_5
        0xe7b8541 -> :sswitch_f
        0x1cb76629 -> :sswitch_e
        0x213e5eca -> :sswitch_4
        0x2a675262 -> :sswitch_6
        0x31869341 -> :sswitch_0
        0x32d4ed36 -> :sswitch_1
        0x42cb52d8 -> :sswitch_c
        0x4684219a -> :sswitch_b
        0x4fea5e0f -> :sswitch_d
        0x58d30456 -> :sswitch_8
        0x5b62cfea -> :sswitch_0
        0x62faba89 -> :sswitch_5
        0x64282c8f -> :sswitch_a
        0x680520ea -> :sswitch_14
        0x685e2b7f -> :sswitch_8
        0x6bc3357f -> :sswitch_1
        0x6c4632cd -> :sswitch_7
        0x70868a19 -> :sswitch_2
        0x75099846 -> :sswitch_d
        0x76421694 -> :sswitch_10
    .end sparse-switch
.end method
