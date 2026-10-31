.class public final synthetic Ll/ۢ۬ܽ;
.super Ljava/lang/Object;
.source "JAGX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ᩴ۬ܽ;

.field public final synthetic ᩹:Ll/ܰܳۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴ۬ܽ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Ll/ܰܳۡ;Ljava/lang/String;)V
    .locals 6

    const v0, 0xb5702c5

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4499

    const v5, 0x783e8a57

    xor-int/2addr v4, v5

    const v5, 0x699214b7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x6665

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۢ۬ܽ;->᩸:Ll/ᩴ۬ܽ;

    iput-object p4, p0, Ll/ۢ۬ܽ;->᩹:Ll/ܰܳۡ;

    .line 3
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_c

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_9

    goto/16 :goto_3

    .line 0
    :sswitch_2
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-lez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u0733\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x62c7

    const v5, 0x5088ed79

    xor-int/2addr v4, v5

    const v5, -0x23e27cc6

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/ۢ۬ܽ;->ۙ:Lbin/mt/plus/Main;

    iput-object p5, p0, Ll/ۢ۬ܽ;->ۗ:Ljava/lang/String;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ۢ۬ܽ;->᩶:Ll/֡ۚۢ;

    .line 2
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_1

    const-string v3, "\u073d\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x233b

    const v5, 0x7ccc2c44

    xor-int/2addr v4, v5

    const v5, -0x7f6f0c37

    goto :goto_0

    :cond_1
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x427f

    const v5, -0x468a1342

    xor-int/2addr v4, v5

    const v5, -0x7dc41bca

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e99

    const v5, -0x4ba6729

    xor-int/2addr v4, v5

    const v5, -0x4389f094

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x41b5

    const v5, 0x57860b4

    xor-int/2addr v4, v5

    const v5, -0x7f9eb7e

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d9\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x21af

    const v5, -0x7c3c251b

    xor-int/2addr v4, v5

    const v5, -0x72c663e0

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06df\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x20a5

    const v5, -0x674a32ed

    xor-int/2addr v4, v5

    const v5, -0x58623f94

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c67

    const v5, 0x2fe066dc

    xor-int/2addr v4, v5

    const v5, 0x112c2068

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06d6\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x391f

    const v5, -0x4527865b

    xor-int/2addr v4, v5

    const v5, 0x546f8158

    goto/16 :goto_0

    .line 1
    :sswitch_c
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u05a1\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x26d3

    const v5, -0xd70fd59

    xor-int/2addr v4, v5

    const v5, 0x20c4ddd1

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u1a75\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e53

    const v5, -0x15b2e203

    xor-int/2addr v4, v5

    const v5, 0x12def271

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a1\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2955

    const v5, 0x9cc8363

    xor-int/2addr v4, v5

    const v5, 0x265a774a

    goto/16 :goto_0

    .line 3
    :sswitch_e
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u06d8\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4f43

    const v5, -0x2de3a0ae

    xor-int/2addr v4, v5

    const v5, -0x4605dc12

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u06d9\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1cf7

    const v5, -0x486c52c7

    xor-int/2addr v4, v5

    const v5, 0x4edaf957

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e4\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x34fd

    const v5, -0x26409070

    xor-int/2addr v4, v5

    const v5, -0x7d2c30e3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f1c5dfb -> :sswitch_1
        -0x6fbab505 -> :sswitch_9
        -0x60ee2a9b -> :sswitch_5
        -0x60ca25d9 -> :sswitch_1
        -0x58ed969d -> :sswitch_2
        -0x45a21c63 -> :sswitch_4
        -0x31836655 -> :sswitch_e
        -0x30fe2460 -> :sswitch_a
        -0x2a4bb2ed -> :sswitch_5
        -0x291fe6d6 -> :sswitch_e
        -0x1b123f67 -> :sswitch_b
        -0x1a565fef -> :sswitch_d
        -0x1a54e788 -> :sswitch_9
        -0x170032f4 -> :sswitch_7
        -0xeab4a4d -> :sswitch_8
        -0x430ba0b -> :sswitch_6
        0x234b294 -> :sswitch_d
        0x74e93d6 -> :sswitch_c
        0x10499912 -> :sswitch_0
        0x164e2642 -> :sswitch_c
        0x1a764b58 -> :sswitch_3
        0x1aa11c9a -> :sswitch_8
        0x1af72970 -> :sswitch_a
        0x22079b8f -> :sswitch_4
        0x2fa2a4e0 -> :sswitch_3
        0x44145105 -> :sswitch_2
        0x5ba69bd0 -> :sswitch_6
        0x65b22a3a -> :sswitch_0
        0x79be8422 -> :sswitch_7
        0x7c94a120 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x3b428e10

    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v6, "\u06eb\u1a75"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x47b5

    const v8, 0x43e88ef4

    xor-int/2addr v7, v8

    const v8, 0x18e7d917

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x505b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    return-void

    :sswitch_0
    sget v6, Ll/ۗ᩵;->֫۠۟:I

    if-gez v6, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_b

    goto/16 :goto_4

    .line 3
    :sswitch_2
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v6, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto :goto_1

    .line 0
    :sswitch_4
    iget-object v3, p0, Ll/ۢ۬ܽ;->᩹:Ll/ܰܳۡ;

    invoke-static {v1, p1, v2, v3, v0}, Ll/ᩴ۬ܽ;->֫(Ll/ᩴ۬ܽ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Ll/ܰܳۡ;Ljava/lang/String;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/ۢ۬ܽ;->᩸:Ll/ᩴ۬ܽ;

    iget-object v2, p0, Ll/ۢ۬ܽ;->᩶:Ll/֡ۚۢ;

    .line 3
    sget-boolean v6, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u073a\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x24e3

    const v8, 0x25074b7f

    xor-int/2addr v7, v8

    const v8, 0x51f6a466

    goto :goto_0

    .line 0
    :sswitch_6
    iget-object v0, p0, Ll/ۢ۬ܽ;->ۗ:Ljava/lang/String;

    .line 4
    sget v6, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v6, :cond_1

    goto :goto_2

    :cond_1
    const-string v6, "\u06d8\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x23ad

    const v8, 0x321dd455

    xor-int/2addr v7, v8

    const v8, -0x3df974b2

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object p1, p0, Ll/ۢ۬ܽ;->ۙ:Lbin/mt/plus/Main;

    sget v6, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v6, :cond_2

    :goto_1
    const-string v6, "\u06e4\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x15a5

    const v8, -0x2d8aa852

    xor-int/2addr v7, v8

    const v8, 0x6989553f

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06eb\u06ec"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x17

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x135b

    const v8, 0x68413627

    xor-int/2addr v7, v8

    const v8, -0x6b5894cc

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u06dc\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1a2f

    const v8, -0x72e00c5

    xor-int/2addr v7, v8

    const v8, -0x72672e80

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v6

    if-eqz v6, :cond_4

    :goto_2
    const-string v6, "\u1a73\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xe97

    const v8, -0x5dc0afa8

    xor-int/2addr v7, v8

    const v8, 0x5f5a9bbc

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u0736\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xad7

    const v8, 0x32ef5c80

    xor-int/2addr v7, v8

    const v8, 0x717cc6d

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u06e1\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x13d

    const v8, 0x72278906

    xor-int/2addr v7, v8

    const v8, 0x5baff6c8

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v6

    if-eqz v6, :cond_7

    :cond_6
    :goto_3
    const-string v6, "\u1a75\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x33d3

    const v8, -0x15d77b68

    xor-int/2addr v7, v8

    const v8, 0x388608fa

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a78\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x79bb

    const v8, 0x49a38bc3

    xor-int/2addr v7, v8

    const v8, -0x331b5fb7

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u06df\u1a78"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2e15

    const v8, 0x603b01cb

    xor-int/2addr v7, v8

    const v8, 0x6c3edcf

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v6, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u05a8\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x63eb

    const v8, -0x5e8e3dea

    xor-int/2addr v7, v8

    const v8, 0x411d8ea1

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0730\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7c8d

    const v8, -0x26727600

    xor-int/2addr v7, v8

    const v8, 0x2b4d4919

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u05a8\u0736"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1089

    const v8, -0xfb83d35

    xor-int/2addr v7, v8

    const v8, 0x471e44ea

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d9\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7545

    const v8, -0x3db20af4

    xor-int/2addr v7, v8

    const v8, 0x6aa6b634

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5e54e474 -> :sswitch_7
        -0x58a3fde8 -> :sswitch_6
        -0x57700411 -> :sswitch_3
        -0x53a022fc -> :sswitch_d
        -0x409ffe6e -> :sswitch_a
        -0x3913daa7 -> :sswitch_c
        -0x312fb360 -> :sswitch_4
        -0x2ba5317b -> :sswitch_a
        -0x2adb3052 -> :sswitch_1
        -0x29378c54 -> :sswitch_0
        -0x24aeb521 -> :sswitch_e
        -0x15495f58 -> :sswitch_8
        -0xe061f2a -> :sswitch_9
        -0xcbe55ff -> :sswitch_b
        -0x77ba6d -> :sswitch_3
        0x561dfe9 -> :sswitch_2
        0x7e3760b -> :sswitch_6
        0x888ab2e -> :sswitch_c
        0xb4c9559 -> :sswitch_d
        0xce42438 -> :sswitch_7
        0x1f8b6270 -> :sswitch_8
        0x26f43fc9 -> :sswitch_2
        0x2fa7ec1c -> :sswitch_5
        0x396312f3 -> :sswitch_1
        0x3a39531a -> :sswitch_5
        0x3a45e77e -> :sswitch_9
        0x3eb36d3b -> :sswitch_0
        0x4dcbb0ec -> :sswitch_e
        0x588ffb66 -> :sswitch_b
        0x7c61cd3d -> :sswitch_4
    .end sparse-switch
.end method
