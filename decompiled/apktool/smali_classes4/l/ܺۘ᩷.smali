.class public final synthetic Ll/ܺۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ll/᩺ᩴ᩷;

.field public final synthetic ᩸:Ll/֫᩵᩷;

.field public final synthetic ᩹:Ll/ۙᩴ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֫᩵᩷;Ll/ۙᩴ᩷;Ll/᩺ᩴ᩷;Ll/֡ۚۢ;)V
    .locals 6

    const v0, -0x4f036173

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2367

    const v5, 0x331c0c20

    xor-int/2addr v4, v5

    const v5, -0x44b7392e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2e75

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_5

    goto/16 :goto_3

    .line 4
    :sswitch_0
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v3, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u0733\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x73ab

    const v5, 0x5552ae80

    xor-int/2addr v4, v5

    const v5, -0x73db1876

    goto :goto_0

    .line 1
    :sswitch_2
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_8

    goto/16 :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto/16 :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܺۘ᩷;->᩶:Ll/᩺ᩴ᩷;

    iput-object p4, p0, Ll/ܺۘ᩷;->ۙ:Ll/֡ۚۢ;

    return-void

    :sswitch_6
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_1

    const-string v3, "\u06d8\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e09

    const v5, 0x311638d3

    xor-int/2addr v4, v5

    const v5, 0x41b69060

    goto :goto_0

    :cond_1
    const-string v3, "\u0730\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b2f

    const v5, 0x395e4b81

    xor-int/2addr v4, v5

    const v5, 0x4ca5977e    # 8.6817776E7f

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x204d

    const v5, 0x47647808

    xor-int/2addr v4, v5

    const v5, -0x655b3318

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d6\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1ba9

    const v5, 0x62cbca2

    xor-int/2addr v4, v5

    const v5, -0x2f8b69a2

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4091

    const v5, -0x525f97f7

    xor-int/2addr v4, v5

    const v5, 0x50d9dc64

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x185b

    const v5, 0x5bd21018

    xor-int/2addr v4, v5

    const v5, -0x414569de

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a78\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2983

    const v5, 0x1e4c6a26

    xor-int/2addr v4, v5

    const v5, 0x3af5e77f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5bdd

    const v5, 0x412da0ca

    xor-int/2addr v4, v5

    const v5, 0x9cbe02

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a7b\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7e15

    const v5, -0x4e4109bd

    xor-int/2addr v4, v5

    const v5, 0x720a4eb6

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u1a74\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75db

    const v5, 0x2ff4d988

    xor-int/2addr v4, v5

    const v5, -0x3ee775d9

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4dd

    const v5, -0x257c5ceb

    xor-int/2addr v4, v5

    const v5, -0xc8cf5db

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1335

    const v5, -0x4b4d3664

    xor-int/2addr v4, v5

    const v5, 0x7f4217b5

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܺۘ᩷;->᩸:Ll/֫᩵᩷;

    iput-object p2, p0, Ll/ܺۘ᩷;->᩹:Ll/ۙᩴ᩷;

    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06ec\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ba1

    const v5, 0x54c1c781

    xor-int/2addr v4, v5

    const v5, 0x63815a00

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x27cd

    const v5, 0xd89bc36

    xor-int/2addr v4, v5

    const v5, -0x637ba6ea

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f01cdf2 -> :sswitch_b
        -0x77d7243f -> :sswitch_1
        -0x76715a83 -> :sswitch_c
        -0x6eab4ceb -> :sswitch_4
        -0x5560227c -> :sswitch_2
        -0x45c09ef8 -> :sswitch_d
        -0x43e0365c -> :sswitch_6
        -0x43812ea2 -> :sswitch_8
        -0x3f33ebf5 -> :sswitch_3
        -0x38fe456a -> :sswitch_5
        -0x37986c80 -> :sswitch_d
        -0x35ed4958 -> :sswitch_0
        -0x279ab0b5 -> :sswitch_a
        -0x2481d0a8 -> :sswitch_4
        -0x185f91e1 -> :sswitch_3
        -0x17dab02c -> :sswitch_1
        -0xcf6d063 -> :sswitch_a
        -0xb19dac5 -> :sswitch_c
        -0x8b7fe6c -> :sswitch_6
        0x1f8231a -> :sswitch_2
        0x1945eed0 -> :sswitch_e
        0x1aa7be59 -> :sswitch_9
        0x1c4d0201 -> :sswitch_9
        0x24ba52bf -> :sswitch_5
        0x28362633 -> :sswitch_0
        0x351d6523 -> :sswitch_8
        0x367c95c4 -> :sswitch_b
        0x43002cfe -> :sswitch_e
        0x5d5cc578 -> :sswitch_7
        0x643d28e8 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x4b2bef67

    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v7, "\u06df\u1a74"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x7f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1ebf

    const v9, -0x30edbfad

    xor-int/2addr v8, v9

    const v9, -0x36d36638    # -706972.5f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x1371

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v7

    if-eqz v7, :cond_a

    goto/16 :goto_5

    :sswitch_0
    sget v7, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v7, :cond_b

    goto :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v7

    if-gez v7, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v7, "\u06db\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4c79

    const v9, 0x68d7ac0b

    xor-int/2addr v8, v9

    const v9, -0x1863c394

    goto :goto_0

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 p1, 0x0

    return p1

    :sswitch_5
    invoke-static {v2, v3, v0, v1, p1}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/ۙᩴ᩷;Ll/᩺ᩴ᩷;Ll/֡ۚۢ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object v2, p0, Ll/ܺۘ᩷;->᩸:Ll/֫᩵᩷;

    iget-object v3, p0, Ll/ܺۘ᩷;->᩹:Ll/ۙᩴ᩷;

    sget v7, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u05ab\u05a1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5dfd

    const v9, -0x51de0045

    xor-int/2addr v8, v9

    const v9, 0xa191439

    goto :goto_0

    :sswitch_7
    iget-object v1, p0, Ll/ܺۘ᩷;->ۙ:Ll/֡ۚۢ;

    sget-boolean v7, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v7, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v7, "\u06da\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x69

    xor-int v8, v7, v6

    mul-int/lit8 v8, v8, 0x13

    const v9, 0x47ea4a8f

    xor-int/2addr v8, v9

    const v9, -0x33369cfc

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Ll/ܺۘ᩷;->᩶:Ll/᩺ᩴ᩷;

    sget-boolean v7, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v7, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u1a7a\u06e2"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1ce5

    const v9, -0x6b2e1a87

    xor-int/2addr v8, v9

    const v9, 0x51b069ac

    goto/16 :goto_0

    :sswitch_9
    sget v7, Ll/۟;->ۗۤۛ:I

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    const-string v7, "\u1a7b\u06d6"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0xd

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6e9b

    const v9, 0x7b31dc9e

    xor-int/2addr v8, v9

    const v9, -0x6084904e

    goto/16 :goto_0

    :sswitch_a
    sget v7, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v7, :cond_5

    goto :goto_3

    :cond_5
    const-string v7, "\u0733\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2f9b

    const v9, 0x1d1f8ca1

    xor-int/2addr v8, v9

    const v9, 0x4d4b047d    # 2.12879312E8f

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v7, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v7, :cond_6

    :goto_2
    const-string v7, "\u1a79\u1a75"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6fd5

    const v9, -0x6fd74c80

    xor-int/2addr v8, v9

    const v9, 0x2b6194bc

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06e0\u05a1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1e6f

    const v9, -0x17219e20

    xor-int/2addr v8, v9

    const v9, 0x6b022dea

    goto/16 :goto_0

    :sswitch_c
    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v7, :cond_7

    :goto_3
    const-string v7, "\u06e0\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1821

    const v9, 0x374a5f57

    xor-int/2addr v8, v9

    const v9, -0x515a7d1e

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06ec\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x65a5

    const v9, -0x423d8865

    xor-int/2addr v8, v9

    const v9, 0x21c7ac53

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v7, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v7, :cond_9

    :cond_8
    :goto_4
    const-string v7, "\u05ab\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x73

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x48ad

    const v9, -0x17ece073

    xor-int/2addr v8, v9

    const v9, 0x763a6ed8

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u06e4\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x43

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2851

    const v9, -0x21f9d6a2

    xor-int/2addr v8, v9

    const v9, -0x647c180c

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06df\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4a71

    const v9, -0x60960dc

    xor-int/2addr v8, v9

    const v9, 0x61044eba

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v7, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_5
    const-string v7, "\u06e1\u1a7a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x41

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6263

    const v9, 0x5361a848

    xor-int/2addr v8, v9

    const v9, 0x3796e45b

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e4\u05ab"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x37

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xea1

    const v9, -0x70fd6cb5

    xor-int/2addr v8, v9

    const v9, 0x7462b084

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ced5ffe -> :sswitch_8
        -0x7c955ffb -> :sswitch_6
        -0x5a73545e -> :sswitch_0
        -0x57ae17ef -> :sswitch_1
        -0x5778a6cb -> :sswitch_5
        -0x5740a9aa -> :sswitch_9
        -0x5651e6d7 -> :sswitch_e
        -0x54b00d35 -> :sswitch_c
        -0x4fdb51ee -> :sswitch_b
        -0x46e5fab9 -> :sswitch_1
        -0x457efb76 -> :sswitch_4
        -0x3faf72d2 -> :sswitch_7
        -0x35589bc3 -> :sswitch_a
        -0x31f3dc88 -> :sswitch_d
        -0x2fc44bcc -> :sswitch_d
        -0x2af801d5 -> :sswitch_4
        -0x1dbcabb9 -> :sswitch_9
        -0x63dd2f0 -> :sswitch_6
        -0x5a2fa86 -> :sswitch_7
        0x6ad3aa -> :sswitch_2
        0x266ba5e -> :sswitch_8
        0x2fbe330 -> :sswitch_c
        0xd416217 -> :sswitch_a
        0x27359a5f -> :sswitch_0
        0x41d5c605 -> :sswitch_5
        0x489451f8 -> :sswitch_3
        0x4bc97f02 -> :sswitch_2
        0x69cbe1c1 -> :sswitch_3
        0x6c36d5cc -> :sswitch_e
        0x7e003c27 -> :sswitch_b
    .end sparse-switch
.end method
