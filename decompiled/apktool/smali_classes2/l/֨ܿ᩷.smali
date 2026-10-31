.class public final synthetic Ll/֨ܿ᩷;
.super Ljava/lang/Object;
.source "Z43S"

# interfaces
.implements Ll/ᩳ᩻ۚ;


# instance fields
.field public final synthetic ֫:Ll/᩶ܿ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܿ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܿ᩷;->֫:Ll/᩶ܿ᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x47f28be5

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v4, "\u1a74\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4bc1

    const v6, 0x7332cb9b

    xor-int/2addr v5, v6

    const v6, -0x13696462

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x3f4f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_7

    goto :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v4, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Ll/᩶ܿ᩷;->֫(Ll/᩶ܿ᩷;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Ll/֨ܿ᩷;->֫:Ll/᩶ܿ᩷;

    .line 2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06d8\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe63

    const v6, -0x4ae63aac

    xor-int/2addr v5, v6

    const v6, 0x2c6d21ce

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e8\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3067

    const v6, -0x46e6ed49

    xor-int/2addr v5, v6

    const v6, -0x4197810e

    goto :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u073a\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x76e7

    const v6, 0x1eee41a1

    xor-int/2addr v5, v6

    const v6, -0x243e9a38

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a79\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6799

    const v6, 0x7d61249

    xor-int/2addr v5, v6

    const v6, 0x33742dae

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a79\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x443b

    const v6, 0x321cf04c

    xor-int/2addr v5, v6

    const v6, 0x7c0cbdbf

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a75\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4f35

    const v6, -0x3eaabc49

    xor-int/2addr v5, v6

    const v6, 0x148d7794

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3b9d

    const v6, -0x7c223413

    xor-int/2addr v5, v6

    const v6, -0xcda2c3e

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_8

    :cond_7
    const-string v4, "\u05a8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3d17

    const v6, 0x435841ee

    xor-int/2addr v5, v6

    const v6, 0x44336027

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x12c9

    const v6, 0x4b291d04    # 1.1083012E7f

    xor-int/2addr v5, v6

    const v6, 0x5c1820a5

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v4, "\u06ec\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2eb5

    const v6, -0x1848ee82

    xor-int/2addr v5, v6

    const v6, 0x44291481

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x21c5

    const v6, -0x5a23d2ac

    xor-int/2addr v5, v6

    const v6, 0x2dd7e7f9

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x52ad

    const v6, 0x5a74d5d9

    xor-int/2addr v5, v6

    const v6, -0x2551a521

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073a\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c33

    const v6, -0x3fc6b0b4

    xor-int/2addr v5, v6

    const v6, -0x5bf79060

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u1a76\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x75c5

    const v6, 0x59128c0a

    xor-int/2addr v5, v6

    const v6, -0x15502d95

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e2\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x32fb

    const v6, -0x52ace9bc

    xor-int/2addr v5, v6

    const v6, 0x552b0b65

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74f83a79 -> :sswitch_4
        -0x6bac2b1d -> :sswitch_c
        -0x668a19f4 -> :sswitch_1
        -0x600c3922 -> :sswitch_d
        -0x5ddd2a8d -> :sswitch_5
        -0x5cd35b60 -> :sswitch_8
        -0x580cb584 -> :sswitch_9
        -0x5113d20c -> :sswitch_b
        -0x458d69fd -> :sswitch_1
        -0x42c7f3e0 -> :sswitch_7
        -0x2fad9266 -> :sswitch_8
        -0x2da81f8d -> :sswitch_a
        -0xebccafe -> :sswitch_2
        -0xd0800db -> :sswitch_b
        0x2c6c4c3 -> :sswitch_d
        0x35f2842 -> :sswitch_0
        0x58dea95 -> :sswitch_4
        0x7d19959 -> :sswitch_3
        0x846be66 -> :sswitch_2
        0x9a39a4a -> :sswitch_a
        0x33b6f76e -> :sswitch_e
        0x35832e39 -> :sswitch_6
        0x3e0ff154 -> :sswitch_0
        0x3e56302c -> :sswitch_7
        0x449f27ef -> :sswitch_c
        0x4c642b58 -> :sswitch_e
        0x52fe12ba -> :sswitch_3
        0x5552ca66 -> :sswitch_9
        0x6047ff68 -> :sswitch_6
        0x7ad2435d -> :sswitch_5
    .end sparse-switch
.end method
