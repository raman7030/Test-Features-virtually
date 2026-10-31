.class public final Ll/᩵۠ۡ;
.super Ljava/lang/Object;
.source "KA2Z"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/᩵۠ۡ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x7db691e5

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v3, "\u073f\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1805

    const v5, -0x4d422aa3

    xor-int/2addr v4, v5

    const v5, -0x6db4a57

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1fe5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    const/4 v3, 0x0

    .line 99
    invoke-virtual {p1, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_2

    .line 45
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_8

    goto :goto_1

    :sswitch_1
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_a

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-gez v3, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_1
    const-string v3, "\u06ec\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x23e1

    const v5, 0x3fe14f25

    xor-int/2addr v4, v5

    const v5, 0xa804548

    goto :goto_0

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_6

    .line 58
    :sswitch_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    :sswitch_5
    return-void

    .line 98
    :sswitch_6
    iget-object p1, p0, Ll/᩵۠ۡ;->᩸:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24f1

    const v5, -0x3ca19166

    xor-int/2addr v4, v5

    const v5, 0x4d9d5417    # 3.29941728E8f

    goto :goto_0

    :cond_1
    :goto_2
    const-string v3, "\u06e2\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x53ff

    const v5, 0x54ae30c5

    xor-int/2addr v4, v5

    const v5, 0x7430a16c

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u05a1\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ceb

    const v5, -0x3b766d33

    xor-int/2addr v4, v5

    const v5, -0x184530d4

    goto/16 :goto_0

    .line 29
    :sswitch_8
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06dc\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4ef

    const v5, -0x24096826

    xor-int/2addr v4, v5

    const v5, -0x432de539

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a75\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x795

    const v5, -0x328f37a4

    xor-int/2addr v4, v5

    const v5, -0x1619ac2

    goto/16 :goto_0

    .line 69
    :sswitch_a
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u05a8\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x415d

    const v5, 0x3ac846b

    xor-int/2addr v4, v5

    const v5, -0x50a21ffd

    goto/16 :goto_0

    .line 80
    :sswitch_b
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06db\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7049

    const v5, -0x7273782f

    xor-int/2addr v4, v5

    const v5, 0x23313b63

    goto/16 :goto_0

    .line 76
    :sswitch_c
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u0736\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x149b

    const v5, 0x7998e4f9

    xor-int/2addr v4, v5

    const v5, 0x69e4c7d6

    goto/16 :goto_0

    .line 83
    :sswitch_d
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a7a\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a9

    const v5, 0x7f1cd1fc

    xor-int/2addr v4, v5

    const v5, -0x31ce1ac7

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6787

    const v5, 0x2806c254

    xor-int/2addr v4, v5

    const v5, 0x9675dd2

    goto/16 :goto_0

    .line 15
    :sswitch_e
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06db\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e85

    const v5, 0x11241940

    xor-int/2addr v4, v5

    const v5, -0x2eda2135

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7555

    const v5, -0x1f0d0881

    xor-int/2addr v4, v5

    const v5, -0x64755705

    goto/16 :goto_0

    .line 3
    :sswitch_f
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u1a73\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x24a3

    const v5, -0x11cbd7f8

    xor-int/2addr v4, v5

    const v5, -0x3cf4ebbd

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c85

    const v5, 0x6f5b92cb

    xor-int/2addr v4, v5

    const v5, -0x5dd575b0

    goto/16 :goto_0

    .line 96
    :sswitch_10
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_d

    :goto_6
    const-string v3, "\u073d\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4119

    const v5, -0x32d8e696

    xor-int/2addr v4, v5

    const v5, 0x68cbbb1

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u073d\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7933

    const v5, -0x7b613704

    xor-int/2addr v4, v5

    const v5, -0x4250144a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x788c7183 -> :sswitch_6
        -0x7813556c -> :sswitch_2
        -0x76dca10a -> :sswitch_c
        -0x6bf2f3d9 -> :sswitch_9
        -0x61561213 -> :sswitch_a
        -0x501236be -> :sswitch_10
        -0x4849e9fe -> :sswitch_9
        -0x437d3c40 -> :sswitch_6
        -0x42f2c756 -> :sswitch_b
        -0x412c0bfe -> :sswitch_2
        -0x40fff1a9 -> :sswitch_8
        -0x3b2440f6 -> :sswitch_e
        -0x32bc7b33 -> :sswitch_d
        -0x31a19466 -> :sswitch_4
        -0x2b16562f -> :sswitch_5
        -0x2873922c -> :sswitch_7
        -0x241c9275 -> :sswitch_0
        -0x2247955e -> :sswitch_3
        0x16c4378 -> :sswitch_e
        0x667930e -> :sswitch_5
        0xa808e3a -> :sswitch_1
        0x1d73721b -> :sswitch_f
        0x373b9a83 -> :sswitch_8
        0x3bdaa33d -> :sswitch_a
        0x3f2dbb1d -> :sswitch_b
        0x43b5ca49 -> :sswitch_c
        0x49a7d1d0 -> :sswitch_0
        0x5045c628 -> :sswitch_4
        0x5c9f05d4 -> :sswitch_3
        0x5e06cc71 -> :sswitch_10
        0x5e599b69 -> :sswitch_7
        0x65403f1a -> :sswitch_1
        0x6d72ee19 -> :sswitch_f
        0x7c0d9c0f -> :sswitch_d
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, 0x37017ca9

    sget p2, Ll/ۗ۬;->ۘܳ᩻:I

    sget p3, Ll/֨᩺;->ۨ֨۬:I

    const-string p4, "\u1a77\u073d"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0xc25

    const v1, 0x1879922b

    xor-int/2addr v0, v1

    const v1, 0x1ab90e38

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, -0x5c1d

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result p4

    if-ltz p4, :cond_9

    goto/16 :goto_4

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget p4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p4, :cond_8

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result p4

    if-nez p4, :cond_b

    goto :goto_1

    :sswitch_2
    sget p4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string p4, "\u1a7b\u06d7"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x23

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x20b1

    const v1, 0x3ad132ec

    xor-int/2addr v0, v1

    const v1, -0x6d7ce5ad

    goto :goto_0

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_3

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    :sswitch_5
    return-void

    .line 1
    :sswitch_6
    sget p4, Ll/ۛ;->᩺᩻֫:I

    if-ltz p4, :cond_1

    goto :goto_2

    :cond_1
    const-string p4, "\u05a1\u073f"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x6d57

    const v1, 0x7b7e39ca

    xor-int/2addr v0, v1

    const v1, -0x7a4a5fe9

    goto :goto_0

    .line 2
    :sswitch_7
    sget p4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz p4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string p4, "\u06e7\u06e4"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x73

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x7775

    const v1, 0x5e08fb02

    xor-int/2addr v0, v1

    const v1, 0x2eb030c5

    goto :goto_0

    :sswitch_8
    sget p4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p4, "\u06dc\u06e2"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x5d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x3d1d

    const v1, -0x7d428806

    xor-int/2addr v0, v1

    const v1, 0x3279d3cf

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget p4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz p4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string p4, "\u06da\u06d8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x39

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x977

    const v1, -0x68f48edd

    xor-int/2addr v0, v1

    const v1, -0x42e0e516

    goto/16 :goto_0

    :sswitch_a
    sget p4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz p4, :cond_5

    :goto_2
    const-string p4, "\u06dc\u073d"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x24a5

    const v1, 0x1a6c8b05

    xor-int/2addr v0, v1

    const v1, 0xa218ea4

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u0733\u06dc"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x5b

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x4f5d

    const v1, -0x692235b

    xor-int/2addr v0, v1

    const v1, -0x53924859

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result p4

    if-ltz p4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string p4, "\u06e1\u06da"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2ccf

    const v1, 0x87497af

    xor-int/2addr v0, v1

    const v1, -0x7158be05

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget p4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p4, :cond_7

    :goto_3
    const-string p4, "\u0730\u073d"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x45

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x43d

    const v1, -0x17050432

    xor-int/2addr v0, v1

    const v1, -0x4128eb6b

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u073a\u05ab"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x755f

    const v1, -0x5e4a9409

    xor-int/2addr v0, v1

    const v1, -0x3d7540e2

    goto/16 :goto_0

    :cond_8
    :goto_4
    const-string p4, "\u06d6\u06dc"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x21bb

    const v1, 0x7a0d0dc2

    xor-int/2addr v0, v1

    const v1, 0x2e017e72

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u06eb\u0736"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x47

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x14f3

    const v1, -0x7da31317

    xor-int/2addr v0, v1

    const v1, 0x53d6c63c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_5

    :cond_a
    const-string p4, "\u1a7a\u06d6"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x73

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4dbf

    const v1, 0x7bfb9b52

    xor-int/2addr v0, v1

    const v1, -0x7fe75d36

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget p4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz p4, :cond_c

    :cond_b
    :goto_5
    const-string p4, "\u1a79\u06df"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x6671

    const v1, 0x346c6c0c

    xor-int/2addr v0, v1

    const v1, 0x29d3ce0a

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u1a79\u05a8"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3363

    const v1, 0x773f2f3d

    xor-int/2addr v0, v1

    const v1, -0x7c43295e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x702fb410 -> :sswitch_a
        -0x6c87a843 -> :sswitch_7
        -0x5e394b7b -> :sswitch_d
        -0x5a5628d9 -> :sswitch_4
        -0x5a33ea08 -> :sswitch_6
        -0x5833b23f -> :sswitch_5
        -0x53213a76 -> :sswitch_a
        -0x4b71ae98 -> :sswitch_9
        -0x48b837ce -> :sswitch_2
        -0x2aafe281 -> :sswitch_d
        -0x24a6f1d1 -> :sswitch_3
        -0x1f0cfd39 -> :sswitch_b
        -0x1aa083e8 -> :sswitch_1
        -0x11eb7c55 -> :sswitch_3
        -0x11ccc4b4 -> :sswitch_8
        -0x4aa7158 -> :sswitch_4
        -0x2f48f54 -> :sswitch_1
        0x2cf5899 -> :sswitch_0
        0xba9ade4 -> :sswitch_2
        0x28580d2d -> :sswitch_0
        0x37002423 -> :sswitch_6
        0x38c36df6 -> :sswitch_e
        0x46ef4666 -> :sswitch_9
        0x479422df -> :sswitch_e
        0x5dfbc68f -> :sswitch_c
        0x5eb3fe65 -> :sswitch_5
        0x5f19ff49 -> :sswitch_7
        0x61a959bb -> :sswitch_c
        0x7cedbaad -> :sswitch_8
        0x7e124ea3 -> :sswitch_b
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, 0x361674ee

    sget p2, Ll/ۘۘ;->᩷ۙ᩸:I

    sget p3, Ll/۠;->ܺܺܶ:I

    const-string p4, "\u06e2\u0733"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x2c73

    const v1, -0x3545b934    # -6103910.0f

    xor-int/2addr v0, v1

    const v1, 0x516c811a

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0xb03

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    sget p4, Ll/᩹;->ۤܿܳ:I

    if-eqz p4, :cond_2

    goto/16 :goto_3

    .line 3
    :sswitch_0
    sget p4, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez p4, :cond_5

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result p4

    if-ltz p4, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_2
    sget-boolean p4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz p4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string p4, "\u06d7\u1a77"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1ee1

    const v1, 0x73cfdd6e

    xor-int/2addr v0, v1

    const v1, -0x45488acd

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    :sswitch_5
    return-void

    :sswitch_6
    sget p4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz p4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p4, "\u06ec\u06dc"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x69

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0xb29

    const v1, -0x76761a73

    xor-int/2addr v0, v1

    const v1, 0x6ad7a3d6

    goto :goto_0

    :cond_2
    const-string p4, "\u1a78\u1a76"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x7647

    const v1, -0x27284645

    xor-int/2addr v0, v1

    const v1, -0x7be786fb

    goto :goto_0

    .line 3
    :sswitch_7
    sget p4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz p4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string p4, "\u1a77\u05a8"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x37

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5651

    const v1, 0x51cbe61c

    xor-int/2addr v0, v1

    const v1, 0x73802869

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget p4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz p4, :cond_4

    goto :goto_2

    :cond_4
    const-string p4, "\u06db\u1a79"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x2f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x4ba3

    const v1, 0x5a16957a

    xor-int/2addr v0, v1

    const v1, -0x4b86a5ce

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget p4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p4, :cond_6

    :cond_5
    const-string p4, "\u0733\u06e7"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5dd9

    const v1, 0x53a001bd

    xor-int/2addr v0, v1

    const v1, 0x5ca4c9ec

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u073a\u1a7b"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x3f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x4c9d

    const v1, -0x1d481c90

    xor-int/2addr v0, v1

    const v1, -0x5688e3c6    # -5.48695E-14f

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget p4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz p4, :cond_7

    goto :goto_3

    :cond_7
    const-string p4, "\u1a73\u073d"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5317

    const v1, 0x5a626566

    xor-int/2addr v0, v1

    const v1, -0x59c547b3

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget p4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p4, :cond_8

    :goto_2
    const-string p4, "\u05a1\u1a75"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x342b

    const v1, 0x358d1380

    xor-int/2addr v0, v1

    const v1, -0x7dc08349

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u06d9\u06e7"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x6291

    const v1, 0x2b45c338

    xor-int/2addr v0, v1

    const v1, -0xc3bcbf8

    goto/16 :goto_0

    :sswitch_c
    sget p4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz p4, :cond_9

    goto :goto_3

    :cond_9
    const-string p4, "\u06e1\u073a"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x4f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2475

    const v1, 0x61ecd992

    xor-int/2addr v0, v1

    const v1, 0x3caec76d

    goto/16 :goto_0

    :sswitch_d
    sget-boolean p4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p4, :cond_a

    :goto_3
    const-string p4, "\u06e8\u06df"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x42b3

    const v1, 0x7a0fba4f

    xor-int/2addr v0, v1

    const v1, -0x6d9f3210

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u05ab\u073a"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x17

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x305b

    const v1, -0x65103940

    xor-int/2addr v0, v1

    const v1, 0x53a15970

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget-boolean p4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz p4, :cond_c

    :cond_b
    const-string p4, "\u06e0\u06db"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x75e3

    const v1, 0x11480731

    xor-int/2addr v0, v1

    const v1, 0x5463d5a9

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u05a1\u06dc"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1957

    const v1, -0x3f166d10

    xor-int/2addr v0, v1

    const v1, -0xdc9a53b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6e74239c -> :sswitch_b
        -0x6dc508fc -> :sswitch_5
        -0x647c29a4 -> :sswitch_4
        -0x635d3974 -> :sswitch_3
        -0x5f1b3041 -> :sswitch_2
        -0x50a8fe4f -> :sswitch_7
        -0x30bf1e4d -> :sswitch_6
        -0x2ef52df4 -> :sswitch_1
        -0x21bd1fb3 -> :sswitch_5
        -0x1f636734 -> :sswitch_e
        -0x192bec94 -> :sswitch_9
        -0x12ab1541 -> :sswitch_1
        -0xefce9f9 -> :sswitch_7
        -0x6e0094e -> :sswitch_0
        0xb475ef4 -> :sswitch_3
        0x1bd9677f -> :sswitch_e
        0x2509f7ab -> :sswitch_8
        0x2c083ea3 -> :sswitch_2
        0x30de4630 -> :sswitch_d
        0x33cf7104 -> :sswitch_0
        0x35ebf2bc -> :sswitch_6
        0x42342a61 -> :sswitch_a
        0x43c62ad9 -> :sswitch_d
        0x4a862617 -> :sswitch_b
        0x52be428a -> :sswitch_9
        0x541c7d4c -> :sswitch_c
        0x5507c89d -> :sswitch_a
        0x56fa72cb -> :sswitch_c
        0x6368ad80 -> :sswitch_8
        0x66e7d0ea -> :sswitch_4
    .end sparse-switch
.end method
