.class public final synthetic Ll/ܿ֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 6

    const v0, -0x59be9322

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/֡᩶;->ܳܶ۠:I

    const-string v3, "\u1a76\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a07

    const v5, 0x23b9ef50

    xor-int/2addr v4, v5

    const v5, -0x703a5ecb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x2a97

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_5

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_9

    goto/16 :goto_4

    :sswitch_1
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v3, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_2

    .line 4
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ܿ֨᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ᩳ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_0

    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2943

    const v5, 0x30e85397

    xor-int/2addr v4, v5

    const v5, -0xa354c64

    goto :goto_0

    :cond_0
    const-string v3, "\u06eb\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1b09

    const v5, 0x293c861a

    xor-int/2addr v4, v5

    const v5, -0x5e3eb638

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a76\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e75

    const v5, -0x6bde3866

    xor-int/2addr v4, v5

    const v5, 0x1d9f4e5c

    goto :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x732b

    const v5, -0x6fe084ad

    xor-int/2addr v4, v5

    const v5, 0x2435e812

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d7\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4099

    const v5, -0x2357dff2

    xor-int/2addr v4, v5

    const v5, 0x64c01c35

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0733\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e2d

    const v5, 0x29da3165

    xor-int/2addr v4, v5

    const v5, -0x19645dce

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe13

    const v5, 0x539dae12

    xor-int/2addr v4, v5

    const v5, 0x7ef94d36

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x12dd

    const v5, -0x52262f73

    xor-int/2addr v4, v5

    const v5, 0x71625c00

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u073f\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6843

    const v5, -0x3bbbb0e6

    xor-int/2addr v4, v5

    const v5, -0x7e9f1c43

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a73\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6251

    const v5, -0xa26c5bd

    xor-int/2addr v4, v5

    const v5, 0x13ca4bfb

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4203

    const v5, -0x1914b658

    xor-int/2addr v4, v5

    const v5, -0x39e5da05

    goto/16 :goto_0

    .line 4
    :sswitch_d
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u05ab\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x695d

    const v5, 0x7d0bd7b6

    xor-int/2addr v4, v5

    const v5, 0x3d549647

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073a\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b01

    const v5, -0x1898ce1c

    xor-int/2addr v4, v5

    const v5, 0x6e4d7077

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb9d

    const v5, -0x2b78460

    xor-int/2addr v4, v5

    const v5, -0xc993d8

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3673

    const v5, 0x183ae1bb

    xor-int/2addr v4, v5

    const v5, -0x4dcb5a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef24219 -> :sswitch_4
        -0x6d86430a -> :sswitch_2
        -0x51e38404 -> :sswitch_5
        -0x43d45483 -> :sswitch_8
        -0x35264b53 -> :sswitch_1
        -0x2e742e54 -> :sswitch_2
        -0x2488c2e2 -> :sswitch_0
        -0x22e46a5b -> :sswitch_7
        -0x10ccd004 -> :sswitch_6
        -0x100f0596 -> :sswitch_9
        -0x5dcbe31 -> :sswitch_1
        -0x48e8429 -> :sswitch_5
        0xa884037 -> :sswitch_3
        0x1024b23b -> :sswitch_3
        0x10736753 -> :sswitch_e
        0x11a1a034 -> :sswitch_d
        0x1748fc4d -> :sswitch_e
        0x1bdadd52 -> :sswitch_4
        0x249e7f44 -> :sswitch_b
        0x332114d7 -> :sswitch_6
        0x34fd79ed -> :sswitch_c
        0x38db4f12 -> :sswitch_9
        0x43548363 -> :sswitch_8
        0x4a7d93bf -> :sswitch_7
        0x4dc0bb9d -> :sswitch_c
        0x57ebe64b -> :sswitch_d
        0x5a6d341b -> :sswitch_a
        0x5c534d4e -> :sswitch_a
        0x6fb794c5 -> :sswitch_0
        0x7dfd6507 -> :sswitch_b
    .end sparse-switch
.end method
