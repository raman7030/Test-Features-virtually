.class public final synthetic Ll/ܺᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩵ᩴ᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩵ᩴ᩷;I)V
    .locals 6

    const v0, 0x75a0a338

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x789f

    const v5, -0x41b1359e

    xor-int/2addr v4, v5

    const v5, -0x24c83bfb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5267

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_3

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-gez v3, :cond_5

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v3, :cond_7

    goto/16 :goto_3

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/ܺᩴ᩷;->᩹:I

    return-void

    :sswitch_5
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_0

    const-string v3, "\u073d\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3bb

    const v5, -0x1a877e7c

    xor-int/2addr v4, v5

    const v5, -0x3b2fc4ce

    goto :goto_0

    :cond_0
    const-string v3, "\u1a7b\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f59

    const v5, -0x111e5acf

    xor-int/2addr v4, v5

    const v5, 0x3697ddba

    goto :goto_0

    .line 2
    :sswitch_6
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x195

    const v5, -0x24ff8a1c

    xor-int/2addr v4, v5

    const v5, -0x3054fe58

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a7a\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6dd7

    const v5, 0x5ca069ac

    xor-int/2addr v4, v5

    const v5, -0x623aac74

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e2\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7613

    const v5, -0x705f4324

    xor-int/2addr v4, v5

    const v5, 0x782b1838

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u05a1\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5993

    const v5, -0x1cd1e217

    xor-int/2addr v4, v5

    const v5, -0x689b7b51

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x628f

    const v5, -0x6ec4d038

    xor-int/2addr v4, v5

    const v5, 0x730a984f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x25a9

    const v5, -0x34640aea    # -2.0441644E7f

    xor-int/2addr v4, v5

    const v5, 0x5a5fd480

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_8

    :cond_7
    const-string v3, "\u0736\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x56d5

    const v5, 0x5f1bcf00

    xor-int/2addr v4, v5

    const v5, -0x33bb3d2

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x323

    const v5, 0x7f4dd03

    xor-int/2addr v4, v5

    const v5, -0x378032b1

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06eb\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a6f

    const v5, -0x2bfd4a69

    xor-int/2addr v4, v5

    const v5, 0x291e89fc

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f83

    const v5, -0x58ead391

    xor-int/2addr v4, v5

    const v5, -0x32f011f9

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u073f\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf2f

    const v5, -0x13616644

    xor-int/2addr v4, v5

    const v5, -0x3a8d71fa

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܺᩴ᩷;->᩸:Ll/᩵ᩴ᩷;

    .line 1
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u1a7a\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ff1

    const v5, -0x1bade757

    xor-int/2addr v4, v5

    const v5, -0x31acc38

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76f3

    const v5, 0x3fd9e66

    xor-int/2addr v4, v5

    const v5, 0x28070a46

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cd2ccea -> :sswitch_0
        -0x6e16597e -> :sswitch_c
        -0x672eb241 -> :sswitch_8
        -0x60a08b6a -> :sswitch_0
        -0x548df056 -> :sswitch_2
        -0x495c0228 -> :sswitch_3
        -0x42db78fb -> :sswitch_d
        -0x3ef66a32 -> :sswitch_9
        -0x2cd96710 -> :sswitch_d
        -0x25da15b2 -> :sswitch_7
        -0x10450d6d -> :sswitch_8
        0x42878ce -> :sswitch_9
        0xca43098 -> :sswitch_5
        0x10b45cca -> :sswitch_4
        0x11f38a13 -> :sswitch_2
        0x14edbf54 -> :sswitch_4
        0x1996aab3 -> :sswitch_e
        0x1b31dd54 -> :sswitch_7
        0x229f1afd -> :sswitch_5
        0x254837e8 -> :sswitch_a
        0x2681bc67 -> :sswitch_b
        0x27b717de -> :sswitch_1
        0x2845498f -> :sswitch_c
        0x360014c3 -> :sswitch_e
        0x37aba410 -> :sswitch_3
        0x51731ca7 -> :sswitch_1
        0x53f7dd7c -> :sswitch_b
        0x611445a6 -> :sswitch_a
        0x66d77b4f -> :sswitch_6
        0x67b62aaf -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, 0x688f374a

    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    sget v7, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v8, "\u06d6\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x28b9

    const v10, 0x546f3a69

    xor-int/2addr v9, v10

    const v10, 0x4d73a2b7    # 2.55470448E8f

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0xa1d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 161
    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v8, :cond_c

    goto/16 :goto_2

    .line 516
    :sswitch_0
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v8, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v8, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v8, "\u06da\u1a73"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4a9d

    const v10, 0x13c31c6b

    xor-int/2addr v9, v10

    const v10, 0x122dc1f8

    goto :goto_0

    .line 15
    :sswitch_1
    sget-boolean v8, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v8, :cond_3

    goto/16 :goto_2

    .line 87
    :sswitch_2
    sget v8, Ll/ۘۨ;->۫᩸۠:I

    if-gez v8, :cond_5

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :sswitch_5
    return-void

    .line 537
    :sswitch_6
    :try_start_0
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 538
    invoke-static {v2}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v8

    .line 1224
    iget-object v8, v8, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    iget-object v8, v8, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    .line 538
    invoke-static {v2}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v9

    iget-object v9, v9, Ll/ۗᩴ᩷;->ᩳ:Ll/۬۬ۧ;

    invoke-static {v2}, Ll/֫᩵᩷;->ܺ(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v10

    invoke-static {v2, v8, v9, v10, v0}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/᩵֡ᩴ;Ll/۬۬ۧ;Ljava/util/concurrent/atomic/AtomicInteger;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v8, "\u1a75\u1a74"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3527

    const v10, -0x41313e90

    xor-int/2addr v9, v10

    const v10, -0x550179e7

    goto :goto_0

    .line 537
    :sswitch_7
    iget-object v2, v1, Ll/᩵ᩴ᩷;->ۢ:Ll/֫᩵᩷;

    const-wide/16 v3, 0x64

    const-string v8, "\u06d7\u06d7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7d85

    const v10, -0x696f57fc

    xor-int/2addr v9, v10

    const v10, -0x1e47502c

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Ll/ܺᩴ᩷;->᩸:Ll/᩵ᩴ᩷;

    .line 473
    sget v8, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v8, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v8, "\u1a7a\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x947

    const v10, -0x6829406e

    xor-int/2addr v9, v10

    const v10, 0x3ab1c886

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    const-string v8, "\u0736\u05ab"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1001

    const v10, 0x29a430c0

    xor-int/2addr v9, v10

    const v10, 0x61b32f8b

    goto/16 :goto_0

    .line 407
    :sswitch_a
    sget v8, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v8, :cond_4

    :cond_3
    :goto_1
    const-string v8, "\u073f\u1a77"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x33b

    const v10, -0x456a2992

    xor-int/2addr v9, v10

    const v10, 0xd7507a1

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u1a79\u05ab"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2f9

    const v10, 0x7134bebb

    xor-int/2addr v9, v10

    const v10, -0x399974e8

    goto/16 :goto_0

    :sswitch_b
    sget v8, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v8, :cond_6

    :cond_5
    :goto_2
    const-string v8, "\u073d\u073d"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2d51

    const v10, 0x27535054

    xor-int/2addr v9, v10

    const v10, 0x432d44d2

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u0736\u06ec"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x692d

    const v10, -0x5317c4b3

    xor-int/2addr v9, v10

    const v10, -0x6c139a93

    goto/16 :goto_0

    .line 974
    :sswitch_c
    sget v8, Ll/۟;->ۗۤۛ:I

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    const-string v8, "\u06db\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6a35

    const v10, 0x1dbd797b

    xor-int/2addr v9, v10

    const v10, -0x4bec4cd2

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v8

    if-gtz v8, :cond_8

    :goto_3
    const-string v8, "\u073f\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x96d

    const v10, 0x5fa53c26

    xor-int/2addr v9, v10

    const v10, -0x6ed2ebac

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u0730\u0736"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x1f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x31f3

    const v10, -0x5a0ebb46

    xor-int/2addr v9, v10

    const v10, 0x4cc3df9

    goto/16 :goto_0

    :sswitch_e
    sget v8, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v8, :cond_9

    goto :goto_5

    :cond_9
    const-string v8, "\u06e4\u1a79"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x3d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6cff

    const v10, 0x215987df

    xor-int/2addr v9, v10

    const v10, -0x4fc3455e

    goto/16 :goto_0

    .line 176
    :sswitch_f
    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v8, :cond_a

    goto :goto_5

    :cond_a
    const-string v8, "\u06df\u06e8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x65

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x200d

    const v10, -0x1a660a0e

    xor-int/2addr v9, v10

    const v10, -0x3b2f192d

    goto/16 :goto_0

    :sswitch_10
    sget v8, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v8, :cond_b

    :goto_4
    const-string v8, "\u06e8\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x49

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4dfb

    const v10, -0x1830da2d

    xor-int/2addr v9, v10

    const v10, -0x66d87f6e

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06dc\u06e8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2a45

    const v10, -0x1c93ea4

    xor-int/2addr v9, v10

    const v10, -0x1675a528

    goto/16 :goto_0

    .line 2
    :sswitch_11
    iget v0, p0, Ll/ܺᩴ᩷;->᩹:I

    .line 823
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v8

    if-eqz v8, :cond_d

    :cond_c
    :goto_5
    const-string v8, "\u1a77\u0736"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7631

    const v10, -0x21f9584

    xor-int/2addr v9, v10

    const v10, 0x3535f856

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06d8\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0xf

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5a8f

    const v10, -0xdfa0c8c

    xor-int/2addr v9, v10

    const v10, -0x6d9563ab

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x779fb307 -> :sswitch_f
        -0x75a12ae5 -> :sswitch_1
        -0x72978dd7 -> :sswitch_0
        -0x71f16e23 -> :sswitch_2
        -0x68bf4ad3 -> :sswitch_10
        -0x5ec5674a -> :sswitch_11
        -0x5c7caa61 -> :sswitch_6
        -0x58708319 -> :sswitch_9
        -0x4e6a248d -> :sswitch_a
        -0x4de7911e -> :sswitch_c
        -0x4cab54c0 -> :sswitch_4
        -0x46222149 -> :sswitch_a
        -0x3c3ed2a4 -> :sswitch_6
        -0x34e8fad5 -> :sswitch_5
        -0x34492dc9 -> :sswitch_b
        -0x2a065a19 -> :sswitch_b
        -0x26965aeb -> :sswitch_d
        -0x18515ff4 -> :sswitch_7
        -0x1821cea3 -> :sswitch_4
        -0x17da9e0a -> :sswitch_f
        -0xfa23583 -> :sswitch_9
        -0xda25be5 -> :sswitch_0
        0x13c7106 -> :sswitch_2
        0x10ccd2e6 -> :sswitch_8
        0x137cd55c -> :sswitch_e
        0x174f9ba1 -> :sswitch_1
        0x1b13f18a -> :sswitch_d
        0x22c76edf -> :sswitch_3
        0x2801b2ab -> :sswitch_c
        0x2c99b5df -> :sswitch_11
        0x3da2c8ed -> :sswitch_5
        0x43ca92d6 -> :sswitch_8
        0x4956cc7e -> :sswitch_3
        0x5b584a10 -> :sswitch_7
        0x5ee64526 -> :sswitch_e
        0x7d77f2a2 -> :sswitch_10
    .end sparse-switch
.end method
