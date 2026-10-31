.class public final Ll/ۤᩳ᩷;
.super Ljava/lang/Object;
.source "K2RM"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x538e729f

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u073a\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5145

    const v6, 0x3751f940

    xor-int/2addr v5, v6

    const v6, -0x357148d4    # -4676502.0f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7cef

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 16
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_3

    .line 21
    :sswitch_0
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v4, :cond_9

    goto/16 :goto_1

    .line 2
    :sswitch_1
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u1a79\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2633

    const v6, -0x6c3276c9

    xor-int/2addr v5, v6

    const v6, -0x5fca8f55

    goto :goto_0

    .line 0
    :sswitch_2
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_5

    goto/16 :goto_1

    .line 10
    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_1

    .line 23
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 29
    :sswitch_5
    iput-object v0, p0, Ll/ۤᩳ᩷;->֫:Ljava/util/HashMap;

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06db\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4c0b

    const v6, 0x5ab8fca3

    xor-int/2addr v5, v6

    const v6, 0x5fba40e3

    goto :goto_0

    .line 21
    :sswitch_7
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06df\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7ec9

    const v6, 0x59402d6c

    xor-int/2addr v5, v6

    const v6, -0x3c1b2f4d

    goto/16 :goto_0

    .line 8
    :sswitch_8
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a79\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13e1

    const v6, -0x28c13649

    xor-int/2addr v5, v6

    const v6, -0x9ab74cb

    goto/16 :goto_0

    .line 11
    :sswitch_9
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06eb\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x699f

    const v6, -0x4c16dd68

    xor-int/2addr v5, v6

    const v6, 0x79d2c08f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b59

    const v6, 0x7b9b9b20

    xor-int/2addr v5, v6

    const v6, 0x6008a660

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06db\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xab9

    const v6, 0x1a963f9e

    xor-int/2addr v5, v6

    const v6, 0x7ed8093c

    goto/16 :goto_0

    .line 9
    :sswitch_b
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_7

    :goto_1
    const-string v4, "\u1a7b\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xfcb

    const v6, 0x2cedb0fc

    xor-int/2addr v5, v6

    const v6, 0x50b86f88

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1a01

    const v6, 0x46614622

    xor-int/2addr v5, v6

    const v6, 0x22dbe6f8

    goto/16 :goto_0

    .line 6
    :sswitch_c
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b4b

    const v6, -0x3a03332

    xor-int/2addr v5, v6

    const v6, 0xf5aaeb6

    goto/16 :goto_0

    .line 21
    :sswitch_d
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4db1

    const v6, -0x6b293674

    xor-int/2addr v5, v6

    const v6, -0x4f4d8863

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0730\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x50c7

    const v6, -0x55f45908

    xor-int/2addr v5, v6

    const v6, 0x13edbcbf

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4a63

    const v6, 0x27021fe4

    xor-int/2addr v5, v6

    const v6, -0x4f0e9b8e

    goto/16 :goto_0

    .line 29
    :sswitch_e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v4

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u05a8\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x235b

    const v6, -0x13655e3d

    xor-int/2addr v5, v6

    const v6, 0x26afb9b0

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e3b

    const v6, 0x1eb26cdd

    xor-int/2addr v5, v6

    const v6, 0x219b9826

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78c036e8 -> :sswitch_e
        -0x782a4d28 -> :sswitch_b
        -0x7401dcfc -> :sswitch_2
        -0x63db218d -> :sswitch_e
        -0x52837b23 -> :sswitch_6
        -0x499a3970 -> :sswitch_3
        -0x48181cd4 -> :sswitch_c
        -0x42e52247 -> :sswitch_4
        -0x40ef2dd9 -> :sswitch_8
        -0x32fd9a19 -> :sswitch_d
        -0xe46b56d -> :sswitch_5
        -0x2db1864 -> :sswitch_1
        -0x1b32cb1 -> :sswitch_c
        0x1bf63918 -> :sswitch_7
        0x21c3a1fe -> :sswitch_b
        0x226fc5dd -> :sswitch_8
        0x2363c559 -> :sswitch_a
        0x28725de4 -> :sswitch_9
        0x321aef41 -> :sswitch_7
        0x36a2f5dc -> :sswitch_3
        0x3965215a -> :sswitch_a
        0x491d7c17 -> :sswitch_2
        0x5101b218 -> :sswitch_5
        0x5ad13763 -> :sswitch_4
        0x5d10c525 -> :sswitch_1
        0x5d5058d8 -> :sswitch_d
        0x6f2dfc62 -> :sswitch_9
        0x700580a4 -> :sswitch_0
        0x7537d393 -> :sswitch_0
        0x77be6cbf -> :sswitch_6
    .end sparse-switch
.end method
