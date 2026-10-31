.class public final synthetic Ll/֡֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, 0x6a78f99b

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v3, "\u06e2\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xdc3

    const v5, -0x7607bc1f

    xor-int/2addr v4, v5

    const v5, 0x6ec568f4

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x191f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_3

    goto/16 :goto_1

    .line 1
    :sswitch_0
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-lez v3, :cond_8

    goto/16 :goto_2

    .line 0
    :sswitch_1
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v3, :cond_6

    goto/16 :goto_1

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto/16 :goto_1

    .line 2
    :sswitch_4
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    invoke-static {p1}, Lbin/mt/plus/Main;->ܳ(Lbin/mt/plus/Main;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object p1, p0, Ll/֡֨᩷;->᩸:Lbin/mt/plus/Main;

    .line 3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u0736\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x21d7

    const v5, -0x27c3d5d9

    xor-int/2addr v4, v5

    const v5, 0x19d06bd0

    goto :goto_0

    :cond_0
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d5

    const v5, -0xb877827

    xor-int/2addr v4, v5

    const v5, -0x4dab27fb

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d9\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ac7

    const v5, -0x132567f9

    xor-int/2addr v4, v5

    const v5, 0x4c2d7c94    # 4.547848E7f

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u0730\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c71

    const v5, 0x651b6544

    xor-int/2addr v4, v5

    const v5, -0x205838b0

    goto/16 :goto_0

    :goto_1
    const-string v3, "\u05a1\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x254f

    const v5, -0x3daaa1dc

    xor-int/2addr v4, v5

    const v5, -0x70e49169

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u0736\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1579

    const v5, -0xa58ff12

    xor-int/2addr v4, v5

    const v5, -0x1083ac55

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x875

    const v5, -0x51827ded

    xor-int/2addr v4, v5

    const v5, 0x7349683

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x677

    const v5, 0x2c11edcf

    xor-int/2addr v4, v5

    const v5, -0x2079a32d

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u05a8\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7dd3

    const v5, -0x6f868631

    xor-int/2addr v4, v5

    const v5, -0x3974df00    # -17808.5f

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5781

    const v5, -0x3debe1c3

    xor-int/2addr v4, v5

    const v5, -0x89f0e4d

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a75\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2cbf

    const v5, 0x2e8484ad

    xor-int/2addr v4, v5

    const v5, 0x75778816

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5347

    const v5, 0x5f5871c0

    xor-int/2addr v4, v5

    const v5, 0x5156dfd7

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24f9

    const v5, 0x1c384f5

    xor-int/2addr v4, v5

    const v5, -0x6aff8808

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a79\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x200b

    const v5, -0x4bc660cb

    xor-int/2addr v4, v5

    const v5, 0x22785469

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x52e7

    const v5, -0x16febb4f

    xor-int/2addr v4, v5

    const v5, 0xf338e70

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f401a78 -> :sswitch_4
        -0x7c9bc2cf -> :sswitch_e
        -0x7137e1c4 -> :sswitch_8
        -0x5a703f2a -> :sswitch_d
        -0x599cf2b1 -> :sswitch_b
        -0x545152aa -> :sswitch_0
        -0x53466a1c -> :sswitch_a
        -0x4dc58a52 -> :sswitch_3
        -0x4b582436 -> :sswitch_6
        -0x467ab186 -> :sswitch_9
        -0x3c36f53e -> :sswitch_c
        -0x39e3c6f2 -> :sswitch_5
        -0x3677f1b3 -> :sswitch_c
        -0x30973f75 -> :sswitch_1
        -0x2b2b7f08 -> :sswitch_2
        -0x1d6d2491 -> :sswitch_d
        -0x1b624788 -> :sswitch_5
        -0x9b1449e -> :sswitch_8
        -0x81df251 -> :sswitch_1
        0x34a951c -> :sswitch_7
        0x79fa24a -> :sswitch_b
        0x8f8264a -> :sswitch_0
        0xd86c25c -> :sswitch_7
        0x105692de -> :sswitch_4
        0x19c18f76 -> :sswitch_e
        0x2b2a1df3 -> :sswitch_2
        0x2df590e8 -> :sswitch_9
        0x32998d29 -> :sswitch_a
        0x41ad9abc -> :sswitch_6
        0x74b2f52a -> :sswitch_3
    .end sparse-switch
.end method
