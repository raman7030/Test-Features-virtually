.class public final Ll/ܳ۟ܽ;
.super Ljava/lang/Object;
.source "U7HQ"


# static fields
.field private static final ۗۤ᩸:[S


# instance fields
.field public ֫:Ll/ܿ۟ܽ;

.field public final ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    return-void

    :array_0
    .array-data 2
        0x1423s
        0x3112s
        0x317cs
        0x317ds
        0x3174s
        0x3171s
        0x3175s
        0x3171s
        0x316cs
        0x317ds
        0x316as
        0x3157s
        0x316as
        0x3171s
        0x317fs
        0x3171s
        0x3176s
        0x3179s
        0x3174s
        0x3130s
        0x3131s
        0x3122s
        0x3112s
        0x314cs
        0x316as
        0x3179s
        0x3176s
        0x316bs
        0x3174s
        0x3179s
        0x316cs
        0x317ds
        0x317cs
        0x3130s
        0x314cs
        0x316as
        0x3179s
        0x3176s
        0x316bs
        0x3174s
        0x3179s
        0x316cs
        0x3171s
        0x3177s
        0x3176s
        0x3138s
        0x317es
        0x3179s
        0x3171s
        0x3174s
        0x317ds
        0x317cs
        0x3122s
        0x3138s
        0x3136s
        0x3136s
        0x3136s
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/translation/TranslationEngine;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x54a3cb28

    sget v2, Ll/֡۬;->۠֡᩶:I

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x549

    const v6, -0x44890966

    xor-int/2addr v5, v6

    const v6, -0x26c1eb6c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x22a1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 5
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    .line 10
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_4

    .line 8
    :sswitch_1
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_8

    goto/16 :goto_4

    .line 22
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_1
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x407d

    const v6, -0x2dd9864

    xor-int/2addr v5, v6

    const v6, -0x634424d2

    goto :goto_0

    .line 24
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 29
    :sswitch_5
    new-instance v4, Ll/ܿ۟ܽ;

    .line 17
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_3

    .line 29
    :cond_0
    iget v5, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->maxTranslationTextLength:I

    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object p1, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->textLengthCalculator:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    invoke-direct {v4, p0, v5, p1}, Ll/ܿ۟ܽ;-><init>(Ll/ܳ۟ܽ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V

    iput-object v4, p0, Ll/ܳ۟ܽ;->֫:Ll/ܿ۟ܽ;

    return-void

    :cond_2
    const-string v4, "\u073f\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb37

    const v6, -0x4b0ea80d

    xor-int/2addr v5, v6

    const v6, -0x57659b52

    goto :goto_0

    :sswitch_6
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u0730\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x35b1

    const v6, -0xb1ccb01

    xor-int/2addr v5, v6

    const v6, 0x5e0d490a

    goto/16 :goto_0

    .line 21
    :sswitch_7
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06ec\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2233

    const v6, 0x41b3a506

    xor-int/2addr v5, v6

    const v6, -0x66596c3b

    goto/16 :goto_0

    .line 8
    :sswitch_8
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_6

    :cond_5
    :goto_2
    const-string v4, "\u06dc\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7611

    const v6, -0x27957bea

    xor-int/2addr v5, v6

    const v6, 0x3d5e01d5

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u05a8\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x788f

    const v6, -0x390af451

    xor-int/2addr v5, v6

    const v6, -0x63eb4fd0

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u1a7a\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2ae5

    const v6, 0x1dd8a255

    xor-int/2addr v5, v6

    const v6, 0x7273b51e

    goto/16 :goto_0

    .line 14
    :sswitch_a
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_9

    :cond_8
    const-string v4, "\u06ec\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x53ad

    const v6, 0x32d83084

    xor-int/2addr v5, v6

    const v6, 0x65333059

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a75\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e07

    const v6, -0x22e50a79

    xor-int/2addr v5, v6

    const v6, -0x352ddafd    # -6886017.5f

    goto/16 :goto_0

    .line 10
    :sswitch_b
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06e1\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5ab

    const v6, -0x4e7495b9

    xor-int/2addr v5, v6

    const v6, -0x1a85f8aa

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x688f

    const v6, 0x608598c6

    xor-int/2addr v5, v6

    const v6, -0x64ec57b9

    goto/16 :goto_0

    .line 25
    :sswitch_c
    iput-object p1, p0, Ll/ܳ۟ܽ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 27
    invoke-interface {p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object v0

    .line 14
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e2\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x37f

    const v6, -0x31c8ebbd    # -7.678896E8f

    xor-int/2addr v5, v6

    const v6, 0x6bbc99b5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0730\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9c5

    const v6, -0x5c6b3a96

    xor-int/2addr v5, v6

    const v6, 0x36ca2c8f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c723f08 -> :sswitch_c
        -0x77296073 -> :sswitch_8
        -0x6f9e0eb6 -> :sswitch_9
        -0x6afec9f9 -> :sswitch_b
        -0x613c8689 -> :sswitch_c
        -0x611bc37d -> :sswitch_5
        -0x50e0d451 -> :sswitch_8
        -0x4035cbc9 -> :sswitch_0
        -0x3e5c5e98 -> :sswitch_a
        -0x3d9e8022 -> :sswitch_b
        -0x3aee2216 -> :sswitch_1
        -0x2ed1811e -> :sswitch_1
        -0x1204ae70 -> :sswitch_0
        -0x25f7609 -> :sswitch_3
        -0x6df588 -> :sswitch_7
        0x301ef6c8 -> :sswitch_4
        0x32427bff -> :sswitch_2
        0x4e45c882 -> :sswitch_3
        0x541e2709 -> :sswitch_4
        0x545f1305 -> :sswitch_7
        0x5cf74c5e -> :sswitch_6
        0x63298664 -> :sswitch_5
        0x79f8d9e0 -> :sswitch_a
        0x7c00e9c5 -> :sswitch_9
        0x7c34b47d -> :sswitch_6
        0x7dd8af64 -> :sswitch_2
    .end sparse-switch
.end method

.method public static ֫(Z[Ljava/lang/String;)Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const v15, 0x3c4c802

    sget v16, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v17, Ll/ۙۨ;->ۡۗۙ:I

    const-string v18, "\u06ec\u06d6"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, -0x3695

    const v20, -0x4cf1a3f0

    xor-int v1, v1, v20

    const v20, -0x61e6ef1c

    xor-int v18, v18, v20

    move-object v7, v6

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x3c4c802

    const/16 v20, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v3, v18, v17

    mul-int/lit16 v3, v3, 0x5225

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    .line 147
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V

    return-object v0

    .line 53
    :sswitch_0
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v1, :cond_f

    goto/16 :goto_7

    .line 23
    :sswitch_1
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v1, :cond_11

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-gez v1, :cond_d

    goto/16 :goto_5

    .line 47
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v1

    if-lez v1, :cond_4

    goto/16 :goto_5

    .line 49
    :sswitch_4
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_5

    .line 23
    :sswitch_5
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_6
    add-int/lit8 v9, v9, 0x1

    move v10, v14

    move v13, v15

    goto/16 :goto_3

    :sswitch_7
    add-int/lit8 v1, v13, 0x1

    if-le v1, v10, :cond_0

    move v14, v1

    move v15, v14

    goto :goto_1

    :cond_0
    move v15, v1

    move v14, v10

    goto :goto_1

    :sswitch_8
    const/4 v1, 0x0

    move v14, v10

    const/4 v15, 0x0

    :goto_1
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x2b03

    const v19, 0x2214f388

    xor-int v3, v3, v19

    const v19, 0x4f2744bb

    goto/16 :goto_a

    :sswitch_9
    add-int/lit8 v1, v10, 0x1

    move v11, v1

    goto :goto_2

    :sswitch_a
    add-int/lit8 v4, v4, 0x1

    move v5, v11

    goto/16 :goto_4

    .line 131
    :sswitch_b
    invoke-static {v7, v9}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v12, :cond_1

    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x40b7

    const v19, 0x720abfb3

    xor-int v3, v3, v19

    const v19, -0x4963ddcb

    goto/16 :goto_a

    :cond_1
    const-string v1, "\u073a\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5859

    const v19, 0x51206881

    xor-int v3, v3, v19

    const v19, -0x6295f509

    goto/16 :goto_a

    :sswitch_c
    if-lt v10, v5, :cond_2

    const-string v1, "\u06e1\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x5165

    const v19, -0x2fa2a354

    xor-int v3, v3, v19

    const v19, 0x5bb2959f

    goto/16 :goto_a

    :cond_2
    move v11, v5

    :goto_2
    const-string v1, "\u05a8\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x72eb

    const v19, 0x1ab0bfa5

    xor-int v3, v3, v19

    const v19, -0x3fac0543

    goto/16 :goto_a

    .line 130
    :sswitch_d
    invoke-static {v7}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    if-ge v9, v1, :cond_3

    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xb

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2ccf

    const v19, 0x7777532f

    xor-int v3, v3, v19

    const v19, 0x27965eeb

    goto/16 :goto_a

    :cond_3
    const-string v1, "\u05a8\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x7d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x7177

    const v19, 0x3bd0be8f

    xor-int v3, v3, v19

    const v19, 0x25fefea6

    goto/16 :goto_a

    :sswitch_e
    const/4 v1, 0x0

    const/4 v3, 0x0

    move v9, v8

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_3
    const-string v1, "\u1a78\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x3033

    const v19, -0x7095d908

    xor-int v3, v3, v19

    const v19, -0x201b2088

    goto/16 :goto_a

    .line 127
    :sswitch_f
    aget-object v7, v0, v4

    const/4 v8, 0x0

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-ltz v1, :cond_5

    :cond_4
    const-string v1, "\u06db\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x3f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x1225

    const v19, -0x71449d42

    xor-int v3, v3, v19

    const v19, -0x1eb92b12

    goto/16 :goto_a

    :cond_5
    const-string v1, "\u06df\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x5d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x49bf

    const v19, -0x516115ac

    xor-int v3, v3, v19

    const v19, 0x6b328c88

    goto/16 :goto_a

    .line 145
    :sswitch_10
    new-array v6, v5, [C

    .line 146
    invoke-static {v6, v12}, Ljava/util/Arrays;->fill([CC)V

    .line 14
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06d8\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x2269

    const v19, 0x67675934

    xor-int v3, v3, v19

    const v19, 0x452d2386

    goto/16 :goto_a

    :sswitch_11
    if-ge v4, v2, :cond_7

    const-string v1, "\u1a76\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x26a3

    const v19, -0x41d0d5f7

    xor-int v3, v3, v19

    const v19, 0x77142ed8

    goto/16 :goto_a

    :cond_7
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x559

    const v19, -0x53125aa9

    xor-int v3, v3, v19

    const v19, -0x4caaf8bb

    goto/16 :goto_a

    :sswitch_12
    const/4 v1, 0x0

    move/from16 v5, v20

    const/4 v4, 0x0

    :goto_4
    const-string v1, "\u06d7\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x6f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x1891

    const v19, -0x498e5c28

    xor-int v3, v3, v19

    const v19, 0x41780538

    goto/16 :goto_a

    .line 117
    :sswitch_13
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u06e4\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2457

    const v19, -0x76249aa1

    xor-int v3, v3, v19

    const v19, 0x5ce05c2c

    goto/16 :goto_a

    .line 112
    :sswitch_14
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x2089

    const v19, 0x3720d1dd

    xor-int v3, v3, v19

    const v19, -0x1c412e56

    goto/16 :goto_a

    .line 133
    :sswitch_15
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_a

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u073a\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x25

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x4ce5

    const v19, 0x2e8afd0a

    xor-int v3, v3, v19

    const v19, 0x1a46f8fb

    goto/16 :goto_a

    .line 122
    :sswitch_16
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x1f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x438b

    const v19, 0x5315f35f

    xor-int v3, v3, v19

    const v19, -0x5043fce8

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u05ab\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x6f

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x1b4f

    const v19, 0x8caa69f

    xor-int v3, v3, v19

    const v19, 0xcb30548

    goto/16 :goto_a

    :sswitch_17
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_c

    :goto_6
    const-string v1, "\u06da\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x3d

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x2591

    const v19, -0x314d3710

    xor-int v3, v3, v19

    const v19, -0x56393c94

    goto/16 :goto_a

    :cond_c
    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0xd

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6d87

    const v19, -0x797b889f

    xor-int v3, v3, v19

    const v19, -0x735e956d

    goto/16 :goto_a

    .line 32
    :sswitch_18
    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v1, :cond_e

    :cond_d
    :goto_7
    const-string v1, "\u073a\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x60e1

    const v19, -0x4efade2b

    xor-int v3, v3, v19

    const v19, 0x6dad09aa

    goto/16 :goto_a

    :cond_e
    const-string v1, "\u073d\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x61

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x28f7

    const v19, -0x48c14894

    xor-int v3, v3, v19

    const v19, -0x21e2e20d

    goto/16 :goto_a

    .line 60
    :sswitch_19
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_10

    :cond_f
    const-string v1, "\u1a79\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0xec9

    const v19, -0x2865515f

    xor-int v3, v3, v19

    const v19, 0x198c35d8

    goto/16 :goto_a

    :cond_10
    const-string v1, "\u06d8\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x13bb

    const v19, 0x525fb928

    xor-int v3, v3, v19

    const v19, 0x12c71af4

    goto/16 :goto_a

    .line 127
    :sswitch_1a
    array-length v2, v0

    const/16 v20, 0x8

    .line 132
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_12

    :cond_11
    :goto_8
    const-string v1, "\u1a77\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x49ad

    const v19, 0x11c4d58d

    xor-int v3, v3, v19

    const v19, 0x5ceda7f5

    goto :goto_a

    :cond_12
    const-string v1, "\u073f\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5ceb

    const v19, -0x1ac2e5f1

    xor-int v3, v3, v19

    const v19, 0x654e8608

    goto :goto_a

    :sswitch_1b
    const/16 v1, 0x2d

    const/16 v12, 0x2d

    goto :goto_9

    :sswitch_1c
    const/16 v1, 0x3d

    const/16 v12, 0x3d

    :goto_9
    const-string v1, "\u1a79\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x5d1b

    const v19, 0x5b19ff81

    xor-int v3, v3, v19

    const v19, 0x4ab78eac    # 6014806.0f

    goto :goto_a

    :sswitch_1d
    if-eqz p0, :cond_13

    const-string v1, "\u0733\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1b89

    const v19, 0x57ef84b4

    xor-int v3, v3, v19

    const v19, 0x690ddb2f

    goto :goto_a

    :cond_13
    const-string v1, "\u06da\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x9

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x7fdf

    const v19, -0x499c5e4d

    xor-int v3, v3, v19

    const v19, 0x35a934b2

    :goto_a
    xor-int v19, v1, v19

    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cbbfa8f -> :sswitch_14
        -0x75ae16e9 -> :sswitch_11
        -0x72fe811d -> :sswitch_5
        -0x6bbd428b -> :sswitch_13
        -0x6833aa15 -> :sswitch_18
        -0x67de604a -> :sswitch_7
        -0x62177ce4 -> :sswitch_10
        -0x615ba65b -> :sswitch_6
        -0x5bb64125 -> :sswitch_12
        -0x524b4856 -> :sswitch_0
        -0x4f5b5388 -> :sswitch_1d
        -0x4c28721c -> :sswitch_8
        -0x35af1ada -> :sswitch_11
        -0x33ca9e61 -> :sswitch_9
        -0x3135b8ac -> :sswitch_b
        -0x2dbb9fdb -> :sswitch_c
        -0x2cfc362f -> :sswitch_16
        -0x293fa1c1 -> :sswitch_13
        -0x25bba61c -> :sswitch_b
        -0x1c99c8c2 -> :sswitch_16
        -0x196e2655 -> :sswitch_1b
        -0x19176db4 -> :sswitch_a
        -0x164fb3de -> :sswitch_e
        -0x12eacd69 -> :sswitch_14
        -0xe28b57c -> :sswitch_a
        -0xb06d7a5 -> :sswitch_19
        -0x7dc57e4 -> :sswitch_1d
        -0x6117e74 -> :sswitch_d
        -0x5b67b67 -> :sswitch_15
        0x733534 -> :sswitch_4
        0x2a5650f -> :sswitch_f
        0x76ef6ae -> :sswitch_5
        0x81eda9c -> :sswitch_c
        0x12e30fcb -> :sswitch_1a
        0x14e83e06 -> :sswitch_9
        0x1be2273e -> :sswitch_8
        0x2700a584 -> :sswitch_10
        0x361c63f0 -> :sswitch_18
        0x37326fa7 -> :sswitch_1
        0x386a9082 -> :sswitch_15
        0x40b56b1e -> :sswitch_7
        0x43108eb2 -> :sswitch_3
        0x47b05cdd -> :sswitch_1b
        0x4bf30025 -> :sswitch_19
        0x4fdf7c35 -> :sswitch_d
        0x50af7497 -> :sswitch_1c
        0x51accb62 -> :sswitch_f
        0x5a191a9f -> :sswitch_17
        0x62afa64f -> :sswitch_3
        0x693a0547 -> :sswitch_1c
        0x69436ad5 -> :sswitch_4
        0x699c46f5 -> :sswitch_6
        0x6aec1f2a -> :sswitch_2
        0x6b7e0ed3 -> :sswitch_17
        0x6c0f6a3e -> :sswitch_1a
        0x6ca95116 -> :sswitch_0
        0x6e11ba4f -> :sswitch_e
        0x725de15d -> :sswitch_12
        0x793f6af1 -> :sswitch_1
        0x7a55427d -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Ll/ܿ۟ܽ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܳ۟ܽ;->֫:Ll/ܿ۟ܽ;

    return-object v0
.end method

.method public final ֫([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 36

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const v25, 0x2483ca84

    sget v26, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v27, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v28, "\u1a7a\u1a79"

    invoke-static/range {v28 .. v28}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v28

    xor-int v28, v28, v27

    xor-int v1, v28, v26

    mul-int/lit16 v1, v1, 0x65d7

    const v30, 0x413331c1

    xor-int v1, v1, v30

    const v30, 0x114cccf8

    xor-int v28, v28, v30

    move-object v5, v4

    move-object/from16 v25, v7

    move-object v11, v10

    move-object v13, v12

    move-object v14, v15

    move-object/from16 v10, v17

    move-object/from16 v19, v18

    move/from16 v29, v28

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v28, 0x2483ca84

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v17, v2

    move-object v4, v3

    move-object v7, v6

    move-object/from16 v18, v9

    move-object/from16 v3, v16

    const/4 v2, 0x0

    move-object v9, v8

    move-object/from16 v8, v24

    const/16 v24, 0x0

    :goto_0
    xor-int v6, v28, v26

    mul-int/lit16 v6, v6, 0x7dcf

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v28, v29, v1

    sparse-switch v28, :sswitch_data_0

    .line 0
    new-instance v0, Ljava/lang/NullPointerException;

    sget-object v1, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    const/4 v2, 0x2

    const/16 v3, 0x9

    invoke-static {v1, v2, v3, v15}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    goto/16 :goto_6

    :cond_1
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    goto/16 :goto_8

    .line 85
    :sswitch_1
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v1, :cond_4

    goto :goto_1

    .line 57
    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :sswitch_3
    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v1, :cond_2

    :goto_2
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    :goto_3
    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move/from16 v3, v31

    move/from16 v17, v2

    goto/16 :goto_17

    :cond_2
    :goto_4
    const-string v1, "\u073f\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v26

    mul-int/lit8 v1, v1, 0x11

    xor-int v6, v1, v27

    mul-int/lit16 v6, v6, -0x793b

    const v29, 0x2cf9eab6

    xor-int v6, v6, v29

    const v29, 0x6a67a487    # 7.0009706E25f

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u06d8\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v27, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v6, v1, v26

    mul-int/lit16 v6, v6, -0x39f3

    const v29, -0x3bf548bc

    xor-int v6, v6, v29

    const v29, 0x14a705b9

    goto :goto_5

    :sswitch_5
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto :goto_2

    :sswitch_6
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_7
    const/16 v1, 0x36

    const/4 v3, 0x3

    .line 89
    invoke-static {v8, v1, v3, v15}, Ll/֨֫;->ۚܺ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    goto/16 :goto_a

    :sswitch_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x63

    invoke-static {v9, v2, v1}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v8, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_5

    :cond_4
    const-string v1, "\u0736\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    mul-int/lit8 v1, v1, -0x7f

    xor-int v6, v1, v26

    mul-int/lit16 v6, v6, 0x2e67

    const v29, -0x7d817c7f

    xor-int v6, v6, v29

    const v29, 0x4c8c202f    # 7.3466232E7f

    goto :goto_5

    :cond_5
    const-string v1, "\u06e8\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v6, v1, v26

    mul-int/lit16 v6, v6, -0x23d1

    const v29, -0x5e761cd0

    xor-int v6, v6, v29

    const v29, -0x7eb81a9a

    :goto_5
    xor-int v29, v1, v29

    move v1, v6

    goto/16 :goto_0

    .line 91
    :sswitch_9
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    const/16 v2, 0x22

    const/16 v4, 0x14

    invoke-static {v1, v2, v4, v15}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v1, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :sswitch_a
    invoke-static/range {v30 .. v30}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v6, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    .line 43
    sget-boolean v29, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v29, :cond_6

    goto/16 :goto_2

    :cond_6
    move-object/from16 v29, v3

    const/16 v3, 0x17

    move-object/from16 v32, v8

    const/16 v8, 0xb

    .line 85
    invoke-static {v6, v3, v8, v15}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v3

    .line 42
    sget v6, Ll/֡۬;->۠֡᩶:I

    if-gtz v6, :cond_7

    :goto_6
    const-string v1, "\u05ab\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v3, v1, v27

    mul-int/lit16 v3, v3, 0x7d89

    const v6, 0x568f06ea

    xor-int/2addr v3, v6

    const v6, -0x452001af    # -0.0017089342f

    xor-int/2addr v1, v6

    goto/16 :goto_10

    .line 85
    :cond_7
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v11

    invoke-static {v1, v3}, Ll/֡۬;->֨ۙ֨(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v1, v14}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v9}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/String;)V

    move-object/from16 v1, v30

    move/from16 v3, v31

    goto/16 :goto_b

    :sswitch_b
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    .line 84
    sget-object v1, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    const/16 v3, 0x14

    const/4 v6, 0x3

    invoke-static {v1, v3, v6, v15}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v1, v30

    invoke-static {v1, v14}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, v7}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move/from16 v3, v31

    move-object/from16 v18, v1

    :goto_7
    move/from16 v17, v2

    goto/16 :goto_18

    :cond_8
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v27, v3

    mul-int/lit8 v3, v3, -0x1b

    xor-int v6, v3, v26

    mul-int/lit16 v6, v6, 0x193f

    const v8, -0x13c3a186

    xor-int/2addr v6, v8

    const v8, -0x155ce906

    goto :goto_9

    :sswitch_c
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v3, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    const/16 v6, 0xb

    const/16 v8, 0x9

    invoke-static {v3, v6, v8, v15}, Ll/֫ܿ;->ܰ᩷ۤ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 25
    sget-boolean v6, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v6, :cond_9

    :goto_8
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, -0x2d

    xor-int v3, v1, v27

    mul-int/lit16 v3, v3, 0x5a0d

    const v6, -0x3f2141f6

    xor-int/2addr v3, v6

    const v6, -0x50cff59f

    xor-int/2addr v1, v6

    move-object/from16 v8, v32

    const/16 v30, 0x0

    goto/16 :goto_11

    .line 84
    :cond_9
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v0

    invoke-static {v1, v3}, Ll/֡֡;->᩹᩻ܽ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 49
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_a

    move-object/from16 v30, v1

    goto/16 :goto_3

    :cond_a
    const-string v3, "\u1a79\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v26

    mul-int/lit8 v3, v3, 0x71

    xor-int v6, v3, v27

    mul-int/lit16 v6, v6, 0x1c73

    const v8, -0x29a7f7a6

    xor-int/2addr v6, v8

    const v8, -0x7f15a779

    :goto_9
    xor-int/2addr v3, v8

    move-object/from16 v30, v1

    move v1, v6

    move-object/from16 v8, v32

    move-object/from16 v34, v29

    move/from16 v29, v3

    goto/16 :goto_12

    :sswitch_d
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    .line 88
    invoke-static {v9}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    const/16 v6, 0x64

    if-le v3, v6, :cond_b

    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v26

    mul-int/lit8 v3, v3, -0x49

    xor-int v6, v3, v27

    mul-int/lit16 v6, v6, -0x483b

    const v8, 0x683229cc    # 3.365409E24f

    xor-int/2addr v6, v8

    const v8, 0x471a604d

    goto :goto_9

    :cond_b
    move-object v3, v9

    :goto_a
    const-string v6, "\u1a7a\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v27

    mul-int/lit8 v6, v6, 0x47

    xor-int v8, v6, v26

    mul-int/lit16 v8, v8, 0x1b2d

    const v29, 0x12fd9a83

    xor-int v8, v8, v29

    const v29, 0xbf06cd

    xor-int v29, v6, v29

    move-object/from16 v30, v1

    move v1, v8

    goto/16 :goto_15

    :sswitch_e
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    .line 0
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    aget-object v3, v0, v12

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v31

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    .line 78
    invoke-static {v3, v0}, Ll/ܳ۟ܽ;->֫(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    move-object/from16 v17, v6

    move-object/from16 v8, v18

    const/16 v24, 0x1

    move-object/from16 v18, v1

    goto/16 :goto_13

    :sswitch_10
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    .line 82
    invoke-interface/range {v25 .. v25}, Lbin/mt/plugin/api/translation/TranslationEngine;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v13

    if-eqz v13, :cond_c

    const-string v6, "\u06d7\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v26

    mul-int/lit8 v6, v6, 0x27

    xor-int v8, v6, v27

    mul-int/lit16 v8, v8, 0x3fa5

    const v30, 0x29f7fb13

    xor-int v8, v8, v30

    const v30, -0x237f00b0

    goto/16 :goto_d

    :cond_c
    :goto_b
    const-string v6, "\u1a79\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v27

    xor-int v8, v6, v26

    mul-int/lit16 v8, v8, 0x746b

    const v30, -0x4c3e5f1

    xor-int v8, v8, v30

    const v30, 0x60bc4914

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    .line 0
    array-length v6, v0

    if-ge v12, v6, :cond_d

    const-string v6, "\u1a73\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v26

    mul-int/lit8 v6, v6, -0x37

    xor-int v8, v6, v27

    mul-int/lit16 v8, v8, 0x4985

    const v30, -0x675eb884

    xor-int v8, v8, v30

    const v30, -0x1da193df

    goto :goto_d

    :cond_d
    move/from16 v31, v3

    move-object/from16 v8, v18

    move-object/from16 v18, v1

    goto/16 :goto_e

    :sswitch_12
    return-object v11

    :sswitch_13
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    if-nez v24, :cond_e

    const-string v6, "\u073d\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v27, v6

    mul-int/lit8 v6, v6, 0xf

    xor-int v8, v6, v26

    mul-int/lit16 v8, v8, -0x2da7

    const v30, 0x417f84d7

    xor-int v8, v8, v30

    const v30, -0x4cdfc290

    goto :goto_d

    :cond_e
    const-string v6, "\u1a77\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v26

    xor-int v8, v6, v27

    mul-int/lit16 v8, v8, -0x6b31

    const v30, -0x24008738

    xor-int v8, v8, v30

    const v30, -0x7c9ff1da

    goto :goto_d

    :sswitch_14
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    aget-object v6, v0, v2

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    const/4 v12, 0x1

    :goto_c
    const-string v6, "\u1a78\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v27

    mul-int/lit8 v6, v6, 0x7f

    xor-int v8, v6, v26

    mul-int/lit16 v8, v8, 0x16d1

    const v30, 0x6d9375bc

    xor-int v8, v8, v30

    const v30, 0x2e949c20

    :goto_d
    xor-int v6, v6, v30

    move-object/from16 v30, v1

    move/from16 v31, v3

    move v1, v8

    move-object/from16 v3, v29

    move-object/from16 v8, v32

    move/from16 v29, v6

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v1, v30

    move/from16 v3, v31

    const/4 v6, -0x1

    move-object/from16 v8, v18

    .line 70
    invoke-virtual {v9, v8, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v11

    .line 72
    array-length v6, v11

    move-object/from16 v18, v1

    array-length v1, v0

    if-ne v6, v1, :cond_f

    const-string v1, "\u06ec\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, -0x2f

    xor-int v6, v1, v27

    mul-int/lit16 v6, v6, -0x4479

    const v30, 0x35118299

    xor-int v6, v6, v30

    const v30, -0x19aebaf5

    goto/16 :goto_14

    :cond_f
    const-string v1, "\u073d\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v27

    mul-int/lit8 v1, v1, 0x5

    xor-int v6, v1, v26

    mul-int/lit16 v6, v6, 0x743b

    const v30, 0x62360b53

    xor-int v6, v6, v30

    const v30, -0x6ab76273

    goto/16 :goto_14

    :sswitch_16
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v18, v30

    move/from16 v3, v31

    .line 0
    invoke-static {v5}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    .line 68
    iget-object v6, v1, Ll/ܳ۟ܽ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    invoke-interface {v6, v7, v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 70
    invoke-static {v4}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    .line 87
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v31

    if-nez v31, :cond_10

    move-object/from16 v9, v25

    move-object/from16 v8, v30

    move-object/from16 v25, v6

    move-object/from16 v6, v17

    goto/16 :goto_7

    :cond_10
    const-string v31, "\u073a\u1a79"

    invoke-static/range {v31 .. v31}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v26

    xor-int v1, v31, v27

    mul-int/lit16 v1, v1, -0x2199

    const v33, 0x3cd380d9

    xor-int v1, v1, v33

    const v33, 0x2d41568b    # 1.0989996E-11f

    xor-int v31, v31, v33

    move-object/from16 v9, v25

    move-object/from16 v8, v32

    move-object/from16 v25, v6

    move/from16 v34, v31

    move/from16 v31, v3

    move-object/from16 v3, v29

    move/from16 v29, v34

    move-object/from16 v35, v30

    move-object/from16 v30, v18

    move-object/from16 v18, v35

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    .line 0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, v0

    const/16 v31, 0x1

    if-lez v1, :cond_11

    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    mul-int/lit8 v1, v1, 0x77

    xor-int v3, v1, v26

    mul-int/lit16 v3, v3, -0x2ce7

    const v6, -0x5b2c4f53

    xor-int/2addr v3, v6

    const v6, 0x5346c479

    goto :goto_f

    :cond_11
    :goto_e
    const-string v1, "\u1a79\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    mul-int/lit8 v1, v1, -0x9

    xor-int v3, v1, v27

    mul-int/lit16 v3, v3, 0x78cf

    const v6, 0x79a22ef6

    xor-int/2addr v3, v6

    const v6, -0x5b19a463

    :goto_f
    xor-int/2addr v1, v6

    move-object/from16 v30, v18

    move-object/from16 v18, v8

    :goto_10
    move-object/from16 v8, v32

    :goto_11
    move-object/from16 v34, v29

    move/from16 v29, v1

    move v1, v3

    :goto_12
    move-object/from16 v3, v34

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    .line 62
    sget-object v1, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    const/4 v4, 0x1

    const/4 v6, 0x1

    invoke-static {v1, v4, v6, v15}, Ll/ۘܿ;->ۢۙۨ([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v6, v17

    .line 0
    invoke-static {v1, v6, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_12

    const-string v1, "\u0730\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    mul-int/lit8 v1, v1, -0x3d

    move/from16 v17, v2

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x653b

    const v30, -0x35d1ecd9

    xor-int v2, v2, v30

    const v30, 0x10925c5

    goto/16 :goto_19

    :cond_12
    move/from16 v17, v2

    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, -0x2f71

    const v30, -0x7c8cb2ff

    xor-int v2, v2, v30

    const v30, 0x27fb84bb

    goto/16 :goto_19

    :sswitch_19
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    const/4 v1, 0x0

    .line 62
    invoke-static {v1, v0}, Ll/ܳ۟ܽ;->֫(Z[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    move-object/from16 v17, v2

    const/4 v2, 0x0

    const/16 v24, 0x0

    :goto_13
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v6, v1, v27

    mul-int/lit16 v6, v6, -0x2e25

    const v30, -0x43ef4b64

    xor-int v6, v6, v30

    const v30, 0x3b9c2a9c

    :goto_14
    xor-int v1, v1, v30

    move/from16 v31, v3

    move-object/from16 v30, v18

    move-object/from16 v3, v29

    move/from16 v29, v1

    move v1, v6

    move-object/from16 v18, v8

    :goto_15
    move-object/from16 v8, v32

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    const v1, 0xfae0    # 8.9997E-41f

    const v15, 0xfae0    # 8.9997E-41f

    goto :goto_16

    :sswitch_1b
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    const/16 v1, 0x3118

    const/16 v15, 0x3118

    :goto_16
    const-string v1, "\u1a76\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x6205

    const v30, -0x16cc6c7f

    xor-int v2, v2, v30

    const v30, 0x14f17075

    goto/16 :goto_19

    :sswitch_1c
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    add-int v1, v20, v23

    mul-int v1, v1, v1

    sub-int v1, v1, v22

    if-gtz v1, :cond_13

    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v26

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x5701

    const v30, -0x48db1088

    xor-int v2, v2, v30

    const v30, 0x5d797e8

    goto/16 :goto_19

    :cond_13
    const-string v1, "\u06d8\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x356d

    const v30, 0x55e119e1

    xor-int v2, v2, v30

    const v30, 0x2e17b5fd

    goto/16 :goto_19

    :sswitch_1d
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    const v1, 0x174f90

    add-int v1, v21, v1

    add-int v22, v1, v1

    const/16 v23, 0x4d4

    .line 59
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_14

    move-object/from16 v30, v18

    :goto_17
    const-string v1, "\u05ab\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x27b5

    const v18, -0x1706d8f

    xor-int v2, v2, v18

    const v18, -0x2cdd0bf6

    xor-int v1, v1, v18

    move/from16 v31, v3

    move-object/from16 v18, v8

    move-object/from16 v3, v29

    move-object/from16 v8, v32

    move/from16 v29, v1

    move v1, v2

    move/from16 v2, v17

    goto/16 :goto_1a

    :cond_14
    const-string v1, "\u06dc\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, -0x443

    const v30, -0x23d97ecb

    xor-int v2, v2, v30

    const v30, -0x38836e9e

    goto/16 :goto_19

    :sswitch_1e
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    const/4 v1, 0x0

    aget-short v20, v19, v1

    mul-int v21, v20, v20

    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_15

    goto :goto_18

    :cond_15
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x64c1

    const v30, 0x60453767

    xor-int v2, v2, v30

    const v30, 0x31855798

    goto :goto_19

    :sswitch_1f
    move-object/from16 v29, v3

    move-object/from16 v32, v8

    move-object/from16 v6, v17

    move-object/from16 v8, v18

    move-object/from16 v18, v30

    move/from16 v3, v31

    move/from16 v17, v2

    sget-object v19, Ll/ܳ۟ܽ;->ۗۤ᩸:[S

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v1

    if-eqz v1, :cond_16

    :goto_18
    const-string v1, "\u06ec\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, 0x2a23

    const v30, 0x1ca4eb3a

    xor-int v2, v2, v30

    const v30, -0x27e74dc5

    goto :goto_19

    :cond_16
    const-string v1, "\u06d9\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, 0x2dfd

    const v30, -0x7eacb8da

    xor-int v2, v2, v30

    const v30, 0xfef5c1c

    :goto_19
    xor-int v1, v1, v30

    move/from16 v31, v3

    move-object/from16 v30, v18

    move-object/from16 v3, v29

    move/from16 v29, v1

    move v1, v2

    move-object/from16 v18, v8

    move/from16 v2, v17

    move-object/from16 v8, v32

    :goto_1a
    move-object/from16 v17, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f462687 -> :sswitch_15
        -0x75a390c2 -> :sswitch_d
        -0x7534c920 -> :sswitch_4
        -0x728f80ef -> :sswitch_7
        -0x71ca44e4 -> :sswitch_1c
        -0x6bc73828 -> :sswitch_d
        -0x650d5f15 -> :sswitch_1
        -0x5d732685 -> :sswitch_b
        -0x56204a92 -> :sswitch_1e
        -0x533b377d -> :sswitch_14
        -0x51c3c6f4 -> :sswitch_16
        -0x45c38d7b -> :sswitch_1b
        -0x4531a57c -> :sswitch_17
        -0x3afd8640 -> :sswitch_1d
        -0x38a708f8 -> :sswitch_1d
        -0x34d6da22 -> :sswitch_3
        -0x337370ea -> :sswitch_0
        -0x2dcc92ae -> :sswitch_9
        -0x28cd6577 -> :sswitch_a
        -0x28bf6ea7 -> :sswitch_10
        -0x26541595 -> :sswitch_1e
        -0x256f6550 -> :sswitch_1a
        -0x2359254e -> :sswitch_a
        -0x1f39209f -> :sswitch_f
        -0x1ebc2b80 -> :sswitch_f
        -0x1bb4207f -> :sswitch_6
        -0x1b4b946f -> :sswitch_17
        -0x1a37bdd6 -> :sswitch_1f
        -0x192bc9d7 -> :sswitch_1b
        -0x170fac87 -> :sswitch_12
        -0x13636de1 -> :sswitch_2
        -0x1103137d -> :sswitch_3
        -0xfce2705 -> :sswitch_11
        -0x8ff30a7 -> :sswitch_9
        -0x6655c66 -> :sswitch_14
        -0x661d85d -> :sswitch_1a
        -0x4d3384f -> :sswitch_5
        -0x3f51c41 -> :sswitch_4
        -0x380bb57 -> :sswitch_2
        -0x2b52ae7 -> :sswitch_18
        0x7568808 -> :sswitch_8
        0x89af612 -> :sswitch_6
        0xd12a615 -> :sswitch_c
        0xea3bce4 -> :sswitch_e
        0x104daa50 -> :sswitch_e
        0x1399e14e -> :sswitch_c
        0x2c9fae1c -> :sswitch_0
        0x33fb8b0a -> :sswitch_1c
        0x40d19a80 -> :sswitch_19
        0x44aa2cb8 -> :sswitch_1f
        0x45a80727 -> :sswitch_8
        0x45c746be -> :sswitch_16
        0x47d0099f -> :sswitch_10
        0x53e33242 -> :sswitch_13
        0x5b121b39 -> :sswitch_13
        0x5ee57282 -> :sswitch_b
        0x5f449bc6 -> :sswitch_5
        0x6264b4da -> :sswitch_1
        0x636c86f6 -> :sswitch_11
        0x6bcc0c73 -> :sswitch_12
        0x6fbf523f -> :sswitch_18
        0x75c0d419 -> :sswitch_7
        0x77def189 -> :sswitch_19
        0x796208c3 -> :sswitch_15
    .end sparse-switch
.end method
