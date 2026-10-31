.class public final synthetic Ll/ۨۚ᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ll/֡ۜܳ;
.implements Ll/ۙ۫ۡ;
.implements Ll/ᩳ᩷ܳ;
.implements Ll/۠ۛ᩷;
.implements Ll/᩷ܿۖ;


# static fields
.field private static final ۠ܳۜ:[S


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨۚ᩷;->۠ܳۜ:[S

    return-void

    :array_0
    .array-data 2
        0x1b4ds
        -0x2d9bs
        -0x2dbes
        -0x2da6s
        -0x2db3s
        -0x2dc0s
        -0x2dbbs
        -0x2db8s
        -0x2df4s
        -0x2d97s
        -0x2dbes
        -0x2da7s
        -0x2dbfs
        -0x2d81s
        -0x2db7s
        -0x2da8s
        -0x2df4s
        -0x2da8s
        -0x2dabs
        -0x2da4s
        -0x2db7s
        -0x2deas
        -0x2df4s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x327608e2

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    const-string v6, "\u06e4\u06d9"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3ea7

    const v8, -0x157bea88

    xor-int/2addr v7, v8

    const v8, 0x930caa5

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x13e1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 211
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v6, :cond_e

    goto/16 :goto_5

    .line 298
    :sswitch_0
    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u06e2\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1eef

    const v8, -0x527cdb62

    xor-int/2addr v7, v8

    const v8, -0x79d122a6

    goto :goto_0

    .line 267
    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v6, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v6, :cond_b

    goto/16 :goto_2

    .line 432
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_9

    goto/16 :goto_2

    .line 435
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto/16 :goto_2

    .line 63
    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    const/4 p1, 0x0

    return-object p1

    .line 462
    :sswitch_5
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :sswitch_6
    const/4 p1, 0x0

    return-object p1

    .line 459
    :sswitch_7
    invoke-static {v2}, Ll/ۘۗ;->᩵ۜۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ll/۠;->ۙᩳۖ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "\u06db\u06d7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xf27

    const v8, -0x3968a7e3

    xor-int/2addr v7, v8

    const v8, -0x411ff4d7

    goto :goto_0

    .line 4
    :sswitch_8
    move-object v1, v0

    check-cast v1, Ljava/util/HashSet;

    .line 6
    move-object v2, p1

    check-cast v2, Ll/ܰ֫ۢ;

    .line 455
    invoke-interface {v2}, Ll/ܰ֫ۢ;->ܿ()Ll/۠ۛ֡;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_1
    const-string v6, "\u05a1\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3ef5

    const v8, 0xccec3b9

    xor-int/2addr v7, v8

    const v8, -0x1c02ae74

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06e7\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1ba5

    const v8, -0x6f441e0d

    xor-int/2addr v7, v8

    const v8, -0x403f810e

    goto/16 :goto_0

    .line 2
    :sswitch_9
    iget-object v0, p0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    .line 104
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v6, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v6, "\u06df\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5acf

    const v8, 0x6208d6b2

    xor-int/2addr v7, v8

    const v8, 0x7a7b6a1d

    goto/16 :goto_0

    .line 273
    :sswitch_a
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u1a7b\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2a81

    const v8, -0x39cdd6b2

    xor-int/2addr v7, v8

    const v8, 0x2367eae9

    goto/16 :goto_0

    .line 66
    :sswitch_b
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v6

    if-gtz v6, :cond_5

    goto :goto_2

    :cond_5
    const-string v6, "\u06e8\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2cc9

    const v8, 0x3bf08fa1

    xor-int/2addr v7, v8

    const v8, 0x7db78059

    goto/16 :goto_0

    .line 242
    :sswitch_c
    sget v6, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v6, :cond_6

    goto :goto_2

    :cond_6
    const-string v6, "\u1a7b\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4991

    const v8, 0x7273207b

    xor-int/2addr v7, v8

    const v8, -0x739d3403

    goto/16 :goto_0

    .line 117
    :sswitch_d
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v6

    if-gtz v6, :cond_7

    :goto_2
    const-string v6, "\u06ec\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x495d

    const v8, 0x5bea89ea

    xor-int/2addr v7, v8

    const v8, 0x1f393cde

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06da\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x32f1

    const v8, -0xb3f929a

    xor-int/2addr v7, v8

    const v8, 0x965ba8d

    goto/16 :goto_0

    .line 243
    :sswitch_e
    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v6, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v6, "\u05ab\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x76f

    const v8, 0x4b4d127d    # 1.3439613E7f

    xor-int/2addr v7, v8

    const v8, -0x10c09a00

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v6, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v6, :cond_a

    :cond_9
    :goto_3
    const-string v6, "\u05a8\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1d1b

    const v8, 0x11fe83f9

    xor-int/2addr v7, v8

    const v8, -0x48bba253

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e1\u073a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6add

    const v8, 0x1a05110

    xor-int/2addr v7, v8

    const v8, -0x10a1818c

    goto/16 :goto_0

    .line 390
    :sswitch_10
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v6

    if-gtz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u1a79\u06ec"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x31f9

    const v8, -0x76f0ea2f

    xor-int/2addr v7, v8

    const v8, -0x44dcbe59

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06df\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4fa9

    const v8, 0x1ca773e4

    xor-int/2addr v7, v8

    const v8, -0x393a5dee

    goto/16 :goto_0

    .line 432
    :sswitch_11
    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v6, :cond_d

    goto :goto_5

    :cond_d
    const-string v6, "\u06db\u1a78"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x61cb

    const v8, -0x3a65394a

    xor-int/2addr v7, v8

    const v8, 0xd7d7801

    goto/16 :goto_0

    :goto_5
    const-string v6, "\u1a77\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6595

    const v8, 0x1a8e4ef

    xor-int/2addr v7, v8

    const v8, -0x7f38cdd6

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u1a76\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x31

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3647

    const v8, 0x7c219147

    xor-int/2addr v7, v8

    const v8, 0x5c73713

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bb8bef1 -> :sswitch_6
        -0x6716e537 -> :sswitch_7
        -0x59d37ce3 -> :sswitch_11
        -0x569735b5 -> :sswitch_c
        -0x49ea710a -> :sswitch_a
        -0x49e300cf -> :sswitch_8
        -0x39b079c0 -> :sswitch_3
        -0x32a90054 -> :sswitch_3
        -0x306caf3a -> :sswitch_9
        -0x234fbaf1 -> :sswitch_9
        -0x1549ecdb -> :sswitch_d
        -0x151f8bd4 -> :sswitch_11
        -0x11875ade -> :sswitch_f
        -0x10ecbb7e -> :sswitch_7
        -0xc31eb3c -> :sswitch_4
        -0xb115c10 -> :sswitch_10
        0x3a9577d -> :sswitch_e
        0x3c82610 -> :sswitch_d
        0x3f1a4a0 -> :sswitch_1
        0xcae8416 -> :sswitch_b
        0x13578724 -> :sswitch_5
        0x22845bf3 -> :sswitch_10
        0x24281740 -> :sswitch_a
        0x245a3fee -> :sswitch_e
        0x2eadd3f8 -> :sswitch_4
        0x2f132b4d -> :sswitch_0
        0x31802a18 -> :sswitch_2
        0x3d394800 -> :sswitch_c
        0x4321e0e8 -> :sswitch_1
        0x44dbe0f5 -> :sswitch_5
        0x44e47a86 -> :sswitch_f
        0x4b0e117b -> :sswitch_6
        0x57d78f44 -> :sswitch_2
        0x60960541 -> :sswitch_b
        0x67adc538 -> :sswitch_8
        0x6c33fc12 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic cancel()V
    .locals 0

    return-void
.end method

.method public ֫()Landroid/graphics/Bitmap;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x721d3c9c

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v5, "\u073d\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4767

    const v7, 0x4f87eebe

    xor-int/2addr v6, v7

    const v7, -0x5d7647b6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x751f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 35
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_1

    goto/16 :goto_1

    .line 215
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-lez v5, :cond_9

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v5, Ll/᩺;->ۙۛܶ:I

    if-lez v5, :cond_2

    goto/16 :goto_3

    .line 65
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v5, :cond_6

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto/16 :goto_3

    .line 254
    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    const/4 v0, 0x0

    return-object v0

    .line 326
    :sswitch_5
    new-instance v0, Ll/ܽܺۡ;

    invoke-direct {v0, v1}, Ll/ܽܺۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 216
    invoke-static {v0}, Ll/ܿܺۡ;->֫(Ll/ۧܺۡ;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 4
    :sswitch_6
    move-object v1, v0

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 279
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v5, "\u06e0\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6911

    const v7, 0x781ec3b1    # 1.28805E34f

    xor-int/2addr v6, v7

    const v7, -0x4791e634

    goto :goto_0

    :cond_1
    const-string v5, "\u1a74\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5cf3

    const v7, 0x35f85599

    xor-int/2addr v6, v7

    const v7, 0x3bfd49a2

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v5

    if-ltz v5, :cond_3

    :cond_2
    const-string v5, "\u1a7b\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x422b

    const v7, 0x67cfcd9b

    xor-int/2addr v6, v7

    const v7, -0x45f8b2ae

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x634b

    const v7, -0x3467b802    # -1.9959804E7f

    xor-int/2addr v6, v7

    const v7, 0x54a4b721

    goto/16 :goto_0

    .line 303
    :sswitch_8
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v5, "\u06d7\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6ff

    const v7, 0x3a296b0d

    xor-int/2addr v6, v7

    const v7, 0x23aafc15

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_5

    goto :goto_1

    :cond_5
    const-string v5, "\u1a77\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e19

    const v7, -0x34367723    # -2.6415546E7f

    xor-int/2addr v6, v7

    const v7, -0x103d17d

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v5

    if-eqz v5, :cond_7

    :cond_6
    const-string v5, "\u1a73\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1f5b

    const v7, -0x3099a2b6

    xor-int/2addr v6, v7

    const v7, -0x3ff141ee

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u073a\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x393f

    const v7, 0x67a9358b

    xor-int/2addr v6, v7

    const v7, -0x3b47f381

    goto/16 :goto_0

    .line 121
    :sswitch_b
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_8

    :goto_1
    const-string v5, "\u06df\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5849

    const v7, 0x29d5f03

    xor-int/2addr v6, v7

    const v7, 0x76488233

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d9\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1251

    const v7, 0xee81f7d

    xor-int/2addr v6, v7

    const v7, -0x26e6d0b2

    goto/16 :goto_0

    .line 132
    :sswitch_c
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_2
    const-string v5, "\u06e0\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e3d

    const v7, 0x271717cd

    xor-int/2addr v6, v7

    const v7, -0x7838acc4    # -2.9991113E-34f

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a74\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2fcf

    const v7, -0x7d88645

    xor-int/2addr v6, v7

    const v7, 0x2735b2b5

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    const-string v5, "\u1a7a\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x400b

    const v7, 0x843336b

    xor-int/2addr v6, v7

    const v7, 0x6b4a8dd9

    goto/16 :goto_0

    .line 2
    :sswitch_e
    iget-object v0, p0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_c

    :goto_3
    const-string v5, "\u1a76\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1adb

    const v7, -0x2f8c60b2

    xor-int/2addr v6, v7

    const v7, -0x73ae440

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a7a\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6cb9

    const v7, -0x35196dbc    # -7555362.0f

    xor-int/2addr v6, v7

    const v7, -0x211b232b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77c1b5e3 -> :sswitch_b
        -0x6ec4a477 -> :sswitch_3
        -0x558207b4 -> :sswitch_d
        -0x4e2e68cb -> :sswitch_0
        -0x4ad095e1 -> :sswitch_9
        -0x497c6afa -> :sswitch_8
        -0x43e3ded9 -> :sswitch_2
        -0x41e5e6dd -> :sswitch_9
        -0x3e2bd05d -> :sswitch_0
        -0x3ab6ff1b -> :sswitch_7
        -0x25bf2633 -> :sswitch_7
        -0x22e2ab04 -> :sswitch_6
        -0x20574068 -> :sswitch_a
        -0x1d1c6beb -> :sswitch_c
        -0xd93a135 -> :sswitch_8
        -0xbd6018b -> :sswitch_b
        0x1e249 -> :sswitch_e
        0xd39c3d8 -> :sswitch_1
        0x20fcf509 -> :sswitch_c
        0x26eed660 -> :sswitch_3
        0x28cf3ee8 -> :sswitch_1
        0x2d9dcd6a -> :sswitch_6
        0x3804b5f9 -> :sswitch_d
        0x3ffad27d -> :sswitch_a
        0x446a79c6 -> :sswitch_e
        0x5282b808 -> :sswitch_5
        0x57ce96c9 -> :sswitch_4
        0x5cd63173 -> :sswitch_4
        0x5f720576 -> :sswitch_2
        0x7ff7137b -> :sswitch_5
    .end sparse-switch
.end method

.method public ֫(JJ)V
    .locals 6

    const v0, 0x179868cb

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    const-string v3, "\u06d9\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x67e5

    const v5, 0x26e1046f

    xor-int/2addr v4, v5

    const v5, 0x1540152e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3087

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_2

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe1

    const v5, -0x5f75e525

    xor-int/2addr v4, v5

    const v5, -0x44d6213c

    goto :goto_0

    :sswitch_1
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_4

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܳۙܳ;

    invoke-static {v0, p1, p2, p3, p4}, Ll/ܳۙܳ;->ۧ(Ll/ܳۙܳ;JJ)V

    return-void

    .line 2
    :sswitch_6
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u073d\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xec1

    const v5, 0x2347fb65

    xor-int/2addr v4, v5

    const v5, 0x77efa47c

    goto :goto_0

    :cond_2
    const-string v3, "\u06d7\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7add

    const v5, 0x7cde50bd

    xor-int/2addr v4, v5

    const v5, 0x59bb74b2

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf55

    const v5, 0x3dfe083a

    xor-int/2addr v4, v5

    const v5, 0x5af1749d

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5185

    const v5, -0x10e3bf50

    xor-int/2addr v4, v5

    const v5, -0xf67c393

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x76a9

    const v5, -0x5743b98d

    xor-int/2addr v4, v5

    const v5, -0x3ab9bdd9

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06e8\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2ae1

    const v5, -0x19296e5b

    xor-int/2addr v4, v5

    const v5, -0x52db8afc

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b73

    const v5, -0x7aaac11e

    xor-int/2addr v4, v5

    const v5, 0x6f7a0288

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1333

    const v5, 0x5afba2e7

    xor-int/2addr v4, v5

    const v5, -0x44969242

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2fcf

    const v5, -0x54999ed7

    xor-int/2addr v4, v5

    const v5, -0x6270d94e

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u073a\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5bf5

    const v5, 0xacabffb

    xor-int/2addr v4, v5

    const v5, 0x363d70cb

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_b

    :goto_2
    const-string v3, "\u06db\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2e53

    const v5, 0x7e067858

    xor-int/2addr v4, v5

    const v5, -0x7fb5fe59

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d8\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1871

    const v5, -0x3f9fb098

    xor-int/2addr v4, v5

    const v5, 0x4f9d5bfc    # 5.2801024E9f

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u06dc\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4801

    const v5, -0x59e19417

    xor-int/2addr v4, v5

    const v5, 0x5f13bdc3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0733\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x31bf

    const v5, 0x29e2d507

    xor-int/2addr v4, v5

    const v5, 0x65cfe575

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f42ab4e -> :sswitch_3
        -0x7b177345 -> :sswitch_0
        -0x79ba1562 -> :sswitch_0
        -0x6b847551 -> :sswitch_4
        -0x63cae961 -> :sswitch_5
        -0x5d6f3874 -> :sswitch_2
        -0x5abf0b75 -> :sswitch_7
        -0x4f009e84 -> :sswitch_8
        -0x49480f0e -> :sswitch_c
        -0x36332867 -> :sswitch_1
        -0x33e9bdd8 -> :sswitch_e
        -0x338638ea -> :sswitch_3
        -0x1748e645 -> :sswitch_d
        -0xb36b600 -> :sswitch_9
        -0x1437 -> :sswitch_6
        0xe339ae1 -> :sswitch_4
        0x179efd5c -> :sswitch_b
        0x1a6d200c -> :sswitch_e
        0x1c1012e5 -> :sswitch_7
        0x29ce6bce -> :sswitch_2
        0x36e1b7df -> :sswitch_1
        0x44d94f3e -> :sswitch_a
        0x4740cbc2 -> :sswitch_b
        0x4863d102 -> :sswitch_6
        0x5ed5bec8 -> :sswitch_8
        0x623f5713 -> :sswitch_9
        0x6e0f1ced -> :sswitch_c
        0x731769a4 -> :sswitch_d
        0x7837363c -> :sswitch_a
        0x7858f57f -> :sswitch_5
    .end sparse-switch
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 23

    const/4 v1, 0x0

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

    const v15, -0x541b8f21

    sget v16, Ll/ۘܿ;->ۘܰ۫:I

    sget v17, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v18, "\u0733\u1a78"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    mul-int/lit8 v18, v18, -0x37

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, -0x1bdf

    const v20, -0x15355e24

    xor-int v0, v0, v20

    const v20, 0x2aa99a15

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, 0x46e1

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v18, v0

    sparse-switch v15, :sswitch_data_0

    .line 194
    new-instance v0, Ll/ܰܽۖ;

    move-object/from16 v18, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v20

    if-gtz v20, :cond_3

    goto :goto_2

    .line 32
    :sswitch_0
    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v18, v5

    move/from16 v20, v15

    goto/16 :goto_9

    :cond_1
    move-object/from16 v18, v5

    :goto_2
    move/from16 v20, v15

    goto/16 :goto_b

    .line 156
    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v18, v5

    move/from16 v20, v15

    goto/16 :goto_5

    .line 112
    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_0

    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v18, v5

    move/from16 v20, v15

    goto/16 :goto_6

    .line 23
    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    const/4 v0, 0x0

    return-object v0

    .line 191
    :sswitch_5
    check-cast v5, Ljava/lang/Class;

    invoke-static {v5}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0

    :cond_3
    move/from16 v20, v15

    .line 194
    invoke-static/range {v19 .. v19}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 39
    sget v21, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v21, :cond_4

    goto/16 :goto_a

    .line 194
    :cond_4
    invoke-static {v5, v15}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 194
    throw v0

    :sswitch_6
    move/from16 v20, v15

    .line 188
    aget-object v5, v3, v4

    .line 189
    instance-of v0, v5, Ljava/lang/Class;

    if-eqz v0, :cond_5

    const-string v0, "\u06dc\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x2d

    xor-int v15, v0, v17

    mul-int/lit16 v15, v15, 0x79df

    const v18, -0x565036a9

    xor-int v15, v15, v18

    const v18, 0x603ecb1

    goto :goto_4

    :cond_5
    const-string v0, "\u06e0\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v15, v0, v16

    mul-int/lit16 v15, v15, -0x5fe7

    const v18, -0x19f3f481

    xor-int v15, v15, v18

    const v18, 0x6e4cbc2c

    :goto_4
    xor-int v18, v0, v18

    move v0, v15

    goto/16 :goto_7

    :sswitch_7
    move-object/from16 v18, v5

    move/from16 v20, v15

    .line 188
    move-object/from16 v0, v19

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    const/4 v4, 0x0

    .line 20
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_6

    move-object/from16 v0, p0

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u1a78\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x65

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x4b15

    const v15, -0x368ceefe

    xor-int/2addr v5, v15

    const v15, -0x32f2f7b8

    goto/16 :goto_c

    :sswitch_8
    move-object/from16 v18, v5

    move/from16 v20, v15

    .line 197
    new-instance v0, Ll/ܰܽۖ;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    sget v15, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v15, :cond_7

    goto/16 :goto_9

    .line 197
    :cond_7
    invoke-static/range {v19 .. v19}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v21

    if-gtz v21, :cond_8

    :goto_5
    const-string v0, "\u1a7a\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x6d3b

    const v15, 0x26eee9

    xor-int/2addr v5, v15

    const v15, 0x1907d282

    goto/16 :goto_c

    :cond_8
    invoke-static {v5, v15}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 197
    throw v0

    :sswitch_9
    move-object/from16 v18, v5

    move/from16 v20, v15

    const/4 v0, 0x1

    const/16 v2, 0x16

    .line 187
    invoke-static {v14, v0, v2, v13}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_9

    const-string v0, "\u0733\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x63

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x7e47

    const v15, 0x739123eb

    xor-int/2addr v5, v15

    const v15, 0x6cbb0b6c

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0xb

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x5b25

    const v15, 0x1ec888e2

    xor-int/2addr v5, v15

    const v15, -0x7df0c76c

    goto/16 :goto_c

    :sswitch_a
    move-object/from16 v18, v5

    move/from16 v20, v15

    sget-object v14, Ll/ۨۚ᩷;->۠ܳۜ:[S

    .line 4
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_a

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u1a75\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x47

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x23ed

    const v15, 0x7272723a

    xor-int/2addr v5, v15

    const v15, -0xaad969a

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v0, p0

    move-object/from16 v18, v5

    move/from16 v20, v15

    .line 2
    iget-object v1, v0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v1, Ljava/lang/reflect/Type;

    .line 187
    instance-of v5, v1, Ljava/lang/reflect/ParameterizedType;

    .line 92
    sget-boolean v15, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v15, :cond_b

    move-object/from16 v19, v1

    move v1, v5

    :goto_6
    const-string v5, "\u05a1\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v17

    mul-int/lit8 v5, v5, 0x35

    xor-int v15, v5, v16

    mul-int/lit16 v15, v15, -0x13f

    const v21, -0x6b404b93

    xor-int v15, v15, v21

    const v21, 0x61f6f7c5

    xor-int v5, v5, v21

    move v0, v15

    move/from16 v15, v20

    move-object/from16 v22, v18

    move/from16 v18, v5

    goto/16 :goto_d

    :cond_b
    const-string v15, "\u05a1\u06e8"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v17

    mul-int/lit8 v15, v15, -0x33

    xor-int v0, v15, v16

    mul-int/lit16 v0, v0, 0x2df3

    const v19, 0x3c8e34fe

    xor-int v0, v0, v19

    const v19, 0x7de1dbb0

    xor-int v15, v15, v19

    move-object/from16 v19, v1

    move v1, v5

    move-object/from16 v5, v18

    move/from16 v18, v15

    :goto_7
    move/from16 v15, v20

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v18, v5

    move/from16 v20, v15

    const/16 v0, 0x63f5

    const/16 v13, 0x63f5

    goto :goto_8

    :sswitch_d
    move-object/from16 v18, v5

    move/from16 v20, v15

    const v0, 0xd22c

    const v13, 0xd22c

    :goto_8
    const-string v0, "\u1a7b\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x53

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x7c8b

    const v15, -0xfe0e431

    xor-int/2addr v5, v15

    const v15, -0x493e950

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v18, v5

    move/from16 v20, v15

    add-int v0, v11, v12

    sub-int v0, v10, v0

    if-lez v0, :cond_c

    const-string v0, "\u1a74\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x9

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x6365

    const v15, -0x43427359

    xor-int/2addr v5, v15

    const v15, -0x2a2144aa

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u05a8\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x23

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x1fc9

    const v15, -0x7d9dac5

    xor-int/2addr v5, v15

    const v15, -0x35884684    # -4058719.0f

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v18, v5

    move/from16 v20, v15

    mul-int v10, v8, v9

    mul-int v11, v8, v8

    const v12, 0x7b12400

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u06e1\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x45

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x6903

    const v15, 0x7e4fa990

    xor-int/2addr v5, v15

    const v15, -0x10b66c52

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u06df\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x7d

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4c53

    const v15, 0x5beb3c12

    xor-int/2addr v5, v15

    const v15, -0x4d6476dc

    goto :goto_c

    :sswitch_10
    move-object/from16 v18, v5

    move/from16 v20, v15

    aget-short v8, v6, v7

    const/16 v9, 0x58c0

    .line 27
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_e

    :goto_a
    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x3df5

    const v15, -0x894eb28

    xor-int/2addr v5, v15

    const v15, 0x63a55cbc

    goto :goto_c

    :cond_e
    const-string v0, "\u1a74\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x5a1d

    const v15, -0x5821be2a

    xor-int/2addr v5, v15

    const v15, 0x6edfb70a

    goto :goto_c

    :sswitch_11
    move-object/from16 v18, v5

    move/from16 v20, v15

    sget-object v6, Ll/ۨۚ᩷;->۠ܳۜ:[S

    const/4 v7, 0x0

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_f

    :goto_b
    const-string v0, "\u06da\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2597

    const v15, -0x69bb3d9b

    xor-int/2addr v5, v15

    const v15, 0x3b3d7fa6

    goto :goto_c

    :cond_f
    const-string v0, "\u06db\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x45

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6f3b

    const v15, 0x59d5c048

    xor-int/2addr v5, v15

    const v15, 0x3aec6cba

    :goto_c
    xor-int/2addr v0, v15

    move/from16 v15, v20

    move-object/from16 v22, v18

    move/from16 v18, v0

    move v0, v5

    :goto_d
    move-object/from16 v5, v22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a865551 -> :sswitch_d
        -0x6e806790 -> :sswitch_4
        -0x611768d0 -> :sswitch_11
        -0x5dc3d29d -> :sswitch_10
        -0x5c53a2e8 -> :sswitch_3
        -0x59fefb13 -> :sswitch_8
        -0x56750814 -> :sswitch_d
        -0x4b0c3165 -> :sswitch_1
        -0x4663aa54 -> :sswitch_a
        -0x44357c3e -> :sswitch_0
        -0x33440d1b -> :sswitch_4
        -0x32308353 -> :sswitch_a
        -0x2e7f2659 -> :sswitch_7
        -0x2521895c -> :sswitch_9
        -0x1afdb954 -> :sswitch_6
        -0x14014392 -> :sswitch_0
        -0x83a40d -> :sswitch_b
        -0x397faa -> :sswitch_6
        0x7ea0b00 -> :sswitch_f
        0x918295a -> :sswitch_8
        0xe279eb0 -> :sswitch_5
        0x1580c56e -> :sswitch_1
        0x1ec83037 -> :sswitch_c
        0x22c989d9 -> :sswitch_b
        0x269778d7 -> :sswitch_e
        0x2a80c5df -> :sswitch_11
        0x2f9dfe31 -> :sswitch_2
        0x2ff457d4 -> :sswitch_3
        0x33ddcdee -> :sswitch_10
        0x37b988d1 -> :sswitch_2
        0x432f695a -> :sswitch_e
        0x4501b1fd -> :sswitch_c
        0x5e4074ce -> :sswitch_5
        0x702c03bf -> :sswitch_f
        0x77bef6ba -> :sswitch_9
        0x7ff09995 -> :sswitch_7
    .end sparse-switch
.end method

.method public ۧ(I)Ll/ܽ᩷ܳ;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x297d5ea9

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v5, "\u06db\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6a35

    const v7, -0x133fc549

    xor-int/2addr v6, v7

    const v7, -0x4c79c5ac

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x4569

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_c

    goto/16 :goto_4

    .line 235
    :sswitch_0
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-lez v5, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v5, :cond_7

    goto/16 :goto_2

    :sswitch_2
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_5

    goto/16 :goto_3

    .line 501
    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_3

    .line 49
    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 p1, 0x0

    return-object p1

    .line 6
    :sswitch_5
    sget v0, Lbin/mt/plus/Main;->ܿܽ:I

    .line 510
    new-instance v0, Ll/ۚۡ᩻;

    invoke-direct {v0, p1, v1}, Ll/ۚۡ᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0

    .line 4
    :sswitch_6
    move-object v1, v0

    check-cast v1, Ll/ۗ᩻᩻;

    sget v5, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u1a76\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2a61

    const v7, 0x250933c

    xor-int/2addr v6, v7

    const v7, 0x1dddf173

    goto :goto_0

    .line 2
    :sswitch_7
    iget-object v0, p0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    .line 267
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06db\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2871

    const v7, -0x4f065f63

    xor-int/2addr v6, v7

    const v7, -0x4b27bb05

    goto :goto_0

    .line 16
    :sswitch_8
    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06d6\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2973

    const v7, 0x61083172    # 1.5702E20f

    xor-int/2addr v6, v7

    const v7, -0x6f6cf61d

    goto/16 :goto_0

    .line 418
    :sswitch_9
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u06e8\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x79ff

    const v7, 0x3025bf55

    xor-int/2addr v6, v7

    const v7, 0x166152b4

    goto/16 :goto_0

    .line 259
    :sswitch_a
    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v5, :cond_4

    :goto_1
    const-string v5, "\u073d\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5209

    const v7, 0x42270149

    xor-int/2addr v6, v7

    const v7, 0x11034e23

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e8\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x15f3

    const v7, -0x7d64c6f7

    xor-int/2addr v6, v7

    const v7, -0x60a02547

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u1a7a\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2f25

    const v7, -0x4fbd0d31

    xor-int/2addr v6, v7

    const v7, -0x4a5f5646

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06ec\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x245

    const v7, 0xa2bd1c9

    xor-int/2addr v6, v7

    const v7, 0x43bb1c4c

    goto/16 :goto_0

    .line 286
    :sswitch_c
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_8

    :cond_7
    const-string v5, "\u1a7b\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6791

    const v7, 0xfe0b940

    xor-int/2addr v6, v7

    const v7, 0x1fcc25e7

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u0736\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xabd

    const v7, 0x6c2ca739

    xor-int/2addr v6, v7

    const v7, -0x37559eb4

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u1a7b\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5a07

    const v7, -0x40c3776e

    xor-int/2addr v6, v7

    const v7, -0x49ea21ee

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v5, :cond_a

    :goto_3
    const-string v5, "\u06dc\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7291

    const v7, -0x32a94e56

    xor-int/2addr v6, v7

    const v7, 0x42fd7102

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x639

    const v7, 0x2abcff69

    xor-int/2addr v6, v7

    const v7, 0x75730d44

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v5, "\u06d7\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x76eb

    const v7, -0x2a09069a

    xor-int/2addr v6, v7

    const v7, -0x2a562aa

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06eb\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, 0x7

    const v7, -0x1de1e868

    xor-int/2addr v6, v7

    const v7, 0x6905d289

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71b64d78 -> :sswitch_8
        -0x639f3e5c -> :sswitch_4
        -0x638452bf -> :sswitch_0
        -0x4b4418be -> :sswitch_b
        -0x4404cede -> :sswitch_a
        -0x402335fc -> :sswitch_7
        -0x362c1533 -> :sswitch_6
        -0x30031649 -> :sswitch_0
        -0x2f3052c6 -> :sswitch_c
        -0x295593e2 -> :sswitch_e
        -0x22aaed65 -> :sswitch_d
        -0x1c94d653 -> :sswitch_6
        -0x679b15c -> :sswitch_9
        0x6dcedef -> :sswitch_e
        0xbc8c76c -> :sswitch_7
        0x1af3d5e4 -> :sswitch_d
        0x1f08cf91 -> :sswitch_c
        0x312b1f10 -> :sswitch_b
        0x355aba7e -> :sswitch_2
        0x38db9773 -> :sswitch_3
        0x3e2c61f3 -> :sswitch_2
        0x43f3949c -> :sswitch_a
        0x69436738 -> :sswitch_5
        0x6ab44de0 -> :sswitch_3
        0x6ccaab7d -> :sswitch_1
        0x6fa91d49 -> :sswitch_9
        0x702242d7 -> :sswitch_1
        0x7b07821f -> :sswitch_5
        0x7cb17c7c -> :sswitch_8
        0x7edba7cf -> :sswitch_4
    .end sparse-switch
.end method
