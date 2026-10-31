.class public final synthetic Ll/ۡ۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ۠᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x1985f967

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v3, Ll/᩺;->ۙۛܶ:I

    const-string v4, "\u0736\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x357b

    const v6, 0x4995d0b9

    xor-int/2addr v5, v6

    const v6, 0x1125cfd9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2b4f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_b

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u073a\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x54a1

    const v6, 0x1c80885d

    xor-int/2addr v5, v6

    const v6, 0x30509cf6

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_9

    goto :goto_1

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    :goto_1
    const-string v4, "\u06df\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1daf

    const v6, 0x72532d73

    xor-int/2addr v5, v6

    const v6, -0x366e6a

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    .line 0
    :sswitch_4
    check-cast p1, Ll/᩺ۚۡ;

    invoke-static {v0, p1}, Lbin/mt/plus/Main;->֫(Lbin/mt/plus/Main;Ll/᩺ۚۡ;)V

    return-void

    :sswitch_5
    iget-object v0, p0, Ll/ۡ۠᩷;->᩸:Lbin/mt/plus/Main;

    .line 4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06d8\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x51a3

    const v6, 0x30acb005

    xor-int/2addr v5, v6

    const v6, 0x70272667

    goto :goto_0

    .line 0
    :sswitch_6
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5511

    const v6, 0x731d8f27

    xor-int/2addr v5, v6

    const v6, -0x48e07677

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06db\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5d9d

    const v6, -0x12419ed5

    xor-int/2addr v5, v6

    const v6, 0x2405a235

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xc15

    const v6, -0x285f21cc

    xor-int/2addr v5, v6

    const v6, 0x3a38d1ca

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06d7\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x213

    const v6, 0x3326f3c9

    xor-int/2addr v5, v6

    const v6, 0x6c36fec8

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x61fb

    const v6, -0x545c1fe

    xor-int/2addr v5, v6

    const v6, 0x12fd0a8a

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u073a\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x47ff

    const v6, -0x520cd39

    xor-int/2addr v5, v6

    const v6, 0xeb35276

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2e1d

    const v6, 0x2171a197

    xor-int/2addr v5, v6

    const v6, -0x6003973c

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a73\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x709d

    const v6, -0x1184f0ea

    xor-int/2addr v5, v6

    const v6, -0xcd1b0d2

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06df\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x55a5

    const v6, -0x7ec3b0bc

    xor-int/2addr v5, v6

    const v6, 0x35e7fa12

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e8\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6665

    const v6, 0x734523a9

    xor-int/2addr v5, v6

    const v6, 0x2b8a7a9d

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d6\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1183

    const v6, 0x6f4be8fe

    xor-int/2addr v5, v6

    const v6, -0x445e2075

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073d\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1da3

    const v6, 0x30628eb0

    xor-int/2addr v5, v6

    const v6, 0x109cac9b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79f47dba -> :sswitch_3
        -0x6b4936a3 -> :sswitch_2
        -0x541511bf -> :sswitch_3
        -0x4dbe66c2 -> :sswitch_1
        -0x3931f851 -> :sswitch_b
        -0x36fa2109 -> :sswitch_e
        -0x3513be08 -> :sswitch_8
        -0x2aacfe4f -> :sswitch_2
        -0x231919ff -> :sswitch_6
        -0x1cc0e95d -> :sswitch_5
        -0x14ab8aa8 -> :sswitch_0
        -0x112549ae -> :sswitch_a
        -0x107d5e8e -> :sswitch_1
        -0x8b035a9 -> :sswitch_7
        0x91c90cd -> :sswitch_4
        0x11e67fb6 -> :sswitch_6
        0x12eb273d -> :sswitch_0
        0x1c1d33dc -> :sswitch_d
        0x1fd19523 -> :sswitch_5
        0x271eea2b -> :sswitch_9
        0x2be49f1e -> :sswitch_c
        0x3815b480 -> :sswitch_8
        0x45068d98 -> :sswitch_e
        0x520918b3 -> :sswitch_c
        0x5a9010b3 -> :sswitch_a
        0x5b9d06de -> :sswitch_d
        0x6c24c13b -> :sswitch_9
        0x6d87a63f -> :sswitch_4
        0x7bfd3cdb -> :sswitch_b
        0x7f9337e0 -> :sswitch_7
    .end sparse-switch
.end method
