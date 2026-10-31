.class public final synthetic Ll/۟ۚ᩷;
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

    iput-object p1, p0, Ll/۟ۚ᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 6

    const v0, 0x4065ceb3

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5af5

    const v5, -0x3f4c3778

    xor-int/2addr v4, v5

    const v5, -0x56d476d1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x39cb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto/16 :goto_1

    .line 3
    :sswitch_0
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_6

    goto/16 :goto_3

    .line 0
    :sswitch_1
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    return-void

    .line 0
    :sswitch_4
    iget-object v0, p0, Ll/۟ۚ᩷;->᩸:Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->ܽ(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    .line 4
    :sswitch_5
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a76\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ae1

    const v5, 0x2a4ede24

    xor-int/2addr v4, v5

    const v5, -0x66a4b57

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073f\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2727

    const v5, 0x736d1a82

    xor-int/2addr v4, v5

    const v5, -0x7152052c

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x72df

    const v5, -0x7fcd84c0

    xor-int/2addr v4, v5

    const v5, 0x22ccc04c

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u05a1\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73e9

    const v5, -0x2889f5a

    xor-int/2addr v4, v5

    const v5, -0x6e8bb38e

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18cd

    const v5, 0x5aa52509

    xor-int/2addr v4, v5

    const v5, -0x99c15df

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x26e5

    const v5, 0x3fb0f9ae

    xor-int/2addr v4, v5

    const v5, -0x5e892b43

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d6f

    const v5, 0x354e40fa

    xor-int/2addr v4, v5

    const v5, 0x46981142

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c73

    const v5, -0x3f234e11

    xor-int/2addr v4, v5

    const v5, -0x72502e6b

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5233

    const v5, 0x6c6d6706

    xor-int/2addr v4, v5

    const v5, -0xf41da78

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_8

    :goto_2
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1317

    const v5, -0x1abada68

    xor-int/2addr v4, v5

    const v5, 0x79070257

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6ba5

    const v5, 0x691c024

    xor-int/2addr v4, v5

    const v5, 0x13e688c5

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x22f1

    const v5, -0x4535ff57

    xor-int/2addr v4, v5

    const v5, -0x3c339f5c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x10f

    const v5, 0x3bc286fe

    xor-int/2addr v4, v5

    const v5, -0x62d275

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a77\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6fa5

    const v5, 0xb7e11d1

    xor-int/2addr v4, v5

    const v5, 0x58578067

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x33d3

    const v5, -0xc8a138f

    xor-int/2addr v4, v5

    const v5, 0x5e4e218f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7efdc817 -> :sswitch_2
        -0x62d958af -> :sswitch_3
        -0x5faec7b5 -> :sswitch_0
        -0x5dbf6a2c -> :sswitch_7
        -0x5d2af622 -> :sswitch_c
        -0x5b62a344 -> :sswitch_a
        -0x5abd2a46 -> :sswitch_d
        -0x532a9e4c -> :sswitch_1
        -0x4bafb95e -> :sswitch_6
        -0x4b234c7a -> :sswitch_8
        -0x3e0fad30 -> :sswitch_a
        -0x393d2a94 -> :sswitch_4
        -0x2a2434fb -> :sswitch_2
        -0x156fe2c6 -> :sswitch_5
        -0xd78ab80 -> :sswitch_1
        -0x63b635 -> :sswitch_4
        0x99e3f1b -> :sswitch_6
        0x11a52b27 -> :sswitch_e
        0x135e3f60 -> :sswitch_d
        0x25167f12 -> :sswitch_b
        0x26cb7a12 -> :sswitch_c
        0x355a7b0e -> :sswitch_0
        0x44e73a84 -> :sswitch_3
        0x514a48d4 -> :sswitch_7
        0x5ad50b7e -> :sswitch_9
        0x64bc81e4 -> :sswitch_b
        0x690f62b7 -> :sswitch_5
        0x7536bda9 -> :sswitch_e
        0x77215d74 -> :sswitch_9
        0x78208341 -> :sswitch_8
    .end sparse-switch
.end method
