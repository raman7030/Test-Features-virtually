.class public final synthetic Ll/᩵᩵ۡ;
.super Ljava/lang/Object;
.source "51RP"

# interfaces
.implements Ll/ۡ᩹᩷;


# static fields
.field private static final ۫ۡ᩷:[S


# instance fields
.field public final synthetic ֫:Ll/᩵֡ۡ;

.field public final synthetic ۧ:Ll/ۗܺ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵᩵ۡ;->۫ۡ᩷:[S

    return-void

    :array_0
    .array-data 2
        0x1431s
        0x5a82s
        0x5a95s
        0x5a83s
        0x5a80s
        0x3e9ds
        0x4d8s
        -0x28d9s
        0x5a95s
        0x5a82s
        0x5a82s
        0x5aa3s
        0x5a84s
        0x5a82s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/᩵֡ۡ;)V
    .locals 6

    const v0, -0x46be9e97

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x687b

    const v5, -0x57b61efd

    xor-int/2addr v4, v5

    const v5, 0x3c4bc703

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1185

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_6

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v3, :cond_9

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v3, :cond_b

    goto :goto_1

    .line 1
    :sswitch_2
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4eaf

    const v5, -0xf0f5cad

    xor-int/2addr v4, v5

    const v5, 0x5eba9b1

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p1, p0, Ll/᩵᩵ۡ;->ۧ:Ll/ۗܺ᩷;

    return-void

    :sswitch_6
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_1

    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f79

    const v5, -0x2ebced6b

    xor-int/2addr v4, v5

    const v5, -0x5f06ee41

    goto :goto_0

    :cond_1
    const-string v3, "\u06e1\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x176b

    const v5, 0x1d8b142d

    xor-int/2addr v4, v5

    const v5, -0x12d2152d

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a7b\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x38a9

    const v5, 0x7aeea330

    xor-int/2addr v4, v5

    const v5, 0xd6e274f

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u073d\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4805

    const v5, 0x156037ff

    xor-int/2addr v4, v5

    const v5, -0x64de6667

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_4

    :goto_2
    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x359b

    const v5, -0x2b3d8dd3

    xor-int/2addr v4, v5

    const v5, 0x743c4a2a

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e2\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6341

    const v5, -0x1ce02263

    xor-int/2addr v4, v5

    const v5, 0x4c2e205b    # 4.5646188E7f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2373

    const v5, 0xd59009a

    xor-int/2addr v4, v5

    const v5, 0x2b65c765

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06eb\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a07

    const v5, -0x3286237d    # -2.6199864E8f

    xor-int/2addr v4, v5

    const v5, 0x42e3e915

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x756f

    const v5, -0x322ab54d

    xor-int/2addr v4, v5

    const v5, 0x5434aedc

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d9\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51cd

    const v5, 0x706adeee

    xor-int/2addr v4, v5

    const v5, 0x7e0ab10c

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a79\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x45a5

    const v5, -0x29038c52

    xor-int/2addr v4, v5

    const v5, 0x4dcd5ac3    # 4.3065968E8f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7b\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3005

    const v5, -0x19fb577f

    xor-int/2addr v4, v5

    const v5, -0x2844cfc0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p2, p0, Ll/᩵᩵ۡ;->֫:Ll/᩵֡ۡ;

    .line 2
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x75ad

    const v5, -0xf187dcf

    xor-int/2addr v4, v5

    const v5, 0xe6905da

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ae3

    const v5, 0x402f5972

    xor-int/2addr v4, v5

    const v5, 0x6c4b995c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dea7277 -> :sswitch_0
        -0x7b6715ae -> :sswitch_d
        -0x76a09340 -> :sswitch_e
        -0x7407abd6 -> :sswitch_8
        -0x5a1b1eae -> :sswitch_6
        -0x538e76d6 -> :sswitch_5
        -0x4be9291a -> :sswitch_5
        -0x4786ccc3 -> :sswitch_6
        -0x4666921b -> :sswitch_9
        -0x44819a93 -> :sswitch_2
        -0x430e3083 -> :sswitch_1
        -0x3ed4d52e -> :sswitch_4
        -0x34e1cefc -> :sswitch_b
        -0x283ff884 -> :sswitch_9
        -0x173cb2a2 -> :sswitch_7
        -0xe1e6c19 -> :sswitch_0
        -0x808908f -> :sswitch_a
        0x12c40a72 -> :sswitch_d
        0x16ecd02a -> :sswitch_3
        0x22df863d -> :sswitch_1
        0x2aaaa810 -> :sswitch_2
        0x2ee753f1 -> :sswitch_8
        0x3710b7bb -> :sswitch_a
        0x4460816b -> :sswitch_e
        0x489f1b57 -> :sswitch_3
        0x569d1286 -> :sswitch_c
        0x62ac2436 -> :sswitch_c
        0x678463e9 -> :sswitch_7
        0x717631b3 -> :sswitch_b
        0x790e8d60 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const v21, -0x5c8eab25

    sget v22, Ll/ۗ᩵;->֫۠۟:I

    sget v23, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v24, "\u06ec\u1a75"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    xor-int v2, v24, v23

    mul-int/lit16 v2, v2, -0x50e9

    const v26, 0x645df96c

    xor-int v2, v2, v26

    const v26, -0x6ce8c4fc

    xor-int v24, v24, v26

    move-object v4, v3

    move-object/from16 v26, v16

    move-object/from16 v15, v18

    move/from16 v25, v24

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v24, -0x5c8eab25

    move-object/from16 v16, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v13, v24, v23

    mul-int/lit16 v13, v13, -0x7951

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v2, v13

    xor-int v24, v25, v2

    sparse-switch v24, :sswitch_data_0

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v2

    if-ltz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    move-object/from16 v13, v26

    goto/16 :goto_11

    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v2, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v2, :cond_4

    goto :goto_3

    :sswitch_1
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v2, :cond_2

    :goto_2
    move/from16 v25, v3

    goto/16 :goto_6

    .line 309
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto :goto_2

    .line 18
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    return-void

    .line 80
    :sswitch_4
    invoke-static {v15, v3, v5, v12}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 440
    invoke-virtual {v4, v10, v1}, Ll/᩵֡ۡ;->֫(Ljava/lang/String;Z)V

    return-void

    .line 80
    :sswitch_5
    iget-object v10, v1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errStr:Ljava/lang/String;

    sget-object v15, Ll/᩵᩵ۡ;->۫ۡ᩷:[S

    const/16 v3, 0x8

    const/4 v5, 0x6

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\u05a1\u1a73"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v13, v2, v22

    mul-int/lit16 v13, v13, -0x3f5f

    const v25, -0x6f037830

    xor-int v13, v13, v25

    const v25, 0x3b77b30b

    goto/16 :goto_5

    .line 832
    :sswitch_6
    new-instance v2, Ljava/lang/Thread;

    new-instance v13, Ll/ۘ֨ۡ;

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v25

    if-eqz v25, :cond_3

    :cond_2
    :goto_3
    const-string v2, "\u073a\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v23

    mul-int/lit8 v2, v2, -0x7b

    xor-int v13, v2, v22

    mul-int/lit16 v13, v13, -0x5eb9

    const v25, -0x47985630

    xor-int v13, v13, v25

    const v25, -0x30a20ec7

    goto/16 :goto_5

    :cond_3
    const/4 v1, 0x0

    invoke-direct {v13, v6, v9, v8, v1}, Ll/ۘ֨ۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v2, v13}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 842
    invoke-static {v2}, Ll/֨ۡ;->ۤۘᩳ(Ljava/lang/Object;)V

    return-void

    .line 57
    :sswitch_7
    new-instance v8, Ll/ۚ᩵ۡ;

    iget-object v9, v0, Ll/᩵᩵ۡ;->ۧ:Ll/ۗܺ᩷;

    invoke-direct {v8, v7, v4, v9}, Ll/ۚ᩵ۡ;-><init>(Ll/᩸ۚۢ;Ll/᩵֡ۡ;Ll/ۗܺ᩷;)V

    .line 781
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_5

    :cond_4
    :goto_4
    const-string v2, "\u073f\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v13, v2, v22

    mul-int/lit16 v13, v13, -0x7129

    const v25, -0x1fcaa50d

    xor-int v13, v13, v25

    const v25, -0x468ddc49

    goto :goto_5

    :cond_5
    const-string v2, "\u1a77\u0736"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, -0x71

    xor-int v13, v2, v23

    mul-int/lit16 v13, v13, -0x35e9

    const v25, 0x4118b657

    xor-int v13, v13, v25

    const v25, 0x2c13451e

    goto :goto_5

    .line 55
    :sswitch_8
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    const v7, 0x7e96fb24

    xor-int/2addr v2, v7

    .line 56
    invoke-static {v2}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;

    move-result-object v7

    .line 125
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-gtz v2, :cond_6

    move/from16 v25, v3

    move/from16 v3, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    goto/16 :goto_10

    :cond_6
    const-string v2, "\u0736\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v23, v2

    mul-int/lit8 v2, v2, -0x31

    xor-int v13, v2, v22

    mul-int/lit16 v13, v13, -0x2ce3

    const v25, -0xb0f2b7b

    xor-int v13, v13, v25

    const v25, 0x7fb932c0

    :goto_5
    xor-int v25, v2, v25

    move v2, v13

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x3

    move-object/from16 v13, v26

    .line 55
    invoke-static {v13, v14, v2, v12}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 8
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v2

    if-gtz v2, :cond_7

    move/from16 v25, v3

    move/from16 v3, v18

    move-object/from16 v2, v20

    goto/16 :goto_10

    :cond_7
    const-string v2, "\u05a8\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    move/from16 v25, v3

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x2249

    const v26, 0x25ef0d18

    xor-int v3, v3, v26

    const v26, -0x2c2aa547

    goto/16 :goto_8

    :sswitch_a
    move/from16 v25, v3

    .line 55
    move-object v2, v1

    check-cast v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;

    iget-object v6, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;->code:Ljava/lang/String;

    sget-object v26, Ll/᩵᩵ۡ;->۫ۡ᩷:[S

    const/4 v14, 0x5

    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_8

    :goto_6
    const-string v2, "\u1a73\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x61

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x1fff

    const v13, 0x1589afe1

    xor-int/2addr v3, v13

    const v13, 0x78c1859a

    goto :goto_7

    :cond_8
    const-string v2, "\u06e7\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x421

    const v13, 0x2376fd27

    xor-int/2addr v3, v13

    const v13, -0x5a4cd317

    :goto_7
    xor-int/2addr v2, v13

    goto/16 :goto_9

    :sswitch_b
    move/from16 v25, v3

    move-object/from16 v13, v26

    if-eqz v21, :cond_9

    const-string v2, "\u06d9\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x31eb

    const v26, 0xf0173b3

    xor-int v3, v3, v26

    const v26, 0x84f7e4a

    goto :goto_8

    :cond_9
    const-string v2, "\u06e0\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v23, v2

    mul-int/lit8 v2, v2, -0x6f

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x5ad

    const v26, -0x3033c2fe

    xor-int v3, v3, v26

    const v26, 0x16d6d12f

    goto :goto_8

    .line 79
    :sswitch_c
    invoke-virtual {v4}, Ll/᩵֡ۡ;->ۧ()V

    :sswitch_d
    return-void

    :sswitch_e
    move/from16 v25, v3

    move-object/from16 v13, v26

    .line 53
    iget v2, v1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    const/4 v3, -0x2

    if-eq v2, v3, :cond_a

    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v22

    mul-int/lit8 v3, v3, 0x1f

    move/from16 v21, v2

    xor-int v2, v3, v23

    mul-int/lit16 v2, v2, -0x2783

    const v26, -0x6af0d4cd

    xor-int v2, v2, v26

    const v26, 0x67ccbb1c

    xor-int v3, v3, v26

    move-object/from16 v26, v13

    goto :goto_a

    :cond_a
    move/from16 v21, v2

    const-string v2, "\u1a7b\u1a73"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    mul-int/lit8 v2, v2, 0x25

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x49fd

    const v26, 0x55a93be8

    xor-int v3, v3, v26

    const v26, 0x720ce0d0

    :goto_8
    xor-int v2, v2, v26

    move-object/from16 v26, v13

    :goto_9
    move/from16 v27, v25

    move/from16 v25, v2

    move v2, v3

    goto :goto_b

    :sswitch_f
    move/from16 v25, v3

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    .line 0
    invoke-static {v1, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    iget-object v4, v0, Ll/᩵᩵ۡ;->֫:Ll/᩵֡ۡ;

    invoke-virtual {v4}, Ll/᩵֡ۡ;->֫()Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "\u0736\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v0, v3, v23

    mul-int/lit16 v0, v0, -0x144d

    const v20, 0x2c255187

    xor-int v0, v0, v20

    const v20, -0x3a574464

    xor-int v3, v3, v20

    move-object/from16 v20, v2

    move-object/from16 v26, v13

    move v2, v0

    move-object/from16 v0, p0

    :goto_a
    move/from16 v27, v25

    move/from16 v25, v3

    :goto_b
    move/from16 v3, v27

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x428f

    const v20, -0x771b9cf

    xor-int v3, v3, v20

    const v20, 0x24baa6b3

    goto :goto_d

    :sswitch_10
    move/from16 v25, v3

    move-object/from16 v13, v26

    .line 0
    sget-object v0, Ll/᩵᩵ۡ;->۫ۡ᩷:[S

    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-static {v0, v2, v3, v12}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v20

    .line 760
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v0

    if-gtz v0, :cond_c

    goto/16 :goto_f

    :cond_c
    const-string v0, "\u0730\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x75

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x441f

    const v3, -0x644f7f3b    # -2.9199973E-22f

    xor-int/2addr v2, v3

    const v3, 0x6cf73c5

    xor-int/2addr v0, v3

    goto :goto_e

    :sswitch_11
    move/from16 v25, v3

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    const v0, 0xb466

    const v12, 0xb466

    goto :goto_c

    :sswitch_12
    move/from16 v25, v3

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    const/16 v0, 0x5af0

    const/16 v12, 0x5af0

    :goto_c
    const-string v0, "\u1a7a\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, -0x1bb3

    const v20, 0x1fc975d0

    xor-int v3, v3, v20

    const v20, 0x64acae75

    :goto_d
    xor-int v0, v0, v20

    move-object/from16 v20, v2

    move v2, v3

    :goto_e
    move-object/from16 v26, v13

    move/from16 v3, v25

    move/from16 v25, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_13
    move/from16 v25, v3

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    const v0, 0x2302c39

    add-int v0, v19, v0

    move/from16 v3, v18

    mul-int/lit16 v1, v3, 0x2f56

    sub-int/2addr v1, v0

    if-gtz v1, :cond_d

    const-string v0, "\u073a\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x1b

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x129b

    const v18, -0x74a01549

    xor-int v1, v1, v18

    const v18, 0x7b34f6dd

    goto/16 :goto_12

    :cond_d
    const-string v0, "\u06d6\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x75

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x3f75

    const v18, 0x229f8a86

    xor-int v1, v1, v18

    const v18, -0x1b8ea4bb

    goto/16 :goto_12

    :sswitch_14
    move/from16 v25, v3

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    aget-short v18, v16, v17

    mul-int v19, v18, v18

    .line 778
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_e

    move-object/from16 v20, v2

    :goto_f
    move/from16 v3, v25

    goto/16 :goto_11

    :cond_e
    const-string v0, "\u073d\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x7323

    const v3, -0x79d65f45

    xor-int/2addr v1, v3

    const v3, -0x3ac99691

    xor-int/2addr v0, v3

    move-object/from16 v20, v2

    goto/16 :goto_13

    :sswitch_15
    move/from16 v25, v3

    move/from16 v3, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    const/16 v17, 0x0

    .line 279
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_f

    :goto_10
    const-string v0, "\u05a1\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x4b

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x2bf1

    const v18, 0x331ca2f2

    xor-int v1, v1, v18

    const v18, -0x1e892690

    goto :goto_12

    :cond_f
    const-string v0, "\u073d\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x7ecb

    const v18, -0x6ed639cd

    xor-int v1, v1, v18

    const v18, -0x34426980    # -2.4849664E7f

    goto :goto_12

    :sswitch_16
    move/from16 v25, v3

    move/from16 v3, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v26

    sget-object v16, Ll/᩵᩵ۡ;->۫ۡ᩷:[S

    .line 273
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-gtz v0, :cond_10

    move-object/from16 v20, v2

    move/from16 v18, v3

    goto :goto_f

    :goto_11
    const-string v0, "\u06d6\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x4685

    const v2, -0x777b3e8c

    xor-int/2addr v2, v1

    const v1, -0x7ae59d

    xor-int v25, v0, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v26, v13

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u1a78\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x65

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x2bdf

    const v18, -0x8956f23

    xor-int v1, v1, v18

    const v18, -0x6d34dff

    :goto_12
    xor-int v0, v0, v18

    move-object/from16 v20, v2

    move/from16 v18, v3

    :goto_13
    move-object/from16 v26, v13

    move/from16 v3, v25

    move/from16 v25, v0

    move v2, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75a19c12 -> :sswitch_b
        -0x6e523e7c -> :sswitch_e
        -0x680899f1 -> :sswitch_14
        -0x66d6c17b -> :sswitch_0
        -0x652e5c96 -> :sswitch_15
        -0x595dc3f8 -> :sswitch_12
        -0x42a40376 -> :sswitch_5
        -0x3a8f7e4d -> :sswitch_4
        -0x2e44313f -> :sswitch_10
        -0x29290df7 -> :sswitch_4
        -0x28644a1f -> :sswitch_11
        -0x24159c21 -> :sswitch_a
        -0x2162d764 -> :sswitch_e
        -0x1e7d9394 -> :sswitch_a
        -0x1c381c75 -> :sswitch_3
        -0x1ae51aa8 -> :sswitch_3
        -0x1a508172 -> :sswitch_16
        -0x402be7f -> :sswitch_7
        0xb377527 -> :sswitch_b
        0x15d9ca7f -> :sswitch_6
        0x1a12e979 -> :sswitch_8
        0x1dae6cc9 -> :sswitch_2
        0x26039125 -> :sswitch_16
        0x28808066 -> :sswitch_9
        0x289707d8 -> :sswitch_13
        0x296266de -> :sswitch_13
        0x2a8a5698 -> :sswitch_c
        0x2f386550 -> :sswitch_c
        0x381c59ee -> :sswitch_15
        0x3cbd0a27 -> :sswitch_6
        0x4812556d -> :sswitch_9
        0x4a91af28 -> :sswitch_0
        0x54d34d96 -> :sswitch_1
        0x58f005c9 -> :sswitch_5
        0x6204f33e -> :sswitch_12
        0x63f20265 -> :sswitch_10
        0x63f6f281 -> :sswitch_f
        0x642baea8 -> :sswitch_f
        0x66c1c842 -> :sswitch_8
        0x6bb438f1 -> :sswitch_2
        0x70bc06d5 -> :sswitch_d
        0x71c32de5 -> :sswitch_14
        0x71f78be1 -> :sswitch_7
        0x75f9e709 -> :sswitch_d
        0x7a779fea -> :sswitch_1
        0x7e01c2d2 -> :sswitch_11
    .end sparse-switch
.end method
