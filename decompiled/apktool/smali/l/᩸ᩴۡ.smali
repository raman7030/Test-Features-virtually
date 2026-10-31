.class public final Ll/᩸ᩴۡ;
.super Ll/۟ܶۡ;
.source "T5M8"


# static fields
.field private static final ۤ᩹ۗ:[S


# instance fields
.field public final synthetic ۜ:J

.field public final synthetic ۡ:Ljava/lang/String;

.field public final synthetic ۢ:Ljava/lang/String;

.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩷:I

.field public final synthetic ᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    return-void

    :array_0
    .array-data 2
        0x15e3s
        0x7709s
        0x7718s
        0x7700s
        0x7730s
        0x7717s
        0x771fs
        0x7716s
        0x7748s
        0x7736s
        0x7732s
        0x7748s
        0x774ds
        0x7740s
        0x774as
        0x7740s
        0x774fs
        0x774as
        0x7740s
        0x774fs
        0x774bs
        0x774bs
        0x774as
        0x774ds
        0x774cs
        0x774fs
    .end array-data
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;JILjava/lang/String;Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V
    .locals 3

    const v0, -0x1d17ab4

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    .line 2
    iput-object p1, p0, Ll/᩸ᩴۡ;->ܳ:Ll/ۗܺ᩷;

    .line 4
    iput-object p2, p0, Ll/᩸ᩴۡ;->ۢ:Ljava/lang/String;

    .line 6
    iput-wide p3, p0, Ll/᩸ᩴۡ;->ۜ:J

    .line 8
    iput p5, p0, Ll/᩸ᩴۡ;->᩷:I

    .line 10
    iput-object p6, p0, Ll/᩸ᩴۡ;->ۡ:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Ll/᩸ᩴۡ;->᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 116
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const-string p1, "\u06eb\u06da"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7971

    const p3, 0x1ae4e7bf

    xor-int/2addr p2, p3

    const p3, 0x5bb076c9

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x3737

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 66
    :sswitch_0
    sget p1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u073a\u05a8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x74d9

    const p3, -0x2b8b3d21

    xor-int/2addr p2, p3

    const p3, 0x21df57d1

    goto :goto_0

    .line 11
    :sswitch_1
    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06e8\u06eb"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x27

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3ce7

    const p3, -0x40920168

    xor-int/2addr p2, p3

    const p3, 0x1ad8f371

    goto :goto_0

    .line 106
    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u073d\u06d9"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x2b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x304b

    const p3, 0x4089cc9b

    xor-int/2addr p2, p3

    const p3, -0x6c4a92a9

    goto :goto_0

    .line 60
    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    :goto_2
    const-string p1, "\u06d8\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x219d

    const p3, -0x33511e3f    # -9.1688456E7f

    xor-int/2addr p2, p3

    const p3, 0x1f155134

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 46
    :sswitch_5
    sget p1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz p1, :cond_3

    const-string p1, "\u1a79\u1a74"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4077

    const p3, -0x4f221760

    xor-int/2addr p2, p3

    const p3, 0x16ecc049

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06da\u06e7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x5f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3415

    const p3, 0x3fdefd7c

    xor-int/2addr p2, p3

    const p3, 0x23bfc551

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bebb6a0 -> :sswitch_3
        -0x5e494d79 -> :sswitch_4
        -0x530e1e18 -> :sswitch_1
        -0x3046fc8c -> :sswitch_0
        -0x2aba1be9 -> :sswitch_0
        0x12d7de19 -> :sswitch_3
        0x15839b57 -> :sswitch_1
        0x1e82575e -> :sswitch_5
        0x1f0e3e02 -> :sswitch_2
        0x2b49a314 -> :sswitch_4
        0x5896e0d7 -> :sswitch_2
        0x6fec82ae -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4a61b210

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v4, "\u06eb\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4f87

    const v6, -0x5c931b1a

    xor-int/2addr v5, v6

    const v6, 0x7f5cf5ed

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x5927

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 175
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_a

    goto/16 :goto_3

    .line 177
    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u0736\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d93

    const v6, 0x10f9c64a

    xor-int/2addr v5, v6

    const v6, 0x33e8973f

    goto :goto_0

    .line 116
    :sswitch_1
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_9

    goto/16 :goto_1

    .line 348
    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_1

    .line 21
    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 546
    invoke-static {v0, p1, v1}, Ll/ۗ᩶;->۠ۛۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 148
    :sswitch_6
    iget-object v0, p0, Ll/᩸ᩴۡ;->ܳ:Ll/ۗܺ᩷;

    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u06df\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3d0b

    const v6, 0x7ff44cb5

    xor-int/2addr v5, v6

    const v6, 0x68386696

    goto :goto_0

    .line 162
    :sswitch_7
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a77\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2417

    const v6, 0x78cf6763

    xor-int/2addr v5, v6

    const v6, 0x15866fed

    goto/16 :goto_0

    .line 335
    :sswitch_8
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u0733\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x372d

    const v6, -0x75ee46b3

    xor-int/2addr v5, v6

    const v6, -0x470805c

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06e2\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x451f

    const v6, -0x42e2baf0

    xor-int/2addr v5, v6

    const v6, -0x5b2b9d7b

    goto/16 :goto_0

    .line 147
    :sswitch_a
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_5

    :goto_1
    const-string v4, "\u1a73\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5437

    const v6, 0x3724e4ee

    xor-int/2addr v5, v6

    const v6, 0x6bc86634

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b81

    const v6, 0xda8b0e3

    xor-int/2addr v5, v6

    const v6, -0x77cd7f25

    goto/16 :goto_0

    .line 456
    :sswitch_b
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13b1

    const v6, -0x5a4bc420

    xor-int/2addr v5, v6

    const v6, -0x30528061

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x77c9

    const v6, 0x1ea1848b

    xor-int/2addr v5, v6

    const v6, 0x34e5291

    goto/16 :goto_0

    .line 352
    :sswitch_d
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v4, "\u1a78\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x43a3

    const v6, 0x1d27b0da

    xor-int/2addr v5, v6

    const v6, -0x5f1cf303

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0733\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x153

    const v6, -0x41d7bc0b

    xor-int/2addr v5, v6

    const v6, 0x5caaac24

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v4, "\u06dc\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x291

    const v6, 0x39adb716

    xor-int/2addr v5, v6

    const v6, -0x43323072

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e0\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2b0b

    const v6, 0x66dc5549

    xor-int/2addr v5, v6

    const v6, -0x3fe8908

    goto/16 :goto_0

    .line 393
    :sswitch_e
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a76\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x65b7

    const v6, 0x6e27200c

    xor-int/2addr v5, v6

    const v6, 0xf88d29d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6df7

    const v6, 0x4fa14069    # 5.4107059E9f

    xor-int/2addr v5, v6

    const v6, 0x6648e0d6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x759620bb -> :sswitch_8
        -0x706676b9 -> :sswitch_7
        -0x4eb77d49 -> :sswitch_a
        -0x4b6ce5c3 -> :sswitch_c
        -0x46a596de -> :sswitch_b
        -0x3e0e1d60 -> :sswitch_3
        -0x3ad17a28 -> :sswitch_1
        -0x34aebe5b -> :sswitch_5
        -0x2f3898fe -> :sswitch_4
        -0x2d43076a -> :sswitch_d
        -0x26e9ee89 -> :sswitch_0
        -0x229998a1 -> :sswitch_6
        -0x1eef3a7f -> :sswitch_a
        -0x185ef667 -> :sswitch_5
        -0x1751c498 -> :sswitch_2
        -0x3a18dbf -> :sswitch_2
        0x396940b -> :sswitch_9
        0xa402206 -> :sswitch_4
        0x124d4541 -> :sswitch_8
        0x13e4ac96 -> :sswitch_6
        0x14ad574b -> :sswitch_c
        0x14cd2fb7 -> :sswitch_0
        0x18a167a5 -> :sswitch_1
        0x1d7e905d -> :sswitch_d
        0x2df3eee7 -> :sswitch_b
        0x36ee2ccb -> :sswitch_e
        0x395cf52c -> :sswitch_e
        0x55d0fc21 -> :sswitch_3
        0x56e7f132 -> :sswitch_9
        0x702b4e50 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۧ()V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/᩸ᩴۡ;->ܳ:Ll/ۗܺ᩷;

    invoke-static {p0, v0}, Ll/ۗ᩺;->ۡܰ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ܿ()V
    .locals 36

    move-object/from16 v0, p0

    const-wide/16 v2, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x40b4501a

    sget v24, Ll/֨۬;->۫ۙ᩺:I

    sget v25, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v26, "\u06df\u0733"

    invoke-static/range {v26 .. v26}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v25

    xor-int v1, v26, v24

    mul-int/lit16 v1, v1, -0x3657

    const v28, -0x4abd5e11

    xor-int v1, v1, v28

    const v28, -0x171b916e

    xor-int v26, v26, v28

    move-wide/from16 v21, v2

    move-object/from16 v23, v6

    move-object/from16 v28, v8

    move-object v11, v10

    move-object v15, v14

    move-object/from16 v13, v16

    move-object/from16 v6, v18

    move-object/from16 v3, v20

    move/from16 v27, v26

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v26, 0x40b4501a

    move-object/from16 v18, v4

    move-object v8, v7

    move-object v10, v9

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    xor-int v9, v26, v24

    mul-int/lit16 v9, v9, -0x3c69

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v26, v27, v1

    sparse-switch v26, :sswitch_data_0

    .line 136
    sget-object v1, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v9, 0x17

    move-object/from16 v27, v3

    const/4 v3, 0x1

    invoke-static {v1, v9, v3, v14}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {v8, v1}, Ll/᩺;->ᩳ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;

    .line 42
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_4

    goto :goto_2

    .line 84
    :sswitch_0
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v1, :cond_2

    :goto_1
    move-object/from16 v27, v3

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v27, v3

    :goto_2
    move-object/from16 v3, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v31

    move-wide/from16 v32, v21

    move/from16 v21, v5

    move-wide/from16 v4, v32

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    goto/16 :goto_12

    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto :goto_1

    .line 118
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 138
    :sswitch_5
    invoke-static {v3, v4, v7, v14}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-static {v8, v1}, Ll/᩺;->ᩳ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->sign:Ljava/lang/String;

    .line 140
    iget-object v1, v0, Ll/᩸ᩴۡ;->᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v1, v10}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    goto/16 :goto_7

    .line 138
    :sswitch_6
    invoke-static {v8, v11}, Ll/᩺;->ᩳ۟ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->packageValue:Ljava/lang/String;

    sget-object v3, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v4, 0x19

    const/4 v7, 0x1

    const-string v1, "\u06e8\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x55

    xor-int v9, v1, v25

    mul-int/lit16 v9, v9, -0x7987

    const v27, 0x3aae4c23

    xor-int v9, v9, v27

    const v27, -0x36c010b3

    goto :goto_3

    .line 137
    :sswitch_7
    sget-object v1, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v9, 0x18

    const/4 v11, 0x1

    invoke-static {v1, v9, v11, v14}, Ll/۟;->ۜܿܰ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 159
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_3

    :cond_2
    const-string v1, "\u1a74\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v9, v1, v25

    mul-int/lit16 v9, v9, -0x795b

    const v27, 0x1979788

    xor-int v9, v9, v27

    const v27, 0x2238aba0

    goto :goto_3

    :cond_3
    const-string v1, "\u1a78\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x1f

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x6657

    const v27, -0x169b7e27

    xor-int v9, v9, v27

    const v27, 0x2247f6f9

    :goto_3
    xor-int v27, v1, v27

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, 0x6c19

    const v9, -0x7aaa25f3

    xor-int/2addr v3, v9

    const v9, -0x1a2ed568

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v27, v3

    const/4 v1, 0x1

    .line 135
    invoke-static {v6, v2, v1, v14}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-static {v8, v1}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;

    .line 70
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_5

    :goto_4
    move-object/from16 v3, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v31

    move-wide/from16 v32, v21

    move/from16 v21, v5

    move-wide/from16 v4, v32

    goto/16 :goto_c

    :cond_5
    const-string v1, "\u06df\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, 0x6ce1

    const v9, 0x1a48c91d

    xor-int/2addr v3, v9

    const v9, -0x5936960d

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v27, v3

    const/4 v1, 0x1

    .line 134
    invoke-static {v13, v5, v1, v14}, Ll/֫֫;->ܿ᩶ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-static {v8, v1}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->prepayId:Ljava/lang/String;

    sget-object v6, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v2, 0x16

    .line 0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0x48f5

    const v9, -0x1dd5323e

    xor-int/2addr v3, v9

    const v9, -0xcc9896d

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v27, v3

    const/16 v1, 0xa

    .line 133
    invoke-static {v15, v12, v1, v14}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 134
    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->partnerId:Ljava/lang/String;

    sget-object v13, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v5, 0x15

    .line 17
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_7

    :goto_5
    const-string v1, "\u06e0\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x4b

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0x741b

    const v9, -0x61072b20

    xor-int/2addr v3, v9

    const v9, 0x2ecb5353

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u05a8\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x75

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, 0x2d45

    const v9, 0x67a20eac

    xor-int/2addr v3, v9

    const v9, 0x72e5ad24

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v27, v3

    .line 132
    new-instance v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;

    invoke-direct {v10}, Lcom/tencent/mm/opensdk/modelpay/PayReq;-><init>()V

    .line 133
    invoke-static {}, Ll/᩹ᩴۡ;->ۧ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->appId:Ljava/lang/String;

    sget-object v15, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v12, 0xb

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v1, "\u1a74\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x1b

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0x67df

    const v9, -0x157cc55b

    xor-int/2addr v3, v9

    const v9, 0x52946d35

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v27, v3

    .line 130
    sget-object v1, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v3, 0x9

    const/4 v9, 0x2

    invoke-static {v1, v3, v9, v14}, Ll/֨֫;->ۚܺ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v28

    .line 169
    invoke-static {v1, v3}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\u06e0\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v9, v1, v25

    mul-int/lit16 v9, v9, -0x6871

    const v28, -0x3bd65642

    xor-int v9, v9, v28

    const v28, -0xd99cd6a

    xor-int v1, v1, v28

    move-object/from16 v28, v3

    move-object/from16 v3, v27

    move/from16 v27, v1

    :goto_6
    move v1, v9

    goto/16 :goto_0

    :cond_9
    move/from16 v28, v2

    move/from16 v9, v19

    move-object/from16 v19, v23

    move-object/from16 v23, v3

    move-object/from16 v3, v20

    :goto_7
    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    goto/16 :goto_d

    :sswitch_d
    move-object/from16 v27, v3

    .line 129
    sget-object v1, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/16 v3, 0x8

    const/4 v9, 0x1

    invoke-static {v1, v3, v9, v14}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-static {v8, v1}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    const-string v1, "\u1a7b\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x53

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, 0x7909

    const v9, 0x54df8206

    xor-int/2addr v3, v9

    const v9, -0x63f82b3c

    :goto_8
    xor-int/2addr v1, v9

    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v3

    move-object/from16 v3, v31

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v27, v3

    move-object/from16 v3, v28

    .line 126
    sget-object v1, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/4 v9, 0x1

    move/from16 v28, v2

    const/4 v2, 0x7

    invoke-static {v1, v9, v2, v14}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v23

    .line 127
    invoke-static {v2, v1}, Ll/᩹;->ۡܽ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 128
    new-instance v9, Ll/ܶᩴۡ;

    .line 20
    sget-boolean v23, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v23, :cond_a

    move-object/from16 v23, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    goto/16 :goto_c

    :cond_a
    move-object/from16 v23, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    .line 128
    invoke-direct {v9, v2, v3, v4, v5}, Ll/ܶᩴۡ;-><init>(Lorg/json/JSONObject;Ljava/lang/String;J)V

    sput-object v9, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    .line 129
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_b

    :goto_9
    const-string v1, "\u06db\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x7d75

    const v22, -0x11db256c

    xor-int v9, v9, v22

    const v22, -0x218c3d5b

    goto :goto_a

    :cond_b
    const-string v1, "\u06d6\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x17

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x4885

    const v22, 0x1394bc3c

    xor-int v9, v9, v22

    const v22, -0x9868937

    goto :goto_a

    :sswitch_f
    move-object/from16 v27, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v31

    move-wide/from16 v32, v21

    move/from16 v21, v5

    move-wide/from16 v4, v32

    .line 126
    invoke-static {}, Ll/᩹ᩴۡ;->֫()J

    move-result-wide v29

    cmp-long v1, v4, v29

    if-eqz v1, :cond_c

    move/from16 v9, v19

    goto/16 :goto_b

    :cond_c
    const-string v1, "\u05a8\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v9, v1, v25

    mul-int/lit16 v9, v9, 0x74c3

    const v22, 0x22528a8e

    xor-int v9, v9, v22

    const v22, -0x2627be6f

    :goto_a
    xor-int v1, v1, v22

    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v9

    move-object/from16 v32, v23

    move-object/from16 v23, v2

    move/from16 v2, v28

    move-object/from16 v28, v32

    move/from16 v33, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v31

    goto/16 :goto_15

    :sswitch_10
    move-object/from16 v27, v3

    move-object/from16 v1, v18

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    .line 163
    invoke-virtual {v1, v9}, Ll/ᩳᩴۡ;->֫(I)V

    iget-object v2, v0, Ll/᩸ᩴۡ;->ۡ:Ljava/lang/String;

    invoke-static {v1, v2}, Ll/֫ۧ;->ۢܰۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    invoke-static {v1}, Ll/᩺ᩴۡ;->֫(Ll/ᩳᩴۡ;)Lorg/json/JSONObject;

    move-result-object v2

    .line 126
    invoke-static {}, Ll/֫᩵;->ܰ۫ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "\u06e0\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x2f

    move-object/from16 v19, v2

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, -0x2f23

    const v22, -0x7d660bc6

    xor-int v2, v2, v22

    const v22, 0x4c1431a9    # 3.8848164E7f

    goto/16 :goto_f

    :cond_d
    :goto_b
    move-object/from16 v19, v2

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v27, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v31

    move-wide/from16 v32, v21

    move/from16 v21, v5

    move-wide/from16 v4, v32

    .line 125
    sget-object v1, Ll/᩹ᩴۡ;->֫:Ll/ۚۡ֫;

    const/16 v1, 0x1112

    .line 162
    invoke-static {v1}, Ll/ۖۘ;->ܶ᩺ۛ(I)Ll/ᩳᩴۡ;

    move-result-object v1

    .line 163
    iget v9, v0, Ll/᩸ᩴۡ;->᩷:I

    invoke-virtual {v1, v9}, Ll/ᩳᩴۡ;->ܽ(I)V

    const/16 v19, 0x1

    sget v9, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v9, :cond_e

    move-object/from16 v18, v1

    :goto_c
    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x5119

    const v22, -0x4e36a9e7

    xor-int v9, v9, v22

    const v22, -0x6f80c398

    goto/16 :goto_a

    :cond_e
    const-string v9, "\u06d9\u1a79"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v24

    mul-int/lit8 v9, v9, -0x11

    move-object/from16 v18, v1

    xor-int v1, v9, v25

    mul-int/lit16 v1, v1, -0x7001

    const v22, 0x4cd79963    # 1.13036056E8f

    xor-int v1, v1, v22

    const v22, -0x2f56b050

    xor-int v9, v9, v22

    move-object/from16 v31, v23

    move-object/from16 v23, v2

    move/from16 v2, v28

    move-object/from16 v28, v31

    move/from16 v32, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v27

    move/from16 v27, v9

    goto/16 :goto_10

    :sswitch_12
    move-object/from16 v27, v3

    move/from16 v21, v5

    move/from16 v9, v19

    move-object/from16 v3, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v31

    .line 124
    invoke-static {}, Ll/᩹ᩴۡ;->֫()J

    move-result-wide v4

    move-object/from16 v19, v2

    iget-wide v1, v0, Ll/᩸ᩴۡ;->ۜ:J

    cmp-long v22, v1, v4

    if-eqz v22, :cond_f

    move-wide v4, v1

    goto/16 :goto_d

    :cond_f
    const-string v4, "\u06db\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v5, v4, v24

    mul-int/lit16 v5, v5, 0x3665

    const v22, 0x17e91177

    xor-int v5, v5, v22

    const v22, 0x5dc272ee

    xor-int v4, v4, v22

    move/from16 v31, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v27

    move/from16 v27, v4

    move/from16 v4, v31

    move-wide/from16 v32, v1

    move v1, v5

    move/from16 v5, v21

    move/from16 v2, v28

    move-wide/from16 v21, v32

    move-object/from16 v28, v23

    move-object/from16 v23, v19

    move/from16 v19, v9

    goto/16 :goto_0

    :sswitch_13
    return-void

    :sswitch_14
    move-object/from16 v27, v3

    move/from16 v20, v4

    move/from16 v9, v19

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    invoke-static {}, Ll/֫᩵;->ܰ۫ܺ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ll/᩸ᩴۡ;->ۢ:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const-string v1, "\u06da\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, -0x3fe7

    const v22, 0x165b0e07

    xor-int v3, v3, v22

    const v22, 0x5a5fb361

    xor-int v1, v1, v22

    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v3

    move-object/from16 v3, v31

    move/from16 v32, v20

    move-object/from16 v20, v2

    move/from16 v2, v28

    move-object/from16 v28, v23

    move-object/from16 v23, v19

    move/from16 v19, v9

    goto/16 :goto_10

    :cond_10
    move-object v3, v2

    :goto_d
    const-string v1, "\u06da\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x2b

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, -0x2293

    const v22, 0x25b98fd4

    xor-int v2, v2, v22

    const v22, 0x5328c9e2

    goto :goto_f

    :sswitch_15
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    const/16 v1, 0x5b72

    const/16 v14, 0x5b72

    goto :goto_e

    :sswitch_16
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    const/16 v1, 0x7779

    const/16 v14, 0x7779

    :goto_e
    const-string v1, "\u1a74\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, 0x57e1

    const v22, -0x1d68d1fe

    xor-int v2, v2, v22

    const v22, -0x6a3a6dc

    :goto_f
    xor-int v1, v1, v22

    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v2

    move/from16 v2, v28

    move-object/from16 v28, v23

    move-object/from16 v23, v19

    move/from16 v19, v9

    move/from16 v32, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v31

    :goto_10
    move-wide/from16 v33, v4

    move/from16 v4, v32

    move/from16 v5, v21

    move-wide/from16 v21, v33

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    add-int v1, v16, v17

    mul-int v1, v1, v1

    move/from16 v2, v16

    mul-int/lit16 v0, v2, 0x420c

    sub-int/2addr v0, v1

    if-lez v0, :cond_11

    const-string v0, "\u06e1\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x13c5

    const v16, -0x609fd5db

    xor-int v1, v1, v16

    const v16, -0x53401089

    goto :goto_11

    :cond_11
    const-string v0, "\u073f\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x8a1

    const v16, -0x421f13e8

    xor-int v1, v1, v16

    const v16, 0x652694dc

    :goto_11
    xor-int v0, v0, v16

    move/from16 v16, v2

    goto :goto_14

    :sswitch_18
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v23

    move-object/from16 v23, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move/from16 v21, v5

    move-wide/from16 v4, v31

    sget-object v0, Ll/᩸ᩴۡ;->ۤ᩹ۗ:[S

    const/4 v1, 0x0

    aget-short v16, v0, v1

    const/16 v17, 0x1083

    .line 135
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_12

    :goto_12
    const-string v0, "\u05ab\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, 0x23b5

    const v2, 0x5ac6cdc9

    xor-int/2addr v1, v2

    const v2, 0x75c81a90

    goto :goto_13

    :cond_12
    const-string v0, "\u06e7\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, -0x17

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x713f

    const v2, 0x13eaba24

    xor-int/2addr v1, v2

    const v2, 0x2e303172

    :goto_13
    xor-int/2addr v0, v2

    :goto_14
    move/from16 v2, v28

    move-object/from16 v28, v23

    move-object/from16 v23, v19

    move/from16 v19, v9

    move/from16 v31, v0

    move-object/from16 v0, p0

    move-object/from16 v32, v27

    move/from16 v27, v31

    move/from16 v33, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v32

    :goto_15
    move-wide/from16 v34, v4

    move/from16 v4, v33

    move/from16 v5, v21

    move-wide/from16 v21, v34

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ead54d6 -> :sswitch_12
        -0x75e9de81 -> :sswitch_10
        -0x72792de4 -> :sswitch_15
        -0x69a99a80 -> :sswitch_9
        -0x5e7950cb -> :sswitch_0
        -0x5bc4cb56 -> :sswitch_15
        -0x4e8def30 -> :sswitch_1
        -0x430ba5f1 -> :sswitch_f
        -0x4208bc1b -> :sswitch_7
        -0x407a3638 -> :sswitch_10
        -0x2fd36f88 -> :sswitch_a
        -0x2ea30f96 -> :sswitch_e
        -0x29999e2a -> :sswitch_11
        -0x18776c65 -> :sswitch_8
        -0x149015f2 -> :sswitch_14
        -0xfe21ab3 -> :sswitch_2
        -0x7a2b999 -> :sswitch_d
        -0x51d16f3 -> :sswitch_b
        -0x4897147 -> :sswitch_2
        0x108ae4d -> :sswitch_3
        0x16fe2f3 -> :sswitch_4
        0xda91b9c -> :sswitch_9
        0x10c8829a -> :sswitch_f
        0x17c0b442 -> :sswitch_a
        0x191821de -> :sswitch_13
        0x1bdb287e -> :sswitch_0
        0x1d23796c -> :sswitch_5
        0x27fa40b2 -> :sswitch_13
        0x28006912 -> :sswitch_b
        0x2abfe2e9 -> :sswitch_1
        0x34e07c31 -> :sswitch_6
        0x38256f55 -> :sswitch_4
        0x419d9211 -> :sswitch_11
        0x46add602 -> :sswitch_5
        0x4a39e8e8 -> :sswitch_6
        0x52db5a74 -> :sswitch_12
        0x573d96ce -> :sswitch_16
        0x5a722081 -> :sswitch_17
        0x5fdb5c8b -> :sswitch_c
        0x63407af2 -> :sswitch_18
        0x6983dd7e -> :sswitch_c
        0x6bd186a9 -> :sswitch_e
        0x6d171920 -> :sswitch_17
        0x6da2746f -> :sswitch_16
        0x6e7539f5 -> :sswitch_7
        0x72fbab83 -> :sswitch_14
        0x78926368 -> :sswitch_8
        0x7d4cabd4 -> :sswitch_3
        0x7dc4cd46 -> :sswitch_d
        0x7df13af5 -> :sswitch_18
    .end sparse-switch
.end method

.method public final ᩳ()V
    .locals 0

    .line 152
    invoke-static {p0}, Ll/ۘۨ;->ܺܿ᩺(Ljava/lang/Object;)V

    return-void
.end method
