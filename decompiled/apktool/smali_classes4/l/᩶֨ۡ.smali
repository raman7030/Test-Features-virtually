.class public final synthetic Ll/᩶֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ܶ᩵ۡ;

.field public final synthetic ۙ:Landroid/app/Activity;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:[B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[BLjava/lang/String;Landroid/app/Activity;Ll/ܶ᩵ۡ;)V
    .locals 6

    const v0, 0x53820ae9

    sget v1, Ll/֡᩶;->ܳܶ۠:I

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3031

    const v5, 0x161c1702

    xor-int/2addr v4, v5

    const v5, -0x7741865a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7083

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_b

    goto :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_6

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    :goto_1
    const-string v3, "\u06e1\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x45cf

    const v5, -0x8a1fbfc

    xor-int/2addr v4, v5

    const v5, 0x772f2e68

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/᩶֨ۡ;->ۙ:Landroid/app/Activity;

    iput-object p5, p0, Ll/᩶֨ۡ;->ۗ:Ll/ܶ᩵ۡ;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/᩶֨ۡ;->᩶:Ljava/lang/String;

    .line 2
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a7b\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x56b

    const v5, -0x522d4e10

    xor-int/2addr v4, v5

    const v5, -0x1e5953c4

    goto :goto_0

    :cond_1
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x35ef

    const v5, -0xd9ce10f

    xor-int/2addr v4, v5

    const v5, 0x32c68a19

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3397

    const v5, 0x5717f926

    xor-int/2addr v4, v5

    const v5, -0x30c5ac67

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06dc\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x52af

    const v5, 0x17b5fbdd

    xor-int/2addr v4, v5

    const v5, -0x323c6172    # -4.1024352E8f

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7463

    const v5, 0x1e558829

    xor-int/2addr v4, v5

    const v5, 0x4c065ef7    # 3.522454E7f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05a1\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4f77

    const v5, -0x5d507ac0

    xor-int/2addr v4, v5

    const v5, -0x71c510ae

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4659

    const v5, 0x371026f3

    xor-int/2addr v4, v5

    const v5, -0x2de13ab2

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073f\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x792b

    const v5, -0x5ce79825

    xor-int/2addr v4, v5

    const v5, -0x28caeb7

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u1a73\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27cd

    const v5, 0x3764a9e3

    xor-int/2addr v4, v5

    const v5, 0x7f6f4651

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073a\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30f7

    const v5, -0x324d7cd5

    xor-int/2addr v4, v5

    const v5, -0x4d7ef8a3

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_a

    :cond_9
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7baf

    const v5, -0x406130bf

    xor-int/2addr v4, v5

    const v5, 0x609ed250

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22af

    const v5, 0x5cb8378b

    xor-int/2addr v4, v5

    const v5, 0x4dc22bc2    # 4.07205952E8f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩶֨ۡ;->᩸:Ljava/lang/String;

    iput-object p2, p0, Ll/᩶֨ۡ;->᩹:[B

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06db\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3139

    const v5, 0x75706360

    xor-int/2addr v4, v5

    const v5, 0x53de7beb

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4155

    const v5, -0x5933d54e

    xor-int/2addr v4, v5

    const v5, -0x4fc44e5a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d5adeaa -> :sswitch_1
        -0x6505762d -> :sswitch_7
        -0x5f44b7f9 -> :sswitch_8
        -0x44ea80a2 -> :sswitch_5
        -0x3518a6e5 -> :sswitch_4
        -0x29a396cd -> :sswitch_6
        -0x23f44295 -> :sswitch_d
        -0x1ae59342 -> :sswitch_e
        -0x19ec8312 -> :sswitch_6
        -0x17ceed9f -> :sswitch_b
        -0x15747bc1 -> :sswitch_d
        -0xdffaddf -> :sswitch_4
        -0xd3b22d3 -> :sswitch_3
        -0x6449541 -> :sswitch_2
        -0x58588f8 -> :sswitch_0
        0x79cd85 -> :sswitch_7
        0x96e7a57 -> :sswitch_1
        0xba6f55d -> :sswitch_0
        0x11413a2d -> :sswitch_2
        0x16b6794b -> :sswitch_8
        0x2132ec23 -> :sswitch_9
        0x250fbf43 -> :sswitch_c
        0x27b5f4ae -> :sswitch_e
        0x35b8500c -> :sswitch_9
        0x488a0c2d -> :sswitch_5
        0x527b001a -> :sswitch_a
        0x578f83c1 -> :sswitch_c
        0x66bcbd46 -> :sswitch_a
        0x69c5c585 -> :sswitch_b
        0x7f11b339 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x2d1f3a6a

    sget v4, Ll/֡۬;->۠֡᩶:I

    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v6, "\u06e0\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x205

    const v8, 0x7203e32a

    xor-int/2addr v7, v8

    const v8, -0x31f0ab12    # -6.0117696E8f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x351f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 0
    iget-object v3, p0, Ll/᩶֨ۡ;->᩹:[B

    iget-object v4, p0, Ll/᩶֨ۡ;->᩶:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۖ۠ۡ;->֫(Ljava/lang/String;[BLjava/lang/String;Landroid/app/Activity;Ll/ܶ᩵ۡ;)V

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v6, "\u06dc\u06e1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x59c3

    const v8, -0x58349848

    xor-int/2addr v7, v8

    const v8, 0x456a4b7c

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v6, :cond_7

    goto/16 :goto_3

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v6

    if-gez v6, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/᩶֨ۡ;->᩸:Ljava/lang/String;

    .line 3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v6

    if-eqz v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "\u06dc\u06da"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x211

    const v8, 0x28816abd

    xor-int/2addr v7, v8

    const v8, 0x22c398d7

    goto :goto_0

    .line 0
    :sswitch_6
    iget-object v1, p0, Ll/᩶֨ۡ;->ۗ:Ll/ܶ᩵ۡ;

    sget v6, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u06dc\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6be3

    const v8, -0x6b8a6ed6

    xor-int/2addr v7, v8

    const v8, 0x4323853e

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u06eb\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x927

    const v8, -0x7559a625

    xor-int/2addr v7, v8

    const v8, 0x3177a772

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget-boolean v6, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u06db\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2b4b

    const v8, -0x2de1860f

    xor-int/2addr v7, v8

    const v8, 0x2442d767

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v6, Ll/۟;->ۗۤۛ:I

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    const-string v6, "\u1a77\u06ec"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x27

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3741

    const v8, -0x5ed0feb6

    xor-int/2addr v7, v8

    const v8, 0x39f645f4

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean v6, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u0730\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1771

    const v8, 0x3f8f0948

    xor-int/2addr v7, v8

    const v8, -0x4f2afae

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v6, :cond_8

    :cond_7
    :goto_1
    const-string v6, "\u073d\u06e4"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x697d

    const v8, -0x375ba3d7

    xor-int/2addr v7, v8

    const v8, 0x299a7ccc

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a74\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3cad

    const v8, -0x6a646f0b

    xor-int/2addr v7, v8

    const v8, 0x615e6f1b

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v6, :cond_9

    :goto_2
    const-string v6, "\u06e7\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x85f

    const v8, 0x6c6e21cb

    xor-int/2addr v7, v8

    const v8, -0x1cf29cb8

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u073a\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x24cf

    const v8, 0x53a67b71

    xor-int/2addr v7, v8

    const v8, 0x57fe648c

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v6, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v6, :cond_a

    :goto_3
    const-string v6, "\u06d9\u1a7a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1e4d

    const v8, -0x32f4678

    xor-int/2addr v7, v8

    const v8, 0x6947b287

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e7\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2e35

    const v8, -0x5338a15f

    xor-int/2addr v7, v8

    const v8, -0x3b37382a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/᩶֨ۡ;->ۙ:Landroid/app/Activity;

    .line 2
    sget v6, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v6, :cond_c

    :cond_b
    const-string v6, "\u06da\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6a9f

    const v8, 0x6ea20ee4

    xor-int/2addr v7, v8

    const v8, -0x30637bf2    # -5.2518001E9f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e7\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x66df

    const v8, -0x70631556

    xor-int/2addr v7, v8

    const v8, -0x5a090211

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ab1da77 -> :sswitch_5
        -0x6cd8708c -> :sswitch_8
        -0x5cdd8216 -> :sswitch_3
        -0x4ec97853 -> :sswitch_e
        -0x4da0fd53 -> :sswitch_9
        -0x47e0de66 -> :sswitch_2
        -0x445f0d17 -> :sswitch_4
        -0x31aa1c3d -> :sswitch_a
        -0x1f306529 -> :sswitch_1
        -0x1c330503 -> :sswitch_6
        -0x1c1908d5 -> :sswitch_9
        -0x13d41762 -> :sswitch_5
        0x130584 -> :sswitch_d
        0x1990d101 -> :sswitch_8
        0x22ce0572 -> :sswitch_2
        0x2e406f1a -> :sswitch_1
        0x35d2f978 -> :sswitch_6
        0x3938cb61 -> :sswitch_3
        0x4a4f29d3 -> :sswitch_c
        0x4c0509be -> :sswitch_0
        0x4f15ddf7 -> :sswitch_b
        0x520df2f4 -> :sswitch_c
        0x5792dd6d -> :sswitch_a
        0x61073933 -> :sswitch_e
        0x67bc5ec2 -> :sswitch_7
        0x69744102 -> :sswitch_4
        0x7036e0f0 -> :sswitch_d
        0x76f762dc -> :sswitch_0
        0x7d735fa9 -> :sswitch_7
        0x7d8cf8d6 -> :sswitch_b
    .end sparse-switch
.end method
