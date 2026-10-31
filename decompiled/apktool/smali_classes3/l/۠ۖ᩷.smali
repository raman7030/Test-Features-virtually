.class public final synthetic Ll/۠ۖ᩷;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ۬ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ۬ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۖ᩷;->᩸:Ll/ᩳ۬ܿ;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x6271b1f7

    sget v2, Ll/֡۬;->۠֡᩶:I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v4, "\u06d6\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x529b

    const v6, 0x1df4d268

    xor-int/2addr v5, v6

    const v6, 0x5bbc9400

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x1c57

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 508
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v4

    if-gtz v4, :cond_9

    goto/16 :goto_2

    .line 65
    :sswitch_0
    sget v4, Ll/۠;->ܺܺܶ:I

    if-gez v4, :cond_4

    goto/16 :goto_3

    .line 584
    :sswitch_1
    sget v4, Ll/۠;->ܺܺܶ:I

    if-gez v4, :cond_2

    goto :goto_1

    .line 538
    :sswitch_2
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u1a74\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x57e5

    const v6, 0x6e65a1af

    xor-int/2addr v5, v6

    const v6, -0x5935bd2a

    goto :goto_0

    .line 193
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    const/4 p1, 0x0

    return p1

    .line 613
    :sswitch_5
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/۠ۖ᩷;->᩸:Ll/ᩳ۬ܿ;

    invoke-virtual {v0, p1}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    .line 260
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a7a\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x73a1

    const v6, 0x707066bf

    xor-int/2addr v5, v6

    const v6, -0x47798184

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    const-string v4, "\u06eb\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x61c5

    const v6, 0x2416e665

    xor-int/2addr v5, v6

    const v6, -0x56855319

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e0\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x76f

    const v6, -0x5b5f6051

    xor-int/2addr v5, v6

    const v6, 0x45db56d0

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_5

    :cond_4
    const-string v4, "\u1a79\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x54b3

    const v6, 0x4a07c159    # 2224214.2f

    xor-int/2addr v5, v6

    const v6, -0x1a6d7eb4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073f\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x61dd

    const v6, 0x2c8c16b9

    xor-int/2addr v5, v6

    const v6, -0x1d7d7e2

    goto/16 :goto_0

    .line 476
    :sswitch_9
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u06d8\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3919

    const v6, 0xbed665c

    xor-int/2addr v5, v6

    const v6, 0x2b219d36

    goto/16 :goto_0

    .line 185
    :sswitch_a
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e2\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3dbf

    const v6, -0x1cebcab1

    xor-int/2addr v5, v6

    const v6, -0x7ecd5592

    goto/16 :goto_0

    .line 512
    :sswitch_b
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u06db\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x19b3

    const v6, -0x4bf12902

    xor-int/2addr v5, v6

    const v6, 0x5d0883dc

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d9\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e2b

    const v6, -0x60d2f8b4

    xor-int/2addr v5, v6

    const v6, -0x3d360af9

    goto/16 :goto_0

    .line 53
    :sswitch_c
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_a

    :goto_2
    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x43ad

    const v6, -0x7ec69d78

    xor-int/2addr v5, v6

    const v6, 0x289f3a0a

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7039

    const v6, -0x49787215

    xor-int/2addr v5, v6

    const v6, 0x50f33efc

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_b

    goto :goto_3

    :cond_b
    const-string v4, "\u073a\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7749

    const v6, 0x5b46fd47

    xor-int/2addr v5, v6

    const v6, 0x4ce68325    # 1.20854824E8f

    goto/16 :goto_0

    .line 468
    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_c

    :goto_3
    const-string v4, "\u06e8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4f69

    const v6, -0x3b89874b

    xor-int/2addr v5, v6

    const v6, -0x253bfd4e

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x425d

    const v6, 0x30adb683

    xor-int/2addr v5, v6

    const v6, -0x51b4111f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74a6f5ef -> :sswitch_a
        -0x6626cab0 -> :sswitch_9
        -0x601da7d1 -> :sswitch_c
        -0x5ae79b6c -> :sswitch_d
        -0x50ff07cf -> :sswitch_d
        -0x4e8d1de2 -> :sswitch_c
        -0x4cbe71ec -> :sswitch_4
        -0x4787f674 -> :sswitch_8
        -0x470bc6f9 -> :sswitch_8
        -0x4537196e -> :sswitch_7
        -0x3f449e3d -> :sswitch_2
        -0x304fbd22 -> :sswitch_4
        -0x2ea8d742 -> :sswitch_3
        -0x2988a7b6 -> :sswitch_9
        -0x1d7f89f4 -> :sswitch_1
        -0x285063a -> :sswitch_1
        0x8a3a71a -> :sswitch_6
        0xe6eba61 -> :sswitch_0
        0x178df3c9 -> :sswitch_5
        0x1de7f5e2 -> :sswitch_b
        0x3074cf37 -> :sswitch_0
        0x34767c62 -> :sswitch_a
        0x36d61f10 -> :sswitch_3
        0x393eb1ba -> :sswitch_5
        0x43570dca -> :sswitch_e
        0x4547d099 -> :sswitch_e
        0x4ddc30f6 -> :sswitch_2
        0x5120652c -> :sswitch_7
        0x5d30fa46 -> :sswitch_6
        0x7152dcb8 -> :sswitch_b
    .end sparse-switch
.end method
