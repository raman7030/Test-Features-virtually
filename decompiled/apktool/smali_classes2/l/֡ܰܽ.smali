.class public final synthetic Ll/֡ܰܽ;
.super Ljava/lang/Object;
.source "D60A"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field private static final ۗۘ֫:[S


# instance fields
.field public final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡ܰܽ;->ۗۘ֫:[S

    return-void

    :array_0
    .array-data 2
        0x1a7as
        0x2041s
        0x2066s
        0x2060s
        0x207bs
        0x207cs
        0x2075s
        0x2032s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;)V
    .locals 6

    const v0, 0x58a4b707

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2b67

    const v5, 0xef02186

    xor-int/2addr v4, v5

    const v5, 0x3c8869fa

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x46e7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/֡ܰܽ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_c

    goto/16 :goto_4

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v3, :cond_5

    goto/16 :goto_2

    .line 4
    :sswitch_1
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v3, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_2

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/֡ܰܽ;->᩹:Ljava/lang/String;

    return-void

    .line 4
    :sswitch_6
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a75\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f7

    const v5, 0x8d3be44

    xor-int/2addr v4, v5

    const v5, -0x5b257497

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_2

    :cond_1
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf81

    const v5, -0x6525477e

    xor-int/2addr v4, v5

    const v5, -0x41f5c8d8

    goto :goto_0

    :cond_2
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2301

    const v5, 0x63dc7f94

    xor-int/2addr v4, v5

    const v5, -0x3f090149

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a7a\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7309

    const v5, -0x593f3785

    xor-int/2addr v4, v5

    const v5, 0x42bd8941

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a7b\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5eef

    const v5, 0x338fa4cf

    xor-int/2addr v4, v5

    const v5, -0x7d733826

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u1a76\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe0b

    const v5, -0x7f8593e

    xor-int/2addr v4, v5

    const v5, 0x484fdd8

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69d7

    const v5, -0x22ea17c4

    xor-int/2addr v4, v5

    const v5, -0x63ad0e54

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06dc\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4393

    const v5, -0xe5b29a7

    xor-int/2addr v4, v5

    const v5, 0x253fde2e

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6ab7

    const v5, -0x7caf2cd9

    xor-int/2addr v4, v5

    const v5, 0x4d90d80b    # 3.03759712E8f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a2f

    const v5, 0x7114628d

    xor-int/2addr v4, v5

    const v5, 0x54b2c2aa

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e7\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30b3

    const v5, -0x734b7d6a

    xor-int/2addr v4, v5

    const v5, 0x78e9fd16

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7101

    const v5, 0x259da6ff

    xor-int/2addr v4, v5

    const v5, 0x77fe6fec

    goto/16 :goto_0

    .line 4
    :sswitch_e
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4861

    const v5, 0x64f6f457

    xor-int/2addr v4, v5

    const v5, -0x6c7b544

    goto/16 :goto_0

    :goto_4
    const-string v3, "\u06df\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x451d

    const v5, 0x5b81347

    xor-int/2addr v4, v5

    const v5, 0x508b6029

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d35

    const v5, -0x386a7a8

    xor-int/2addr v4, v5

    const v5, -0x188f2e81

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c9680c2 -> :sswitch_3
        -0x766e1fbd -> :sswitch_5
        -0x6e532cba -> :sswitch_3
        -0x6bdf5237 -> :sswitch_4
        -0x63ede02c -> :sswitch_d
        -0x60d1818d -> :sswitch_1
        -0x4e257a29 -> :sswitch_e
        -0x2e606ca4 -> :sswitch_6
        -0x21baa37d -> :sswitch_8
        -0x175f9c55 -> :sswitch_2
        -0x11b4bc82 -> :sswitch_6
        -0xed15370 -> :sswitch_c
        -0xdb9edda -> :sswitch_a
        -0x95cc179 -> :sswitch_9
        -0x456a9e0 -> :sswitch_9
        -0x216540e -> :sswitch_0
        0x21b760f -> :sswitch_b
        0xb826402 -> :sswitch_a
        0x2ddd4cbf -> :sswitch_b
        0x35c9ae6d -> :sswitch_d
        0x409c993b -> :sswitch_5
        0x5256ee22 -> :sswitch_2
        0x577c92f9 -> :sswitch_1
        0x598574e9 -> :sswitch_7
        0x5f1807aa -> :sswitch_8
        0x632d631f -> :sswitch_4
        0x65877005 -> :sswitch_e
        0x6c03d4b4 -> :sswitch_7
        0x784acd4d -> :sswitch_0
        0x7a14cb99 -> :sswitch_c
    .end sparse-switch
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, 0x66a509de

    sget v15, Ll/֫᩵;->ܶ᩻᩷:I

    sget v16, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v17, "\u1a7b\u06e7"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x72a3

    const v19, -0x413ff31e

    xor-int v1, v1, v19

    const v19, -0x80c7da

    xor-int v17, v17, v19

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v18, v17

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, 0x66a509de

    move-object v4, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x8d9

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    const/4 v1, 0x7

    .line 99
    invoke-static {v13, v14, v1, v12}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v2, v1}, Ll/֨᩺;->ۨ۬۠(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 37
    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_4

    const-string v1, "\u05ab\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x3979

    const v18, 0x7edcb5c7    # 1.46687E38f

    xor-int v5, v5, v18

    const v18, 0x744ad07d

    goto/16 :goto_5

    :sswitch_0
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\u06e4\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x27

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x57cb

    const v18, 0x326d8648

    xor-int v5, v5, v18

    const v18, 0x6ef3cd45

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v1

    if-gtz v1, :cond_a

    goto/16 :goto_4

    .line 58
    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    const-string v1, "\u1a76\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x5

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1975

    const v18, 0x58800b4e

    xor-int v5, v5, v18

    const v18, -0x42eb2b56

    goto/16 :goto_5

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_4

    .line 87
    :sswitch_4
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 v1, 0x0

    return-object v1

    .line 101
    :sswitch_5
    new-instance v1, Ll/ܺۢᩴ;

    invoke-direct {v1}, Ll/ܺۢᩴ;-><init>()V

    invoke-virtual {v3, v1}, Ll/ۡ۟ܽ;->֫(Ll/ܺۢᩴ;)V

    return-object v3

    .line 24
    :sswitch_6
    new-instance v3, Ll/ۡ۟ܽ;

    const/4 v1, 0x0

    iget-object v5, v0, Ll/֡ܰܽ;->᩹:Ljava/lang/String;

    sget v18, Ll/֡֡;->֫ۤܳ:I

    if-ltz v18, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-direct {v3, v5, v2, v4, v1}, Ll/ۡ۟ܽ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u05ab\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x5b3d

    const v18, 0x89be491

    xor-int v5, v5, v18

    const v18, -0x11055108

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u1a76\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5e99

    const v18, -0x21b716a2

    xor-int v5, v5, v18

    const v18, 0x318722f7

    goto/16 :goto_5

    .line 99
    :sswitch_7
    sget-object v13, Ll/֡ܰܽ;->ۗۘ֫:[S

    const/4 v14, 0x1

    .line 19
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u073d\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2067

    const v18, 0x460e6eb1

    xor-int v5, v5, v18

    const v18, 0x6ff05e4f

    goto/16 :goto_5

    .line 2
    :sswitch_8
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    .line 99
    iget-object v1, v0, Ll/֡ܰܽ;->᩸:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1}, Ll/֫ܺ;->᩵ۛۙ(Ljava/lang/Object;)I

    move-result v2

    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06db\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x4b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1831

    const v18, 0x2eb0e66d

    xor-int v5, v5, v18

    const v18, 0x74a9683d

    goto/16 :goto_5

    :sswitch_9
    const v1, 0xcbfe

    const v12, 0xcbfe

    goto :goto_2

    :sswitch_a
    const/16 v1, 0x2012

    const/16 v12, 0x2012

    :goto_2
    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x1f5d

    const v18, -0x392883ae

    xor-int v5, v5, v18

    const v18, -0x44eef053

    goto/16 :goto_5

    :sswitch_b
    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int v1, v9, v1

    if-gtz v1, :cond_7

    const-string v1, "\u1a75\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x6d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7c29

    const v18, -0x70b25201

    xor-int v5, v5, v18

    const v18, -0x5b1cbcbb

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u0736\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x61

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x147

    const v18, -0x63fabc1c

    xor-int v5, v5, v18

    const v18, -0x27581c09

    goto/16 :goto_5

    :sswitch_c
    mul-int v9, v8, v8

    mul-int v10, v7, v7

    const v11, 0x1eae640

    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u1a79\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1375

    const v18, 0x4f760a50

    xor-int v5, v5, v18

    const v18, -0x21236a43

    goto/16 :goto_5

    :sswitch_d
    aget-short v7, v20, v6

    add-int/lit16 v8, v7, 0x1628

    .line 23
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v1, "\u06d7\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x2b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2419

    const v18, -0x74b249f7

    xor-int v5, v5, v18

    const v18, 0x2bfb6ead

    goto/16 :goto_5

    :sswitch_e
    const/4 v6, 0x0

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_b

    :cond_a
    :goto_3
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x418d

    const v5, -0x239a85b4

    xor-int/2addr v3, v5

    const v5, 0x6bd3079a

    xor-int v18, v1, v5

    move v1, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5dbd

    const v18, 0x78bea9dc

    xor-int v5, v5, v18

    const v18, 0x484f6f23

    goto :goto_5

    :sswitch_f
    sget-object v20, Ll/֡ܰܽ;->ۗۘ֫:[S

    .line 69
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_c

    goto :goto_4

    :cond_c
    const-string v1, "\u06d6\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x47d5

    const v18, 0x52ca5038

    xor-int v5, v5, v18

    const v18, 0x5001bf49

    goto :goto_5

    :sswitch_10
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_d

    :goto_4
    const-string v1, "\u06d7\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x9

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x72c7

    const v18, -0x28c7158e

    xor-int v5, v5, v18

    const v18, -0x52ff2eb0

    goto :goto_5

    :cond_d
    const-string v1, "\u06da\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2559

    const v18, -0x3eff0067

    xor-int v5, v5, v18

    const v18, -0x14292c40

    :goto_5
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f993eef -> :sswitch_0
        -0x795fd9fb -> :sswitch_7
        -0x778adf94 -> :sswitch_b
        -0x7048000d -> :sswitch_0
        -0x61a54e84 -> :sswitch_d
        -0x5ad3a29d -> :sswitch_1
        -0x5903d434 -> :sswitch_4
        -0x56d8b958 -> :sswitch_b
        -0x56cdffd4 -> :sswitch_5
        -0x56b0842f -> :sswitch_2
        -0x566afc2e -> :sswitch_1
        -0x4771cd19 -> :sswitch_a
        -0x3fb992bc -> :sswitch_e
        -0x2db8dd60 -> :sswitch_d
        -0x1244a388 -> :sswitch_8
        -0x8874769 -> :sswitch_4
        0x6abea0e -> :sswitch_e
        0xbfbc207 -> :sswitch_10
        0xc31d2d9 -> :sswitch_c
        0xfa42c73 -> :sswitch_3
        0x1123cfaf -> :sswitch_a
        0x17432e5c -> :sswitch_7
        0x2ff7d8b2 -> :sswitch_2
        0x442ec672 -> :sswitch_8
        0x46ccc4c3 -> :sswitch_10
        0x47cf7214 -> :sswitch_f
        0x586dc5f8 -> :sswitch_5
        0x5a7a9b86 -> :sswitch_c
        0x5ff6a67c -> :sswitch_9
        0x672ee3b5 -> :sswitch_6
        0x68d8a07c -> :sswitch_6
        0x74cddd4c -> :sswitch_f
        0x7b8c32ab -> :sswitch_3
        0x7fbeeffa -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
