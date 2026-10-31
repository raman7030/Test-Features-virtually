.class public final synthetic Ll/ۙۘۡ;
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

    iput-object p1, p0, Ll/ۙۘۡ;->᩸:Ll/ۛۘۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x345662b7    # -2.2231698E7f

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    const-string v4, "\u06eb\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6319

    const v6, 0x7488ab86

    xor-int/2addr v5, v6

    const v6, -0x3c0fc700

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x6dcb

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_7

    goto/16 :goto_4

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_b

    goto :goto_1

    :sswitch_1
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_9

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u073d\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2359

    const v6, 0x2bab216b

    xor-int/2addr v5, v6

    const v6, -0x7b0424e3

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ll/᩺ۚۡ;

    invoke-static {v0, p1}, Ll/ۛۘۡ;->֫(Ll/ۛۘۡ;Ll/᩺ۚۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/ۙۘۡ;->᩸:Ll/ۛۘۡ;

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f45

    const v6, 0x203e08b2

    xor-int/2addr v5, v6

    const v6, -0x52e5f5db

    goto :goto_0

    .line 2
    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e1\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x71e5

    const v6, 0x4eb9de0e

    xor-int/2addr v5, v6

    const v6, -0x40f79895

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u05a8\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4e07

    const v6, 0x6d7249c1

    xor-int/2addr v5, v6

    const v6, 0x47274dcc

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u1a77\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x15b3

    const v6, -0x6b767efe

    xor-int/2addr v5, v6

    const v6, 0x2793a2ee

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_5

    :goto_2
    const-string v4, "\u06e2\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3d65

    const v6, -0x1da63e7

    xor-int/2addr v5, v6

    const v6, 0x3cbbdafa

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6549

    const v6, 0x430bcfef

    xor-int/2addr v5, v6

    const v6, -0x232b0fd9

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_6

    :goto_3
    const-string v4, "\u06d6\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5587

    const v6, 0x56831d68

    xor-int/2addr v5, v6

    const v6, 0x6ebff6a5

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x44e1

    const v6, 0x1d02075c

    xor-int/2addr v5, v6

    const v6, -0x62117e9a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u05a1\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xebf

    const v6, -0x44c90eaf

    xor-int/2addr v5, v6

    const v6, -0x7abd0a13

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u06d6\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5dc9

    const v6, -0x2f481068

    xor-int/2addr v5, v6

    const v6, -0x442cb45

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u073f\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4ffd

    const v6, -0x3b903c26

    xor-int/2addr v5, v6

    const v6, 0x4ec6a640

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1edf

    const v6, -0x3d295292

    xor-int/2addr v5, v6

    const v6, 0x7c2d811

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u1a7a\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c91

    const v6, -0x55af90f1

    xor-int/2addr v5, v6

    const v6, -0x4b70b840

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5409

    const v6, -0x1e0e236f

    xor-int/2addr v5, v6

    const v6, 0x47b37f34

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79a12e6b -> :sswitch_c
        -0x764222fb -> :sswitch_6
        -0x720e9651 -> :sswitch_d
        -0x714547aa -> :sswitch_9
        -0x71152fd4 -> :sswitch_8
        -0x5a9a537c -> :sswitch_3
        -0x529daa11 -> :sswitch_5
        -0x4d29a7d0 -> :sswitch_c
        -0x40f9dfda -> :sswitch_4
        -0x3ee5c242 -> :sswitch_e
        -0x39c6fcc7 -> :sswitch_7
        -0x2d9cd3bb -> :sswitch_1
        -0x2a5b5a0d -> :sswitch_7
        -0x2931dd12 -> :sswitch_1
        -0x229af03a -> :sswitch_8
        -0x1e08d077 -> :sswitch_a
        -0x1dbe490a -> :sswitch_b
        -0x4881496 -> :sswitch_2
        0x1ca33e62 -> :sswitch_e
        0x31ef7aec -> :sswitch_3
        0x340bda0b -> :sswitch_0
        0x3f7cf40e -> :sswitch_9
        0x42739fec -> :sswitch_5
        0x42aa78a7 -> :sswitch_b
        0x4668102e -> :sswitch_a
        0x58783d8b -> :sswitch_d
        0x5e0a4163 -> :sswitch_4
        0x6bf60582 -> :sswitch_0
        0x6e22c19a -> :sswitch_2
        0x6eb1b701 -> :sswitch_6
    .end sparse-switch
.end method
