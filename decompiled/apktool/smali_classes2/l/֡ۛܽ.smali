.class public final synthetic Ll/֡ۛܽ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۛܽ;->᩸:Ll/ۤۤᩳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x471cba6e

    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v10, "\u1a77\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x47

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4b5d

    const v12, -0x73adad2

    xor-int/2addr v11, v12

    const v12, -0x3ed89689

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit8 v7, v7, 0x9

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 420
    sget v10, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v10, :cond_8

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v10, Ll/֡֡;->֫ۤܳ:I

    if-ltz v10, :cond_c

    goto/16 :goto_2

    .line 9
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v10, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v10, :cond_9

    goto/16 :goto_2

    .line 486
    :sswitch_2
    sget v10, Ll/᩹;->ۤܿܳ:I

    if-nez v10, :cond_1

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    return-void

    :sswitch_5
    add-int/2addr v6, v4

    .line 578
    invoke-virtual {v3, v6}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void

    :sswitch_6
    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v6

    .line 82
    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v10, :cond_0

    goto :goto_1

    :cond_0
    const-string v10, "\u0733\u05ab"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1ec9

    const v12, -0x6482a7e8

    xor-int/2addr v11, v12

    const v12, 0x3b16cd06

    goto :goto_0

    .line 577
    :sswitch_7
    invoke-static {v3}, Ll/ۨ;->᩸ܺ᩶(Ljava/lang/Object;)Ll/۟᩺ᩳ;

    move-result-object v10

    invoke-interface {v10, v4, v5, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 341
    sget v10, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v10, :cond_2

    :cond_1
    :goto_1
    const-string v10, "\u06df\u1a76"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6d6f

    const v12, 0x6bcfd9aa

    xor-int/2addr v11, v12

    const v12, 0x270bb9d0

    goto :goto_0

    :cond_2
    const-string v10, "\u06da\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5285

    const v12, 0x116e368f

    xor-int/2addr v11, v12

    const v12, -0x43c5cd82

    goto/16 :goto_0

    .line 570
    :sswitch_8
    invoke-static {v3}, Ll/ۗ۬;->᩷ۢᩴ(Ljava/lang/Object;)I

    move-result v4

    .line 571
    invoke-static {v3}, Ll/ۖ۫;->᩵᩵ۙ(Ljava/lang/Object;)I

    move-result v5

    if-le v4, v5, :cond_3

    move v13, v5

    move v5, v4

    move v4, v13

    :cond_3
    const-string v10, "\u06da\u06e0"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xa71

    const v12, 0x3ce7c19d

    xor-int/2addr v11, v12

    const v12, -0x55d36199

    goto/16 :goto_0

    .line 569
    :sswitch_9
    invoke-static {v1}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 570
    iget-object v3, p0, Ll/֡ۛܽ;->᩸:Ll/ۤۤᩳ;

    sget-boolean v10, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v10, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v10, "\u0736\u06e4"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x2d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4f65

    const v12, -0x2c42b10e

    xor-int/2addr v11, v12

    const v12, -0x730ad27e

    goto/16 :goto_0

    .line 569
    :sswitch_a
    invoke-static {v0}, Ll/ۘۘ;->ۛۛܺ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v10

    if-eqz v10, :cond_5

    const-string v10, "\u06d9\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x24c9

    const v12, -0x51aa548b

    xor-int/2addr v11, v12

    const v12, -0x2048ec8c

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u1a78\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x47

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1ec3

    const v12, 0x3325884b

    xor-int/2addr v11, v12

    const v12, 0x30d3dd5a

    goto/16 :goto_0

    :sswitch_b
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v10

    if-gtz v10, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v10, "\u073f\u0733"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5faf

    const v12, 0x45d7f400    # 6910.5f

    xor-int/2addr v11, v12

    const v12, 0x35fa1cf8

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v10

    if-ltz v10, :cond_7

    goto :goto_3

    :cond_7
    const-string v10, "\u06e8\u06e0"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x179f

    const v12, 0x4b7e7cfb    # 1.6678139E7f

    xor-int/2addr v11, v12

    const v12, 0x7c5c2869

    goto/16 :goto_0

    :goto_2
    const-string v10, "\u06d7\u1a75"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x43

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4e37

    const v12, 0x1a6a25d

    xor-int/2addr v11, v12

    const v12, 0x520236d3

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u06e8\u06d7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x73

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x299f

    const v12, -0x63e77eb5

    xor-int/2addr v11, v12

    const v12, -0x3296d54f

    goto/16 :goto_0

    .line 310
    :sswitch_d
    sget-boolean v10, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v10, :cond_a

    :cond_9
    :goto_3
    const-string v10, "\u1a7a\u073d"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x73

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x50eb

    const v12, 0x7ba23f6c

    xor-int/2addr v11, v12

    const v12, 0x798c4dc8

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a76\u05ab"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4e1b

    const v12, 0x6ab7a114

    xor-int/2addr v11, v12

    const v12, -0x19f7d6d2

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v10

    if-gtz v10, :cond_b

    goto :goto_4

    :cond_b
    const-string v10, "\u073a\u06df"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x73

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1c91

    const v12, -0x3076b412

    xor-int/2addr v11, v12

    const v12, 0x71fed241

    goto/16 :goto_0

    .line 79
    :sswitch_f
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    :goto_4
    const-string v10, "\u0730\u1a75"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x773b

    const v12, 0x255d374a

    xor-int/2addr v11, v12

    const v12, 0xf9ae6a1

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u1a74\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1e4d

    const v12, -0x23e8c50

    xor-int/2addr v11, v12

    const v12, -0x78341e6e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78efd978 -> :sswitch_f
        -0x74b856e5 -> :sswitch_9
        -0x6aacd3a3 -> :sswitch_b
        -0x4f4d1e76 -> :sswitch_5
        -0x415055e4 -> :sswitch_c
        -0x3a017123 -> :sswitch_2
        -0x39345eb6 -> :sswitch_4
        -0x362f67c7 -> :sswitch_6
        -0x34035c29 -> :sswitch_3
        -0x2b9b71c8 -> :sswitch_8
        -0x284439d4 -> :sswitch_8
        -0x26f2f1a4 -> :sswitch_a
        -0x22290d80 -> :sswitch_3
        -0x2051e8b2 -> :sswitch_5
        -0x1c92156c -> :sswitch_1
        -0x163e2982 -> :sswitch_e
        -0x10dbf097 -> :sswitch_0
        -0x1983656 -> :sswitch_7
        0x17ea955 -> :sswitch_f
        0x6a78485 -> :sswitch_1
        0x200c18f0 -> :sswitch_c
        0x21888d75 -> :sswitch_7
        0x32985a62 -> :sswitch_b
        0x3514cf06 -> :sswitch_2
        0x356c9b24 -> :sswitch_d
        0x50cd29d1 -> :sswitch_6
        0x541335e0 -> :sswitch_0
        0x56ae2279 -> :sswitch_4
        0x5c4b404c -> :sswitch_a
        0x6b3f5a62 -> :sswitch_e
        0x78d4032f -> :sswitch_d
        0x7e72f8fd -> :sswitch_9
    .end sparse-switch
.end method
