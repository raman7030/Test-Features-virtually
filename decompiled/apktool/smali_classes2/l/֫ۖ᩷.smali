.class public final Ll/֫ۖ᩷;
.super Landroid/webkit/WebChromeClient;
.source "N15Q"


# instance fields
.field public final synthetic ֫:Ll/ۧۖ᩷;


# direct methods
.method public constructor <init>(Ll/ۧۖ᩷;)V
    .locals 0

    .line 69
    iput-object p1, p0, Ll/֫ۖ᩷;->֫:Ll/ۧۖ᩷;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    const p1, 0x7987da95

    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v2, "\u1a79\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x55

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x1223

    const v4, -0x690fb7a6

    xor-int/2addr v3, v4

    const v4, -0x1e249520

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v1

    mul-int/lit16 p1, p1, 0xbc1

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 35
    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v2, :cond_7

    goto/16 :goto_5

    .line 44
    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v2, :cond_b

    goto/16 :goto_4

    .line 71
    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget-boolean v2, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v2, :cond_9

    goto/16 :goto_2

    .line 62
    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_2

    .line 72
    :sswitch_4
    iget-object p1, p0, Ll/֫ۖ᩷;->֫:Ll/ۧۖ᩷;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    .line 44
    :sswitch_5
    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "\u06e7\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x51

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x1423

    const v4, 0x64ede7af

    xor-int/2addr v3, v4

    const v4, 0x399a4141

    goto :goto_0

    :sswitch_6
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v2, "\u06eb\u06e7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2139

    const v4, 0x496f4662    # 980070.1f

    xor-int/2addr v3, v4

    const v4, -0x522194e6

    goto :goto_0

    .line 57
    :sswitch_7
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v2, :cond_2

    :goto_1
    const-string v2, "\u0733\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x2f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5367

    const v4, 0xa96ed5d

    xor-int/2addr v3, v4

    const v4, 0x26eca948

    goto/16 :goto_0

    :cond_2
    const-string v2, "\u0736\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x730f

    const v4, 0x2cb9bef0

    xor-int/2addr v3, v4

    const v4, -0x769a8ffa

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u06dc\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x33

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2bfd

    const v4, -0x6137bba5

    xor-int/2addr v3, v4

    const v4, -0x4a795dac

    goto/16 :goto_0

    .line 56
    :sswitch_9
    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v2, :cond_4

    goto :goto_2

    :cond_4
    const-string v2, "\u06d9\u06e0"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x3

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x9af

    const v4, 0x1e4ede5f

    xor-int/2addr v3, v4

    const v4, 0x3ee32e3f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v2, "\u06df\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x7d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x165f

    const v4, -0x79d5204d

    xor-int/2addr v3, v4

    const v4, 0x3269dab1

    goto/16 :goto_0

    .line 69
    :sswitch_b
    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v2, :cond_6

    :goto_2
    const-string v2, "\u06e0\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x13

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xe31

    const v4, -0x511dbb24

    xor-int/2addr v3, v4

    const v4, -0x563d543a

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u073d\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x6d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0xbb7

    const v4, 0x5e5ae668

    xor-int/2addr v3, v4

    const v4, 0x759381bf

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v2

    if-gtz v2, :cond_8

    :cond_7
    :goto_3
    const-string v2, "\u06eb\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x69

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x24ed

    const v4, 0x1c452fff

    xor-int/2addr v3, v4

    const v4, -0x78708aba

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u0736\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1ed5

    const v4, 0x72521ab

    xor-int/2addr v3, v4

    const v4, 0x1d2c5df8

    goto/16 :goto_0

    .line 58
    :sswitch_d
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_a

    :cond_9
    :goto_4
    const-string v2, "\u06e1\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x27a9

    const v4, -0x29967ba5

    xor-int/2addr v3, v4

    const v4, -0x4bc7ca8e

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u1a7b\u05ab"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x77

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xa87

    const v4, 0x1dbbc329

    xor-int/2addr v3, v4

    const v4, 0x3fa2391f

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_c

    :cond_b
    :goto_5
    const-string v2, "\u06db\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x1033

    const v4, 0x1bbc9aee

    xor-int/2addr v3, v4

    const v4, -0x278f8a6e

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06eb\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x3f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4937

    const v4, -0x4ab29a25

    xor-int/2addr v3, v4

    const v4, 0x2f4873e0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x64e5a83a -> :sswitch_a
        -0x63dc9c0b -> :sswitch_9
        -0x601dfbfc -> :sswitch_3
        -0x4f3e3e53 -> :sswitch_e
        -0x3b82fad0 -> :sswitch_d
        -0x22b9cda6 -> :sswitch_6
        -0x1fd49e55 -> :sswitch_4
        -0x1ae6d396 -> :sswitch_c
        -0x13975fac -> :sswitch_7
        -0xa8ad8b1 -> :sswitch_b
        -0x6bb5c33 -> :sswitch_0
        -0x602ed8f -> :sswitch_5
        -0x503bcdd -> :sswitch_1
        0x525d13f -> :sswitch_2
        0x1d27dff5 -> :sswitch_a
        0x2115c4a7 -> :sswitch_e
        0x2a660f55 -> :sswitch_5
        0x2e2f1d71 -> :sswitch_c
        0x3d748aef -> :sswitch_8
        0x3ea7a66f -> :sswitch_4
        0x424f67c4 -> :sswitch_1
        0x491a086d -> :sswitch_8
        0x4e430820 -> :sswitch_9
        0x4edd9489 -> :sswitch_3
        0x563f808f -> :sswitch_2
        0x5d886554 -> :sswitch_7
        0x62fb4ef2 -> :sswitch_0
        0x64397e86 -> :sswitch_d
        0x79fe2d9b -> :sswitch_6
        0x7da25f96 -> :sswitch_b
    .end sparse-switch
.end method
