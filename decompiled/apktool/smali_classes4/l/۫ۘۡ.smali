.class public final synthetic Ll/۫ۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۛۘۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۘۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۘۡ;->᩸:Ll/ۛۘۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x2699fd16

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v3, "\u06e4\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x79fb

    const v5, 0x7e261ea3

    xor-int/2addr v4, v5

    const v5, 0x38484008

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7e69

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_8

    goto/16 :goto_4

    :sswitch_0
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-lez v3, :cond_7

    goto :goto_1

    .line 4
    :sswitch_1
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_b

    goto :goto_1

    :sswitch_2
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u06da\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6055

    const v5, -0x6d8bbdab

    xor-int/2addr v4, v5

    const v5, 0x6742cae4

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/۫ۘۡ;->᩸:Ll/ۛۘۡ;

    invoke-static {p1}, Ll/ۛۘۡ;->֫(Ll/ۛۘۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    .line 1
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0730\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ce3

    const v5, -0x4a72fe01

    xor-int/2addr v4, v5

    const v5, 0x19d85b0

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06db\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b07

    const v5, -0x539019e

    xor-int/2addr v4, v5

    const v5, -0x71a9582c

    goto :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_3

    :goto_2
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5607

    const v5, -0x75cafb5d

    xor-int/2addr v4, v5

    const v5, -0x688bb3a

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x250f

    const v5, -0x112dd023

    xor-int/2addr v4, v5

    const v5, 0x4ca18de5    # 8.4700968E7f

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06e8\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d9b

    const v5, 0x47b121ba

    xor-int/2addr v4, v5

    const v5, -0x28cf2577

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_5

    :goto_3
    const-string v3, "\u0733\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x71ff

    const v5, 0x97e595e

    xor-int/2addr v4, v5

    const v5, -0x79b61709

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u0730\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4057

    const v5, -0x240b94fa

    xor-int/2addr v4, v5

    const v5, -0x1e8bf37f

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6891

    const v5, -0x1a4452b6

    xor-int/2addr v4, v5

    const v5, -0x2c7d33ea

    goto/16 :goto_0

    :cond_7
    :goto_4
    const-string v3, "\u1a75\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4345

    const v5, 0x12cef21c

    xor-int/2addr v4, v5

    const v5, -0x2a046750

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0736\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33ff

    const v5, -0x1cd6644d

    xor-int/2addr v4, v5

    const v5, 0x37c7c48

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_9

    goto :goto_5

    :cond_9
    const-string v3, "\u05ab\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x44dd

    const v5, -0x691d9624

    xor-int/2addr v4, v5

    const v5, 0x449295b7

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7cb9

    const v5, 0x5f460a70

    xor-int/2addr v4, v5

    const v5, -0x7434f156

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1891

    const v5, 0x3cedad71

    xor-int/2addr v4, v5

    const v5, 0x58b783b4

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6467

    const v5, -0x68bd9cd4

    xor-int/2addr v4, v5

    const v5, 0x3d682259

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fbb6c6a -> :sswitch_a
        -0x75478924 -> :sswitch_9
        -0x6f02580f -> :sswitch_0
        -0x60c91968 -> :sswitch_5
        -0x60bb9d77 -> :sswitch_6
        -0x55716ad2 -> :sswitch_9
        -0x550736ca -> :sswitch_3
        -0x4f13594f -> :sswitch_4
        -0x49e8e9de -> :sswitch_8
        -0x41c11f7d -> :sswitch_c
        -0x3c4f688a -> :sswitch_2
        -0x3abe3dd8 -> :sswitch_2
        -0x3a3e3788 -> :sswitch_b
        -0x2ce70323 -> :sswitch_1
        -0x2747fe1b -> :sswitch_a
        -0x27030cc2 -> :sswitch_6
        -0x1dbcfed7 -> :sswitch_c
        -0x1355bfb2 -> :sswitch_5
        -0x11b4458d -> :sswitch_b
        -0x100a521e -> :sswitch_d
        0x158d5c00 -> :sswitch_0
        0x1fe24d66 -> :sswitch_e
        0x2038609f -> :sswitch_1
        0x32abd033 -> :sswitch_7
        0x3a072167 -> :sswitch_8
        0x4cd65332 -> :sswitch_4
        0x56feba08 -> :sswitch_7
        0x596450c8 -> :sswitch_e
        0x6bc24a56 -> :sswitch_d
        0x6fb6769d -> :sswitch_3
    .end sparse-switch
.end method
