.class public final synthetic Ll/ۖ۟ܽ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۟ܽ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x23b672d1

    sget v2, Ll/֨᩺;->ۨ֨۬:I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    const-string v4, "\u05a8\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2611

    const v6, 0x57aa69cf

    xor-int/2addr v5, v6

    const v6, 0x29fa9ab6

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x486b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    invoke-static {v0, p1}, Ll/ۗۚ;->᩶ܳ۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ۟ܽ;

    return-object p1

    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_8

    goto/16 :goto_4

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v4

    if-lez v4, :cond_a

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xea1

    const v6, 0xc77d578

    xor-int/2addr v5, v6

    const v6, 0x425cdd9b

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_4

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    iget-object v0, p0, Ll/ۖ۟ܽ;->᩸:Ljava/util/ArrayList;

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06d7\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x50d7

    const v6, -0x4ca1ccce

    xor-int/2addr v5, v6

    const v6, 0x1506928b

    goto :goto_0

    .line 1
    :sswitch_6
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u1a7b\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x457d

    const v6, -0x5803536b

    xor-int/2addr v5, v6

    const v6, 0x463d88c2

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05a1\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x636f

    const v6, -0x6886f272

    xor-int/2addr v5, v6

    const v6, 0x3ca53a4b

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u073d\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6591

    const v6, -0x3292a4c2    # -2.4888624E8f

    xor-int/2addr v5, v6

    const v6, -0x1ade7678

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_5

    :goto_1
    const-string v4, "\u05a8\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6bed

    const v6, 0x3063ba79

    xor-int/2addr v5, v6

    const v6, -0x1128b59e

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7f49

    const v6, 0x63a4f280

    xor-int/2addr v5, v6

    const v6, 0x44d16975

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a7b\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x13fb

    const v6, -0x3c9b02ad

    xor-int/2addr v5, v6

    const v6, -0x6e65d724

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06e1\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1921

    const v6, -0x5234738e

    xor-int/2addr v5, v6

    const v6, 0x6a7d31c4

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06e1\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xead

    const v6, -0x69ce4d08

    xor-int/2addr v5, v6

    const v6, -0x27869886

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x15f5

    const v6, -0x37fb6ca9

    xor-int/2addr v5, v6

    const v6, 0x620187bd

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u1a76\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2631

    const v6, 0xefbc9c4

    xor-int/2addr v5, v6

    const v6, 0x18a56755

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d6\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34e1

    const v6, -0x423dafbb

    xor-int/2addr v5, v6

    const v6, 0x4c5bb583    # 5.7595404E7f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u0736\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4e0d

    const v6, 0x3111818d

    xor-int/2addr v5, v6

    const v6, -0x4a4e0b63

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a78\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x391b

    const v6, -0x438a262f

    xor-int/2addr v5, v6

    const v6, 0x46e0e299

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6aab3ae4 -> :sswitch_4
        -0x65e5bccf -> :sswitch_8
        -0x63118822 -> :sswitch_e
        -0x60a520b2 -> :sswitch_b
        -0x5d67037a -> :sswitch_9
        -0x45381b11 -> :sswitch_9
        -0x28eaf883 -> :sswitch_b
        -0x16f73faa -> :sswitch_1
        -0x14ff84e7 -> :sswitch_2
        -0x984290a -> :sswitch_4
        -0x8b7a41f -> :sswitch_3
        0x2e6ea06 -> :sswitch_d
        0xdc21c47 -> :sswitch_0
        0xdc8147e -> :sswitch_a
        0xf91b4d9 -> :sswitch_c
        0x10b8b591 -> :sswitch_5
        0x29b7367b -> :sswitch_a
        0x2cfb7900 -> :sswitch_d
        0x2f78c7c0 -> :sswitch_0
        0x447a3bd5 -> :sswitch_6
        0x46734b2f -> :sswitch_5
        0x470b1d75 -> :sswitch_2
        0x4df361b7 -> :sswitch_6
        0x5450ef55 -> :sswitch_e
        0x61167c1e -> :sswitch_7
        0x6e3c67cb -> :sswitch_3
        0x6e60bd52 -> :sswitch_c
        0x738af41a -> :sswitch_1
        0x75bcb02b -> :sswitch_8
        0x7a0901fe -> :sswitch_7
    .end sparse-switch
.end method
