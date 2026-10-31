.class public final synthetic Ll/֡ۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ᩷ۧۚ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡ۘۡ;->᩷ۧۚ:[S

    return-void

    :array_0
    .array-data 2
        0x203cs
        -0x2dds
        -0x2d8s
        -0x2d5s
        -0x2d1s
        -0x2d1s
        -0x2des
        -0x2d2s
        -0x2d2s
        -0x2d1s
        -0x2a6s
        -0x295s
        -0x295s
        -0x2ccs
        -0x287s
        -0x28bs
        -0x289s
    .end array-data
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    const/4 v0, 0x0

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

    const v11, -0x47ad0042

    sget v12, Ll/᩺;->ۙۛܶ:I

    sget v13, Ll/֨᩺;->ۨ֨۬:I

    const-string v14, "\u06d7\u06e2"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1377

    const v16, -0x394e4eea

    xor-int v15, v15, v16

    const v16, 0x6cf53df

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x3327

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    mul-int v4, v2, v3

    const/16 v5, 0x9f

    .line 63
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v14

    if-eqz v14, :cond_5

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v14

    if-eqz v14, :cond_c

    goto/16 :goto_3

    .line 5
    :sswitch_1
    sget-boolean v14, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v14, :cond_a

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v14, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v14, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v14, "\u1a7a\u1a75"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x5

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x5909

    const v16, 0x415092f4

    xor-int v15, v15, v16

    const v16, -0x75d153f5

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_3

    .line 56
    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    return-void

    .line 0
    :sswitch_5
    invoke-static {v8, v9, v10, v7}, Ll/ۘۛ;->ۚ᩻֫([SIII)Ljava/lang/String;

    move-result-object v0

    .line 249
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void

    :sswitch_6
    const/16 v10, 0x10

    sget v14, Ll/֨۟;->᩹֫᩷:I

    if-eqz v14, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v14, "\u06df\u073a"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x7b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1137

    const v16, 0x77cbf48c

    xor-int v15, v15, v16

    const v16, 0x643ac218

    goto :goto_0

    .line 0
    :sswitch_7
    sget-object v8, Ll/֡ۘۡ;->᩷ۧۚ:[S

    const/4 v9, 0x1

    .line 11
    sget v14, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v14, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v14, "\u06dc\u1a7a"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x5f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x5f7d

    const v16, -0x15cf3fe0

    xor-int v15, v15, v16

    const v16, -0x3f64b38e

    goto/16 :goto_0

    :sswitch_8
    const v7, 0xa6c2

    goto :goto_2

    :sswitch_9
    const v7, 0xfd1a

    :goto_2
    const-string v14, "\u06d6\u1a74"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2895

    const v16, -0x3c549ed5

    xor-int v15, v15, v16

    const v16, -0x60adc775    # -4.4516E-20f

    goto/16 :goto_0

    :sswitch_a
    mul-int v14, v6, v6

    sub-int/2addr v14, v4

    if-ltz v14, :cond_3

    const-string v14, "\u1a77\u06d8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x45

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x4b6b

    const v16, -0x6cd4d011

    xor-int v15, v15, v16

    const v16, -0x33d9f6a3    # -4.3525492E7f

    goto/16 :goto_0

    :cond_3
    const-string v14, "\u06e2\u1a79"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2719

    const v16, 0xd7449c0

    xor-int v15, v15, v16

    const v16, -0x222c275c

    goto/16 :goto_0

    :sswitch_b
    add-int v6, v2, v5

    .line 188
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v14

    if-nez v14, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v14, "\u06db\u06e4"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2e73

    const v16, 0x1865e5be

    xor-int v15, v15, v16

    const v16, -0x7dca1859

    goto/16 :goto_0

    :goto_3
    const-string v14, "\u06e0\u05a8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1723

    const v16, -0x3d145bab

    xor-int v15, v15, v16

    const v16, 0x679559

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06e8\u06d7"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6e37

    const v16, 0x6eba3f19

    xor-int v15, v15, v16

    const v16, -0x4afce217

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const/16 v3, 0x27c

    .line 72
    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v14, :cond_6

    const-string v14, "\u05a1\u06e7"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6c9d

    const v16, -0x491a030d

    xor-int v15, v15, v16

    const v16, -0x30c92252

    goto/16 :goto_0

    :cond_6
    const-string v14, "\u06d6\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x44af

    const v16, -0x5b880b05

    xor-int v15, v15, v16

    const v16, 0x555c78a3

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    sget-boolean v14, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v14, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v14, "\u06dc\u073d"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5261

    const v16, -0xf5632f

    xor-int v15, v15, v16

    const v16, -0x7e1c917a

    goto/16 :goto_0

    :sswitch_e
    sget-object v0, Ll/֡ۘۡ;->᩷ۧۚ:[S

    .line 170
    sget v14, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v14, :cond_8

    goto :goto_5

    :cond_8
    const-string v14, "\u06ec\u0736"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x75a1

    const v16, -0x3acb1a81

    xor-int v15, v15, v16

    const v16, -0x1eb9240a

    goto/16 :goto_0

    .line 237
    :sswitch_f
    sget v14, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v14, :cond_9

    goto :goto_4

    :cond_9
    const-string v14, "\u073a\u1a7b"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x53

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x45a5

    const v16, -0x330f2fd5

    xor-int v15, v15, v16

    const v16, 0x39f78028

    goto/16 :goto_0

    .line 19
    :sswitch_10
    sget v14, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v14, :cond_b

    :cond_a
    :goto_4
    const-string v14, "\u05a1\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x5

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x69ff

    const v16, 0x23c80004

    xor-int v15, v15, v16

    const v16, -0x48560248

    goto/16 :goto_0

    :cond_b
    const-string v14, "\u1a73\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x3f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x63ed

    const v16, 0x351d01e7

    xor-int v15, v15, v16

    const v16, -0x59b3c02d

    goto/16 :goto_0

    .line 76
    :sswitch_11
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v14

    if-eqz v14, :cond_d

    :cond_c
    :goto_5
    const-string v14, "\u06da\u1a7b"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x2f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2811

    const v16, 0x2f679857

    xor-int v15, v15, v16

    const v16, 0x12fa0085

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u1a78\u1a76"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x65

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6465

    const v16, -0x6fc32139

    xor-int v15, v15, v16

    const v16, -0x5f0fa97a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78aefd63 -> :sswitch_3
        -0x73034ca4 -> :sswitch_0
        -0x554e2fca -> :sswitch_7
        -0x4d43a3a5 -> :sswitch_5
        -0x4829c5d3 -> :sswitch_a
        -0x3dd6910d -> :sswitch_c
        -0x3c7b86ff -> :sswitch_e
        -0x35f829d0 -> :sswitch_8
        -0x2b7b870c -> :sswitch_c
        -0x2b5aff21 -> :sswitch_d
        -0x23cb0317 -> :sswitch_a
        -0x1e73da09 -> :sswitch_10
        -0x1dbaed69 -> :sswitch_10
        -0x1c8e327d -> :sswitch_d
        -0x1c0f5f79 -> :sswitch_3
        -0x188a0c48 -> :sswitch_6
        -0x17cfce70 -> :sswitch_8
        -0x9d48cf3 -> :sswitch_5
        -0x936e56e -> :sswitch_b
        0x8e29bb5 -> :sswitch_f
        0x9dfe181 -> :sswitch_1
        0xd3e2345 -> :sswitch_11
        0xeb8818d -> :sswitch_f
        0x16cb2d5f -> :sswitch_2
        0x1aa22cc4 -> :sswitch_2
        0x1ad36c63 -> :sswitch_6
        0x2021d53a -> :sswitch_4
        0x2aad4e3c -> :sswitch_0
        0x2ded19e4 -> :sswitch_e
        0x332c8fd7 -> :sswitch_11
        0x35844972 -> :sswitch_4
        0x5ce39fc0 -> :sswitch_7
        0x66f27dd3 -> :sswitch_b
        0x6f17e679 -> :sswitch_9
        0x6fb11a46 -> :sswitch_1
        0x7717c0fc -> :sswitch_9
    .end sparse-switch
.end method
