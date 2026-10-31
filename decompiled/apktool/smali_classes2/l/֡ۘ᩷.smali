.class public final synthetic Ll/֡ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/text/Collator;


# direct methods
.method public synthetic constructor <init>(Ljava/text/Collator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۘ᩷;->᩸:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x4be62cc9

    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v6, Ll/۠;->ܺܺܶ:I

    const-string v7, "\u06d6\u06e8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x2f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4f59

    const v9, 0x2e04a43

    xor-int/2addr v8, v9

    const v9, 0x299cabb7

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0x15ff

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 1270
    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_3

    goto :goto_1

    .line 144
    :sswitch_0
    sget v7, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v7, :cond_2

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v7, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v7, :cond_a

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v7

    if-gez v7, :cond_8

    goto/16 :goto_4

    .line 988
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_4

    .line 1133
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 p1, 0x0

    return p1

    .line 2271
    :sswitch_5
    iget-object p1, p0, Ll/֡ۘ᩷;->᩸:Ljava/text/Collator;

    invoke-virtual {p1, v2, v3}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    .line 6
    :sswitch_6
    sget v2, Ll/֫᩵᩷;->ۛۧ:I

    .line 2271
    invoke-virtual {v0}, Ll/ۙᩴ᩷;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ll/ۙᩴ᩷;->֫()Ljava/lang/String;

    move-result-object v3

    .line 1712
    sget v7, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v7, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v7, "\u1a7b\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7929

    const v9, -0x7c64341

    xor-int/2addr v8, v9

    const v9, 0x585f9c02

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    .line 4
    move-object v1, p2

    check-cast v1, Ll/ۙᩴ᩷;

    .line 1352
    sget v7, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v7, :cond_1

    goto :goto_2

    :cond_1
    const-string v7, "\u06eb\u06d6"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xb47

    const v9, 0x6f0e2b30    # 4.399908E28f

    xor-int/2addr v8, v9

    const v9, -0x627d2c9e

    goto :goto_0

    :cond_2
    :goto_1
    const-string v7, "\u1a77\u06e1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xef1

    const v9, 0x32bd1d06

    xor-int/2addr v8, v9

    const v9, -0x524abc7e

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06e0\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x1b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3319

    const v9, 0x5632d618

    xor-int/2addr v8, v9

    const v9, 0x74db4fc3

    goto/16 :goto_0

    .line 1907
    :sswitch_8
    sget-boolean v7, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    const-string v7, "\u05a1\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x1b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1589

    const v9, 0x288a3107

    xor-int/2addr v8, v9

    const v9, 0x75c8918a

    goto/16 :goto_0

    .line 2255
    :sswitch_9
    sget v7, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v7, :cond_5

    :goto_2
    const-string v7, "\u0733\u06d6"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5973

    const v9, -0xf3a7588

    xor-int/2addr v8, v9

    const v9, 0x4ac3414a    # 6398117.0f

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u073f\u073d"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1525

    const v9, 0x6c8dd956

    xor-int/2addr v8, v9

    const v9, 0x655d4b47

    goto/16 :goto_0

    .line 1376
    :sswitch_a
    sget v7, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v7, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v7, "\u1a7b\u05a1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4fef

    const v9, -0x68d123e9

    xor-int/2addr v8, v9

    const v9, -0x1bdb2f3c

    goto/16 :goto_0

    .line 1257
    :sswitch_b
    sget v7, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v7, :cond_7

    goto :goto_3

    :cond_7
    const-string v7, "\u073a\u06db"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1183

    const v9, -0x60c854c9

    xor-int/2addr v8, v9

    const v9, 0x6e6f4e88

    goto/16 :goto_0

    .line 1908
    :sswitch_c
    sget v7, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v7, :cond_9

    :cond_8
    :goto_3
    const-string v7, "\u06e2\u05a8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x22ed

    const v9, -0x639ccfcb

    xor-int/2addr v8, v9

    const v9, 0x393e2416

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u0736\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3d85

    const v9, -0x494c94f3

    xor-int/2addr v8, v9

    const v9, 0x34689d41

    goto/16 :goto_0

    :sswitch_d
    sget v7, Ll/۠;->ܺܺܶ:I

    if-ltz v7, :cond_b

    :cond_a
    const-string v7, "\u06d8\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x15d5

    const v9, 0x79165d1a

    xor-int/2addr v8, v9

    const v9, 0x70ef5e72

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u073a\u06dc"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x63

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x454d

    const v9, -0xdc90717

    xor-int/2addr v8, v9

    const v9, 0x450eda11

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v7, Ll/֨۫;->۬᩷᩶:Z

    if-nez v7, :cond_c

    :goto_4
    const-string v7, "\u06df\u06e2"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4359

    const v9, -0x789763e    # -2.0001548E34f

    xor-int/2addr v8, v9

    const v9, -0x3cac54dd

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u0730\u06e7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x552b

    const v9, -0x55b7222b

    xor-int/2addr v8, v9

    const v9, 0x30f5375

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fbcda86 -> :sswitch_a
        -0x7a674198 -> :sswitch_b
        -0x6cdcce41 -> :sswitch_e
        -0x576600aa -> :sswitch_5
        -0x5381cd1d -> :sswitch_7
        -0x4d008c7b -> :sswitch_d
        -0x2ee0165d -> :sswitch_b
        -0x251389cd -> :sswitch_6
        -0x24e0ae4c -> :sswitch_9
        -0x20c735e9 -> :sswitch_9
        -0x5a16db2 -> :sswitch_4
        -0x4cc9df2 -> :sswitch_0
        -0x4877c71 -> :sswitch_0
        0xe7e4f7f -> :sswitch_1
        0xe953d1b -> :sswitch_5
        0x192681cd -> :sswitch_d
        0x1c46bd8f -> :sswitch_1
        0x2aa13214 -> :sswitch_c
        0x2c72cb6e -> :sswitch_6
        0x3394363e -> :sswitch_8
        0x38a632ce -> :sswitch_a
        0x38b86c52 -> :sswitch_e
        0x4072c16c -> :sswitch_3
        0x5144ac27 -> :sswitch_c
        0x58a89c0a -> :sswitch_7
        0x61d8b70d -> :sswitch_2
        0x6a67e026 -> :sswitch_2
        0x6ff765b7 -> :sswitch_3
        0x72a3b587 -> :sswitch_4
        0x786d599e -> :sswitch_8
    .end sparse-switch
.end method
