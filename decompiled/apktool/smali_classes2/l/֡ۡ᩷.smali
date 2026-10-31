.class public final synthetic Ll/֡ۡ᩷;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡ۡ᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x621541a7

    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    const-string v7, "\u05a1\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x2f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x593f

    const v9, 0x44b9c36c

    xor-int/2addr v8, v9

    const v9, -0x3809ca34

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x5a19

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 439
    invoke-virtual {v2}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/۬ܿ;->ۧ()Z

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_3

    .line 288
    :sswitch_1
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_4

    goto/16 :goto_4

    .line 205
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v7, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v7, :cond_a

    goto/16 :goto_4

    .line 160
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    goto/16 :goto_4

    .line 99
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 357
    :sswitch_5
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 364
    :sswitch_6
    invoke-static {}, Ll/ۖ᩻ᩳ;->ܿ()Z

    return-void

    .line 212
    :sswitch_7
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06db\u073f"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x5f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2d59

    const v9, 0x32501b34

    xor-int/2addr v8, v9

    const v9, 0x4b1be88c    # 1.0217612E7f

    goto :goto_0

    :cond_0
    const-string v7, "\u1a78\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0xbff

    const v9, -0xd3dcefa

    xor-int/2addr v8, v9

    const v9, -0x315685c9

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u1a75\u1a7b"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1eaf

    const v9, 0x2a7f6747

    xor-int/2addr v8, v9

    const v9, 0x1d8dd619

    goto/16 :goto_0

    :sswitch_9
    sget v7, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v7, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v7, "\u0733\u05ab"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x27e3

    const v9, -0x4dc74c95

    xor-int/2addr v8, v9

    const v9, 0x1e2ccaf3

    goto/16 :goto_0

    .line 6
    :sswitch_a
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v7

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    const-string v7, "\u1a77\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xf65

    const v9, -0x6b3a3187

    xor-int/2addr v8, v9

    const v9, 0x5b484ac9

    goto/16 :goto_0

    .line 181
    :sswitch_b
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v7

    if-ltz v7, :cond_5

    :cond_4
    :goto_1
    const-string v7, "\u06e8\u0730"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x57

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7201

    const v9, 0x4056d5d8

    xor-int/2addr v8, v9

    const v9, 0x5a940605

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u0733\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x15bf

    const v9, -0x7a42b820

    xor-int/2addr v8, v9

    const v9, -0x49b628f

    goto/16 :goto_0

    .line 17
    :sswitch_c
    sget v7, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v7, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v7, "\u1a79\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1caf

    const v9, 0x114ace6

    xor-int/2addr v8, v9

    const v9, 0x27ebd4b5

    goto/16 :goto_0

    .line 284
    :sswitch_d
    sget v7, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v7, :cond_8

    :cond_7
    :goto_2
    const-string v7, "\u073f\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x2d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2495

    const v9, 0xd7a43a3

    xor-int/2addr v8, v9

    const v9, 0x7178dbd8

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06dc\u06ec"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4ac1

    const v9, 0x43c30921

    xor-int/2addr v8, v9

    const v9, -0x3c64eabb

    goto/16 :goto_0

    .line 399
    :sswitch_e
    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_9

    goto :goto_3

    :cond_9
    const-string v7, "\u06e7\u06e0"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5989

    const v9, 0x4836568

    xor-int/2addr v8, v9

    const v9, 0x472adf26

    goto/16 :goto_0

    .line 56
    :sswitch_f
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v7

    if-eqz v7, :cond_b

    :cond_a
    :goto_3
    const-string v7, "\u1a7a\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2c55

    const v9, -0x23a5b4f5

    xor-int/2addr v8, v9

    const v9, 0x7b6a6f7a

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u05ab\u06da"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3f4b

    const v9, -0x3c0ad607

    xor-int/2addr v8, v9

    const v9, 0xc45ec76

    goto/16 :goto_0

    .line 360
    :sswitch_10
    invoke-static {}, Ll/ۜ᩷ܿ;->ܿ()Ll/᩸᩷ܿ;

    .line 362
    invoke-static {}, Ll/ܰ۬ۡ;->ۧ()V

    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_c

    :goto_4
    const-string v7, "\u1a73\u1a73"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x33

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5def

    const v9, 0x7374f4c2

    xor-int/2addr v8, v9

    const v9, -0x13a5a584

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u1a77\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6485

    const v9, -0x36e92439

    xor-int/2addr v8, v9

    const v9, -0x1d1e4c6e

    goto/16 :goto_0

    :sswitch_11
    return-void

    .line 355
    :sswitch_12
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v7, "\u0730\u1a7b"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xc7b

    const v9, 0x72920443

    xor-int/2addr v8, v9

    const v9, -0x728a67f7

    goto/16 :goto_0

    :catch_0
    move-exception v3

    const-string v7, "\u06e4\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7df5

    const v9, -0x4a10791d

    xor-int/2addr v8, v9

    const v9, -0x261e809e

    goto/16 :goto_0

    .line 7
    :sswitch_13
    sget v2, Ll/۟᩸ۢ;->ۖۧ:I

    .line 35
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v2

    if-eqz v2, :cond_d

    const-string v7, "\u05ab\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x63

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x15e1

    const v9, 0x17298d49

    xor-int/2addr v8, v9

    const v9, -0x68a6fb3e

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v7, "\u1a79\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x25

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5c53

    const v9, -0x64723009

    xor-int/2addr v8, v9

    const v9, -0x1fb09e03

    goto/16 :goto_0

    .line 0
    :sswitch_14
    invoke-static {}, Ll/ۤܺܳ;->֫()V

    return-void

    :sswitch_15
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-wide/16 v0, 0xbb8

    const-string v7, "\u1a7b\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x19

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x76e7

    const v9, -0x50edd8e2

    xor-int/2addr v8, v9

    const v9, 0x408aa187

    goto/16 :goto_0

    .line 2
    :sswitch_16
    iget v7, p0, Ll/֡ۡ᩷;->᩸:I

    packed-switch v7, :pswitch_data_0

    const-string v7, "\u06e7\u073a"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x23

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0xc3b

    const v9, 0x5b8a6403

    xor-int/2addr v8, v9

    const v9, 0x5322f9d8    # 6.9997638E11f

    goto/16 :goto_0

    :pswitch_0
    const-string v7, "\u06e8\u1a78"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x23

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3b1

    const v9, -0x19010241

    xor-int/2addr v8, v9

    const v9, 0x78fe394a

    goto/16 :goto_0

    :pswitch_1
    const-string v7, "\u073a\u06d6"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x77

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xd57

    const v9, -0x9ac4ab6

    xor-int/2addr v8, v9

    const v9, -0x1e0843f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f85396f -> :sswitch_5
        -0x7e2698e6 -> :sswitch_10
        -0x7620001f -> :sswitch_14
        -0x73c7e851 -> :sswitch_1
        -0x70b7e0b3 -> :sswitch_2
        -0x6b71d989 -> :sswitch_b
        -0x69d5af15 -> :sswitch_7
        -0x65569ed9 -> :sswitch_13
        -0x51777615 -> :sswitch_8
        -0x4c9ef9d5 -> :sswitch_15
        -0x444c14cd -> :sswitch_13
        -0x423f485c -> :sswitch_c
        -0x409aefba -> :sswitch_4
        -0x33713455 -> :sswitch_d
        -0x2c572077 -> :sswitch_3
        -0x2415d88b -> :sswitch_9
        -0x1b767c77 -> :sswitch_2
        -0x14e31182 -> :sswitch_7
        -0x14d951d7 -> :sswitch_e
        -0x147d34f8 -> :sswitch_0
        -0x12c7020f -> :sswitch_6
        -0x55f3ea3 -> :sswitch_12
        -0xa58290 -> :sswitch_5
        0x15331a2 -> :sswitch_b
        0x55b7e47 -> :sswitch_1
        0xd881a74 -> :sswitch_9
        0x141b1491 -> :sswitch_15
        0x206f6d7a -> :sswitch_11
        0x2e425e17 -> :sswitch_e
        0x33285b6c -> :sswitch_0
        0x3370a9da -> :sswitch_14
        0x3cecce6f -> :sswitch_a
        0x3e26dfa0 -> :sswitch_4
        0x450e8909 -> :sswitch_6
        0x4652db8e -> :sswitch_f
        0x483f0681 -> :sswitch_c
        0x483fb9a0 -> :sswitch_16
        0x5801dabc -> :sswitch_10
        0x5dd28a1b -> :sswitch_3
        0x64edd7df -> :sswitch_16
        0x70c0b32a -> :sswitch_a
        0x77736615 -> :sswitch_12
        0x79d1aa77 -> :sswitch_11
        0x7a0422e4 -> :sswitch_8
        0x7ab0f005 -> :sswitch_f
        0x7b55a6f6 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
