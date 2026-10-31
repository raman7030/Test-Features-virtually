.class public final synthetic Ll/ᩴ۟ܽ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫۟ܽ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/۫۟ܽ;Z)V
    .locals 6

    const v0, 0x67c23114

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x61e7

    const v5, -0x54437bce

    xor-int/2addr v4, v5

    const v5, 0x43277e5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3aeb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v3, :cond_a

    goto/16 :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u1a77\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2b57

    const v5, -0x4748904

    xor-int/2addr v4, v5

    const v5, 0x52bef3b9

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p2, p0, Ll/ᩴ۟ܽ;->᩹:Z

    return-void

    .line 3
    :sswitch_6
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x389d

    const v5, 0x4d1df57c

    xor-int/2addr v4, v5

    const v5, -0x54eca4d7

    goto :goto_0

    :cond_2
    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x16db

    const v5, 0x1425e5ee

    xor-int/2addr v4, v5

    const v5, -0x5a9d1183

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v3, "\u05a8\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x688d

    const v5, -0x79ac7ab9

    xor-int/2addr v4, v5

    const v5, -0x74852af1

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ee5

    const v5, 0x10e57bef

    xor-int/2addr v4, v5

    const v5, -0x7dfcb4f4

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u05ab\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4c13

    const v5, -0x64d73145

    xor-int/2addr v4, v5

    const v5, 0x3d450b0

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4483

    const v5, -0x5046cb03

    xor-int/2addr v4, v5

    const v5, -0x3df2848e

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3637

    const v5, -0x363a1f58    # -1621013.0f

    xor-int/2addr v4, v5

    const v5, -0x6b9a2129

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a7a\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b5b

    const v5, 0x5a543934

    xor-int/2addr v4, v5

    const v5, -0x6d21c431

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u1a7a\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x49f7

    const v5, -0x2cc2256f

    xor-int/2addr v4, v5

    const v5, -0x59ddb0f6

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x70fd

    const v5, -0x4394ef6f

    xor-int/2addr v4, v5

    const v5, 0x5f028e32

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_b

    :cond_a
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x275b

    const v5, -0x7f1a4c53

    xor-int/2addr v4, v5

    const v5, 0x38357929

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6445

    const v5, 0x387872aa

    xor-int/2addr v4, v5

    const v5, -0x7e4e57e2

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ᩴ۟ܽ;->᩸:Ll/۫۟ܽ;

    .line 2
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u06d6\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x31f5

    const v5, 0x28fb76f4

    xor-int/2addr v4, v5

    const v5, -0x7eab7944

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x20c1

    const v5, -0x6df4006c

    xor-int/2addr v4, v5

    const v5, -0x2ee3756f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f655594 -> :sswitch_0
        -0x7c5301ee -> :sswitch_5
        -0x75aa535c -> :sswitch_c
        -0x4d22c63f -> :sswitch_3
        -0x4c0314ef -> :sswitch_5
        -0x44238e0b -> :sswitch_d
        -0x2a6bc7dd -> :sswitch_1
        -0x1a678184 -> :sswitch_a
        -0x173ca7c7 -> :sswitch_7
        -0x171e6ff3 -> :sswitch_d
        -0x15bf1944 -> :sswitch_1
        -0x12d54693 -> :sswitch_2
        -0x11526d53 -> :sswitch_2
        0x2b4022 -> :sswitch_6
        0xf2034d -> :sswitch_7
        0xbfe9766 -> :sswitch_c
        0x14826df3 -> :sswitch_8
        0x1ae9baa4 -> :sswitch_8
        0x27574b85 -> :sswitch_e
        0x2c326e33 -> :sswitch_9
        0x319ca820 -> :sswitch_4
        0x5de55837 -> :sswitch_6
        0x5f90b371 -> :sswitch_b
        0x652cea57 -> :sswitch_a
        0x66d9fa47 -> :sswitch_0
        0x6c42044d -> :sswitch_9
        0x6cf5d59e -> :sswitch_4
        0x6f5f54a7 -> :sswitch_e
        0x79b9a953 -> :sswitch_b
        0x7b3c71ff -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ᩴ۟ܽ;->᩸:Ll/۫۟ܽ;

    iget-boolean v1, p0, Ll/ᩴ۟ܽ;->᩹:Z

    invoke-static {v0, v1}, Ll/۫۟ܽ;->֫(Ll/۫۟ܽ;Z)V

    return-void
.end method
