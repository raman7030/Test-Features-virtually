.class public final Ll/֨ۛܽ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Ll/֨᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/۠ۛܽ;


# direct methods
.method public constructor <init>(Ll/۠ۛܽ;)V
    .locals 0

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۛܽ;->᩸:Ll/۠ۛܽ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJ)V
    .locals 4

    const p1, -0x4c95c3cc

    sget p2, Ll/ۛ;->᩺᩻֫:I

    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    const-string v1, "\u06df\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x67

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4e1d

    const v3, 0x20b23d4c

    xor-int/2addr v2, v3

    const v3, 0x30fa4e0f

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x7f0d

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 245
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_6

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_1

    :sswitch_1
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-lez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v1, "\u05a8\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x451b

    const v3, 0x11225079

    xor-int/2addr v2, v3

    const v3, -0x225e6987

    goto :goto_0

    .line 20
    :sswitch_2
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v1, :cond_5

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_4

    .line 178
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    return-void

    .line 284
    :sswitch_5
    iget-object p1, p0, Ll/֨ۛܽ;->᩸:Ll/۠ۛܽ;

    iget-object p1, p1, Ll/۠ۛܽ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {p1, p3, p4, p5, p6}, Ll/᩺ۤܿ;->֫(JJ)V

    return-void

    .line 276
    :sswitch_6
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u073a\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x35d7

    const v3, 0x699254f9

    xor-int/2addr v2, v3

    const v3, -0x5ec1df07

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u1a74\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3471

    const v3, 0x559df098

    xor-int/2addr v2, v3

    const v3, 0x5c0a8429

    goto :goto_0

    .line 191
    :sswitch_8
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xe5f

    const v3, -0x43854315

    xor-int/2addr v2, v3

    const v3, 0x311e9c93

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string v1, "\u06df\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4f39

    const v3, 0x69eafbf1

    xor-int/2addr v2, v3

    const v3, -0x4520ca57

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v1, "\u073d\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x55c3

    const v3, -0x186f8ea5

    xor-int/2addr v2, v3

    const v3, -0x9beb54d

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06eb\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x2b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x57b5

    const v3, -0x1c9973c6

    xor-int/2addr v2, v3

    const v3, -0x5298a1b3

    goto/16 :goto_0

    :sswitch_a
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06df\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x5df

    const v3, 0x7bc9f672

    xor-int/2addr v2, v3

    const v3, -0x4b003715

    goto/16 :goto_0

    .line 231
    :sswitch_b
    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v1, :cond_8

    :goto_3
    const-string v1, "\u06e1\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x67

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x3347

    const v3, -0x6ad624e1

    xor-int/2addr v2, v3

    const v3, 0x5ab6f532

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u1a7a\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6ea7

    const v3, 0x4dabd0c6    # 3.60323264E8f

    xor-int/2addr v2, v3

    const v3, 0x39950159

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u06d8\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x2c4f

    const v3, 0x49ff99ef

    xor-int/2addr v2, v3

    const v3, 0x7339a90c

    goto/16 :goto_0

    .line 263
    :sswitch_d
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_b

    :cond_a
    const-string v1, "\u1a77\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x547b

    const v3, -0x572c2e3a

    xor-int/2addr v2, v3

    const v3, 0x17bf1d40

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06d7\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4897

    const v3, 0x22159d55

    xor-int/2addr v2, v3

    const v3, -0x2cef9dfc

    goto/16 :goto_0

    .line 30
    :sswitch_e
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_c

    :goto_4
    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x7

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x167

    const v3, -0x3572f35

    xor-int/2addr v2, v3

    const v3, -0x69bf255a

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06d8\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x153b

    const v3, -0x7941842d    # -7.1652E-35f

    xor-int/2addr v2, v3

    const v3, -0x41dea8c6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75075126 -> :sswitch_9
        -0x6a9d116f -> :sswitch_5
        -0x5c8214a4 -> :sswitch_4
        -0x545c7ff8 -> :sswitch_8
        -0x4ec1622d -> :sswitch_6
        -0x2eba0917 -> :sswitch_1
        -0x2b5ee570 -> :sswitch_a
        -0x27002346 -> :sswitch_2
        -0x23d69fb0 -> :sswitch_7
        -0x1e190015 -> :sswitch_9
        -0x18b36e27 -> :sswitch_c
        -0x134b4785 -> :sswitch_e
        -0xb1b1f72 -> :sswitch_7
        0x1df1491 -> :sswitch_a
        0x7249eba -> :sswitch_4
        0xd089b81 -> :sswitch_5
        0x1a09587a -> :sswitch_0
        0x1b768d79 -> :sswitch_3
        0x21b48d49 -> :sswitch_d
        0x23e00f21 -> :sswitch_1
        0x30967ffc -> :sswitch_2
        0x3bb4a605 -> :sswitch_6
        0x417c395f -> :sswitch_e
        0x4252363f -> :sswitch_8
        0x47656ebb -> :sswitch_b
        0x4bd046a5 -> :sswitch_0
        0x5316ac7e -> :sswitch_d
        0x554206b4 -> :sswitch_b
        0x57419aea -> :sswitch_c
        0x709103f8 -> :sswitch_3
    .end sparse-switch
.end method

.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 289
    iget-object v0, p0, Ll/֨ۛܽ;->᩸:Ll/۠ۛܽ;

    iget-object v0, v0, Ll/۠ۛܽ;->ܳ:Ll/᩺ۤܿ;

    invoke-static {v0}, Ll/ۘ᩶;->ܺ֡ۘ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
