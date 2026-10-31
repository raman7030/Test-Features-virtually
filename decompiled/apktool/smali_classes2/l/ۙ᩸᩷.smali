.class public final Ll/ۙ᩸᩷;
.super Ljava/lang/Object;
.source "02QQ"


# static fields
.field public static final ֫:Landroid/os/Handler;

.field private static final ۘۡܿ:[S

.field public static final ۜ:Ll/ܿ۠᩵;

.field public static ۧ:Ll/᩶ۡ᩷;

.field public static ܳ:Landroid/content/SharedPreferences;

.field public static ܽ:Z

.field public static ܿ:Z

.field public static final ᩳ:Ll/ܿ۠᩵;

.field public static ᩻:Ll/۫ۤۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x2eb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x681a1e38

    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v5, Ll/֡۬;->۠֡᩶:I

    const-string v6, "\u06d6\u06eb"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6b45

    const v8, 0x1f81f2ee

    xor-int/2addr v7, v8

    const v8, -0x1e6bd5df

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x51c5

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 46
    new-instance v0, Ll/ۜۤۡ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v6, :cond_c

    goto/16 :goto_4

    .line 56
    :sswitch_0
    sget v6, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v6, :cond_a

    goto/16 :goto_2

    .line 71
    :sswitch_1
    sput-object v2, Ll/ۙ᩸᩷;->ۜ:Ll/ܿ۠᩵;

    sget v6, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u06e0\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7e63

    const v8, 0x55f3027f

    xor-int/2addr v7, v8

    const v8, -0x37aea1b4

    goto :goto_0

    .line 58
    :sswitch_2
    new-instance v1, Ll/᩸᩸᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 72
    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u1a7b\u06d7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x27

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4bef

    const v8, 0x220ad79e

    xor-int/2addr v7, v8

    const v8, 0x4bbc3243    # 2.466727E7f

    goto :goto_0

    .line 71
    :sswitch_3
    new-instance v6, Ll/᩹᩸᩷;

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-static {v6}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v2

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v6

    if-gtz v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v6, "\u06da\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x38a3

    const v8, 0x359415ae

    xor-int/2addr v7, v8

    const v8, 0x5c31cc5d

    goto/16 :goto_0

    .line 46
    :sswitch_4
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u1a79\u0733"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7533

    const v8, 0x4723e15d

    xor-int/2addr v7, v8

    const v8, -0x7ae1e460

    goto/16 :goto_0

    .line 74
    :sswitch_5
    new-instance v6, Landroid/os/Handler;

    .line 67
    sget v7, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v7, :cond_5

    :goto_1
    const-string v6, "\u05ab\u06ec"

    .line 71
    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x559d

    const v8, 0x2f40fc33

    xor-int/2addr v7, v8

    const v8, -0x1aaea97d

    goto/16 :goto_0

    .line 74
    :cond_5
    invoke-static {}, Ll/֡᩶;->ۛ֫᩵()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v6, Ll/ۙ᩸᩷;->֫:Landroid/os/Handler;

    return-void

    .line 68
    :sswitch_6
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 46
    :sswitch_7
    sput-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    sget v6, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v6, :cond_6

    goto :goto_2

    :cond_6
    const-string v6, "\u073f\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a75

    const v8, 0x7ef2d23c

    xor-int/2addr v7, v8

    const v8, -0x2e70b87

    goto/16 :goto_0

    .line 42
    :sswitch_8
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v6, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v6, :cond_7

    goto :goto_2

    :cond_7
    const-string v6, "\u06e7\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5d47

    const v8, -0x43e63ed9

    xor-int/2addr v7, v8

    const v8, 0x5cc71a7e

    goto/16 :goto_0

    .line 27
    :sswitch_9
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u1a74\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4ba5

    const v8, 0x635030ce

    xor-int/2addr v7, v8

    const v8, -0x4e59e63c

    goto/16 :goto_0

    .line 63
    :sswitch_a
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto :goto_4

    .line 42
    :sswitch_b
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v6, Ll/ۗ᩵;->֫۠۟:I

    if-gez v6, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    const-string v6, "\u06d7\u073f"

    .line 46
    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x207

    const v8, -0x48cfa770

    xor-int/2addr v7, v8

    const v8, -0x684760b0

    goto/16 :goto_0

    .line 58
    :sswitch_c
    invoke-static {v1}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object v6

    sput-object v6, Ll/ۙ᩸᩷;->ᩳ:Ll/ܿ۠᩵;

    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_3
    const-string v6, "\u1a75\u06db"

    .line 46
    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x785f

    const v8, 0x4bf9b2f5    # 3.2728554E7f

    xor-int/2addr v7, v8

    const v8, 0x35136c09

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06d9\u06d7"

    .line 58
    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6395

    const v8, 0xdd20e16

    xor-int/2addr v7, v8

    const v8, 0x6f66b466

    goto/16 :goto_0

    :goto_4
    const-string v6, "\u06dc\u0736"

    .line 27
    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5b59

    const v8, 0x2a6fdd8f

    xor-int/2addr v7, v8

    const v8, 0x24ee7f1f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073f\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1605

    const v8, -0x4184afb7

    xor-int/2addr v7, v8

    const v8, -0x621003bd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f29a978 -> :sswitch_c
        -0x70345fa4 -> :sswitch_b
        -0x5bd911c7 -> :sswitch_a
        -0x5370a761 -> :sswitch_b
        -0x4a820ed1 -> :sswitch_9
        -0x44a0b2ee -> :sswitch_8
        -0x30f30fb8 -> :sswitch_7
        -0x2a3a9603 -> :sswitch_6
        -0x296f52c2 -> :sswitch_5
        -0x28f69ae0 -> :sswitch_c
        -0x182bf212 -> :sswitch_4
        -0x98f867f -> :sswitch_a
        0xb523a67 -> :sswitch_7
        0xf0c673f -> :sswitch_3
        0x11dafa97 -> :sswitch_4
        0x16b33908 -> :sswitch_6
        0x2f194ee8 -> :sswitch_9
        0x3ce56211 -> :sswitch_3
        0x3f00bf08 -> :sswitch_2
        0x44da6180 -> :sswitch_1
        0x461e9e9a -> :sswitch_5
        0x514097bd -> :sswitch_8
        0x54f4c7d8 -> :sswitch_2
        0x629ec1e5 -> :sswitch_0
        0x6b1efa3f -> :sswitch_0
        0x7da374ee -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 2
        0x73s
        0x75a1s
        0x75ads
        0x75acs
        0x75acs
        0x75a7s
        0x75a1s
        0x75b6s
        0x75abs
        0x75b4s
        0x75abs
        0x75b6s
        0x75bbs
        0x75acs
        0x75b7s
        0x75aes
        0x75aes
        0x75e2s
        0x75a1s
        0x75a3s
        0x75acs
        0x75acs
        0x75ads
        0x75b6s
        0x75e2s
        0x75a0s
        0x75a7s
        0x75e2s
        0x75a1s
        0x75a3s
        0x75b1s
        0x75b6s
        0x75e2s
        0x75b6s
        0x75ads
        0x75e2s
        0x75acs
        0x75ads
        0x75acs
        0x75efs
        0x75acs
        0x75b7s
        0x75aes
        0x75aes
        0x75e2s
        0x75b6s
        0x75bbs
        0x75b2s
        0x75a7s
        0x75e2s
        0x75a3s
        0x75acs
        0x75a6s
        0x75b0s
        0x75ads
        0x75abs
        0x75a6s
        0x75ecs
        0x75acs
        0x75a7s
        0x75b6s
        0x75ecs
        0x7581s
        0x75ads
        0x75acs
        0x75acs
        0x75a7s
        0x75a1s
        0x75b6s
        0x75abs
        0x75b4s
        0x75abs
        0x75b6s
        0x75bbs
        0x758fs
        0x75a3s
        0x75acs
        0x75a3s
        0x75a5s
        0x75a7s
        0x75b0s
        0x20f1s
        0x1dc4s
        0x1dc6s
        0x1dd7s
        0x1de2s
        0x1dd3s
        0x1dd3s
        0x1dcfs
        0x1dcas
        0x1dc0s
        0x1dc2s
        0x1dd7s
        0x1dcas
        0x1dccs
        0x1dcds
        0x1deas
        0x1dcds
        0x1dc5s
        0x1dccs
        0x1d8bs
        0x1d8ds
        0x1d8ds
        0x1d8ds
        0x1d8as
        0x3b2s
        -0x699bs
        -0x698cs
        -0x698as
        -0x6982s
        -0x698cs
        -0x698es
        -0x6990s
        -0x69a5s
        -0x698cs
        -0x6988s
        -0x6990s
        -0x698es
        -0x6990s
        -0x699fs
        -0x69bbs
        -0x698cs
        -0x698as
        -0x6982s
        -0x698cs
        -0x698es
        -0x6990s
        -0x69a4s
        -0x6985s
        -0x698ds
        -0x6986s
        -0x69c3s
        -0x69c5s
        -0x69c5s
        -0x69c5s
        -0x69c4s
        0x97fs
        0x4433s
        0x443as
        0x4427s
        0x4438s
        0x4434s
        0x4421s
        0x4414s
        0x4427s
        0x4432s
        0x4426s
        0x4432s
        0x4430s
        0x4421s
        0x4406s
        0x4421s
        0x4427s
        0x443cs
        0x443bs
        0x4432s
        0x447ds
        0x447bs
        0x447bs
        0x447bs
        0x447cs
        0x1beas
        -0x2c31s
        -0x2c40s
        -0x2c3bs
        -0x2c24s
        -0x2c32s
        -0x2c3ds
        -0x2c33s
        -0x2c22s
        -0x2c38s
        -0x2c3es
        -0x2c27s
        -0x2c40s
        -0x2c40s
        -0x2c74s
        -0x2c31s
        -0x2c33s
        -0x2c3es
        -0x2c3es
        -0x2c3ds
        -0x2c28s
        -0x2c74s
        -0x2c32s
        -0x2c37s
        -0x2c74s
        -0x2c31s
        -0x2c33s
        -0x2c21s
        -0x2c28s
        -0x2c74s
        -0x2c28s
        -0x2c3ds
        -0x2c74s
        -0x2c3es
        -0x2c3ds
        -0x2c3es
        -0x2c7fs
        -0x2c3es
        -0x2c27s
        -0x2c40s
        -0x2c40s
        -0x2c74s
        -0x2c28s
        -0x2c2bs
        -0x2c24s
        -0x2c37s
        -0x2c74s
        -0x2c33s
        -0x2c3es
        -0x2c38s
        -0x2c22s
        -0x2c3ds
        -0x2c3bs
        -0x2c38s
        -0x2c7es
        -0x2c28s
        -0x2c37s
        -0x2c2cs
        -0x2c28s
        -0x2c7es
        -0x2c11s
        -0x2c40s
        -0x2c3bs
        -0x2c24s
        -0x2c32s
        -0x2c3ds
        -0x2c33s
        -0x2c22s
        -0x2c38s
        -0x2c1fs
        -0x2c33s
        -0x2c3es
        -0x2c33s
        -0x2c35s
        -0x2c37s
        -0x2c22s
        -0x565es
        -0x53abs
        -0x732es
        0x2342s
        -0x546as
        -0x547fs
        -0x5479s
        -0x547fs
        -0x5473s
        -0x546es
        -0x547fs
        -0x546as
        0x2668s
        -0x560fs
        -0x561as
        -0x5620s
        -0x561as
        -0x5616s
        -0x560bs
        -0x561as
        -0x560fs
        0x1822s
        0x3a0as
        0x3a0ds
        0x3a17s
        0x3a06s
        0x3a0ds
        0x3a17s
        0xe98s
        -0x7bbes
        -0x7506s
        -0x7b67s
        0x196fs
        -0x2e23s
        0x2042s
        -0x54a6s
        0x1183s
        0xe66s
        0xe78s
        0xe6cs
        0xe68s
        0xe67s
        0xe62s
        0xe7bs
        0xe69s
        0xe64s
        0xe6as
        0xe79s
        0xe6fs
        0xe65s
        0xe7es
        0xe67s
        0xe67s
        0xe2bs
        0xe68s
        0xe6as
        0xe65s
        0xe65s
        0xe64s
        0xe7fs
        0xe2bs
        0xe69s
        0xe6es
        0xe2bs
        0xe68s
        0xe6as
        0xe78s
        0xe7fs
        0xe2bs
        0xe7fs
        0xe64s
        0xe2bs
        0xe65s
        0xe64s
        0xe65s
        0xe26s
        0xe65s
        0xe7es
        0xe67s
        0xe67s
        0xe2bs
        0xe7fs
        0xe72s
        0xe7bs
        0xe6es
        0xe2bs
        0xe6as
        0xe65s
        0xe6fs
        0xe79s
        0xe64s
        0xe62s
        0xe6fs
        0xe25s
        0xe7fs
        0xe6es
        0xe73s
        0xe7fs
        0xe25s
        0xe48s
        0xe67s
        0xe62s
        0xe7bs
        0xe69s
        0xe64s
        0xe6as
        0xe79s
        0xe6fs
        0xe46s
        0xe6as
        0xe65s
        0xe6as
        0xe6cs
        0xe6es
        0xe79s
        -0x76ffs
        0x7e43s
        -0x60f0s
        0x1f3as
        0x7436s
        0x7434s
        0x7425s
        0x7407s
        0x7430s
        0x743ds
        0x7424s
        0x7434s
        0x7479s
        0x747fs
        0x747fs
        0x747fs
        0x7478s
        0x126as
        -0x6f7es
        -0x6f80s
        -0x6f6fs
        -0x6f4bs
        -0x6f7cs
        -0x6f7as
        -0x6f72s
        -0x6f7cs
        -0x6f7es
        -0x6f80s
        -0x6f58s
        -0x6f7cs
        -0x6f75s
        -0x6f7cs
        -0x6f7es
        -0x6f80s
        -0x6f69s
        -0x6f33s
        -0x6f35s
        -0x6f35s
        -0x6f35s
        -0x6f34s
        0xbd5s
        0x58b8s
        0x58bfs
        0x58b8s
        0x58a1s
        0x58a3s
        0x58b4s
        0x58a2s
        0x58b4s
        0x58a3s
        0x58a7s
        0x58b4s
        0x588es
        0x58b7s
        0x58b8s
        0x58bds
        0x58b4s
        0x588es
        0x58a5s
        0x58b8s
        0x58bcs
        0x58b4s
        0x1762s
        -0x77e4s
        -0x77e2s
        -0x77f1s
        -0x77c3s
        -0x77ees
        -0x77e9s
        -0x77e2s
        -0x77f8s
        -0x77c1s
        -0x77ees
        -0x77f7s
        -0x77ads
        -0x77abs
        -0x77abs
        -0x77abs
        -0x77aes
        0x12d5s
        0x2a73s
        0x2a71s
        0x2a60s
        0x2a42s
        0x2a75s
        0x2a78s
        0x2a61s
        0x2a71s
        0x2a3cs
        0x2a3as
        0x2a3as
        0x2a3as
        0x2a3ds
        0xdaas
        0x25cfs
        0x25cds
        0x25dcs
        0x25e9s
        0x25dbs
        0x25dbs
        0x25cds
        0x25dcs
        0x25dbs
        0x2580s
        0x2586s
        0x2586s
        0x2586s
        0x2581s
        0xa69s
        0x5d44s
        0x5d46s
        0x5d57s
        0x5d70s
        0x5d57s
        0x5d51s
        0x5d4as
        0x5d4ds
        0x5d44s
        0x5d0bs
        0x5d0ds
        0x5d0ds
        0x5d0ds
        0x5d0as
        0x18d5s
        0x3f63s
        0x3f64s
        0x3f7as
        0x3f7fs
        0x3f7es
        0x3f55s
        0x3f67s
        0x3f6fs
        0x3f7es
        0x3f62s
        0x3f65s
        0x3f6es
        0x3f64s
        0x3f7fs
        0x3f66s
        0x3f66s
        0x3f2as
        0x3f69s
        0x3f6bs
        0x3f64s
        0x3f64s
        0x3f65s
        0x3f7es
        0x3f2as
        0x3f68s
        0x3f6fs
        0x3f2as
        0x3f69s
        0x3f6bs
        0x3f79s
        0x3f7es
        0x3f2as
        0x3f7es
        0x3f65s
        0x3f2as
        0x3f64s
        0x3f65s
        0x3f64s
        0x3f27s
        0x3f64s
        0x3f7fs
        0x3f66s
        0x3f66s
        0x3f2as
        0x3f7es
        0x3f73s
        0x3f7as
        0x3f6fs
        0x3f2as
        0x3f6bs
        0x3f64s
        0x3f6es
        0x3f78s
        0x3f65s
        0x3f63s
        0x3f6es
        0x3f24s
        0x3f7cs
        0x3f63s
        0x3f6fs
        0x3f7ds
        0x3f24s
        0x3f63s
        0x3f64s
        0x3f7as
        0x3f7fs
        0x3f7es
        0x3f67s
        0x3f6fs
        0x3f7es
        0x3f62s
        0x3f65s
        0x3f6es
        0x3f24s
        0x3f43s
        0x3f64s
        0x3f7as
        0x3f7fs
        0x3f7es
        0x3f47s
        0x3f6fs
        0x3f7es
        0x3f62s
        0x3f65s
        0x3f6es
        0x3f47s
        0x3f6bs
        0x3f64s
        0x3f6bs
        0x3f6ds
        0x3f6fs
        0x3f78s
        0xfcfs
        -0x3033s
        -0x303es
        -0x3039s
        -0x3022s
        -0x3034s
        -0x303fs
        -0x3031s
        -0x3024s
        -0x3036s
        -0x3040s
        -0x3025s
        -0x303es
        -0x303es
        -0x3072s
        -0x3033s
        -0x3031s
        -0x3040s
        -0x3040s
        -0x303fs
        -0x3026s
        -0x3072s
        -0x3034s
        -0x3035s
        -0x3072s
        -0x3033s
        -0x3031s
        -0x3023s
        -0x3026s
        -0x3072s
        -0x3026s
        -0x303fs
        -0x3072s
        -0x3040s
        -0x303fs
        -0x3040s
        -0x307ds
        -0x3040s
        -0x3025s
        -0x303es
        -0x303es
        -0x3072s
        -0x3026s
        -0x3029s
        -0x3022s
        -0x3035s
        -0x3072s
        -0x3031s
        -0x3040s
        -0x3036s
        -0x3024s
        -0x303fs
        -0x3039s
        -0x3036s
        -0x3080s
        -0x3033s
        -0x303fs
        -0x3040s
        -0x3026s
        -0x3035s
        -0x3040s
        -0x3026s
        -0x3080s
        -0x3013s
        -0x303es
        -0x3039s
        -0x3022s
        -0x3034s
        -0x303fs
        -0x3031s
        -0x3024s
        -0x3036s
        -0x301ds
        -0x3031s
        -0x3040s
        -0x3031s
        -0x3037s
        -0x3035s
        -0x3024s
        0x2ccs
        -0x3656s
        -0x3658s
        -0x3647s
        -0x3672s
        -0x3654s
        -0x3652s
        -0x365bs
        -0x3658s
        -0x3677s
        -0x365cs
        -0x3641s
        -0x361bs
        -0x361ds
        -0x361ds
        -0x361ds
        -0x361cs
        0x1cf2s
        -0x45f6s
        -0x45f8s
        -0x45e7s
        -0x45c7s
        -0x45f8s
        -0x45ebs
        -0x45e7s
        -0x45bbs
        -0x45bds
        -0x45bds
        -0x45bds
        -0x45bcs
        0x1e83s
        0x5acbs
        0x5ac7s
        0x5ac6s
        0x5adcs
        0x5acds
        0x5ad0s
        0x5adcs
        0x1c28s
        -0x35c3s
        -0x35c1s
        -0x35d2s
        -0x35e7s
        -0x35cbs
        -0x35ccs
        -0x35d2s
        -0x35c1s
        -0x35ccs
        -0x35d2s
        -0x35f8s
        -0x35c1s
        -0x35d7s
        -0x35cbs
        -0x35cas
        -0x35d4s
        -0x35c1s
        -0x35d8s
        -0x358es
        -0x358cs
        -0x358cs
        -0x358cs
        -0x358ds
        0xca9s
        -0x348bs
        -0x3489s
        -0x349as
        -0x34bes
        -0x348ds
        -0x348fs
        -0x3487s
        -0x348ds
        -0x348bs
        -0x3489s
        -0x34a4s
        -0x348ds
        -0x3481s
        -0x3489s
        -0x34c6s
        -0x34c4s
        -0x34c4s
        -0x34c4s
        -0x34c5s
        0x21b4s
        -0x2049s
        -0x204bs
        -0x205cs
        -0x207es
        -0x204bs
        -0x205ds
        -0x2041s
        -0x205bs
        -0x205es
        -0x204ds
        -0x204bs
        -0x205ds
        -0x2008s
        -0x2002s
        -0x2002s
        -0x2002s
        -0x2007s
    .end array-data
.end method

.method public static final ֡()Z
    .locals 21

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

    const v15, -0x558a2b7d

    sget v16, Ll/֡᩶;->ܳܶ۠:I

    sget v17, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v18, "\u073a\u06e0"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v17, v18

    mul-int/lit8 v18, v18, -0x4d

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x5119

    const v20, -0x132bcefe

    xor-int v0, v0, v20

    const v20, 0x17136954

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v12, v11

    move-object v15, v14

    move/from16 v19, v18

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v18, -0x558a2b7d

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v18, v16

    mul-int/lit16 v5, v5, -0x1749

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    const/16 v14, 0xc

    .line 247
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v0

    if-ltz v0, :cond_6

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v0, "\u06e4\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1473

    const v19, 0x339a45fa

    xor-int v5, v5, v19

    const v19, 0x5f548d0e

    goto/16 :goto_6

    .line 246
    :sswitch_1
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_d

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v0, :cond_2

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_4

    .line 250
    :sswitch_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x1

    return v0

    :sswitch_6
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v5, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v5, :cond_1

    const-string v0, "\u1a73\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6037

    const v19, -0x34f5ecfc    # -9048836.0f

    xor-int v5, v5, v19

    const v19, -0x2c7162b4

    goto/16 :goto_6

    .line 249
    :sswitch_7
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u1a73\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x3589

    const v19, 0x21cbb47e

    xor-int v5, v5, v19

    const v19, 0x65f32554

    goto/16 :goto_6

    :sswitch_8
    const/4 v0, 0x0

    return v0

    .line 246
    :sswitch_9
    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v2

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 248
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v0, "\u06ec\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x35

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x335b

    const v19, -0x117ea643

    xor-int v5, v5, v19

    const v19, -0x3f594ec8

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u1a7b\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4a49

    const v19, 0x6ea739b0

    xor-int v5, v5, v19

    const v19, 0x6f9db286

    goto/16 :goto_6

    :sswitch_a
    const/16 v0, 0xd

    const/16 v3, 0x44

    .line 247
    invoke-static {v15, v0, v3, v11}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 248
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_3

    :cond_2
    :goto_1
    const-string v0, "\u06d9\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1a6d

    const v19, -0xfd6cdf7

    xor-int v5, v5, v19

    const v19, -0x36139c65

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u1a77\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x1a81

    const v19, -0x17c5b213

    xor-int v5, v5, v19

    const v19, -0x5ed63f41

    goto/16 :goto_6

    .line 247
    :sswitch_b
    sget-object v15, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 246
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u073a\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x5f

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x628f

    const v19, -0x553437be    # -3.6199E-13f

    xor-int v5, v5, v19

    const v19, -0x6057605e

    goto/16 :goto_6

    :sswitch_c
    invoke-static {v12, v13, v14, v11}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    .line 247
    invoke-static {v1, v0}, Ll/֨۫;->᩵۫ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v0, "\u1a74\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x420f

    const v19, 0x36270f1

    xor-int v5, v5, v19

    const v19, -0x22bca11c

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06d7\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x40dd

    const v19, -0xcea9637

    xor-int v5, v5, v19

    const v19, -0x79f4b439

    goto/16 :goto_6

    :sswitch_d
    const/4 v13, 0x1

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v0

    if-ltz v0, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v0, "\u06e0\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x79

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x348b

    const v19, -0x5391eae2

    xor-int v5, v5, v19

    const v19, -0x59b11aa5

    goto/16 :goto_6

    .line 246
    :sswitch_e
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v1

    sget-object v12, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v0

    if-gtz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u05a8\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x2cd7

    const v19, -0x2193ce5b

    xor-int v5, v5, v19

    const v19, -0x617cc5b2

    goto/16 :goto_6

    :sswitch_f
    const/16 v0, 0x3dae

    const/16 v11, 0x3dae

    goto :goto_2

    :sswitch_10
    const/16 v0, 0x75c2

    const/16 v11, 0x75c2

    :goto_2
    const-string v0, "\u1a7b\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1129

    const v19, 0x19b138cf

    xor-int v5, v5, v19

    const v19, 0x61404d75

    goto/16 :goto_6

    :sswitch_11
    add-int v0, v9, v10

    sub-int/2addr v0, v8

    if-ltz v0, :cond_9

    const-string v0, "\u06eb\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, -0x6d41

    const v19, 0x51eb2c3b

    xor-int v5, v5, v19

    const v19, 0x7bb861e2

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u0733\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x6ee9

    const v19, -0x14d57600

    xor-int v5, v5, v19

    const v19, -0x5599a943

    goto/16 :goto_6

    :sswitch_12
    mul-int v9, v7, v7

    const v10, 0xc1ed69

    .line 247
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_a

    :goto_3
    const-string v0, "\u06e0\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x7b91

    const v19, -0x40347bc3

    xor-int v5, v5, v19

    const v19, 0x4e930058    # 1.23313664E9f

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u06e7\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x17

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x7577

    const v19, -0x3dcb7173

    xor-int v5, v5, v19

    const v19, -0x5dff954b

    goto/16 :goto_6

    :sswitch_13
    mul-int/lit16 v8, v7, 0x1bda

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_b

    :goto_4
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0xc65

    const v19, 0x58f56098

    xor-int v5, v5, v19

    const v19, 0xf450776

    goto :goto_6

    :cond_b
    const-string v0, "\u1a73\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x6d

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x4e8b

    const v19, 0x45421e01

    xor-int v5, v5, v19

    const v19, -0x57a95805

    goto :goto_6

    :sswitch_14
    aget-short v7, v20, v6

    .line 246
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_c

    goto :goto_5

    :cond_c
    const-string v0, "\u06eb\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x66d3

    const v19, 0x39fe0ff8

    xor-int v5, v5, v19

    const v19, -0x4a7b5a31

    goto :goto_6

    :sswitch_15
    sget-object v20, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/4 v6, 0x0

    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_e

    :cond_d
    :goto_5
    const-string v0, "\u1a73\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x79

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x2379

    const v19, 0x77903bca

    xor-int v5, v5, v19

    const v19, -0x4fb66061

    goto :goto_6

    :cond_e
    const-string v0, "\u1a7b\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x1f77

    const v19, 0x6d16c201

    xor-int v5, v5, v19

    const v19, 0x7cc71d0f

    :goto_6
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79811da5 -> :sswitch_e
        -0x782e355c -> :sswitch_11
        -0x780f74ab -> :sswitch_b
        -0x77bc6c45 -> :sswitch_14
        -0x754f5f0d -> :sswitch_0
        -0x70c08292 -> :sswitch_10
        -0x6cffd920 -> :sswitch_f
        -0x6ca3a806 -> :sswitch_3
        -0x6bce9b2d -> :sswitch_7
        -0x6b90f4c5 -> :sswitch_1
        -0x6a821b4b -> :sswitch_d
        -0x4e0f5bec -> :sswitch_9
        -0x489f7b3c -> :sswitch_14
        -0x45ebe21b -> :sswitch_0
        -0x1e84b4cd -> :sswitch_8
        -0x1c91cfb5 -> :sswitch_6
        -0x10cb683c -> :sswitch_13
        -0xf29a00a -> :sswitch_f
        0x27617d6 -> :sswitch_5
        0x450bc0d -> :sswitch_9
        0x5e4be84 -> :sswitch_1
        0x1003ee3a -> :sswitch_a
        0x1d027462 -> :sswitch_c
        0x21a3d85a -> :sswitch_a
        0x25f8ea51 -> :sswitch_2
        0x2690f56f -> :sswitch_4
        0x26de12c0 -> :sswitch_b
        0x270a12c9 -> :sswitch_5
        0x2e2a46e3 -> :sswitch_10
        0x352e667e -> :sswitch_8
        0x358132ae -> :sswitch_13
        0x3bf399f6 -> :sswitch_e
        0x3f40f0cb -> :sswitch_6
        0x40495e97 -> :sswitch_3
        0x4bd845c5 -> :sswitch_12
        0x55f6d378 -> :sswitch_4
        0x570492a6 -> :sswitch_15
        0x5d8a73d3 -> :sswitch_2
        0x5f4b885a -> :sswitch_7
        0x646377b1 -> :sswitch_15
        0x6a044d9b -> :sswitch_d
        0x7251bbec -> :sswitch_12
        0x728c50da -> :sswitch_c
        0x73f503f5 -> :sswitch_11
    .end sparse-switch
.end method

.method public static final ֨()V
    .locals 1

    const/4 v0, 0x1

    .line 55
    sput-boolean v0, Ll/ۙ᩸᩷;->ܽ:Z

    return-void
.end method

.method public static final ֫()Landroid/content/pm/ApplicationInfo;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x2d5364fb

    sget v11, Ll/ۖ;->᩹۟ۘ:I

    sget v12, Ll/֡᩶;->ܳܶ۠:I

    const-string v13, "\u073d\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x65

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6cf5

    const v15, -0x25efa82d

    xor-int/2addr v14, v15

    const v15, 0x38c8e19

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x2fcb

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    aget-short v3, v1, v2

    .line 141
    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v13, :cond_7

    goto/16 :goto_4

    :sswitch_0
    sget-boolean v13, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v13, :cond_a

    goto :goto_1

    :sswitch_1
    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v13, :cond_c

    goto/16 :goto_4

    .line 140
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v13

    if-lez v13, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    :goto_1
    const-string v13, "\u06e2\u06d8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x29

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1083

    const v15, 0x58464f0

    xor-int/2addr v14, v15

    const v15, 0x5589ea16

    goto :goto_0

    .line 142
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0x17

    .line 139
    invoke-static {v8, v9, v1, v7}, Ll/֫᩺;->ۤᩴܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_6
    const/16 v9, 0x52

    sget v13, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v13, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v13, "\u1a76\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7057

    const v15, -0x5c5720d5

    xor-int/2addr v14, v15

    const v15, -0x45619f33

    goto :goto_0

    :sswitch_7
    sget-object v8, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 141
    sget v13, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v13, "\u073a\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6343

    const v15, -0x5922a6b2

    xor-int/2addr v14, v15

    const v15, 0x471c4c5e

    goto/16 :goto_0

    .line 139
    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    sget-boolean v13, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v13, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v13, "\u1a73\u06da"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x57

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7e91

    const v15, 0x689c7624

    xor-int/2addr v14, v15

    const v15, -0x50d286d6

    goto/16 :goto_0

    :sswitch_9
    const v7, 0xfc51

    goto :goto_2

    :sswitch_a
    const/16 v7, 0x1da3

    :goto_2
    const-string v13, "\u05a1\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5f91

    const v15, 0x50c5bedd

    xor-int/2addr v14, v15

    const v15, 0x2e0aa5b6

    goto/16 :goto_0

    :sswitch_b
    mul-int v13, v3, v6

    sub-int v13, v5, v13

    if-gez v13, :cond_3

    const-string v13, "\u05a8\u06d6"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6d3b

    const v15, -0x4bda8b23

    xor-int/2addr v14, v15

    const v15, -0x5066b7eb

    goto/16 :goto_0

    :cond_3
    const-string v13, "\u073d\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x3b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x442f

    const v15, -0x5d2e6a07

    xor-int/2addr v14, v15

    const v15, -0x6c59d00a

    goto/16 :goto_0

    :sswitch_c
    mul-int v5, v4, v4

    const/16 v6, 0x5408

    sget v13, Ll/ۛ;->᩺᩻֫:I

    if-ltz v13, :cond_4

    goto :goto_3

    :cond_4
    const-string v13, "\u06d8\u1a76"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x1f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5841

    const v15, 0x48c5463c    # 404017.88f

    xor-int/2addr v14, v15

    const v15, -0x7bfd35aa

    goto/16 :goto_0

    :sswitch_d
    add-int/lit16 v4, v3, 0x1502

    .line 142
    sget v13, Ll/۟;->ۗۤۛ:I

    if-eqz v13, :cond_5

    :goto_3
    const-string v13, "\u1a77\u1a78"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2465

    const v15, 0x7523f495

    xor-int/2addr v14, v15

    const v15, 0x17623d2e

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u0733\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x5d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x56d7

    const v15, 0x5dee6731

    xor-int/2addr v14, v15

    const v15, -0x4aaf56a0

    goto/16 :goto_0

    :cond_6
    :goto_4
    const-string v13, "\u1a73\u05a1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x39c3

    const v15, 0x25dfa4be

    xor-int/2addr v14, v15

    const v15, -0x24b18248

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06db\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x33b7

    const v15, 0x1c277c23

    xor-int/2addr v14, v15

    const v15, -0x2a6d7e5f

    goto/16 :goto_0

    :sswitch_e
    sget v13, Ll/۟;->ۗۤۛ:I

    if-eqz v13, :cond_8

    goto :goto_5

    :cond_8
    const-string v13, "\u06df\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6edb

    const v15, -0x7b989a37

    xor-int/2addr v14, v15

    const v15, -0x5aa492ce

    goto/16 :goto_0

    .line 140
    :sswitch_f
    sget v13, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v13, :cond_9

    goto :goto_5

    :cond_9
    const-string v13, "\u1a73\u05ab"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4ef5

    const v15, 0x35da5d99

    xor-int/2addr v14, v15

    const v15, -0x56cd5486

    goto/16 :goto_0

    :sswitch_10
    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v13, :cond_b

    :cond_a
    :goto_5
    const-string v13, "\u1a78\u0733"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x43

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7881

    const v15, 0x367cc0ae

    xor-int/2addr v14, v15

    const v15, -0x7382b484

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u073f\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2c3b

    const v15, 0x42093cb

    xor-int/2addr v14, v15

    const v15, -0x7ffc03e3

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x51

    sget v13, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v13, :cond_d

    :cond_c
    :goto_6
    const-string v13, "\u1a75\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1d1d

    const v15, 0x17ca4745

    xor-int/2addr v14, v15

    const v15, 0x2edf73b0

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a79\u05a8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4bf

    const v15, -0x466ba480

    xor-int/2addr v14, v15

    const v15, -0xe8929dd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70dd4a75 -> :sswitch_d
        -0x64a4c77a -> :sswitch_4
        -0x61b5c5fd -> :sswitch_6
        -0x5ff01788 -> :sswitch_3
        -0x543afcd6 -> :sswitch_10
        -0x436b3042 -> :sswitch_11
        -0x419b30c8 -> :sswitch_c
        -0x3e45abfd -> :sswitch_0
        -0x34b8a370 -> :sswitch_3
        -0x2a88c1e2 -> :sswitch_b
        -0x2593409b -> :sswitch_e
        -0x23ead6b0 -> :sswitch_b
        -0x2049aaf4 -> :sswitch_5
        -0x11812a76 -> :sswitch_1
        -0xc7e825c -> :sswitch_e
        -0x8753b6c -> :sswitch_2
        0xbbe9ecb -> :sswitch_2
        0x102ce145 -> :sswitch_10
        0x1fd5943b -> :sswitch_c
        0x2c6dc2c4 -> :sswitch_d
        0x31789965 -> :sswitch_5
        0x3708b61d -> :sswitch_1
        0x53424b5f -> :sswitch_0
        0x54bc36a6 -> :sswitch_7
        0x5876b9ca -> :sswitch_f
        0x59559672 -> :sswitch_f
        0x6d4d2ec6 -> :sswitch_11
        0x6def583a -> :sswitch_9
        0x7303a708 -> :sswitch_4
        0x74baff96 -> :sswitch_8
        0x7537f5e5 -> :sswitch_a
        0x75e71fa2 -> :sswitch_6
        0x76cf721d -> :sswitch_9
        0x7b54322d -> :sswitch_8
        0x7c30f7fd -> :sswitch_7
        0x7f9887a7 -> :sswitch_a
    .end sparse-switch
.end method

.method public static final ֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 23

    move-object/from16 v0, p0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x4d775360

    sget v18, Ll/ۗ᩵;->֫۠۟:I

    sget v19, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v20, "\u1a79\u1a74"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    xor-int v1, v20, v18

    mul-int/lit16 v1, v1, 0x7665

    const v22, -0x41448214

    xor-int v1, v1, v22

    const v22, 0x4ab8992d    # 6048918.5f

    xor-int v20, v20, v22

    move-object v3, v2

    move-object/from16 v16, v5

    move-object v13, v12

    move-object v6, v15

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const v20, -0x4d775360

    const/16 v22, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v9, v20, v18

    mul-int/lit16 v9, v9, -0xf21

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    sget-object v13, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v14, 0x6a

    .line 224
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_4

    goto/16 :goto_4

    .line 59
    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v1, :cond_6

    goto/16 :goto_4

    .line 107
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_c

    goto/16 :goto_3

    .line 170
    :sswitch_2
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_9

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto/16 :goto_3

    .line 51
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x13

    .line 235
    invoke-static {v6, v7, v0, v12}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v5

    :sswitch_6
    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    sget-object v6, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v7, 0x75

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "\u1a78\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x4b

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0xa03

    const v21, -0x48882492

    xor-int v9, v9, v21

    const v21, 0x31024f6a

    goto/16 :goto_6

    .line 5
    :sswitch_7
    invoke-static {v0, v2}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    .line 53
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06d8\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x7f

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x7113

    const v21, 0x1f1eea10

    xor-int v9, v9, v21

    const v21, 0x331ee4c1

    goto/16 :goto_6

    :cond_1
    const-string v1, "\u06ec\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x73

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x68a5

    const v21, 0x4b1d3b65    # 1.0304357E7f

    xor-int v9, v9, v21

    const v21, 0x12a57fdc

    goto/16 :goto_6

    .line 0
    :sswitch_8
    invoke-static {v13, v14, v15, v12}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u06e7\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x7d

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, -0x3377

    const v21, 0x535b37a2

    xor-int v9, v9, v21

    const v21, -0x2187ed4c

    goto/16 :goto_6

    :sswitch_9
    const/16 v15, 0xb

    .line 38
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06dc\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x4ab7

    const v21, -0x685f9582

    xor-int v9, v9, v21

    const v21, 0x44b094a7

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u06db\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, -0x2419

    const v21, -0x433aa7cf

    xor-int v9, v9, v21

    const v21, -0x269feb14

    goto/16 :goto_6

    :sswitch_a
    const/16 v1, 0xe9c

    const/16 v12, 0xe9c

    goto :goto_1

    :sswitch_b
    const v1, 0x9615

    const v12, 0x9615

    :goto_1
    const-string v1, "\u06df\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x3f9b

    const v21, 0x24b64c35

    xor-int v9, v9, v21

    const v21, 0x3f406eb2

    goto/16 :goto_6

    :sswitch_c
    mul-int v1, v8, v11

    sub-int v1, v10, v1

    if-ltz v1, :cond_5

    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x3

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, 0x7c0f

    const v21, -0x751ea039

    xor-int v9, v9, v21

    const v21, 0x5fb8d193

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06d7\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x7e9b

    const v21, -0x28b6defb

    xor-int v9, v9, v21

    const v21, -0x6092ea9e

    goto/16 :goto_6

    :sswitch_d
    const/16 v11, 0x7260

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_7

    :cond_6
    :goto_2
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x38b1

    const v21, 0x4e2bf5af    # 7.2125126E8f

    xor-int v9, v9, v21

    const v21, -0x10dd560

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x60c3

    const v21, -0x1f6434f8

    xor-int v9, v9, v21

    const v21, 0x3fab4fef

    goto/16 :goto_6

    :sswitch_e
    const v1, 0xcc66900

    add-int v10, v22, v1

    .line 116
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_8

    :goto_3
    const-string v1, "\u1a75\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, -0x6e11

    const v21, -0x698d456c

    xor-int v9, v9, v21

    const v21, 0x6ba8af9c

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x5d

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x2b65

    const v21, -0x671ee0e3

    xor-int v9, v9, v21

    const v21, 0x338874e1

    goto/16 :goto_6

    :sswitch_f
    aget-short v8, v16, v17

    mul-int v22, v8, v8

    .line 36
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    :goto_4
    const-string v1, "\u1a73\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, -0x6f0f

    const v21, -0x107f1c9

    xor-int v9, v9, v21

    const v21, -0x5fa76e3f

    goto :goto_6

    :cond_a
    const-string v1, "\u06e4\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x439b

    const v21, 0x20524f6b

    xor-int v9, v9, v21

    const v21, 0x64acd7e3

    goto :goto_6

    :sswitch_10
    const/16 v17, 0x69

    .line 9
    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x1b

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0x5ac1

    const v21, 0x23259b9e

    xor-int v9, v9, v21

    const v21, -0x3a4c0d56

    goto :goto_6

    :sswitch_11
    sget-object v16, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 106
    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v9, v1, v19

    mul-int/lit16 v9, v9, -0xb83

    const v21, -0x59ea0639

    xor-int v9, v9, v21

    const v21, -0x47b5c490

    goto :goto_6

    :cond_d
    const-string v1, "\u0736\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x5c2b

    const v21, -0x6a8d4ddd

    xor-int v9, v9, v21

    const v21, 0x34f1579d

    :goto_6
    xor-int v21, v1, v21

    move v1, v9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77851852 -> :sswitch_3
        -0x711941aa -> :sswitch_3
        -0x5d5c41cb -> :sswitch_2
        -0x5c212f3b -> :sswitch_9
        -0x4e2f51b5 -> :sswitch_a
        -0x4d13ed04 -> :sswitch_4
        -0x4a2d115b -> :sswitch_6
        -0x46d97339 -> :sswitch_c
        -0x46cce73a -> :sswitch_e
        -0x457d6e2b -> :sswitch_a
        -0x408775d2 -> :sswitch_b
        -0x4061a6a4 -> :sswitch_10
        -0x37796ceb -> :sswitch_d
        -0x2fb06e63 -> :sswitch_1
        -0x2e47afbd -> :sswitch_e
        -0x22eeb930 -> :sswitch_5
        -0x2213244b -> :sswitch_0
        -0x196e8288 -> :sswitch_0
        -0x1027c1b2 -> :sswitch_7
        -0xc9ca2c6 -> :sswitch_7
        -0xbf49474 -> :sswitch_b
        -0x82250c4 -> :sswitch_9
        0xd5d5b7b -> :sswitch_2
        0xe1aa742 -> :sswitch_f
        0x1116f2c3 -> :sswitch_c
        0x1a4cd0a2 -> :sswitch_10
        0x1e22fac4 -> :sswitch_d
        0x2366471c -> :sswitch_f
        0x26348e95 -> :sswitch_11
        0x2f336d50 -> :sswitch_4
        0x3cc12a0d -> :sswitch_5
        0x40b70e15 -> :sswitch_6
        0x417a296f -> :sswitch_8
        0x42fbee29 -> :sswitch_8
        0x571ce2b7 -> :sswitch_1
        0x6406b7c0 -> :sswitch_11
    .end sparse-switch
.end method

.method public static final ֫(I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 103
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p0}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final varargs ֫(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 25

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0x4a8be0ca    # 4583525.0f

    sget v18, Ll/֡᩶;->ܳܶ۠:I

    sget v19, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v20, "\u06e8\u06e2"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    mul-int/lit8 v20, v20, 0x29

    xor-int v1, v20, v19

    mul-int/lit16 v1, v1, 0x3d11

    const v22, 0x11debd9a

    xor-int v1, v1, v22

    const v22, 0x2091f477

    xor-int v20, v20, v22

    move-object v3, v2

    move-object/from16 v16, v5

    move-object v13, v12

    move-object v6, v15

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const v20, 0x4a8be0ca    # 4583525.0f

    const/16 v22, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v9, v20, v19

    mul-int/lit16 v9, v9, -0x175d

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    .line 66
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_1

    goto :goto_1

    .line 94
    :sswitch_0
    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_0

    :goto_1
    move/from16 v9, p0

    move-object/from16 v21, v3

    goto/16 :goto_9

    :cond_0
    move/from16 v9, p0

    move-object/from16 v21, v3

    goto/16 :goto_8

    .line 71
    :sswitch_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_2

    :cond_1
    move/from16 v9, p0

    move-object/from16 v21, v3

    goto/16 :goto_4

    :cond_2
    move/from16 v9, p0

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    goto :goto_1

    .line 50
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v0, 0xe

    .line 95
    invoke-static {v6, v7, v0, v12}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v5

    :sswitch_5
    const/16 v7, 0x93

    .line 39
    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u0730\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x37

    xor-int v9, v1, v18

    mul-int/lit16 v9, v9, 0x3553

    const v21, -0x87c7fb8

    xor-int v9, v9, v21

    const v21, 0x688a2f36

    xor-int v21, v1, v21

    move v1, v9

    goto :goto_0

    .line 95
    :sswitch_6
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move/from16 v9, p0

    invoke-static {v3, v9, v1}, Ll/ۘܿ;->᩵ܽۢ(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_4

    :goto_2
    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    move-object/from16 v21, v3

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x7163

    const v23, 0x61ec6133

    xor-int v3, v3, v23

    const v23, 0x77b1afac

    goto :goto_3

    :cond_4
    move-object/from16 v21, v3

    const-string v1, "\u06d6\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x33

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0xf37

    const v23, -0x79070329

    xor-int v3, v3, v23

    const v23, 0x12905a96    # 9.110009E-28f

    :goto_3
    xor-int v1, v1, v23

    move-object/from16 v24, v21

    move/from16 v21, v1

    move v1, v3

    move-object/from16 v3, v24

    goto/16 :goto_0

    :sswitch_7
    move/from16 v9, p0

    .line 0
    invoke-static {v0, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v3

    array-length v4, v0

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u0730\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x5d

    xor-int v0, v1, v19

    mul-int/lit16 v0, v0, 0x11c3

    const v21, 0x660a91a9

    xor-int v0, v0, v21

    const v21, 0x4e3b35d1    # 7.8521658E8f

    xor-int v21, v1, v21

    move v1, v0

    goto/16 :goto_b

    :sswitch_8
    move/from16 v9, p0

    move-object/from16 v21, v3

    .line 0
    invoke-static {v13, v14, v15, v12}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v2

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_6

    :goto_4
    const-string v0, "\u05ab\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x2a2d

    const v3, -0x65315189

    xor-int/2addr v1, v3

    const v3, -0x3149e0d0

    goto/16 :goto_a

    :cond_6
    const-string v0, "\u06e2\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x114f

    const v3, 0x136b53eb

    xor-int/2addr v1, v3

    const v3, -0x515df65b

    goto/16 :goto_a

    :sswitch_9
    move/from16 v9, p0

    move-object/from16 v21, v3

    sget-object v13, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v14, 0x89

    const/16 v15, 0xa

    .line 16
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u073d\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x2f43

    const v3, -0x19648906

    xor-int/2addr v1, v3

    const v3, -0x456ad1de

    goto/16 :goto_a

    :sswitch_a
    move/from16 v9, p0

    move-object/from16 v21, v3

    const/16 v0, 0x31cc

    const/16 v12, 0x31cc

    goto :goto_5

    :sswitch_b
    move/from16 v9, p0

    move-object/from16 v21, v3

    const/16 v0, 0x4455

    const/16 v12, 0x4455

    :goto_5
    const-string v0, "\u06e8\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x6d

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1581

    const v3, 0x78f10860

    xor-int/2addr v1, v3

    const v3, -0x21251b16

    goto/16 :goto_a

    :sswitch_c
    move/from16 v9, p0

    move-object/from16 v21, v3

    add-int v0, v8, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-ltz v0, :cond_8

    const-string v0, "\u06e8\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x6f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x3dad

    const v3, 0x1954c778    # 1.10004255E-23f

    xor-int/2addr v1, v3

    const v3, -0x5966a547

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06db\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0xc99

    const v3, 0x1b33728

    xor-int/2addr v1, v3

    const v3, 0x6c20eaf8

    goto/16 :goto_a

    :sswitch_d
    move/from16 v9, p0

    move-object/from16 v21, v3

    add-int/lit8 v10, v22, 0x1

    const/4 v11, 0x1

    .line 85
    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u073a\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x2e9

    const v3, -0x3c872f30

    xor-int/2addr v1, v3

    const v3, -0x4e0f7355    # -7.0009114E-9f

    goto/16 :goto_a

    :sswitch_e
    move/from16 v9, p0

    move-object/from16 v21, v3

    aget-short v8, v16, v17

    mul-int/lit8 v22, v8, 0x2

    .line 65
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_a

    :goto_6
    move-object/from16 v3, v21

    :goto_7
    const-string v0, "\u1a78\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2a91

    const v21, 0x3fdf7f59

    xor-int v1, v1, v21

    const v21, -0x35631492    # -5141943.0f

    xor-int v21, v0, v21

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u0736\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x49b5

    const v3, 0x373a96da

    xor-int/2addr v1, v3

    const v3, 0x7b8491a2

    goto/16 :goto_a

    :sswitch_f
    move/from16 v9, p0

    move-object/from16 v21, v3

    const/16 v17, 0x88

    .line 21
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_b

    goto :goto_8

    :cond_b
    const-string v0, "\u05a8\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x7f

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x3d25

    const v3, -0x435df0f

    xor-int/2addr v1, v3

    const v3, 0xb31cc4f

    goto :goto_a

    :sswitch_10
    move/from16 v9, p0

    move-object/from16 v21, v3

    sget-object v16, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 91
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_8
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0xa75

    const v3, 0x47e93e37

    xor-int/2addr v1, v3

    const v3, -0x38e5af3a

    goto :goto_a

    :cond_c
    const-string v0, "\u1a78\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x71bb

    const v3, 0x6cf20f10

    xor-int/2addr v1, v3

    const v3, 0x101698ad    # 2.96999E-29f

    goto :goto_a

    :sswitch_11
    move/from16 v9, p0

    move-object/from16 v21, v3

    .line 59
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x2fe1

    const v3, 0x4d15ebf4    # 1.57204288E8f

    xor-int/2addr v1, v3

    const v3, 0x7f3c1a5a

    goto :goto_a

    :cond_d
    const-string v0, "\u05a8\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0xebd

    const v3, 0x42732bf

    xor-int/2addr v1, v3

    const v3, 0x4f5e95c4

    :goto_a
    xor-int/2addr v0, v3

    move-object/from16 v3, v21

    move/from16 v21, v0

    :goto_b
    move-object/from16 v0, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6255a676 -> :sswitch_1
        -0x61ea9081 -> :sswitch_a
        -0x59f40bcc -> :sswitch_11
        -0x59564295 -> :sswitch_11
        -0x4b5a66ac -> :sswitch_1
        -0x47c939ac -> :sswitch_d
        -0x4037b50f -> :sswitch_6
        -0x3e3a2bd0 -> :sswitch_f
        -0x39cf1dda -> :sswitch_2
        -0x282b11c3 -> :sswitch_2
        -0x1fdad9a8 -> :sswitch_8
        -0x1da5a011 -> :sswitch_9
        -0x18bada1b -> :sswitch_10
        -0x14bf7ae4 -> :sswitch_c
        -0x10175cb4 -> :sswitch_9
        -0xc7405ea -> :sswitch_4
        -0xc64e7d9 -> :sswitch_5
        -0x9a261da -> :sswitch_e
        -0x761da3d -> :sswitch_6
        0x3aac72b -> :sswitch_b
        0x63c2dd7 -> :sswitch_e
        0x92f092a -> :sswitch_0
        0xe0e2e00 -> :sswitch_b
        0x1051dbc8 -> :sswitch_7
        0x14386322 -> :sswitch_f
        0x18bbbbe7 -> :sswitch_3
        0x1c2cc451 -> :sswitch_0
        0x22ead83e -> :sswitch_c
        0x230a46eb -> :sswitch_d
        0x23dae31f -> :sswitch_7
        0x258c43f4 -> :sswitch_3
        0x357fb85b -> :sswitch_8
        0x3690eabe -> :sswitch_a
        0x3c2de7ac -> :sswitch_5
        0x64df0651 -> :sswitch_10
        0x7985774c -> :sswitch_4
    .end sparse-switch
.end method

.method public static ֫(ILandroid/view/View;)V
    .locals 6

    const v0, -0x4a382bf2

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b2d

    const v5, -0x41fdaf08

    xor-int/2addr v4, v5

    const v5, -0x4a4f94d0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x113

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_c

    goto/16 :goto_5

    .line 104
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_5

    .line 132
    :sswitch_1
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_b

    goto/16 :goto_4

    .line 74
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_8

    goto :goto_1

    .line 100
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    :goto_1
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x164d

    const v5, -0xe7c414e

    xor-int/2addr v4, v5

    const v5, 0x37fc03b6

    goto :goto_0

    .line 104
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    :sswitch_5
    add-int/lit8 v3, p0, 0x1

    .line 189
    invoke-static {v3, p1}, Ll/ۙ᩸᩷;->ۧ(ILandroid/view/View;)V

    goto :goto_2

    .line 199
    :sswitch_6
    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x655

    const v5, 0x278d69ec

    xor-int/2addr v4, v5

    const v5, 0x687d4f3a

    goto :goto_0

    :sswitch_7
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u1a73\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1055

    const v5, -0x7d88a573

    xor-int/2addr v4, v5

    const v5, 0x17b66f13

    goto :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u06e4\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7145

    const v5, 0x5e9b0c9e

    xor-int/2addr v4, v5

    const v5, 0x5033da9c

    goto/16 :goto_0

    :cond_0
    :goto_2
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c1

    const v5, 0x1d3b4c84

    xor-int/2addr v4, v5

    const v5, -0x67b0e89d

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v3, "\u06e0\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1cf1

    const v5, -0x13c4c065

    xor-int/2addr v4, v5

    const v5, 0x16d9531c

    goto/16 :goto_0

    .line 37
    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v3, "\u1a74\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x29ad

    const v5, -0x4a82ca3e

    xor-int/2addr v4, v5

    const v5, 0x234665f5

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d05

    const v5, 0x41393d8e    # 11.577528f

    xor-int/2addr v4, v5

    const v5, -0x4b2f35c7

    goto/16 :goto_0

    .line 77
    :sswitch_d
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u06df\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3861

    const v5, -0x15a7e2d7

    xor-int/2addr v4, v5

    const v5, 0x404cdc49

    goto/16 :goto_0

    .line 69
    :sswitch_e
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4653

    const v5, 0x5cebe63b

    xor-int/2addr v4, v5

    const v5, -0x73f5639b

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1827

    const v5, -0x3e830fa

    xor-int/2addr v4, v5

    const v5, 0x2c1679fe

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05ab\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x141

    const v5, 0x1a9700b

    xor-int/2addr v4, v5

    const v5, -0xc698965

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x630b

    const v5, -0x3f22c1bb

    xor-int/2addr v4, v5

    const v5, 0x35f7491f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d6\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe59

    const v5, 0x119fc65d

    xor-int/2addr v4, v5

    const v5, -0x3fee5bff

    goto/16 :goto_0

    .line 45
    :sswitch_11
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x667

    const v5, -0x567c7c6f

    xor-int/2addr v4, v5

    const v5, -0x6c96f586

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v3, "\u06da\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3761

    const v5, 0x3ea4ccc6

    xor-int/2addr v4, v5

    const v5, -0x38a1c127

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x63b9

    const v5, -0x425c0ebc

    xor-int/2addr v4, v5

    const v5, 0x53b497df

    goto/16 :goto_0

    .line 91
    :sswitch_12
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_d

    :goto_6
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c19

    const v5, -0x1788131d

    xor-int/2addr v4, v5

    const v5, -0x59cc21d5

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d8\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x735b

    const v5, -0x32d2f8fa

    xor-int/2addr v4, v5

    const v5, -0x27231e8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76c5d5b5 -> :sswitch_2
        -0x6bba8e98 -> :sswitch_1
        -0x52a94156 -> :sswitch_c
        -0x4ed4e03a -> :sswitch_5
        -0x4d5519d7 -> :sswitch_a
        -0x3bb33e73 -> :sswitch_11
        -0x39f3a661 -> :sswitch_6
        -0x3860cb12 -> :sswitch_0
        -0x2afe1438 -> :sswitch_b
        -0x27896a72 -> :sswitch_2
        -0x2396d901 -> :sswitch_8
        -0x1e338edf -> :sswitch_11
        -0x195263a5 -> :sswitch_0
        -0x1898bbde -> :sswitch_e
        -0xd03d8c3 -> :sswitch_a
        -0xad38a67 -> :sswitch_9
        -0x67cf90c -> :sswitch_8
        -0x5007a48 -> :sswitch_5
        -0x237398b -> :sswitch_b
        -0x19292d1 -> :sswitch_4
        0x8dc195e -> :sswitch_3
        0x110ab489 -> :sswitch_7
        0x1168e0ba -> :sswitch_f
        0x1489dcef -> :sswitch_12
        0x23c57c26 -> :sswitch_12
        0x241508be -> :sswitch_1
        0x2ac04fdd -> :sswitch_e
        0x2b6cd424 -> :sswitch_3
        0x2e683572 -> :sswitch_7
        0x370ad105 -> :sswitch_10
        0x39de50d0 -> :sswitch_f
        0x42d33df1 -> :sswitch_10
        0x488a4523 -> :sswitch_9
        0x4cb2f714 -> :sswitch_4
        0x59c215bc -> :sswitch_d
        0x5db34b2d -> :sswitch_d
        0x6ba61437 -> :sswitch_c
        0x79c0669c -> :sswitch_6
    .end sparse-switch
.end method

.method public static final ֫(ILjava/lang/CharSequence;)V
    .locals 28

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x78603bd0

    sget v21, Ll/֡֡;->֫ۤܳ:I

    sget v22, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v23, "\u073d\u073d"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v0, v23, v22

    mul-int/lit16 v0, v0, 0x39d

    const v25, 0x5e8850ca

    xor-int v0, v0, v25

    const v25, -0x2801a5fc

    xor-int v23, v23, v25

    move-object/from16 v6, v17

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v16

    move-object/from16 v16, v5

    move-object/from16 v5, v27

    :goto_0
    xor-int v10, v20, v22

    mul-int/lit16 v10, v10, -0xbbd

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v0, v10

    xor-int v20, v23, v0

    sparse-switch v20, :sswitch_data_0

    .line 56
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_3

    goto :goto_1

    .line 124
    :sswitch_0
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-lez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    move/from16 v10, p0

    move-object/from16 v23, v4

    goto/16 :goto_c

    .line 189
    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v0

    if-gez v0, :cond_1

    :goto_1
    move/from16 v10, p0

    move-object/from16 v23, v4

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u1a79\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v22

    mul-int/lit16 v10, v10, 0x5a77

    const v23, -0x523d6771

    xor-int v10, v10, v23

    const v23, 0x4a1b86f1    # 2548156.2f

    goto/16 :goto_3

    .line 234
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto :goto_1

    .line 7
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    return-void

    .line 274
    :sswitch_4
    :try_start_0
    invoke-static/range {p0 .. p0}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v10, p0

    goto/16 :goto_4

    :catchall_0
    move/from16 v10, p0

    move-object/from16 v23, v4

    goto/16 :goto_5

    :sswitch_5
    return-void

    :sswitch_6
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7ec80ccc

    xor-int/2addr v0, v1

    .line 276
    invoke-static {v0}, Ll/֫֫;->ۙܽ᩹(I)Ll/᩸ۚۢ;

    return-void

    .line 274
    :sswitch_7
    invoke-static {v6, v8, v9, v12}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 89
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_2

    move/from16 v10, p0

    goto/16 :goto_b

    :cond_2
    const-string v0, "\u1a77\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v22

    mul-int/lit16 v10, v10, -0x357d

    const v23, 0x29c4decc

    xor-int v10, v10, v23

    const v23, -0xcf88ce8

    goto :goto_3

    .line 274
    :sswitch_8
    sget-object v6, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v8, 0xed

    const/4 v9, 0x3

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_2
    const-string v0, "\u06dc\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v22

    mul-int/lit16 v10, v10, -0x135f

    const v23, 0x10b88a9c

    xor-int v10, v10, v23

    const v23, 0x72025594

    goto :goto_3

    :cond_4
    const-string v0, "\u1a78\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x13

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x1ed9

    const v23, 0x309f64f6

    xor-int v10, v10, v23

    const v23, 0x6dc2d8c1

    :goto_3
    xor-int v23, v0, v23

    move v0, v10

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, -0x1

    move/from16 v10, p0

    if-eq v10, v0, :cond_5

    const-string v0, "\u06e0\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x4f

    move-object/from16 v23, v4

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x180f

    const v26, 0xbd54d7

    xor-int v4, v4, v26

    const v26, -0x1d3a732d

    goto/16 :goto_9

    :cond_5
    :goto_4
    move-object/from16 v23, v4

    const-string v0, "\u1a75\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x3d0f

    const v26, -0xca2f7b2

    xor-int v4, v4, v26

    const v26, 0x72ed52ec

    goto/16 :goto_9

    :sswitch_a
    move/from16 v10, p0

    move-object/from16 v0, p1

    move-object/from16 v23, v4

    .line 273
    :try_start_1
    invoke-virtual {v3, v0}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v0, v4, v21

    mul-int/lit16 v0, v0, 0x12b7

    const v26, 0x305666ad

    xor-int v0, v0, v26

    const v26, 0x10f2f8db

    xor-int v4, v4, v26

    move-object/from16 v27, v23

    move/from16 v23, v4

    goto/16 :goto_a

    :catchall_1
    :goto_5
    const-string v0, "\u0736\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x18bb

    const v26, 0x7e970e72

    xor-int v4, v4, v26

    const v26, 0x7c3c2ff0

    goto/16 :goto_9

    :sswitch_b
    move/from16 v10, p0

    move-object/from16 v23, v4

    .line 271
    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Landroid/text/ClipboardManager;

    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x741f

    const v26, -0x7a345c79

    xor-int v4, v4, v26

    const v26, -0x4024b6b6

    goto/16 :goto_9

    :sswitch_c
    move/from16 v10, p0

    move-object/from16 v23, v4

    const/16 v0, 0xab

    const/16 v2, 0x42

    invoke-static {v5, v0, v2, v12}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 104
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_6

    goto :goto_6

    :cond_6
    const-string v0, "\u06da\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x5f

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x565d

    const v26, -0x3555ce82    # -5576895.0f

    xor-int v4, v4, v26

    const v26, -0x2849031

    goto/16 :goto_9

    :sswitch_d
    move/from16 v10, p0

    move-object/from16 v23, v4

    .line 271
    invoke-static/range {v24 .. v24}, Ll/ۙ᩸᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 196
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_7

    goto/16 :goto_c

    :cond_7
    const-string v0, "\u06e8\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x9

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x8f1

    const v26, -0x7deaa2eb

    xor-int v4, v4, v26

    const v26, 0x4a0fbce0    # 2355000.0f

    goto/16 :goto_9

    :sswitch_e
    move/from16 v10, p0

    move-object/from16 v23, v4

    .line 0
    invoke-static {v13, v14, v15, v12}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v24

    .line 15
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-eqz v0, :cond_8

    :goto_6
    const-string v0, "\u06d9\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x553b

    const v26, 0x426e662a

    xor-int v4, v4, v26

    const v26, 0x3b5cab0c

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u05a1\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x16b3

    const v26, -0x52d4afde

    xor-int v4, v4, v26

    const v26, 0x4a26bbb3    # 2731756.8f

    goto/16 :goto_9

    :sswitch_f
    move/from16 v10, p0

    move-object/from16 v23, v4

    .line 0
    sget-object v13, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v14, 0xa2

    const/16 v15, 0x9

    .line 80
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_9

    goto/16 :goto_c

    :cond_9
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, -0x368f

    const v26, 0x375420db

    xor-int v4, v4, v26

    const v26, -0x6a85db64

    goto/16 :goto_9

    :sswitch_10
    move/from16 v10, p0

    move-object/from16 v23, v4

    const/16 v0, 0x2c7f

    const/16 v12, 0x2c7f

    goto :goto_7

    :sswitch_11
    move/from16 v10, p0

    move-object/from16 v23, v4

    const v0, 0xd3ac

    const v12, 0xd3ac

    :goto_7
    const-string v0, "\u06e4\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x6d

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x33d

    const v26, 0x76017733

    xor-int v4, v4, v26

    const v26, -0x72992c80

    goto/16 :goto_9

    :sswitch_12
    move/from16 v10, p0

    move-object/from16 v23, v4

    add-int v0, v7, v11

    mul-int v0, v0, v0

    sub-int v0, v0, v25

    if-gtz v0, :cond_a

    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x7caf

    const v26, -0x77b8cde7

    xor-int v4, v4, v26

    const v26, 0x5e7e52dc

    goto :goto_9

    :cond_a
    const-string v0, "\u1a7a\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x698f

    const v26, 0x310bace3

    xor-int v4, v4, v26

    const v26, 0x1dcddfdb

    goto :goto_9

    :sswitch_13
    move/from16 v10, p0

    move-object/from16 v23, v4

    add-int v0, v18, v19

    add-int v25, v0, v0

    const/16 v11, 0xa68

    .line 58
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_b

    goto :goto_8

    :cond_b
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x1dc5

    const v26, 0x3a284f3b

    xor-int v4, v4, v26

    const v26, -0x9669bfb

    goto :goto_9

    :sswitch_14
    move/from16 v10, p0

    move-object/from16 v23, v4

    aget-short v7, v16, v17

    mul-int v18, v7, v7

    const v19, 0x6c4a40

    .line 267
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_c

    :goto_8
    move-object/from16 v4, v23

    goto :goto_b

    :cond_c
    const-string v0, "\u06d7\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x4d

    xor-int v4, v0, v22

    mul-int/lit16 v4, v4, 0x2555

    const v26, -0x4f6ee5a0

    xor-int v4, v4, v26

    const v26, -0x79aba087

    :goto_9
    xor-int v0, v0, v26

    move-object/from16 v27, v23

    move/from16 v23, v0

    move v0, v4

    :goto_a
    move-object/from16 v4, v27

    goto/16 :goto_0

    :sswitch_15
    move/from16 v10, p0

    move-object/from16 v23, v4

    const/16 v17, 0xa1

    .line 190
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_d

    goto :goto_8

    :goto_b
    const-string v0, "\u06e4\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0xb

    move-object/from16 v26, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x607b

    const v23, -0x7a4ae7ee    # -1.703E-35f

    xor-int v1, v1, v23

    const v23, 0x3692cd54

    xor-int v23, v0, v23

    goto :goto_e

    :cond_d
    move-object/from16 v26, v1

    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x39

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x3b47

    const v4, -0x73b869e1

    xor-int/2addr v1, v4

    const v4, 0x5d962e4f

    goto :goto_d

    :sswitch_16
    move/from16 v10, p0

    move-object/from16 v26, v1

    move-object/from16 v23, v4

    sget-object v16, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 54
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_e

    move-object/from16 v1, v26

    :goto_c
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x5119

    const v26, 0xf84d895

    xor-int v4, v4, v26

    const v26, 0x5d0c9f3d

    goto :goto_9

    :cond_e
    const-string v0, "\u06e4\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x6c91

    const v4, -0x63d676a    # -1.2630005E35f

    xor-int/2addr v1, v4

    const v4, 0x13f193f9

    :goto_d
    xor-int/2addr v0, v4

    move-object/from16 v4, v23

    move/from16 v23, v0

    :goto_e
    move v0, v1

    move-object/from16 v1, v26

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f662b2e -> :sswitch_8
        -0x7b33a63f -> :sswitch_13
        -0x7ab60c67 -> :sswitch_3
        -0x71b4898f -> :sswitch_5
        -0x71586cad -> :sswitch_2
        -0x70ba4726 -> :sswitch_7
        -0x67a8cf37 -> :sswitch_16
        -0x5fa83086 -> :sswitch_f
        -0x5d27fe97 -> :sswitch_11
        -0x58f9326b -> :sswitch_0
        -0x54258f29 -> :sswitch_c
        -0x532059df -> :sswitch_7
        -0x51e1c9ef -> :sswitch_9
        -0x4d1fb6f7 -> :sswitch_8
        -0x4148014b -> :sswitch_12
        -0x3ce5ec5b -> :sswitch_b
        -0x235b2bfa -> :sswitch_a
        -0x21691826 -> :sswitch_13
        -0x1d299ec1 -> :sswitch_2
        -0x16147b80 -> :sswitch_d
        -0x1437a467 -> :sswitch_4
        -0x1407c863 -> :sswitch_a
        -0x10abadcb -> :sswitch_15
        -0xfce5450 -> :sswitch_e
        -0x8a1c451 -> :sswitch_e
        0x3005505 -> :sswitch_1
        0x747f512 -> :sswitch_b
        0x92fe0d7 -> :sswitch_1
        0xfa155fb -> :sswitch_6
        0x1031ff9e -> :sswitch_12
        0x1263f799 -> :sswitch_0
        0x192a5e35 -> :sswitch_14
        0x1e05aadb -> :sswitch_d
        0x23591ebf -> :sswitch_4
        0x29f8c5c2 -> :sswitch_c
        0x2b5ba0ef -> :sswitch_16
        0x2d928a35 -> :sswitch_5
        0x31b36d88 -> :sswitch_15
        0x34dcb14b -> :sswitch_6
        0x3de81aae -> :sswitch_11
        0x44d267c6 -> :sswitch_9
        0x49ed34d7 -> :sswitch_10
        0x4dd0f5e5 -> :sswitch_3
        0x6c31289d -> :sswitch_10
        0x7a1fc264 -> :sswitch_f
        0x7e5a5bbd -> :sswitch_14
    .end sparse-switch
.end method

.method public static final ֫(JLjava/lang/Runnable;)V
    .locals 1

    .line 87
    sget-object v0, Ll/ۙ᩸᩷;->֫:Landroid/os/Handler;

    invoke-virtual {v0, p2, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static final ֫(Landroid/content/BroadcastReceiver;)V
    .locals 20

    move-object/from16 v0, p0

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

    const v14, 0x59d40e9d

    sget v15, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v16, Ll/ۛ;->᩺᩻֫:I

    const-string v17, "\u0730\u0736"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    mul-int/lit8 v17, v17, 0x79

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, 0x1689

    const v19, -0x2f1dfed8

    xor-int v1, v1, v19

    const v19, -0xe982003

    xor-int v17, v17, v19

    move-object/from16 v19, v3

    move-object v12, v11

    move/from16 v18, v17

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x59d40e9d

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v17, v16

    mul-int/lit16 v4, v4, 0x1bbf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    mul-int v10, v6, v9

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_7

    goto/16 :goto_2

    .line 48
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v1, "\u06d7\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x50b3

    const v18, -0x2f246b29

    xor-int v4, v4, v18

    const v18, -0x7f8958ea

    goto/16 :goto_6

    .line 137
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v1, :cond_c

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_6

    goto/16 :goto_3

    .line 23
    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto/16 :goto_3

    .line 209
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    return-void

    .line 219
    :sswitch_5
    invoke-static {v3}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;)V

    return-void

    .line 6
    :sswitch_6
    invoke-static {v0, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v3

    .line 210
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u06d6\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x743b

    const v18, 0xa5e04e6

    xor-int v4, v4, v18

    const v18, -0x52f787f

    goto/16 :goto_6

    .line 0
    :sswitch_7
    invoke-static {v12, v13, v14, v11}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    .line 133
    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06e0\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x1f

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x2e95

    const v18, -0x3fe3f5fc

    xor-int v4, v4, v18

    const v18, -0x6da6ccc4

    goto/16 :goto_6

    :sswitch_8
    const/16 v14, 0x8

    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x182f

    const v18, 0x2f49d147

    xor-int v4, v4, v18

    const v18, -0x223fd1c3

    goto/16 :goto_6

    .line 0
    :sswitch_9
    sget-object v12, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v13, 0xf1

    .line 78
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u1a76\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x4205

    const v18, -0x367cfff7

    xor-int v4, v4, v18

    const v18, 0x3ddf1c3a

    goto/16 :goto_6

    :sswitch_a
    const v1, 0xbce4

    const v11, 0xbce4

    goto :goto_1

    :sswitch_b
    const v1, 0xabe4

    const v11, 0xabe4

    :goto_1
    const-string v1, "\u05ab\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x6c23

    const v18, -0x3d345df3

    xor-int v4, v4, v18

    const v18, -0x2415b2ba

    goto/16 :goto_6

    :sswitch_c
    add-int/lit8 v1, v10, 0x1

    sub-int v1, v8, v1

    if-ltz v1, :cond_5

    const-string v1, "\u1a74\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x41

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x2179

    const v18, 0x1039c63c

    xor-int v4, v4, v18

    const v18, -0x5b49a49a

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06e0\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x6b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5adf

    const v18, 0x4cfe3aaf    # 1.33289336E8f

    xor-int v4, v4, v18

    const v18, 0xfb98885

    goto/16 :goto_6

    :cond_6
    :goto_2
    const-string v1, "\u1a74\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x4d

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x665f

    const v18, 0x1d99e6f0

    xor-int v4, v4, v18

    const v18, 0x6848755c

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x6c01

    const v18, 0x75630d17

    xor-int v4, v4, v18

    const v18, 0x5e092f47

    goto/16 :goto_6

    :sswitch_d
    mul-int v8, v7, v7

    const/4 v9, 0x2

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-nez v1, :cond_8

    :goto_3
    const-string v1, "\u05a1\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x19

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x1f37

    const v18, 0x1042d43a

    xor-int v4, v4, v18

    const v18, -0x184e830e

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u06dc\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xd

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x2445

    const v18, -0x43c80155

    xor-int v4, v4, v18

    const v18, 0x429ba290

    goto/16 :goto_6

    :sswitch_e
    add-int/lit8 v7, v6, 0x1

    .line 193
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u1a79\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x73

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x7497

    const v18, 0x1418afbd

    xor-int v4, v4, v18

    const v18, -0x798a756b

    goto/16 :goto_6

    :sswitch_f
    aget-short v6, v19, v5

    .line 124
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_a

    :goto_4
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x38ab

    const v18, 0x24340c2d

    xor-int v4, v4, v18

    const v18, 0x5b916d39

    goto :goto_6

    :cond_a
    const-string v1, "\u0730\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x9

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xff3

    const v18, 0x5bc97607

    xor-int v4, v4, v18

    const v18, 0x72f55579

    goto :goto_6

    :sswitch_10
    const/16 v5, 0xf0

    .line 181
    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_b

    goto :goto_5

    :cond_b
    const-string v1, "\u05a1\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x8eb

    const v18, 0xd5f48cb

    xor-int v4, v4, v18

    const v18, 0xf1fe7d0

    goto :goto_6

    :sswitch_11
    sget-object v19, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 5
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u06d9\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x79b9

    const v18, -0x7bfa33ac

    xor-int v4, v4, v18

    const v18, 0x442bf756

    goto :goto_6

    :cond_d
    const-string v1, "\u06d9\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x7cfb

    const v18, 0x45efc2f3

    xor-int v4, v4, v18

    const v18, 0x42b6001e    # 91.00023f

    :goto_6
    xor-int v18, v1, v18

    move v1, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a0a0f2c -> :sswitch_b
        -0x7613ae57 -> :sswitch_0
        -0x72a6bc19 -> :sswitch_4
        -0x6242e860 -> :sswitch_10
        -0x510fc863 -> :sswitch_7
        -0x50d0b7c0 -> :sswitch_5
        -0x4d5608c2 -> :sswitch_11
        -0x4ab5632c -> :sswitch_9
        -0x49596f24 -> :sswitch_0
        -0x3cd292d5 -> :sswitch_b
        -0x359bc993 -> :sswitch_2
        -0x33063ee2 -> :sswitch_10
        -0x30e47d80 -> :sswitch_3
        -0x2f14f8e9 -> :sswitch_8
        -0x29dc7d72 -> :sswitch_a
        -0x26cdca05 -> :sswitch_c
        -0x1dd7f081 -> :sswitch_f
        -0x1af544ef -> :sswitch_3
        -0x21689f8 -> :sswitch_4
        0x714e12e -> :sswitch_f
        0xa78cb9f -> :sswitch_d
        0xe395389 -> :sswitch_1
        0xf62f8f7 -> :sswitch_a
        0x17e77d1d -> :sswitch_5
        0x2400b02f -> :sswitch_e
        0x2b9ea936 -> :sswitch_6
        0x2e4380e7 -> :sswitch_e
        0x317b2a83 -> :sswitch_7
        0x32f40c51 -> :sswitch_6
        0x3fce62f5 -> :sswitch_9
        0x41229d0e -> :sswitch_8
        0x4a870935 -> :sswitch_2
        0x6849b922 -> :sswitch_11
        0x68f1147a -> :sswitch_c
        0x6a3fa5e6 -> :sswitch_d
        0x6ee67f76 -> :sswitch_1
    .end sparse-switch
.end method

.method public static final ֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, -0x6f5cd1f5

    sget v14, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v15, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v16, "\u1a79\u05ab"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    mul-int/lit8 v16, v16, -0x17

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0xde3

    const v18, 0x6746c270

    xor-int v1, v1, v18

    const v18, -0x6f73baca

    xor-int v16, v16, v18

    move-object/from16 v18, v2

    move-object v11, v10

    move/from16 v17, v16

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, -0x6f5cd1f5

    :goto_0
    xor-int v3, v16, v14

    mul-int/lit16 v3, v3, -0x2ebb

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v1, :cond_0

    :goto_1
    move-object/from16 v3, p1

    goto/16 :goto_6

    :sswitch_0
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v1, :cond_1

    :cond_0
    move-object/from16 v3, p1

    goto/16 :goto_4

    :cond_1
    move-object/from16 v3, p1

    goto/16 :goto_5

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-gez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v3, p1

    goto/16 :goto_3

    .line 50
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto :goto_1

    .line 64
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 6
    :sswitch_4
    invoke-static {v0, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v1

    move-object/from16 v3, p1

    invoke-virtual {v1, v0, v3}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void

    :sswitch_5
    move-object/from16 v3, p1

    .line 0
    invoke-static {v11, v12, v13, v10}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v2

    .line 158
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v0, v1, v14

    mul-int/lit16 v0, v0, -0x3bd

    const v17, -0x5a7b55d8

    xor-int v0, v0, v17

    const v17, -0x40f314c6

    xor-int v17, v1, v17

    move v1, v0

    goto/16 :goto_9

    :sswitch_6
    move-object/from16 v3, p1

    const/16 v13, 0x8

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u1a79\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x746b

    const v17, 0x29ea9879

    xor-int v1, v1, v17

    const v17, -0x28be0244

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v3, p1

    .line 0
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0xfa

    .line 18
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v0, "\u0736\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6b

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x795b

    const v17, 0x3fd1adc7

    xor-int v1, v1, v17

    const v17, -0x53b35a4a

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v3, p1

    const v0, 0xf4d5

    const v10, 0xf4d5

    goto :goto_2

    :sswitch_9
    move-object/from16 v3, p1

    const v0, 0xa983

    const v10, 0xa983

    :goto_2
    const-string v0, "\u06e4\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x3449

    const v17, 0x5170a349

    xor-int v1, v1, v17

    const v17, -0x7c4137eb

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v3, p1

    add-int v0, v5, v9

    mul-int v0, v0, v0

    sub-int/2addr v0, v8

    if-gez v0, :cond_6

    const-string v0, "\u06db\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x63

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x3865

    const v17, -0x57801295

    xor-int v1, v1, v17

    const v17, 0x5607dd87

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u073a\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x59b9

    const v17, -0x258b897

    xor-int v1, v1, v17

    const v17, -0x29a8a8ce

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v3, p1

    const/4 v9, 0x1

    .line 4
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_7

    :goto_3
    const-string v0, "\u1a77\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x3927

    const v17, -0x4ad8f8ff    # -6.222254E-7f

    xor-int v1, v1, v17

    const v17, 0x2294d662

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u05ab\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x722d

    const v17, -0x2d53fde5

    xor-int v1, v1, v17

    const v17, -0x342385e

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v3, p1

    add-int/lit8 v8, v7, 0x1

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v0

    if-ltz v0, :cond_8

    :goto_4
    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x1d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3e8d

    const v17, 0x4b44671a    # 1.287145E7f

    xor-int v1, v1, v17

    const v17, 0xa549fb4

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x2791

    const v17, 0x3ab96a23

    xor-int v1, v1, v17

    const v17, 0x6a5aa109

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v3, p1

    mul-int v7, v5, v6

    .line 185
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u06d8\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x4ea3

    const v17, -0x48cb6f04

    xor-int v1, v1, v17

    const v17, -0x40b641c

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v3, p1

    aget-short v5, v18, v4

    const/4 v6, 0x2

    .line 7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_6

    :cond_a
    const-string v0, "\u1a77\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x65

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x351f

    const v17, -0x57c0c1cb

    xor-int v1, v1, v17

    const v17, -0x72cca8f5

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v3, p1

    const/16 v4, 0xf9

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_b

    :goto_5
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x7f35

    const v17, -0x7ea47724

    xor-int v1, v1, v17

    const v17, -0x325125b

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u06d8\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x5b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x54fd

    const v17, -0x3f363053

    xor-int v1, v1, v17

    const v17, -0x5cc88775

    goto :goto_8

    :sswitch_10
    move-object/from16 v3, p1

    sget-object v18, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_c

    :goto_6
    const-string v0, "\u073a\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x47

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x63cb

    const v17, -0x40b978b1

    xor-int v1, v1, v17

    const v17, 0x341b6529

    goto :goto_8

    :cond_c
    const-string v0, "\u1a79\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x6f47

    const v17, -0x379d6e1b

    xor-int v1, v1, v17

    const v17, -0xafe56fd

    goto :goto_8

    :sswitch_11
    move-object/from16 v3, p1

    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_d

    :goto_7
    const-string v0, "\u06da\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x730d

    const v17, -0x104fe152

    xor-int v1, v1, v17

    const v17, -0x41251df6

    goto :goto_8

    :cond_d
    const-string v0, "\u1a77\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x501d

    const v17, -0xc2604e

    xor-int v1, v1, v17

    const v17, -0x1bafb156

    :goto_8
    xor-int v17, v0, v17

    :goto_9
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a464762 -> :sswitch_10
        -0x79c2aac8 -> :sswitch_2
        -0x75078a1b -> :sswitch_d
        -0x6e307ec8 -> :sswitch_6
        -0x6d2fd335 -> :sswitch_0
        -0x6a7e8ee9 -> :sswitch_10
        -0x62a83fdb -> :sswitch_a
        -0x5c8902df -> :sswitch_11
        -0x5801ef9b -> :sswitch_c
        -0x4d3423fd -> :sswitch_4
        -0x471cf1ca -> :sswitch_5
        -0x425ae16f -> :sswitch_e
        -0x346a3d6a -> :sswitch_9
        -0x21190252 -> :sswitch_4
        -0x1dd762fc -> :sswitch_1
        -0x1dab263a -> :sswitch_7
        -0x1cd754f5 -> :sswitch_8
        -0x17966786 -> :sswitch_6
        0x5203f3f -> :sswitch_7
        0xbb0da56 -> :sswitch_b
        0xf44c933 -> :sswitch_5
        0x242020cd -> :sswitch_f
        0x24d71685 -> :sswitch_c
        0x28f6c9ee -> :sswitch_3
        0x2a21c54f -> :sswitch_f
        0x2d9adf15 -> :sswitch_11
        0x3f69fa89 -> :sswitch_1
        0x466393cd -> :sswitch_d
        0x604bde0a -> :sswitch_a
        0x63f8510f -> :sswitch_9
        0x683673af -> :sswitch_3
        0x6dfc9513 -> :sswitch_e
        0x79a54a65 -> :sswitch_8
        0x7a4de322 -> :sswitch_2
        0x7b2dfa91 -> :sswitch_b
        0x7d5149b0 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final ֫(Landroid/content/Intent;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, -0x30e57d6

    sget v14, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v15, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v16, "\u06ec\u1a73"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v15, v16

    mul-int/lit8 v16, v16, -0x6b

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, 0x4c7d

    const v18, -0x5143fbdf

    xor-int v1, v1, v18

    const v18, -0x395b9c45

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v11, v10

    move/from16 v17, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, -0x30e57d6

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, 0x3691

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 47
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v1, :cond_b

    goto/16 :goto_4

    .line 48
    :sswitch_0
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-lez v1, :cond_7

    goto/16 :goto_4

    .line 45
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_3

    goto/16 :goto_4

    .line 145
    :sswitch_2
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto/16 :goto_4

    .line 35
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    return-void

    .line 224
    :sswitch_4
    invoke-static {v3}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۖۖ֫;->֫(Landroid/content/Intent;)Z

    return-void

    .line 5
    :sswitch_5
    invoke-static {v0, v2}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v3

    .line 156
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v1

    if-ltz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x345b

    const v17, -0x65249afd

    xor-int v4, v4, v17

    const v17, -0x3e62ea39

    goto/16 :goto_5

    .line 0
    :sswitch_6
    invoke-static {v11, v12, v13, v10}, Ll/֫ܿ;->ܰ᩷ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 200
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u1a7b\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x63e1

    const v17, 0x22bc3ab1

    xor-int v4, v4, v17

    const v17, -0x747e80ba

    goto/16 :goto_5

    :sswitch_7
    const/4 v13, 0x6

    .line 16
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u06e2\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x7e1

    const v17, 0x4896eac7

    xor-int v4, v4, v17

    const v17, -0x4171dfcf

    goto/16 :goto_5

    .line 0
    :sswitch_8
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0x103

    .line 137
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_4

    :cond_3
    :goto_1
    const-string v1, "\u073f\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x28ef

    const v17, -0x31840777

    xor-int v4, v4, v17

    const v17, -0x1fd1704b

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u1a75\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0xd

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x27c9

    const v17, 0x4b5f6776    # 1.4641014E7f

    xor-int v4, v4, v17

    const v17, 0x66b81583

    goto/16 :goto_5

    :sswitch_9
    const/16 v1, 0xada

    const/16 v10, 0xada

    goto :goto_2

    :sswitch_a
    const/16 v1, 0x3a63

    const/16 v10, 0x3a63

    :goto_2
    const-string v1, "\u05a8\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x71

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x3afb

    const v17, -0x150e1515

    xor-int v4, v4, v17

    const v17, -0x2fb94b14

    goto/16 :goto_5

    :sswitch_b
    mul-int v1, v6, v9

    sub-int v1, v8, v1

    if-gez v1, :cond_5

    const-string v1, "\u0736\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x41

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x17b5

    const v17, -0x7071b3b1

    xor-int v4, v4, v17

    const v17, -0x2b9783bc

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06d7\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x5d

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x2311

    const v17, -0x6b5b8c55

    xor-int v4, v4, v17

    const v17, 0x7765a9fe

    goto/16 :goto_5

    :sswitch_c
    const v9, 0x11e4c

    .line 37
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x2f

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x30b9

    const v17, 0x2c1660e9

    xor-int v4, v4, v17

    const v17, 0x2dc50cfe

    goto/16 :goto_5

    :sswitch_d
    add-int v1, v6, v7

    mul-int v8, v1, v1

    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_8

    :cond_7
    const-string v1, "\u05a1\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x122d

    const v17, -0x2fa6ae04

    xor-int v4, v4, v17

    const v17, 0x4097d10b

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u06df\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x29

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2e45

    const v17, -0x3cd18da2

    xor-int v4, v4, v17

    const v17, 0x726ad23b

    goto/16 :goto_5

    :sswitch_e
    aget-short v6, v18, v5

    const/16 v7, 0x4793

    .line 91
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_9

    const-string v1, "\u073f\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x31

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x6a4d

    const v17, -0x63026fbd

    xor-int v4, v4, v17

    const v17, -0x57ce3e19

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u073f\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x6f

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x4ff5

    const v17, 0xf2fa8cc

    xor-int v4, v4, v17

    const v17, -0x1fa4cfda

    goto/16 :goto_5

    :sswitch_f
    const/16 v5, 0x102

    .line 135
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_a

    goto :goto_3

    :cond_a
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x6e5f

    const v17, 0x640380e4

    xor-int v4, v4, v17

    const v17, 0x3e964951

    goto :goto_5

    .line 207
    :sswitch_10
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v1

    if-ltz v1, :cond_c

    :cond_b
    :goto_3
    const-string v1, "\u06dc\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x33d9

    const v17, 0x44a83d2e

    xor-int v4, v4, v17

    const v17, -0x6a9a3360

    goto :goto_5

    :cond_c
    const-string v1, "\u06e1\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x54a5

    const v17, -0x15cc8048

    xor-int v4, v4, v17

    const v17, 0x6270d015

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 37
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_d

    :goto_4
    const-string v1, "\u06eb\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x51c7

    const v17, 0x50eb5c47

    xor-int v4, v4, v17

    const v17, -0x5cfb7026

    goto :goto_5

    :cond_d
    const-string v1, "\u1a74\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0xd

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x2bd3

    const v17, 0x4d2ce194    # 1.8127904E8f

    xor-int v4, v4, v17

    const v17, 0x30db4da7

    :goto_5
    xor-int v17, v1, v17

    move v1, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79e30d9f -> :sswitch_b
        -0x6cddb0ac -> :sswitch_f
        -0x5e82cac6 -> :sswitch_d
        -0x5b738511 -> :sswitch_10
        -0x583d82dc -> :sswitch_6
        -0x578585bb -> :sswitch_3
        -0x552580b8 -> :sswitch_d
        -0x4c2a044b -> :sswitch_11
        -0x4a09ee1c -> :sswitch_8
        -0x48e3b04c -> :sswitch_1
        -0x31798b5d -> :sswitch_0
        -0x301b1e21 -> :sswitch_c
        -0x2c14b41c -> :sswitch_2
        -0x1c188e75 -> :sswitch_4
        -0x186b7e5b -> :sswitch_8
        -0x163be497 -> :sswitch_0
        -0x1626ffc6 -> :sswitch_9
        -0x1593b8af -> :sswitch_4
        -0x14571ce3 -> :sswitch_7
        0xd242c5f -> :sswitch_a
        0x10341b40 -> :sswitch_b
        0x15e831fb -> :sswitch_9
        0x1cefcad5 -> :sswitch_e
        0x2987327a -> :sswitch_2
        0x352c6b81 -> :sswitch_5
        0x35a9f5fe -> :sswitch_f
        0x3d8d30a1 -> :sswitch_6
        0x42405605 -> :sswitch_10
        0x4cf78b91 -> :sswitch_1
        0x5108a9ce -> :sswitch_11
        0x53c0723c -> :sswitch_e
        0x5626882c -> :sswitch_3
        0x603648c5 -> :sswitch_c
        0x73565d4d -> :sswitch_7
        0x7de2149e -> :sswitch_a
        0x7ea099f3 -> :sswitch_5
    .end sparse-switch
.end method

.method public static synthetic ֫(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 165
    invoke-static {v0, p0}, Ll/ۙ᩸᩷;->ۧ(ILandroid/view/View;)V

    return-void
.end method

.method public static final ֫(Ljava/lang/CharSequence;)V
    .locals 22

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

    const v14, -0x35c212ea    # -3111749.5f

    sget v15, Ll/֡֡;->֫ۤܳ:I

    sget v16, Ll/ۘۨ;->۫᩸۠:I

    const-string v17, "\u05ab\u1a7b"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v0, v17, v16

    mul-int/lit16 v0, v0, -0x7edb

    const v19, 0x62a41c70

    xor-int v0, v0, v19

    const v19, -0x7aa1056

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int v14, v14, v16

    mul-int/lit16 v14, v14, -0x4279

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v0, v14

    xor-int v14, v17, v0

    sparse-switch v14, :sswitch_data_0

    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    add-int v0, v8, v9

    add-int/2addr v0, v0

    sub-int v0, v7, v0

    if-lez v0, :cond_6

    const-string v0, "\u06df\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1baf

    const v20, -0x111a3a7e

    xor-int v1, v1, v20

    const v20, 0x534cb393

    goto/16 :goto_8

    .line 87
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_0

    move/from16 v17, v14

    move-object/from16 v14, p0

    goto/16 :goto_4

    :cond_0
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v0, :cond_1

    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u06da\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x73

    move/from16 v17, v14

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x7f3b

    const v19, -0xf2f7e1

    xor-int v14, v14, v19

    const v19, -0x4add965f

    xor-int v0, v0, v19

    move/from16 v21, v17

    move/from16 v17, v0

    move v0, v14

    move/from16 v14, v21

    goto :goto_0

    :sswitch_2
    move/from16 v17, v14

    .line 64
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    move-object/from16 v14, p0

    if-ltz v0, :cond_8

    :goto_1
    move/from16 v19, v1

    goto/16 :goto_6

    :sswitch_3
    move/from16 v17, v14

    .line 224
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-object/from16 v14, p0

    goto :goto_1

    .line 191
    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    :sswitch_5
    xor-int v0, v1, v2

    move-object/from16 v14, p0

    .line 266
    invoke-static {v0, v14}, Ll/ۙ᩸᩷;->֫(ILjava/lang/CharSequence;)V

    return-void

    :sswitch_6
    move/from16 v17, v14

    move-object/from16 v14, p0

    .line 0
    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    .line 252
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_2

    const v2, 0x7ea6ca87

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u1a74\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x4d

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0xbb1

    const v20, 0x6149b6ab

    xor-int v2, v2, v20

    const v20, -0x4fb2c989

    xor-int v0, v0, v20

    move/from16 v14, v17

    move/from16 v17, v0

    move v0, v2

    const v2, 0x7ea6ca87

    goto/16 :goto_0

    :sswitch_7
    move/from16 v17, v14

    move-object/from16 v14, p0

    .line 0
    invoke-static {v11, v12, v13, v10}, Ll/ۖۘ;->۠ܶܿ([SIII)Ljava/lang/String;

    move-result-object v18

    .line 37
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "\u06e8\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move/from16 v19, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x58c1

    const v20, -0x2aaa0e10

    xor-int v1, v1, v20

    const v20, -0x13cbb387

    goto/16 :goto_8

    :sswitch_8
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    const/4 v13, 0x3

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u1a79\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x5373

    const v20, -0x655c3bcb

    xor-int v1, v1, v20

    const v20, -0x730533f5

    goto/16 :goto_8

    :sswitch_9
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    .line 0
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0x10a

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u073a\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x3c31

    const v20, 0x3b574ecd

    xor-int v1, v1, v20

    const v20, 0x44c7340c

    goto/16 :goto_8

    :sswitch_a
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    const v0, 0xc446

    const v10, 0xc446

    goto :goto_2

    :sswitch_b
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    const v0, 0xf467

    const v10, 0xf467

    :goto_2
    const-string v0, "\u06dc\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2601

    const v20, -0x24fb6e83

    xor-int v1, v1, v20

    const v20, -0x569933e4

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u05a8\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x46c9

    const v20, -0x675607b1

    xor-int v1, v1, v20

    const v20, -0x7b55781f

    goto/16 :goto_8

    :sswitch_c
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    const v9, 0xadf6304

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_7

    :goto_3
    move/from16 v1, v19

    goto :goto_4

    :cond_7
    const-string v0, "\u1a7b\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x1fc9

    const v20, -0x34cae715    # -1.1868395E7f

    xor-int v1, v1, v20

    const v20, 0x370bcc97

    goto/16 :goto_8

    :sswitch_d
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    mul-int v7, v6, v6

    mul-int v8, v5, v5

    .line 179
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_9

    goto :goto_3

    :cond_8
    :goto_4
    const-string v0, "\u1a75\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move/from16 v19, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x5ae1

    const v20, -0x772a281e

    xor-int v1, v1, v20

    const v20, 0x775a2ef5

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u0736\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1fd

    const v20, -0x3d177b95

    xor-int v1, v1, v20

    const v20, 0x14070975

    goto/16 :goto_8

    :sswitch_e
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    add-int/lit16 v6, v5, 0x34c2

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v0

    if-gtz v0, :cond_a

    goto :goto_5

    :cond_a
    const-string v0, "\u06d9\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x209b

    const v20, -0x509cbd0e

    xor-int v1, v1, v20

    const v20, -0x22206b98

    goto/16 :goto_8

    :sswitch_f
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    aget-short v5, v3, v4

    .line 252
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_b

    :goto_5
    const-string v0, "\u1a79\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x75

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x29b1

    const v20, 0x6f83022e

    xor-int v1, v1, v20

    const v20, -0x73d2d21a

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u073a\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x26e5

    const v20, -0xb44b731

    xor-int v1, v1, v20

    const v20, 0x2fb1b78a

    goto/16 :goto_8

    :sswitch_10
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    const/16 v4, 0x109

    .line 160
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_c

    :goto_6
    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x69

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x20ab

    const v20, 0x47da3ed7

    xor-int v1, v1, v20

    const v20, -0x25de571d

    goto :goto_8

    :cond_c
    const-string v0, "\u06e8\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1a95

    const v20, -0xa84e1e7

    xor-int v1, v1, v20

    const v20, 0x46efdf1c

    goto :goto_8

    :sswitch_11
    move/from16 v19, v1

    move/from16 v17, v14

    move-object/from16 v14, p0

    sget-object v3, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 153
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_d

    :goto_7
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x37

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7dd1

    const v20, 0x2bbed1b

    xor-int v1, v1, v20

    const v20, 0x498c8a69

    goto :goto_8

    :cond_d
    const-string v0, "\u05ab\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x14f3

    const v20, -0xeed81b9

    xor-int v1, v1, v20

    const v20, 0x1cf8bd95

    :goto_8
    xor-int v0, v0, v20

    move/from16 v14, v17

    move/from16 v17, v0

    move v0, v1

    move/from16 v1, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e45cc16 -> :sswitch_3
        -0x64554daa -> :sswitch_9
        -0x56b76629 -> :sswitch_4
        -0x4db4db4e -> :sswitch_5
        -0x4bf8febc -> :sswitch_a
        -0x479d2cc5 -> :sswitch_8
        -0x41ad35dc -> :sswitch_3
        -0x3ee3cf21 -> :sswitch_1
        -0x3b95d92c -> :sswitch_e
        -0x37431e37 -> :sswitch_5
        -0x36ad8bd2 -> :sswitch_e
        -0x344ae036 -> :sswitch_2
        -0x33b5aa2c -> :sswitch_9
        -0x1ffb7278 -> :sswitch_8
        -0xe101c50 -> :sswitch_1
        -0xd1b3657 -> :sswitch_c
        -0x840b27d -> :sswitch_0
        -0x7aa5a9d -> :sswitch_0
        -0x3d089b9 -> :sswitch_11
        0x4f038d1 -> :sswitch_11
        0x8bdef06 -> :sswitch_f
        0xad7b693 -> :sswitch_6
        0xeead8f9 -> :sswitch_c
        0xf6e40fc -> :sswitch_6
        0x111bef75 -> :sswitch_b
        0x1dfae723 -> :sswitch_2
        0x1e57b982 -> :sswitch_a
        0x217a67e1 -> :sswitch_d
        0x2976525a -> :sswitch_f
        0x308640d6 -> :sswitch_10
        0x39091027 -> :sswitch_7
        0x4d8ff067 -> :sswitch_d
        0x505d86f9 -> :sswitch_10
        0x624917b4 -> :sswitch_b
        0x69b03396 -> :sswitch_4
        0x705cea3f -> :sswitch_7
    .end sparse-switch
.end method

.method public static final ֫(Ljava/lang/Runnable;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, 0x77f7f51b

    sget v14, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v15, Ll/᩺;->ۙۛܶ:I

    const-string v16, "\u06e1\u05ab"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x7aa9

    const v18, -0x223284a8

    xor-int v1, v1, v18

    const v18, -0x124feebc

    xor-int v16, v16, v18

    move-object/from16 v18, v2

    move-object v11, v10

    move/from16 v17, v16

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x77f7f51b

    :goto_0
    xor-int v3, v16, v14

    mul-int/lit16 v3, v3, 0x7b09

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    const v1, 0xfd57

    const v10, 0xfd57

    goto/16 :goto_1

    :sswitch_0
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 22
    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v1

    if-lez v1, :cond_c

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v1, :cond_a

    goto/16 :goto_2

    .line 35
    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    goto/16 :goto_2

    .line 23
    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    return-void

    .line 6
    :sswitch_5
    invoke-static {v0, v2}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    sget-object v1, Ll/ۙ᩸᩷;->֫:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 0
    :sswitch_6
    invoke-static {v11, v12, v13, v10}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 64
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_1

    :cond_0
    const-string v1, "\u06da\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x37

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, 0x6aa1

    const v17, 0x1f21c1b8

    xor-int v3, v3, v17

    const v17, -0x6d326e0

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, 0xe91

    const v17, -0x5338bcb9

    xor-int v3, v3, v17

    const v17, 0x24099328

    goto/16 :goto_5

    :sswitch_7
    const/4 v13, 0x1

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, 0x3b3f

    const v17, 0x6cc4592c

    xor-int v3, v3, v17

    const v17, 0x514deee9

    goto/16 :goto_5

    .line 0
    :sswitch_8
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0x10e

    .line 11
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x33

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x5c65

    const v17, -0x3285e720

    xor-int v3, v3, v17

    const v17, -0x190ad24e

    goto/16 :goto_5

    :sswitch_9
    const v1, 0xd1af

    const v10, 0xd1af

    :goto_1
    const-string v1, "\u073d\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, -0x3dcd

    const v17, -0xbfae1fb

    xor-int v3, v3, v17

    const v17, 0x30fde9a5

    goto/16 :goto_5

    :sswitch_a
    mul-int v1, v9, v9

    sub-int v1, v7, v1

    if-gtz v1, :cond_4

    const-string v1, "\u06da\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, 0x7b75

    const v17, 0x3184dd4b

    xor-int v3, v3, v17

    const v17, 0x27369ac3

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06d9\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x577f

    const v17, -0x70842de7

    xor-int v3, v3, v17

    const v17, 0x763ecad

    goto/16 :goto_5

    :sswitch_b
    add-int v9, v5, v8

    .line 67
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v1, "\u0730\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, -0x1709

    const v17, 0x3960b47f

    xor-int v3, v3, v17

    const v17, 0x30ffad4c

    goto/16 :goto_5

    :sswitch_c
    mul-int v7, v5, v6

    const/16 v8, 0x13c9

    .line 6
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u06d9\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, -0x3a7

    const v17, 0x4324f65d

    xor-int v3, v3, v17

    const v17, 0x306d37b5

    goto/16 :goto_5

    :sswitch_d
    aget-short v5, v18, v4

    const/16 v6, 0x4f24

    .line 49
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_7

    const-string v1, "\u073d\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, -0x73c5

    const v17, -0xb8d38e1

    xor-int v3, v3, v17

    const v17, -0x7205195d

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u1a75\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x4423

    const v17, 0x3c2d2f

    xor-int v3, v3, v17

    const v17, -0x286067ba

    goto/16 :goto_5

    :sswitch_e
    const/16 v4, 0x10d

    .line 48
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_8

    :goto_2
    const-string v1, "\u0736\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x3e89

    const v17, 0x141d6fbd

    xor-int v3, v3, v17

    const v17, -0x7102648e

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u1a78\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, 0x3521

    const v17, 0x3c6757c6

    xor-int v3, v3, v17

    const v17, -0x2c808b45

    goto/16 :goto_5

    .line 68
    :sswitch_f
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u1a76\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x77

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x3565

    const v17, -0x60bca1ed

    xor-int v3, v3, v17

    const v17, 0x45586a56

    goto :goto_5

    .line 54
    :sswitch_10
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_b

    :cond_a
    :goto_3
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, -0x73b7

    const v17, -0x749f0795

    xor-int v3, v3, v17

    const v17, -0x4d8387de

    goto :goto_5

    :cond_b
    const-string v1, "\u06e4\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x40f1

    const v17, 0x4c82170

    xor-int v3, v3, v17

    const v17, -0xbc3875e

    goto :goto_5

    :sswitch_11
    sget-object v18, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 64
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_d

    :cond_c
    :goto_4
    const-string v1, "\u05a1\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, -0x5f6f

    const v17, -0x1711e276

    xor-int v3, v3, v17

    const v17, 0x2f715d29

    goto :goto_5

    :cond_d
    const-string v1, "\u06dc\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v3, v1, v14

    mul-int/lit16 v3, v3, -0x623d

    const v17, -0x57746811

    xor-int v3, v3, v17

    const v17, -0x7e790a50

    :goto_5
    xor-int v17, v1, v17

    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x772ac086 -> :sswitch_e
        -0x75a88104 -> :sswitch_4
        -0x70e3c852 -> :sswitch_2
        -0x70755999 -> :sswitch_8
        -0x6e5a68ee -> :sswitch_3
        -0x6ad873c9 -> :sswitch_1
        -0x5cee423f -> :sswitch_f
        -0x55cb5b1f -> :sswitch_d
        -0x4fa2553f -> :sswitch_7
        -0x4b9ad721 -> :sswitch_10
        -0x4b1a3fba -> :sswitch_6
        -0x40e9bd7b -> :sswitch_7
        -0x3eeafd27 -> :sswitch_11
        -0x3202fb03 -> :sswitch_b
        -0x27ac32b3 -> :sswitch_11
        -0x156f22c3 -> :sswitch_9
        -0xe881bfe -> :sswitch_a
        0x3b51bf9 -> :sswitch_0
        0x51e08d5 -> :sswitch_8
        0x58edfeb -> :sswitch_b
        0xc06f796 -> :sswitch_a
        0xf2b64a4 -> :sswitch_6
        0x11ea724e -> :sswitch_5
        0x12d54780 -> :sswitch_9
        0x1a92933d -> :sswitch_2
        0x1fa994c5 -> :sswitch_1
        0x2909f345 -> :sswitch_0
        0x3c305972 -> :sswitch_3
        0x3f946ae6 -> :sswitch_10
        0x432d3500 -> :sswitch_d
        0x59d3bb97 -> :sswitch_c
        0x6063ec80 -> :sswitch_e
        0x6b5e9607 -> :sswitch_4
        0x773ccb6e -> :sswitch_c
        0x7a73be64 -> :sswitch_f
        0x7f961ba2 -> :sswitch_5
    .end sparse-switch
.end method

.method public static final ֫(Ljava/lang/Runnable;J)V
    .locals 21

    move-object/from16 v0, p0

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

    const v14, 0x6362565b

    sget v15, Ll/֡ᩴ;->ܳۤ֫:I

    sget v16, Ll/ۖ;->᩹۟ۘ:I

    const-string v17, "\u06db\u06e1"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0xfa1

    const v19, 0x71ac6e24

    xor-int v1, v1, v19

    const v19, -0x364cca42

    xor-int v17, v17, v19

    move-object/from16 v19, v2

    move-object v12, v11

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x6362565b

    :goto_0
    xor-int v3, v17, v15

    mul-int/lit16 v3, v3, 0x6b5d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    const/4 v14, 0x1

    .line 73
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_3

    goto/16 :goto_3

    .line 34
    :sswitch_0
    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v1, :cond_a

    goto/16 :goto_3

    .line 27
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u06e0\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x4fdb

    const v18, 0x7d58ab38    # 1.8000142E37f

    xor-int v3, v3, v18

    const v18, 0x2d895d00

    goto :goto_1

    :sswitch_2
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u05a8\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x339d

    const v18, -0x32f608d6

    xor-int v3, v3, v18

    const v18, 0x3a1d829d

    :goto_1
    xor-int v18, v1, v18

    move v1, v3

    goto :goto_0

    .line 38
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    .line 0
    :sswitch_5
    invoke-static {v0, v2}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    sget-object v1, Ll/ۙ᩸᩷;->֫:Landroid/os/Handler;

    move-wide/from16 v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :sswitch_6
    move-wide/from16 v2, p1

    .line 0
    invoke-static {v12, v13, v14, v11}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 16
    sget-boolean v18, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v18, :cond_2

    move-object v2, v1

    goto/16 :goto_4

    :cond_2
    const-string v18, "\u06d8\u06e8"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    mul-int/lit8 v18, v18, 0x7d

    xor-int v0, v18, v15

    mul-int/lit16 v0, v0, -0x126b

    const v20, 0x5369bf2a

    xor-int v0, v0, v20

    const v20, -0x2ea85014

    xor-int v18, v18, v20

    move-object v2, v1

    move v1, v0

    goto/16 :goto_7

    :cond_3
    const-string v0, "\u1a74\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x4d29

    const v3, 0x1b1c6992

    xor-int/2addr v1, v3

    const v3, -0xd24a682

    goto/16 :goto_6

    .line 0
    :sswitch_7
    sget-object v12, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v13, 0x110

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "\u06eb\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x6a1

    const v3, -0x30173259

    xor-int/2addr v1, v3

    const v3, -0x45740e31

    goto/16 :goto_6

    :sswitch_8
    const v0, 0x879a

    const v11, 0x879a

    goto :goto_2

    :sswitch_9
    const v0, 0xab28

    const v11, 0xab28

    :goto_2
    const-string v0, "\u06dc\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x308f

    const v3, -0x3edefd80

    xor-int/2addr v1, v3

    const v3, -0x3071245c

    goto/16 :goto_6

    :sswitch_a
    add-int/lit8 v0, v10, 0x1

    sub-int/2addr v0, v8

    if-lez v0, :cond_5

    const-string v0, "\u1a74\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x39

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0xc69

    const v3, -0x2b3a259a

    xor-int/2addr v1, v3

    const v3, 0x6018caca

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u0736\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x3d1d

    const v3, 0x476487da

    xor-int/2addr v1, v3

    const v3, 0x36979fbb

    goto/16 :goto_6

    :sswitch_b
    mul-int v10, v5, v9

    .line 30
    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_6

    :goto_3
    const-string v0, "\u06da\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x33c3

    const v3, -0x7d6e0a01

    xor-int/2addr v1, v3

    const v3, 0xde554b

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u1a7a\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x27ed

    const v3, -0x25611d42

    xor-int/2addr v1, v3

    const v3, 0x56bb1aa7

    goto/16 :goto_6

    :sswitch_c
    mul-int v8, v7, v7

    const/4 v9, 0x2

    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    const-string v0, "\u073a\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x47

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x14f3

    const v3, -0x71470de

    xor-int/2addr v1, v3

    const v3, 0x23635215

    goto/16 :goto_6

    :sswitch_d
    add-int v7, v5, v6

    .line 42
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u06da\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x5f17

    const v3, 0x12ebae10

    xor-int/2addr v1, v3

    const v3, 0xb6c1e7d

    goto/16 :goto_6

    :sswitch_e
    aget-short v5, v19, v4

    const/4 v6, 0x1

    .line 77
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u05a8\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x47

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2ee9

    const v3, 0xd39eaba

    xor-int/2addr v1, v3

    const v3, 0x62316df3

    goto/16 :goto_6

    :sswitch_f
    const/16 v4, 0x10f

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v0

    if-ltz v0, :cond_b

    :cond_a
    :goto_4
    const-string v0, "\u1a76\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x61

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x5c3f

    const v3, 0x6fdf4ab0

    xor-int/2addr v1, v3

    const v3, -0x7f670333

    goto :goto_6

    :cond_b
    const-string v0, "\u05a1\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x25a5

    const v3, 0x3613b798

    xor-int/2addr v1, v3

    const v3, 0x1a86345

    goto :goto_6

    :sswitch_10
    sget-object v19, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_c

    goto :goto_5

    :cond_c
    const-string v0, "\u1a79\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2d13

    const v3, 0x53205e50

    xor-int/2addr v1, v3

    const v3, -0x1a8cf03d

    goto :goto_6

    :sswitch_11
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_d

    :goto_5
    const-string v0, "\u06e8\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x564b

    const v3, -0x3f5693bd

    xor-int/2addr v1, v3

    const v3, -0xe8e55ff

    goto :goto_6

    :cond_d
    const-string v0, "\u06e1\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x4f4b

    const v3, 0x4b467487    # 1.3005959E7f

    xor-int/2addr v1, v3

    const v3, -0x1a3dde31

    :goto_6
    xor-int v18, v0, v3

    :goto_7
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x727e0ee6 -> :sswitch_c
        -0x71b3715a -> :sswitch_6
        -0x6b620419 -> :sswitch_a
        -0x67acd644 -> :sswitch_e
        -0x677a9035 -> :sswitch_7
        -0x66da8f0b -> :sswitch_4
        -0x65a3eef1 -> :sswitch_b
        -0x61789c7e -> :sswitch_8
        -0x44abcc6b -> :sswitch_11
        -0x3c9826b8 -> :sswitch_3
        -0x395a0c3e -> :sswitch_4
        -0x3180c54e -> :sswitch_5
        -0x24db758e -> :sswitch_d
        -0x246cf357 -> :sswitch_1
        -0x1bcadde4 -> :sswitch_b
        -0x1a2b7e84 -> :sswitch_f
        -0x18c4f9dc -> :sswitch_9
        -0x103e0a0f -> :sswitch_9
        -0xa70c4d8 -> :sswitch_2
        -0x822997d -> :sswitch_a
        0x6abfc4e -> :sswitch_0
        0xd2802b0 -> :sswitch_3
        0x10e562fe -> :sswitch_11
        0x16d88c07 -> :sswitch_7
        0x17112516 -> :sswitch_d
        0x29ccc649 -> :sswitch_8
        0x32a1d2ce -> :sswitch_0
        0x39a71dcc -> :sswitch_f
        0x433ea923 -> :sswitch_c
        0x4e935286 -> :sswitch_10
        0x550bdedd -> :sswitch_5
        0x5f07caee -> :sswitch_6
        0x63fff69f -> :sswitch_e
        0x6f5ae416 -> :sswitch_2
        0x75736f12 -> :sswitch_1
        0x7c3931d7 -> :sswitch_10
    .end sparse-switch
.end method

.method public static final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 27

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, -0x77dfd5cc

    sget v20, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v21, Ll/֨۬;->۫ۙ᩺:I

    const-string v22, "\u1a7a\u1a79"

    invoke-static/range {v22 .. v22}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v22

    add-int v22, v22, v21

    mul-int/lit8 v22, v22, -0x4d

    xor-int v0, v22, v20

    mul-int/lit16 v0, v0, -0x1795

    const v24, 0x781d653

    xor-int v0, v0, v24

    const v24, -0x7fa142cf

    xor-int v22, v22, v24

    move-object/from16 v16, v4

    move-object v12, v11

    move-object v15, v14

    move-object/from16 v7, v17

    move/from16 v23, v22

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, -0x77dfd5cc

    const/16 v24, 0x0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v9, v22, v20

    mul-int/lit16 v9, v9, -0x780d

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v0, v9

    xor-int v22, v23, v0

    sparse-switch v22, :sswitch_data_0

    move-object/from16 v9, p1

    move-object/from16 v23, v1

    sget-object v16, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 140
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v0

    if-gtz v0, :cond_d

    goto/16 :goto_8

    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    goto/16 :goto_6

    .line 214
    :sswitch_1
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v9, p1

    :goto_1
    move-object/from16 v23, v1

    goto/16 :goto_8

    :sswitch_2
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_3

    .line 245
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    :sswitch_5
    return-void

    .line 285
    :sswitch_6
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d1b17a2

    xor-int/2addr v0, v1

    .line 287
    invoke-static {v0}, Ll/֫֫;->ۙܽ᩹(I)Ll/᩸ۚۢ;

    return-void

    .line 285
    :sswitch_7
    sget-object v0, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v4, 0x160

    const/4 v9, 0x3

    invoke-static {v0, v4, v9, v11}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 55
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "\u06d6\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x68af

    const v23, -0x715a387a

    xor-int v9, v9, v23

    const v23, 0x54503802

    goto/16 :goto_4

    :sswitch_8
    move-object/from16 v0, p0

    .line 284
    :try_start_0
    invoke-virtual {v3, v0}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 285
    invoke-static/range {p1 .. p1}, Ll/֡ᩴ;->ܽۖ۫(Ljava/lang/Object;)Ll/᩸ۚۢ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v9, "\u1a7b\u0736"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v21

    xor-int v0, v9, v20

    mul-int/lit16 v0, v0, 0xc01

    const v23, 0x4948f61d

    xor-int v0, v0, v23

    const v23, 0x262bec78

    xor-int v23, v9, v23

    goto/16 :goto_0

    :catchall_0
    const-string v0, "\u06e1\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x33

    xor-int v9, v0, v20

    mul-int/lit16 v9, v9, 0x341

    const v23, 0x42a459b4

    xor-int v9, v9, v23

    const v23, -0x268408b2

    goto/16 :goto_4

    :sswitch_9
    const/16 v0, 0x42

    .line 204
    invoke-static {v7, v8, v0, v11}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 282
    invoke-static {v2, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v2

    check-cast v3, Landroid/text/ClipboardManager;

    const-string v0, "\u073d\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x6ff7

    const v23, 0x35ccfebb

    xor-int v9, v9, v23

    const v23, -0x2f1ef557

    goto/16 :goto_4

    .line 204
    :sswitch_a
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ۖۘ;->ۧܰ᩹(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v8, 0x11e

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const-string v0, "\u1a7b\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x29

    xor-int v9, v0, v20

    mul-int/lit16 v9, v9, -0x7813

    const v23, 0x3701017c

    xor-int v9, v9, v23

    const v23, -0x28966d8b

    goto :goto_4

    :cond_4
    const-string v0, "\u1a7a\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v9, v0, v20

    mul-int/lit16 v9, v9, 0x16a3

    const v23, -0x16f8bf8b

    xor-int v9, v9, v23

    const v23, -0x728bf6f5

    goto :goto_4

    .line 0
    :sswitch_b
    invoke-static {v15, v5, v6, v11}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_5

    :goto_2
    move-object/from16 v9, p1

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u1a7a\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x63

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, -0x35d9

    const v23, -0x4302e91c

    xor-int v9, v9, v23

    const v23, 0x39a1b635

    goto :goto_4

    :sswitch_c
    sget-object v15, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v5, 0x115

    const/16 v6, 0x9

    .line 91
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_6

    :goto_3
    const-string v0, "\u06eb\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x65

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, 0x1369

    const v23, 0x6b16e4cb

    xor-int v9, v9, v23

    const v23, -0xc4fded0

    goto :goto_4

    :cond_6
    const-string v0, "\u1a7a\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v9, v0, v21

    mul-int/lit16 v9, v9, 0x280f

    const v23, 0x17316a70

    xor-int v9, v9, v23

    const v23, 0x2186b25

    :goto_4
    xor-int v23, v0, v23

    move v0, v9

    goto/16 :goto_0

    .line 0
    :sswitch_d
    invoke-static {v12, v13, v14, v11}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v9, p1

    invoke-static {v9, v0}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_7

    goto/16 :goto_1

    :cond_7
    const-string v0, "\u06e0\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x4f

    move-object/from16 v23, v1

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x2189

    const v25, -0x5d9e785c

    xor-int v1, v1, v25

    const v25, 0x65885c6c

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    .line 0
    sget-object v12, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v13, 0x112

    const/4 v14, 0x3

    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u06e1\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x67ef

    const v25, -0x466f4278

    xor-int v1, v1, v25

    const v25, -0x79c11ad8

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    const/16 v0, 0x622d

    const/16 v11, 0x622d

    goto :goto_5

    :sswitch_10
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    const/16 v0, 0xe0b

    const/16 v11, 0xe0b

    :goto_5
    const-string v0, "\u06e1\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x7e8b

    const v25, 0x7fb17467

    xor-int v1, v1, v25

    const v25, 0x5cd2befd

    goto/16 :goto_9

    :sswitch_11
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    add-int/lit8 v0, v10, 0x1

    sub-int v0, v0, v24

    if-gtz v0, :cond_9

    const-string v0, "\u06df\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x5

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x48f9

    const v25, -0x4c3c3778

    xor-int v1, v1, v25

    const v25, 0x6f3098bc

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u06e2\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x70f5

    const v25, -0x64ee330c

    xor-int v1, v1, v25

    const v25, 0x7c928f17

    goto/16 :goto_9

    :sswitch_12
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    mul-int v24, v19, v19

    mul-int/lit8 v10, v18, 0x2

    .line 246
    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_a

    :goto_6
    const-string v0, "\u05a8\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x43d9

    const v25, -0xb0c43b8

    xor-int v1, v1, v25

    const v25, 0x58057f47

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06e7\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x4fe9

    const v25, -0x62650091

    xor-int v1, v1, v25

    const v25, -0x60da6967

    goto/16 :goto_9

    :sswitch_13
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    aget-short v18, v16, v17

    add-int/lit8 v19, v18, 0x1

    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_b

    move-object/from16 v1, v23

    :goto_7
    const-string v0, "\u06d7\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    move-object/from16 v23, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x1dc7

    const v25, 0xb1b124e

    xor-int v1, v1, v25

    const v25, -0xb846d8f

    goto :goto_9

    :cond_b
    const-string v0, "\u05a8\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x7b2f

    const v25, -0x5abfd077

    xor-int v1, v1, v25

    const v25, -0x1e5304f8

    goto :goto_9

    :sswitch_14
    move-object/from16 v9, p1

    move-object/from16 v23, v1

    const/16 v17, 0x111

    .line 122
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x5d13

    const v25, 0x2da1d250

    xor-int v1, v1, v25

    const v25, 0x5b02e502

    goto :goto_9

    :goto_8
    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x3cc3

    const v25, -0x2921d5e9

    xor-int v1, v1, v25

    const v25, 0x66e4999a

    goto :goto_9

    :cond_d
    const-string v0, "\u06da\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x2c41

    const v25, 0x7b5d16bb

    xor-int v1, v1, v25

    const v25, -0x20368aad

    :goto_9
    xor-int v0, v0, v25

    move-object/from16 v26, v23

    move/from16 v23, v0

    move v0, v1

    move-object/from16 v1, v26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a0cbe7e -> :sswitch_9
        -0x79d788bf -> :sswitch_8
        -0x76034c08 -> :sswitch_d
        -0x6cb6d22d -> :sswitch_b
        -0x6a5bdab1 -> :sswitch_14
        -0x5d4d2c16 -> :sswitch_0
        -0x595f2fdf -> :sswitch_0
        -0x575cf534 -> :sswitch_6
        -0x56212387 -> :sswitch_e
        -0x4d8e4142 -> :sswitch_11
        -0x45a76f87 -> :sswitch_a
        -0x449ac8e0 -> :sswitch_e
        -0x41343943 -> :sswitch_9
        -0x33d64ab1 -> :sswitch_c
        -0x2f085c57 -> :sswitch_d
        -0x28b2565c -> :sswitch_14
        -0x2869453a -> :sswitch_12
        -0x27503d26 -> :sswitch_8
        -0x213b3516 -> :sswitch_10
        -0x1c7cd1b8 -> :sswitch_f
        -0x16d7b50f -> :sswitch_12
        0x2997982 -> :sswitch_6
        0x2e1e39e -> :sswitch_13
        0xa4f85dd -> :sswitch_7
        0xdcb91c4 -> :sswitch_13
        0xecc53d9 -> :sswitch_1
        0x16d990cb -> :sswitch_4
        0x24012d8b -> :sswitch_1
        0x2c634201 -> :sswitch_11
        0x2eacd7ab -> :sswitch_5
        0x31273d1b -> :sswitch_4
        0x3b74120f -> :sswitch_c
        0x470eaec2 -> :sswitch_2
        0x4dd5408b -> :sswitch_2
        0x54554c6e -> :sswitch_3
        0x54d2ca28 -> :sswitch_b
        0x5768adcd -> :sswitch_a
        0x64af4b30 -> :sswitch_10
        0x6a0430c2 -> :sswitch_5
        0x6b02904b -> :sswitch_7
        0x741654e5 -> :sswitch_f
        0x7436c1a2 -> :sswitch_3
    .end sparse-switch
.end method

.method public static final ֫(Z)V
    .locals 0

    .line 52
    sput-boolean p0, Ll/ۙ᩸᩷;->ܿ:Z

    return-void
.end method

.method public static final ۖ()Landroid/graphics/Typeface;
    .locals 17

    const/4 v0, 0x0

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

    const v11, 0x54c5cade

    sget v12, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v14, "\u06e2\u06db"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3441

    const v16, 0x6c8d1ad6

    xor-int v15, v15, v16

    const v16, -0x1ab06f50

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x6701

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 71
    invoke-static {v0, v1}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0

    :sswitch_0
    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v14, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v14

    if-eqz v14, :cond_9

    goto :goto_1

    .line 74
    :sswitch_2
    sget v14, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v14, :cond_0

    goto :goto_1

    :cond_0
    const-string v14, "\u06e0\u06d9"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x3b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2593

    const v16, 0xdd3c91a

    xor-int v15, v15, v16

    const v16, 0x577d6a95

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0xd

    .line 71
    invoke-static {v9, v10, v1, v8}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 72
    sget-boolean v14, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v14, :cond_1

    :goto_1
    const-string v14, "\u05a8\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6947

    const v16, -0x4cef58dd

    xor-int v15, v15, v16

    const v16, 0x761e4543

    goto :goto_0

    :cond_1
    const-string v14, "\u06e8\u06ec"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x6d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x111f

    const v16, 0x196bf3ed

    xor-int v15, v15, v16

    const v16, -0x576f0a6d

    goto :goto_0

    :sswitch_6
    const/16 v10, 0x164

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v14

    if-eqz v14, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v14, "\u06e1\u1a76"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x5d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0xe0f

    const v16, -0x50b0d5b9

    xor-int v15, v15, v16

    const v16, 0x34f65562

    goto/16 :goto_0

    .line 71
    :sswitch_7
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v14, Ll/۟;->ۗۤۛ:I

    if-eqz v14, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v14, "\u06d7\u0736"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3627

    const v16, -0x6f6fa444

    xor-int v15, v15, v16

    const v16, -0x1774dbf1

    goto/16 :goto_0

    :sswitch_8
    sget-object v0, Ll/ۙ᩸᩷;->ۜ:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v14

    if-eqz v14, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v14, "\u0736\u06e8"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6a3d

    const v16, 0x6698557c

    xor-int v15, v15, v16

    const v16, -0x2b8cf39d

    goto/16 :goto_0

    :sswitch_9
    const v8, 0xb407

    goto :goto_2

    :sswitch_a
    const/16 v8, 0x7451

    :goto_2
    const-string v14, "\u06e1\u06da"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x31bb

    const v16, -0x4fbedb63

    xor-int v15, v15, v16

    const v16, -0x4958168c

    goto/16 :goto_0

    :sswitch_b
    add-int v14, v6, v7

    sub-int v14, v5, v14

    if-gtz v14, :cond_5

    const-string v14, "\u06da\u1a77"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3c2b

    const v16, -0x9e81be1

    xor-int v15, v15, v16

    const v16, 0x1aa8205c

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06d8\u06ec"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x59

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x724f

    const v16, 0x31477819

    xor-int v15, v15, v16

    const v16, 0x5369c092

    goto/16 :goto_0

    :sswitch_c
    mul-int v6, v4, v4

    const v7, 0x15050659

    .line 72
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v14

    if-eqz v14, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v14, "\u0730\u06df"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x567

    const v16, -0x30a54f0e

    xor-int v15, v15, v16

    const v16, -0x173afe77

    goto/16 :goto_0

    :sswitch_d
    const v5, 0x92b6

    mul-int v5, v5, v4

    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v14, :cond_7

    goto :goto_4

    :cond_7
    const-string v14, "\u05a8\u1a7b"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x35

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7dcd

    const v16, 0x1c0dd486

    xor-int v15, v15, v16

    const v16, -0x48675f94

    goto/16 :goto_0

    :sswitch_e
    aget-short v4, v2, v3

    .line 71
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v14

    if-eqz v14, :cond_8

    goto :goto_4

    :cond_8
    const-string v14, "\u0730\u073a"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x27

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x13ff

    const v16, -0x65857ded

    xor-int v15, v15, v16

    const v16, 0x159ba46d

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v14

    if-ltz v14, :cond_a

    :cond_9
    :goto_3
    const-string v14, "\u06eb\u06df"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x21f9

    const v16, -0x19ea5cae

    xor-int v15, v15, v16

    const v16, -0x1b1370b4

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u06e8\u06d6"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x77

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x42c9

    const v16, -0x5b232d4

    xor-int v15, v15, v16

    const v16, -0xfd4af1a

    goto/16 :goto_0

    .line 72
    :sswitch_10
    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v14, :cond_b

    :goto_4
    const-string v14, "\u06e1\u0736"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x77

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6345

    const v16, 0x1000ae50

    xor-int v15, v15, v16

    const v16, 0x2d27e87e

    goto/16 :goto_0

    :cond_b
    const-string v14, "\u06e7\u05ab"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x69

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1ddf

    const v16, 0x434e4270

    xor-int v15, v15, v16

    const v16, -0x6a208997

    goto/16 :goto_0

    :sswitch_11
    sget-object v2, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v3, 0x163

    sget v14, Ll/֡֡;->֫ۤܳ:I

    if-ltz v14, :cond_d

    :cond_c
    :goto_5
    const-string v14, "\u1a77\u06d9"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1375

    const v16, -0x3dcd5e03

    xor-int v15, v15, v16

    const v16, 0x5759acd1

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u1a79\u05ab"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x33

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x253f

    const v16, -0x579eee3

    xor-int v15, v15, v16

    const v16, 0x6af8c522

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c31a3f3 -> :sswitch_c
        -0x7a6a681b -> :sswitch_3
        -0x74b4ee55 -> :sswitch_a
        -0x5a401622 -> :sswitch_5
        -0x5a016878 -> :sswitch_4
        -0x596c9b50 -> :sswitch_f
        -0x43c3a855 -> :sswitch_f
        -0x4319bfef -> :sswitch_b
        -0x3ce2e6cc -> :sswitch_7
        -0x3b3b4cda -> :sswitch_d
        -0x3946b747 -> :sswitch_1
        -0x31d0278e -> :sswitch_0
        -0x2025a37f -> :sswitch_b
        -0x1d7b6ea6 -> :sswitch_8
        -0x15da3257 -> :sswitch_c
        -0x13d98181 -> :sswitch_9
        -0x82233f1 -> :sswitch_9
        -0x2d88bb5 -> :sswitch_e
        -0x174762d -> :sswitch_8
        0x16c3aee0 -> :sswitch_0
        0x1b776ed1 -> :sswitch_1
        0x2054faaa -> :sswitch_d
        0x21783fce -> :sswitch_e
        0x272ed2f4 -> :sswitch_a
        0x2be7ea88 -> :sswitch_6
        0x33794cdf -> :sswitch_3
        0x3a1294b7 -> :sswitch_4
        0x4134f79f -> :sswitch_2
        0x4590353b -> :sswitch_7
        0x4ffc4951 -> :sswitch_11
        0x519eca53 -> :sswitch_5
        0x56b96f97 -> :sswitch_10
        0x663a6c55 -> :sswitch_10
        0x74ac93a3 -> :sswitch_11
        0x750f8d32 -> :sswitch_2
        0x7968201a -> :sswitch_6
    .end sparse-switch
.end method

.method public static final ۘ()Landroid/content/pm/PackageManager;
    .locals 19

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

    const v12, -0x274f9892

    sget v13, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v14, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v15, "\u073f\u06d7"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, -0x2273

    const v17, 0x7236169b

    xor-int v0, v0, v17

    const v17, 0x316918b2    # 3.392E-9f

    xor-int v15, v15, v17

    move-object v2, v1

    move-object v11, v10

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, -0x274f9892

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x22fb

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v15

    const v0, 0x12ae0bf1

    add-int v6, v5, v0

    .line 109
    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_7

    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x13

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x51cd

    const v17, 0x2427fd22

    xor-int v15, v15, v17

    const v17, 0x38771662

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-lez v0, :cond_0

    move/from16 v16, v15

    goto/16 :goto_2

    :cond_0
    const-string v0, "\u06e7\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x6f

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x2e2f

    const v17, 0x6faa9f95

    xor-int v15, v15, v17

    const v17, -0x70ac4a35

    goto/16 :goto_5

    :sswitch_1
    move/from16 v16, v15

    .line 110
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_2

    :sswitch_2
    move/from16 v16, v15

    .line 107
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v0, :cond_8

    goto/16 :goto_3

    :sswitch_3
    move/from16 v16, v15

    .line 110
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_3

    .line 109
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x16

    .line 107
    invoke-static {v11, v12, v0, v10}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :sswitch_6
    move/from16 v16, v15

    const/16 v12, 0x172

    .line 111
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u1a73\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x42a3

    const v17, 0x5cc98ce0

    xor-int v15, v15, v17

    const v17, -0x69da9e00

    goto/16 :goto_5

    :sswitch_7
    move/from16 v16, v15

    .line 107
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 108
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v0

    if-gtz v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x236f

    const v17, -0x6ef031b8

    xor-int v15, v15, v17

    const v17, -0x5872d6f6

    goto/16 :goto_5

    :sswitch_8
    move/from16 v16, v15

    .line 107
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x4b89

    const v17, -0x517c903a

    xor-int v15, v15, v17

    const v17, -0x38711543

    goto/16 :goto_5

    :sswitch_9
    move/from16 v16, v15

    const/16 v0, 0x5caf

    const/16 v10, 0x5caf

    goto :goto_1

    :sswitch_a
    move/from16 v16, v15

    const v0, 0x90e5

    const v10, 0x90e5

    :goto_1
    const-string v0, "\u0733\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x639f

    const v17, -0x7f03487

    xor-int v15, v15, v17

    const v17, 0x67cd5165

    goto/16 :goto_5

    :sswitch_b
    move/from16 v16, v15

    mul-int v0, v9, v9

    sub-int v0, v7, v0

    if-ltz v0, :cond_4

    const-string v0, "\u06e4\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x235d

    const v17, 0x60a34b05

    xor-int v15, v15, v17

    const v17, -0x58f5ecaa

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u06d7\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x45

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0xafb

    const v17, 0x77454d4c

    xor-int v15, v15, v17

    const v17, 0x10437356

    goto/16 :goto_5

    :sswitch_c
    move/from16 v16, v15

    add-int v9, v4, v8

    .line 111
    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x3f61

    const v17, -0x307eb0bf

    xor-int v15, v15, v17

    const v17, 0x722399e0

    goto/16 :goto_5

    :sswitch_d
    move/from16 v16, v15

    add-int v7, v6, v6

    const/16 v8, 0x4527

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "\u06dc\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x40fb

    const v17, -0x11e80846

    xor-int v15, v15, v17

    const v17, -0x1e7247e0

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u073a\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x7ccb

    const v17, -0x7604de3a

    xor-int v15, v15, v17

    const v17, -0x74cd0253

    goto/16 :goto_5

    :sswitch_e
    move/from16 v16, v15

    mul-int v5, v4, v4

    .line 107
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_9

    :cond_8
    :goto_2
    const-string v0, "\u05a1\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x3a7d

    const v17, 0x5c64ffc

    xor-int v15, v15, v17

    const v17, 0xa0207d5

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x403

    const v17, -0xd4900

    xor-int v15, v15, v17

    const v17, -0x3794d272

    goto/16 :goto_5

    :sswitch_f
    move/from16 v16, v15

    aget-short v4, v2, v3

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_a

    goto :goto_3

    :cond_a
    const-string v0, "\u05ab\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x3b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3377

    const v17, -0x46587065

    xor-int v15, v15, v17

    const v17, 0x195478bf

    goto :goto_5

    :sswitch_10
    move/from16 v16, v15

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_b

    :goto_3
    const-string v0, "\u05a8\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x64b1

    const v17, 0x6004d1c9

    xor-int v15, v15, v17

    const v17, -0x16402b73

    goto :goto_5

    :cond_b
    const-string v0, "\u06da\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x311f

    const v17, 0x4df597be    # 5.15045312E8f

    xor-int v15, v15, v17

    const v17, -0x371c0691

    goto :goto_5

    :sswitch_11
    move/from16 v16, v15

    sget-object v2, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v3, 0x171

    .line 110
    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_d

    :cond_c
    :goto_4
    const-string v0, "\u073d\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x7e19

    const v17, -0x1b287119

    xor-int v15, v15, v17

    const v17, 0x7a50219d

    goto :goto_5

    :cond_d
    const-string v0, "\u1a77\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x2d

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x48cb

    const v17, -0x7db0d9ab

    xor-int v15, v15, v17

    const v17, -0xc4c95ae

    :goto_5
    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea2c844 -> :sswitch_f
        -0x708dfe2c -> :sswitch_2
        -0x678a3337 -> :sswitch_e
        -0x6419cd18 -> :sswitch_b
        -0x498b44b8 -> :sswitch_8
        -0x409f6a7d -> :sswitch_4
        -0x2f4d401e -> :sswitch_3
        -0x29877985 -> :sswitch_f
        -0x277995b2 -> :sswitch_0
        -0x24fb910f -> :sswitch_1
        -0x1f2f0c80 -> :sswitch_11
        -0x1eea306a -> :sswitch_d
        -0x14c61a74 -> :sswitch_10
        -0x2e64136 -> :sswitch_9
        -0x70f2b3 -> :sswitch_3
        0x74969b0 -> :sswitch_6
        0x9f91d1d -> :sswitch_0
        0x12bd9b54 -> :sswitch_9
        0x14afb9c9 -> :sswitch_c
        0x14f012e0 -> :sswitch_a
        0x16eb30d4 -> :sswitch_6
        0x1d77d912 -> :sswitch_b
        0x283baf00 -> :sswitch_7
        0x2dabcfd8 -> :sswitch_10
        0x3227c3d4 -> :sswitch_7
        0x38061115 -> :sswitch_4
        0x3d9c2b4e -> :sswitch_e
        0x56e92e91 -> :sswitch_a
        0x5a8b1715 -> :sswitch_d
        0x5dd750a2 -> :sswitch_c
        0x618f2588 -> :sswitch_1
        0x63048243 -> :sswitch_5
        0x63562dfa -> :sswitch_11
        0x668ab686 -> :sswitch_2
        0x71bfbe4b -> :sswitch_8
        0x7a0a6ae6 -> :sswitch_5
    .end sparse-switch
.end method

.method public static final ۚ()Z
    .locals 21

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

    const v15, 0x19916869

    sget v16, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v17, Ll/֡֡;->֫ۤܳ:I

    const-string v18, "\u06e4\u1a76"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v17, v18

    mul-int/lit8 v18, v18, -0xd

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x124f

    const v20, 0x5556c018

    xor-int v0, v0, v20

    const v20, -0x604fc50d

    xor-int v18, v18, v20

    move-object/from16 v20, v1

    move-object v10, v9

    move-object v13, v12

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x19916869

    :goto_0
    xor-int v2, v18, v16

    mul-int/lit16 v2, v2, -0x1dc9

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v0, v2

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    const/4 v5, 0x1

    .line 207
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_b

    goto/16 :goto_4

    :sswitch_0
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_d

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "\u0730\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0xf

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x2663

    const v19, 0x4d7e557c    # 2.66688448E8f

    xor-int v2, v2, v19

    const v19, 0x78c4db0

    goto/16 :goto_6

    .line 105
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v0, :cond_7

    goto :goto_1

    .line 126
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    :goto_1
    const-string v0, "\u06d7\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x15

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x3297

    const v19, 0x40e300e2

    xor-int v2, v2, v19

    const v19, -0x356bc426    # -4857325.0f

    goto/16 :goto_6

    .line 148
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    const/4 v0, 0x0

    return v0

    .line 43
    :sswitch_5
    invoke-static {v13, v14, v15, v9}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    .line 261
    invoke-static {v1, v0, v2}, Ll/ۖ۫;->۠ۛܳ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    return v0

    :sswitch_6
    const/16 v15, 0x12

    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u1a77\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x6d51

    const v19, 0xbc8374a

    xor-int v2, v2, v19

    const v19, 0x6d542a26

    goto/16 :goto_6

    .line 43
    :sswitch_7
    sget-object v13, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v14, 0x18c

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u06e8\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x7043

    const v19, 0x9085bf5

    xor-int v2, v2, v19

    const v19, -0x25e80320

    goto/16 :goto_6

    .line 261
    :sswitch_8
    invoke-static {v10, v11, v12, v9}, Ll/֫֫;->ܿ᩶ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-static {v0}, Ll/᩺;->ۢ۬ۖ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :sswitch_9
    const/4 v12, 0x3

    .line 89
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u1a73\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x43

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x6f89

    const v19, -0x574cc177

    xor-int v2, v2, v19

    const v19, 0x63434b1

    goto/16 :goto_6

    .line 261
    :sswitch_a
    sget-object v10, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v11, 0x189

    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u1a76\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x3c7f

    const v19, 0x3540a96

    xor-int v2, v2, v19

    const v19, 0x78b87b02

    goto/16 :goto_6

    .line 43
    :sswitch_b
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_5

    const-string v0, "\u06d7\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x67

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x1e95

    const v19, 0x79a7d005

    xor-int v2, v2, v19

    const v19, 0x30497f88

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u073d\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x7b8b

    const v19, 0x1cc30baf

    xor-int v2, v2, v19

    const v19, 0x1138dc73

    goto/16 :goto_6

    :sswitch_c
    const v0, 0xc4d0

    const v9, 0xc4d0

    goto :goto_2

    :sswitch_d
    const/16 v0, 0x58d1

    const/16 v9, 0x58d1

    :goto_2
    const-string v0, "\u1a73\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x55

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x44fd

    const v19, -0x64b0761e

    xor-int v2, v2, v19

    const v19, 0x501413fa

    goto/16 :goto_6

    :sswitch_e
    add-int v0, v7, v8

    sub-int/2addr v0, v6

    if-gtz v0, :cond_6

    const-string v0, "\u0733\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x3f

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x2c63

    const v19, 0x4f05cd99

    xor-int v2, v2, v19

    const v19, -0x22e1568c

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x54b

    const v19, -0x54f8c4c7

    xor-int v2, v2, v19

    const v19, 0x46ab1c03

    goto/16 :goto_6

    :sswitch_f
    const/4 v8, 0x1

    .line 243
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    :goto_3
    const-string v0, "\u06e2\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x485f

    const v19, 0x59d7a558

    xor-int v2, v2, v19

    const v19, -0x56dba0a0

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06d9\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x3cf

    const v19, -0x5825bacd

    xor-int v2, v2, v19

    const v19, 0x3f878d32

    goto/16 :goto_6

    :sswitch_10
    mul-int/lit8 v7, v4, 0x2

    .line 87
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x73

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x2c0d

    const v19, 0x2eb6e207

    xor-int v2, v2, v19

    const v19, -0x6bd58109

    goto/16 :goto_6

    :sswitch_11
    add-int v0, v4, v5

    mul-int v6, v0, v0

    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_a

    goto :goto_4

    :cond_a
    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x5d

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x7a69

    const v19, -0x7158a5c6

    xor-int v2, v2, v19

    const v19, -0x27c491ab

    goto/16 :goto_6

    :goto_4
    const-string v0, "\u05a1\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x5f

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, 0x17e3

    const v19, 0x3d9e11b4

    xor-int v2, v2, v19

    const v19, 0x39b6748d

    goto :goto_6

    :cond_b
    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x3385

    const v19, 0x1feefa6e

    xor-int v2, v2, v19

    const v19, 0x686f9a8b

    goto :goto_6

    :sswitch_12
    aget-short v4, v20, v3

    .line 76
    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_c

    goto :goto_5

    :cond_c
    const-string v0, "\u06e4\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v16

    mul-int/lit16 v2, v2, -0x59b3

    const v19, -0x2ce06118

    xor-int v2, v2, v19

    const v19, -0x3da6c79e

    goto :goto_6

    :sswitch_13
    sget-object v20, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v3, 0x188

    .line 183
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_e

    :cond_d
    :goto_5
    const-string v0, "\u073f\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x3823

    const v19, 0x7d121fd0

    xor-int v2, v2, v19

    const v19, 0x307ec34a

    goto :goto_6

    :cond_e
    const-string v0, "\u1a75\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x1d

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x2b95

    const v19, -0x6618e0cf

    xor-int v2, v2, v19

    const v19, -0x5deac8f2

    :goto_6
    xor-int v19, v0, v19

    move v0, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7be1a045 -> :sswitch_9
        -0x7b43f2f6 -> :sswitch_11
        -0x799c0fd4 -> :sswitch_d
        -0x7053cbcc -> :sswitch_6
        -0x6f52f042 -> :sswitch_b
        -0x69707ff2 -> :sswitch_7
        -0x65f885b4 -> :sswitch_5
        -0x5e53c955 -> :sswitch_8
        -0x51da8d39 -> :sswitch_c
        -0x51221f32 -> :sswitch_2
        -0x4e37866e -> :sswitch_e
        -0x4be67118 -> :sswitch_13
        -0x45f1377a -> :sswitch_c
        -0x41cec174 -> :sswitch_1
        -0x31944c9d -> :sswitch_a
        -0x2be755e5 -> :sswitch_1
        -0x274e748e -> :sswitch_d
        -0x19dfa239 -> :sswitch_11
        -0x1262d98d -> :sswitch_a
        0x7c0c509 -> :sswitch_0
        0x100578d2 -> :sswitch_10
        0x155b1f52 -> :sswitch_f
        0x23e87e71 -> :sswitch_b
        0x260243a0 -> :sswitch_12
        0x2b2ed671 -> :sswitch_9
        0x2e029d3c -> :sswitch_7
        0x32d178fd -> :sswitch_4
        0x360a3977 -> :sswitch_5
        0x3bd97f7e -> :sswitch_8
        0x416eeba5 -> :sswitch_3
        0x43728b3b -> :sswitch_12
        0x455d255a -> :sswitch_e
        0x477deafd -> :sswitch_f
        0x4bd33316 -> :sswitch_0
        0x54583bfe -> :sswitch_6
        0x55819e61 -> :sswitch_3
        0x5afdadc2 -> :sswitch_10
        0x6c6bb7cd -> :sswitch_2
        0x7309679e -> :sswitch_4
        0x74dcaed6 -> :sswitch_13
    .end sparse-switch
.end method

.method public static final ۜ()Ljava/io/File;
    .locals 17

    const/4 v0, 0x0

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

    const v11, 0x2830645d

    sget v12, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v13, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v14, "\u0733\u06e7"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0xb

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x6589

    const v16, -0x14934a

    xor-int v15, v15, v16

    const v16, -0xa7a58a1

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x2db1

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 124
    sget v14, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v14, :cond_c

    goto/16 :goto_5

    :sswitch_0
    sget v14, Ll/֨۟;->᩹֫᩷:I

    if-eqz v14, :cond_a

    goto :goto_1

    .line 123
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v14, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v14, :cond_7

    goto :goto_1

    .line 126
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto :goto_1

    .line 127
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v1, 0x10

    .line 123
    invoke-static {v9, v10, v1, v8}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_5
    const/16 v10, 0x19f

    sget v14, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v14, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v14, "\u06da\u1a76"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x17

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1375

    const v16, -0x21fd7f14

    xor-int v15, v15, v16

    const v16, -0x3dbc49d1

    goto :goto_0

    :sswitch_6
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v14, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v14, "\u1a7b\u073d"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x61

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x49b7

    const v16, 0x7a3b6dd4

    xor-int v15, v15, v16

    const v16, 0x319ea954

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 124
    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v14, :cond_2

    :goto_1
    const-string v14, "\u06e8\u06db"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x34f3

    const v16, 0xa84662

    xor-int v15, v15, v16

    const v16, 0x51ab1f2e

    goto/16 :goto_0

    :cond_2
    const-string v14, "\u073a\u1a73"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x22c7

    const v16, -0x285e212f

    xor-int v15, v15, v16

    const v16, -0x68b9694d

    goto/16 :goto_0

    :sswitch_8
    const/16 v8, 0x45d5

    goto :goto_2

    :sswitch_9
    const v8, 0x887b

    :goto_2
    const-string v14, "\u073a\u1a79"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x77cb

    const v16, -0x97dc0e2

    xor-int v15, v15, v16

    const v16, 0x6c6475f9

    goto/16 :goto_0

    :sswitch_a
    mul-int v14, v3, v7

    sub-int v14, v6, v14

    if-ltz v14, :cond_3

    const-string v14, "\u06e8\u073d"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x752b

    const v16, -0x66181cd9

    xor-int v15, v15, v16

    const v16, -0xeac2658

    goto/16 :goto_0

    :cond_3
    const-string v14, "\u05a1\u06db"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x5f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x233d

    const v16, 0x5c07ebbb

    xor-int v15, v15, v16

    const v16, 0x7d4c1982

    goto/16 :goto_0

    :sswitch_b
    add-int v6, v4, v5

    const/16 v7, 0x27a2

    sget v14, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v14, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v14, "\u0736\u06e4"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5ba5

    const v16, -0x66dca898

    xor-int v15, v15, v16

    const v16, 0x6ef2305

    goto/16 :goto_0

    :sswitch_c
    mul-int v4, v3, v3

    const v5, 0x188b0a1

    .line 126
    sget v14, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v14, :cond_5

    goto :goto_4

    :cond_5
    const-string v14, "\u0730\u06ec"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x7

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7eb5

    const v16, 0x71cd3a43

    xor-int v15, v15, v16

    const v16, -0x13c61460

    goto/16 :goto_0

    :sswitch_d
    aget-short v3, v1, v2

    .line 127
    sget-boolean v14, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v14, :cond_6

    goto :goto_4

    :cond_6
    const-string v14, "\u06e4\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x3d

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7dd1

    const v16, -0x18b42fe2

    xor-int v15, v15, v16

    const v16, -0x29132665

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v14

    if-eqz v14, :cond_8

    :cond_7
    :goto_3
    const-string v14, "\u06dc\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0xde3

    const v16, 0x3b96bd81

    xor-int v15, v15, v16

    const v16, 0x4254a5b6

    goto/16 :goto_0

    :cond_8
    const-string v14, "\u06d9\u06d6"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x67

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x7e43

    const v16, 0x3b95fbdd

    xor-int v15, v15, v16

    const v16, 0x2ab199b9

    goto/16 :goto_0

    :sswitch_f
    sget v14, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v14, :cond_9

    :goto_4
    const-string v14, "\u1a77\u1a78"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x7201

    const v16, 0x11cb1dad

    xor-int v15, v15, v16

    const v16, -0x48edaeaa

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u06da\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3d5d

    const v16, -0x11cf112

    xor-int v15, v15, v16

    const v16, -0x15ae76e1

    goto/16 :goto_0

    .line 126
    :sswitch_10
    sget v14, Ll/۟;->ۗۤۛ:I

    if-eqz v14, :cond_b

    :cond_a
    :goto_5
    const-string v14, "\u1a78\u06e2"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x3

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x43d9

    const v16, -0x1db983a

    xor-int v15, v15, v16

    const v16, 0xcd34be1

    goto/16 :goto_0

    :cond_b
    const-string v14, "\u073d\u06e4"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x29

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2373

    const v16, -0x4cfb3dd1

    xor-int v15, v15, v16

    const v16, 0x2d623454

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x19e

    sget v14, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v14, :cond_d

    :cond_c
    :goto_6
    const-string v14, "\u1a73\u06ec"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x21

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1a2b

    const v16, -0x3f6b69c9

    xor-int v15, v15, v16

    const v16, 0x30ebf4ba

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u06d6\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x43

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x14af

    const v16, -0x2ea01fb

    xor-int v15, v15, v16

    const v16, 0x406f6e7e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7031bfd9 -> :sswitch_c
        -0x6adccd7a -> :sswitch_9
        -0x5beeb6d7 -> :sswitch_3
        -0x586561a6 -> :sswitch_9
        -0x5194cd5e -> :sswitch_e
        -0x4cdbaa24 -> :sswitch_11
        -0x4cbae633 -> :sswitch_b
        -0x44f644e4 -> :sswitch_f
        -0x442a0ecc -> :sswitch_b
        -0x43042233 -> :sswitch_e
        -0x3e3b079b -> :sswitch_d
        -0x3e131cb7 -> :sswitch_6
        -0x34f304b6 -> :sswitch_f
        -0x2f4886cf -> :sswitch_5
        -0x20149cd8 -> :sswitch_4
        -0x91d7d28 -> :sswitch_1
        0x7014c5e -> :sswitch_3
        0xe5ac122 -> :sswitch_4
        0xe810132 -> :sswitch_a
        0xf2e555a -> :sswitch_1
        0xfce2532 -> :sswitch_7
        0xfce378f -> :sswitch_5
        0x11fa0e66 -> :sswitch_10
        0x12bf2765 -> :sswitch_d
        0x149de554 -> :sswitch_2
        0x1b0b9420 -> :sswitch_0
        0x281bd7cc -> :sswitch_c
        0x3ace0005 -> :sswitch_7
        0x436570fa -> :sswitch_8
        0x450388d6 -> :sswitch_2
        0x49e4d761 -> :sswitch_8
        0x4bc529d6 -> :sswitch_11
        0x50454ae8 -> :sswitch_a
        0x5f365b0c -> :sswitch_10
        0x6d17c7d6 -> :sswitch_0
        0x7acba92d -> :sswitch_6
    .end sparse-switch
.end method

.method public static final ۡ()Ll/ܿ۟᩵;
    .locals 19

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

    const v12, -0x74b12aa2

    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v15, "\u1a7a\u1a73"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, -0x7b

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, -0x6c7f

    const v17, 0x75536c69

    xor-int v0, v0, v17

    const v17, 0x57ad3f12

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v11, v10

    move/from16 v16, v15

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, -0x74b12aa2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x6f87

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v16, v1

    aget-short v5, v3, v4

    .line 62
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_7

    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    :goto_1
    move-object/from16 v16, v1

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v16, v1

    goto/16 :goto_6

    .line 60
    :sswitch_2
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_0

    :goto_2
    move-object/from16 v16, v1

    goto/16 :goto_7

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    .line 58
    :sswitch_5
    invoke-static {v1, v2}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Ll/ܿ۟᩵;

    return-object v1

    :sswitch_6
    const/16 v0, 0xd

    invoke-static {v11, v12, v0, v10}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v2

    .line 60
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_2

    goto :goto_3

    :cond_2
    const-string v0, "\u06e0\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move-object/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x58d7

    const v17, -0x4f99b4db

    xor-int v1, v1, v17

    const v17, 0x35d5d40

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v16, v1

    const/16 v12, 0x1b0

    .line 62
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06d9\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x7ae7

    const v17, 0x1d2f7b9b

    xor-int v1, v1, v17

    const v17, -0x5c31c2d6

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v16, v1

    .line 58
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 61
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u1a73\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x5ae1

    const v17, -0x5ef5772b

    xor-int v1, v1, v17

    const v17, 0x4744fcf5

    goto/16 :goto_9

    .line 58
    :sswitch_9
    sget-object v0, Ll/ۙ᩸᩷;->ᩳ:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 62
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    :goto_3
    const-string v0, "\u06e2\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v16, v0, v14

    mul-int/lit8 v16, v16, -0x59

    const v17, -0x432db06a

    xor-int v16, v16, v17

    const v17, -0x5364ea53

    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move/from16 v0, v18

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u073f\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move-object/from16 v16, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x133f

    const v17, 0x36698ca2

    xor-int v1, v1, v17

    const v17, 0x2df6346d

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v16, v1

    const v0, 0xd868

    const v10, 0xd868

    goto :goto_4

    :sswitch_b
    move-object/from16 v16, v1

    const/16 v0, 0x2a14

    const/16 v10, 0x2a14

    :goto_4
    const-string v0, "\u05a8\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x1b3d

    const v17, 0x4b1dc3f1    # 1.0339313E7f

    xor-int v1, v1, v17

    const v17, 0x6954e24e

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v16, v1

    add-int v0, v8, v9

    sub-int/2addr v0, v7

    if-gtz v0, :cond_7

    const-string v0, "\u0730\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x51

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x6139

    const v17, 0x1813c90

    xor-int v1, v1, v17

    const v17, 0x9e591be    # 5.52668E-33f

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u06db\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x3463

    const v17, -0x72d2f01c

    xor-int v1, v1, v17

    const v17, 0x227796af

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v16, v1

    const/4 v9, 0x1

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v0

    if-ltz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u073a\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x10ab

    const v17, 0x790a4b6a

    xor-int v1, v1, v17

    const v17, -0x70f61235

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v16, v1

    mul-int/lit8 v8, v5, 0x2

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u06da\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x312d

    const v17, -0x1c795875

    xor-int v1, v1, v17

    const v17, 0x5ec29366

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v16, v1

    add-int v0, v5, v6

    mul-int v7, v0, v0

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u1a77\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x5ab9

    const v17, -0x3ead62e

    xor-int v1, v1, v17

    const v17, 0x40f1d5f4

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u05a8\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x5f6d

    const v17, -0x317154fd

    xor-int v1, v1, v17

    const v17, 0x36837504

    goto/16 :goto_9

    :sswitch_10
    move-object/from16 v16, v1

    const/4 v6, 0x1

    .line 58
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_b

    :goto_6
    const-string v0, "\u1a78\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x7ca7

    const v17, -0x5b0b1649

    xor-int v1, v1, v17

    const v17, 0x24d75885

    goto :goto_9

    :cond_b
    const-string v0, "\u06da\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x6cef

    const v17, -0x751c6353

    xor-int v1, v1, v17

    const v17, 0x77e811c6

    goto :goto_9

    :goto_7
    const-string v0, "\u1a79\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x12e5

    const v17, 0x28b2a714

    xor-int v1, v1, v17

    const v17, 0x974926

    goto :goto_9

    :cond_c
    const-string v0, "\u0730\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x1835

    const v17, -0x7f63e8ee

    xor-int v1, v1, v17

    const v17, 0x2595f3a3

    goto :goto_9

    :sswitch_11
    move-object/from16 v16, v1

    sget-object v3, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v4, 0x1af

    .line 59
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_d

    :goto_8
    const-string v0, "\u06d8\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x6bf1

    const v17, -0x7e6dee05

    xor-int v1, v1, v17

    const v17, -0x4ad1147e

    goto :goto_9

    :cond_d
    const-string v0, "\u06da\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x1b03

    const v17, -0x30d7d8bb

    xor-int v1, v1, v17

    const v17, -0x420038c7

    :goto_9
    xor-int v0, v0, v17

    move-object/from16 v18, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b43fe83 -> :sswitch_9
        -0x75dfdb4c -> :sswitch_1
        -0x6b622445 -> :sswitch_a
        -0x6a182080 -> :sswitch_0
        -0x5bdf0234 -> :sswitch_10
        -0x59215a6a -> :sswitch_11
        -0x57727b89 -> :sswitch_e
        -0x564d3689 -> :sswitch_c
        -0x55ba76d2 -> :sswitch_d
        -0x500e4bd1 -> :sswitch_9
        -0x4b8ad04f -> :sswitch_0
        -0x485fb6d2 -> :sswitch_b
        -0x3baead6b -> :sswitch_5
        -0x37b1bdac -> :sswitch_2
        -0x322abf4a -> :sswitch_f
        -0x2fac5d30 -> :sswitch_2
        -0x2245cf38 -> :sswitch_10
        -0x21ddaff2 -> :sswitch_1
        -0x124540fa -> :sswitch_c
        -0x8258cc8 -> :sswitch_5
        0xa1281d4 -> :sswitch_3
        0xb4d0d76 -> :sswitch_8
        0x1c4902b8 -> :sswitch_e
        0x1fdaba39 -> :sswitch_6
        0x207042bd -> :sswitch_d
        0x262fd8c7 -> :sswitch_4
        0x2740ddf3 -> :sswitch_3
        0x32fe3531 -> :sswitch_11
        0x3c2eee6d -> :sswitch_7
        0x51531444 -> :sswitch_f
        0x574927e7 -> :sswitch_6
        0x61fc18ed -> :sswitch_7
        0x7721f297 -> :sswitch_4
        0x7823eea3 -> :sswitch_a
        0x793e8395 -> :sswitch_b
        0x7e5f075e -> :sswitch_8
    .end sparse-switch
.end method

.method public static final ۢ()Landroid/os/Handler;
    .locals 1

    .line 74
    sget-object v0, Ll/ۙ᩸᩷;->֫:Landroid/os/Handler;

    return-object v0
.end method

.method public static final ۧ()Landroid/content/res/AssetManager;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x74c2f61e

    sget v11, Ll/֨᩺;->ۨ֨۬:I

    sget v12, Ll/֡᩶;->ܳܶ۠:I

    const-string v13, "\u06eb\u0733"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3f43

    const v15, 0x8ae0d4e

    xor-int/2addr v14, v15

    const v15, -0xd483391

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x44f

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-gez v13, :cond_b

    goto :goto_1

    .line 112
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v13, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_1
    const-string v13, "\u0730\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x38c1

    const v15, -0x45190c28

    xor-int/2addr v14, v15

    const v15, -0x39b84c81

    goto :goto_0

    .line 115
    :sswitch_2
    sget-boolean v13, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v13, :cond_9

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v1, 0xe

    .line 111
    invoke-static {v8, v9, v1, v7}, Ll/֡ۨ;->ۡܺ֡([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_5
    const/16 v9, 0x1be

    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v13, "\u1a77\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7047

    const v15, 0x74427cf7

    xor-int/2addr v14, v15

    const v15, 0x14e47cdf

    goto :goto_0

    :sswitch_6
    sget-object v8, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 113
    sget-boolean v13, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v13, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v13, "\u1a79\u06e0"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x5f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x233b

    const v15, 0xf43f2eb

    xor-int/2addr v14, v15

    const v15, -0x6d402442

    goto/16 :goto_0

    .line 111
    :sswitch_7
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 114
    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v13, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v13, "\u06db\u1a7a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x622f

    const v15, -0x5cafeed2

    xor-int/2addr v14, v15

    const v15, 0x1a7af6f9

    goto/16 :goto_0

    :sswitch_8
    const v7, 0xbaaa

    goto :goto_2

    :sswitch_9
    const/16 v7, 0x25a8

    :goto_2
    const-string v13, "\u1a76\u0736"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2fdf

    const v15, -0x7ec1eea8

    xor-int/2addr v14, v15

    const v15, -0x3b9e64d

    goto/16 :goto_0

    :sswitch_a
    add-int v13, v5, v6

    sub-int/2addr v13, v4

    if-ltz v13, :cond_4

    const-string v13, "\u1a73\u06d7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x15

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3e71

    const v15, -0x73bab4ca

    xor-int/2addr v14, v15

    const v15, 0x3adc0ee4

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u073a\u05ab"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x4f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5841

    const v15, 0x76cfe45c

    xor-int/2addr v14, v15

    const v15, -0x8d74b1d

    goto/16 :goto_0

    :sswitch_b
    mul-int v5, v3, v3

    const v6, 0x86c71

    sget-boolean v13, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v13, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u06da\u1a7b"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x4d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x19c5

    const v15, 0xf9d35ea

    xor-int/2addr v14, v15

    const v15, -0x201d50cd

    goto/16 :goto_0

    :sswitch_c
    mul-int/lit16 v4, v3, 0x5ce

    sget-boolean v13, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v13, :cond_6

    goto :goto_3

    :cond_6
    const-string v13, "\u0730\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xffd

    const v15, 0x5bd63fda

    xor-int/2addr v14, v15

    const v15, 0x115a2ffd

    goto/16 :goto_0

    :sswitch_d
    aget-short v3, v1, v2

    sget v13, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v13, :cond_7

    goto :goto_4

    :cond_7
    const-string v13, "\u06e8\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x69

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x610f

    const v15, -0x5653f811

    xor-int/2addr v14, v15

    const v15, -0x5e160ad8

    goto/16 :goto_0

    .line 112
    :sswitch_e
    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v13, :cond_8

    :goto_3
    const-string v13, "\u0730\u05a8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x41

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1481

    const v15, 0x4ecc2111

    xor-int/2addr v14, v15

    const v15, -0x2041ae03

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06d6\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x25fd

    const v15, 0x96b8311

    xor-int/2addr v14, v15

    const v15, -0x42c1c705

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v13, :cond_a

    :cond_9
    :goto_4
    const-string v13, "\u1a75\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4e75

    const v15, -0x2c698fbc

    xor-int/2addr v14, v15

    const v15, 0x45a789bc

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06e8\u1a7b"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1b01

    const v15, -0x7dc63362

    xor-int/2addr v14, v15

    const v15, -0x95803c3

    goto/16 :goto_0

    .line 111
    :sswitch_10
    sget v13, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v13, :cond_c

    :cond_b
    :goto_5
    const-string v13, "\u1a7a\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x71

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x74f3

    const v15, -0x37463d67

    xor-int/2addr v14, v15

    const v15, 0x35194f0e

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u06da\u06dc"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7d59

    const v15, 0x6a72e866

    xor-int/2addr v14, v15

    const v15, 0x5f2db752

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x1bd

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v13, :cond_d

    :goto_6
    const-string v13, "\u06da\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3bd9

    const v15, -0x4322fc11

    xor-int/2addr v14, v15

    const v15, 0x1aaf215f

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u0730\u05ab"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2f3d

    const v15, 0x6f8f860d

    xor-int/2addr v14, v15

    const v15, 0x56dbb0a0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x649f3a65 -> :sswitch_a
        -0x63085a83 -> :sswitch_2
        -0x590a328b -> :sswitch_7
        -0x57f8017f -> :sswitch_11
        -0x4a9228c6 -> :sswitch_e
        -0x4a052747 -> :sswitch_8
        -0x43a1611c -> :sswitch_a
        -0x34ca685f -> :sswitch_5
        -0x3149ceda -> :sswitch_9
        -0x2b6b735f -> :sswitch_c
        -0x271e8c51 -> :sswitch_1
        -0x26f3104d -> :sswitch_0
        -0x25ec8b43 -> :sswitch_5
        -0x1bf349f9 -> :sswitch_10
        -0x1871f1d1 -> :sswitch_d
        -0x15829e8d -> :sswitch_1
        -0x127d0db4 -> :sswitch_3
        -0xc02cb9c -> :sswitch_4
        -0x19f6b88 -> :sswitch_0
        0x59d8356 -> :sswitch_f
        0x15118f4f -> :sswitch_10
        0x1c23357e -> :sswitch_d
        0x1c7a55ee -> :sswitch_8
        0x349c98b3 -> :sswitch_2
        0x36704aae -> :sswitch_3
        0x3b7984e5 -> :sswitch_e
        0x4a09d321 -> :sswitch_11
        0x4a1c8d4e -> :sswitch_9
        0x4bea26b8 -> :sswitch_b
        0x4d8fba43 -> :sswitch_7
        0x4e57dd44 -> :sswitch_4
        0x4ff39aff -> :sswitch_6
        0x59b0c392 -> :sswitch_6
        0x6c35479c -> :sswitch_c
        0x70808eef -> :sswitch_b
        0x72a60dc0 -> :sswitch_f
    .end sparse-switch
.end method

.method public static final ۧ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 204
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p0}, Ll/ۖۘ;->ۧܰ᩹(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۧ(I)Ljava/lang/String;
    .locals 18

    const/4 v0, 0x0

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

    const v11, -0x3ae2c44

    sget v12, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v13, Ll/֨᩺;->ۨ֨۬:I

    const-string v14, "\u1a75\u06e1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x11e5

    const v16, 0x3c970524

    xor-int v15, v15, v16

    const v16, -0x31be78e0    # -8.1171456E8f

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x2da9

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 15
    sget-boolean v14, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v14, :cond_0

    goto :goto_2

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v14, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v14, :cond_1

    :cond_0
    move/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_7

    :cond_1
    move/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_9

    .line 26
    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v14, Ll/۟;->ۗۤۛ:I

    if-eqz v14, :cond_2

    :goto_2
    move/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_8

    :cond_2
    :goto_3
    move/from16 v14, p0

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto :goto_2

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v1, 0xe

    .line 91
    invoke-static {v9, v10, v1, v8}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_5
    const/16 v10, 0x1cd

    sget v14, Ll/֡۬;->۠֡᩶:I

    if-gtz v14, :cond_3

    goto :goto_3

    :cond_3
    const-string v14, "\u06dc\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6c1b

    const v16, -0x188e9765

    xor-int v15, v15, v16

    const v16, 0x4b0f3048    # 9384008.0f

    goto :goto_0

    :sswitch_6
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 57
    sget v14, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v14, :cond_4

    goto :goto_3

    :cond_4
    const-string v14, "\u06e0\u06ec"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x38eb

    const v16, -0x1b74ad92

    xor-int v15, v15, v16

    const v16, 0x21e595d6

    goto/16 :goto_0

    .line 91
    :sswitch_7
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    move/from16 v14, p0

    invoke-static {v0, v14}, Ll/֡۬;->ܶ۟᩵(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v15

    if-eqz v15, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v15, "\u06ec\u073f"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x763

    const v17, 0xd103c68

    xor-int v0, v0, v17

    const v17, 0x35a2d50f

    goto :goto_5

    :sswitch_8
    move/from16 v14, p0

    const/16 v8, 0x6259

    goto :goto_4

    :sswitch_9
    move/from16 v14, p0

    const/16 v8, 0x5d23

    :goto_4
    const-string v15, "\u1a77\u1a78"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x3c9

    const v17, 0x728902b5

    xor-int v0, v0, v17

    const v17, -0x4d57d2d3

    :goto_5
    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto/16 :goto_b

    :sswitch_a
    move/from16 v14, p0

    move-object/from16 v16, v0

    add-int v0, v6, v7

    add-int/2addr v0, v0

    sub-int v0, v5, v0

    if-gtz v0, :cond_6

    const-string v0, "\u06d8\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x44eb

    const v17, 0x7080dd95

    xor-int v15, v15, v17

    const v17, 0x55030fb9

    goto/16 :goto_a

    :cond_6
    const-string v0, "\u06ec\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x5397

    const v17, 0x7c2f36f8

    xor-int v15, v15, v17

    const v17, -0x1b685fd0

    goto/16 :goto_a

    :sswitch_b
    move/from16 v14, p0

    move-object/from16 v16, v0

    const v7, 0xab998a4

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_7

    move-object/from16 v0, v16

    :goto_6
    const-string v15, "\u1a76\u073d"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x7acf

    const v17, 0x31b900cd

    xor-int v0, v0, v17

    const v17, -0x58125193

    goto :goto_5

    :cond_7
    const-string v0, "\u06e8\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x5edb

    const v17, 0x1d20a07d

    xor-int v15, v15, v17

    const v17, 0x755846b2

    goto/16 :goto_a

    :sswitch_c
    move/from16 v14, p0

    move-object/from16 v16, v0

    mul-int v5, v4, v4

    mul-int v6, v3, v3

    .line 13
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u06d7\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x89

    const v17, -0x1ac3e60d

    xor-int v15, v15, v17

    const v17, -0x4145bcba

    goto/16 :goto_a

    :sswitch_d
    move/from16 v14, p0

    move-object/from16 v16, v0

    add-int/lit16 v4, v3, 0x3466

    .line 52
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v0

    if-gtz v0, :cond_9

    const-string v0, "\u1a74\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x64c3

    const v17, -0x351a0b96    # -7535157.0f

    xor-int v15, v15, v17

    const v17, -0xa863892

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u06da\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x2a6d

    const v17, 0x707c43e5

    xor-int v15, v15, v17

    const v17, 0x4ece21

    goto/16 :goto_a

    :sswitch_e
    move/from16 v14, p0

    move-object/from16 v16, v0

    aget-short v3, v1, v2

    .line 85
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_a

    :goto_7
    const-string v0, "\u1a76\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x2b3d

    const v17, 0x170160e

    xor-int v15, v15, v17

    const v17, -0x6b3a1eda

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u1a75\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x6d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x12c3

    const v17, 0x725bc369

    xor-int v15, v15, v17

    const v17, 0x4a12d0ea    # 2405434.5f

    goto/16 :goto_a

    :sswitch_f
    move/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v2, 0x1cc

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_b

    goto :goto_9

    :cond_b
    const-string v0, "\u06da\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x4fcb

    const v17, -0x1e13a234

    xor-int v15, v15, v17

    const v17, -0x65c1988f

    goto :goto_a

    :sswitch_10
    move/from16 v14, p0

    move-object/from16 v16, v0

    .line 25
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_c

    :goto_8
    const-string v0, "\u0733\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x78bd

    const v17, 0x25f9b5e6

    xor-int v15, v15, v17

    const v17, 0x587db221

    goto :goto_a

    :cond_c
    const-string v0, "\u06da\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1ccb

    const v17, 0xc93574a

    xor-int v15, v15, v17

    const v17, -0x64c4531

    goto :goto_a

    :sswitch_11
    move/from16 v14, p0

    move-object/from16 v16, v0

    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u0730\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x47f

    const v17, -0xdb93a0f

    xor-int v15, v15, v17

    const v17, -0x3589b2d5

    goto :goto_a

    :cond_d
    const-string v0, "\u073f\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x7ef3

    const v17, 0x480693fc

    xor-int v15, v15, v17

    const v17, -0x608c642e

    :goto_a
    xor-int v0, v0, v17

    move v14, v0

    :goto_b
    move-object/from16 v0, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f56e389 -> :sswitch_b
        -0x75d5bda3 -> :sswitch_a
        -0x72779848 -> :sswitch_11
        -0x659cf9c4 -> :sswitch_9
        -0x63c3cfc9 -> :sswitch_3
        -0x5b299edd -> :sswitch_f
        -0x5807e149 -> :sswitch_4
        -0x5478e89e -> :sswitch_10
        -0x494fd9e4 -> :sswitch_0
        -0x460bde55 -> :sswitch_9
        -0x3fb02810 -> :sswitch_0
        -0x3cfeef42 -> :sswitch_8
        -0x3c51ac3f -> :sswitch_e
        -0x28f3fe64 -> :sswitch_2
        -0x26aa0254 -> :sswitch_6
        -0x260badc6 -> :sswitch_e
        -0x23465835 -> :sswitch_10
        -0x125b8528 -> :sswitch_5
        -0x11114823 -> :sswitch_8
        -0xbaf7a10 -> :sswitch_c
        0x6f7f74c -> :sswitch_2
        0x154494ee -> :sswitch_f
        0x1bb79011 -> :sswitch_3
        0x20648f9b -> :sswitch_4
        0x26815dfd -> :sswitch_1
        0x321345b2 -> :sswitch_1
        0x36926da9 -> :sswitch_a
        0x3b8751c3 -> :sswitch_d
        0x4384ce2c -> :sswitch_c
        0x50e16214 -> :sswitch_11
        0x524d6cd7 -> :sswitch_b
        0x531e8ce4 -> :sswitch_d
        0x5d21b17f -> :sswitch_6
        0x5e5c96bc -> :sswitch_7
        0x622f924e -> :sswitch_5
        0x7fcce6e4 -> :sswitch_7
    .end sparse-switch
.end method

.method public static ۧ(ILandroid/view/View;)V
    .locals 27

    move/from16 v0, p0

    move-object/from16 v1, p1

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

    const v20, 0x4f8bbe0a

    sget v21, Ll/֡֡;->֫ۤܳ:I

    sget v22, Ll/ۖ;->᩹۟ۘ:I

    const-string v23, "\u1a74\u06ec"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v22

    xor-int v2, v23, v21

    mul-int/lit16 v2, v2, 0xfeb

    const v3, 0x5d7d1838

    xor-int/2addr v2, v3

    const v3, 0x5ce74824

    xor-int v3, v23, v3

    move-object v9, v7

    move-object/from16 v17, v8

    move-object/from16 v11, v16

    move-object/from16 v15, v19

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const v24, 0x4f8bbe0a

    const/16 v25, 0x0

    move-object v7, v5

    move-object v8, v6

    const/4 v6, 0x0

    move v5, v3

    const-wide/16 v3, 0x0

    :goto_0
    xor-int v12, v24, v21

    mul-int/lit16 v12, v12, -0x37b3

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v2, v12

    xor-int v24, v5, v2

    sparse-switch v24, :sswitch_data_0

    if-ge v0, v6, :cond_7

    const-string v2, "\u06df\u06d6"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x4d

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x2739

    const v12, 0x271f6fa

    xor-int/2addr v5, v12

    const v12, 0x1b198e54

    goto/16 :goto_9

    .line 88
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_10

    goto :goto_1

    .line 16
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v2, "\u0736\u1a78"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x817

    const v12, 0x47c66749

    xor-int/2addr v5, v12

    const v12, 0x4dd1f9e1    # 4.40351776E8f

    goto/16 :goto_9

    .line 61
    :sswitch_2
    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_4

    goto/16 :goto_7

    .line 109
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v2, :cond_e

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_6

    :sswitch_5
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    return-void

    .line 187
    :sswitch_6
    new-instance v2, Ll/ܶ᩸᩷;

    invoke-direct {v2, v0, v1}, Ll/ܶ᩸᩷;-><init>(ILandroid/view/View;)V

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_3

    :sswitch_7
    new-instance v2, Ll/ܶ᩸᩷;

    invoke-direct {v2, v0, v1}, Ll/ܶ᩸᩷;-><init>(ILandroid/view/View;)V

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :sswitch_8
    if-ge v0, v6, :cond_7

    const-string v2, "\u06da\u0736"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, -0x27

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x2243

    const v12, 0x717fb5a5

    xor-int/2addr v5, v12

    const v12, -0x6c444d11

    goto/16 :goto_9

    .line 167
    :sswitch_9
    invoke-static/range {p1 .. p1}, Ll/֨֫;->᩷ۖ֫(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_3

    :sswitch_a
    return-void

    .line 175
    :sswitch_b
    move-object v2, v8

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    const/4 v5, 0x0

    .line 176
    invoke-virtual {v2, v1, v5}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "\u06e2\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, -0x75

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0xecf

    const v12, -0x7a67a780

    xor-int/2addr v5, v12

    const v12, 0x35486cf1

    goto/16 :goto_9

    .line 175
    :sswitch_c
    invoke-static {v8, v9}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v2, :cond_1

    goto/16 :goto_8

    :cond_1
    const-string v2, "\u1a74\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x1565

    const v12, -0xfe3d024

    xor-int/2addr v5, v12

    const v12, -0x16734673

    goto/16 :goto_9

    :sswitch_d
    const/16 v2, 0x1e8

    const/16 v5, 0x50

    invoke-static {v15, v2, v5, v10}, Ll/֡۬;->ۢܳ᩸([SIII)Ljava/lang/String;

    move-result-object v9

    .line 130
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v2, "\u06dc\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x6199

    const v12, -0x36cda989

    xor-int/2addr v5, v12

    const v12, 0x51aa0123

    goto/16 :goto_9

    .line 175
    :sswitch_e
    invoke-static {v11, v13, v14, v10}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Ll/ۖۘ;->ۧܰ᩹(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    sget-object v15, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 170
    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v2, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v2, "\u1a79\u06d7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x7cd3

    const v12, -0x2befb58a

    xor-int/2addr v5, v12

    const v12, -0x67de0ae9

    goto/16 :goto_9

    :sswitch_f
    const/16 v14, 0xc

    .line 180
    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_5

    :cond_4
    :goto_2
    const-string v2, "\u073d\u06df"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x4b8f

    const v12, 0x42712eda

    xor-int/2addr v5, v12

    const v12, 0x4aa0670a    # 5256069.0f

    goto/16 :goto_9

    :cond_5
    const-string v2, "\u06e7\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x19

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x27ef

    const v12, 0x73dec4d7

    xor-int/2addr v5, v12

    const v12, -0x5a89fe56

    goto/16 :goto_9

    .line 175
    :sswitch_10
    invoke-static/range {p1 .. p1}, Ll/֫᩵;->۫۠ۗ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v13, 0x1dc

    .line 2
    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v2, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v2, "\u06e4\u06df"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, -0x63

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x4fed

    const v12, 0xe772db4

    xor-int/2addr v5, v12

    const v12, -0x4879ca21    # -1.599913E-5f

    goto/16 :goto_9

    :sswitch_11
    if-gtz v0, :cond_7

    const-string v2, "\u1a78\u1a76"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x3b

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x3e0d

    const v12, 0x143b0dcb

    xor-int/2addr v5, v12

    const v12, 0xb190472

    goto/16 :goto_9

    :cond_7
    :goto_3
    const-string v2, "\u0736\u1a76"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, -0xd

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x6645

    const v12, -0x5140f752

    xor-int/2addr v5, v12

    const v12, 0x7006d5

    goto/16 :goto_9

    .line 171
    :sswitch_12
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v2

    const-wide/16 v3, 0x64

    const/4 v6, 0x3

    if-nez v2, :cond_8

    const-string v2, "\u073d\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, -0x75

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x66b

    const v12, -0xb56779f

    xor-int/2addr v5, v12

    const v12, 0x70fbeda5

    goto/16 :goto_9

    :cond_8
    const-string v2, "\u06e7\u06e0"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x6fdd

    const v12, -0xa312c0b

    xor-int/2addr v5, v12

    const v12, -0x308b7654

    goto/16 :goto_9

    .line 166
    :sswitch_13
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-nez v2, :cond_9

    const-string v2, "\u06d9\u1a78"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    mul-int/lit8 v2, v2, -0x45

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x5d8d

    const v12, -0x1ecc49a0

    xor-int/2addr v5, v12

    const v12, 0x6410ad7d

    goto/16 :goto_9

    :cond_9
    const-string v2, "\u1a7a\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, 0x6b

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x5f9b

    const v12, 0x42ea5e6c

    xor-int/2addr v5, v12

    const v12, -0x6dfc84da

    goto/16 :goto_9

    :sswitch_14
    const/16 v2, 0x79ff

    const/16 v10, 0x79ff

    goto :goto_4

    :sswitch_15
    const/16 v2, 0x3f0a

    const/16 v10, 0x3f0a

    :goto_4
    const-string v2, "\u06e1\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x5a33

    const v12, -0x7fcd323a

    xor-int/2addr v5, v12

    const v12, -0x638dc9de

    goto/16 :goto_9

    :sswitch_16
    add-int v2, v25, v16

    mul-int v2, v2, v2

    sub-int v2, v23, v2

    if-ltz v2, :cond_a

    const-string v2, "\u06e4\u06da"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x318b

    const v12, 0x62beedd0

    xor-int/2addr v5, v12

    const v12, 0x5fb9e0fb

    goto/16 :goto_9

    :cond_a
    const-string v2, "\u06d8\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    mul-int/lit8 v2, v2, -0x39

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x63e5

    const v12, 0xc374c89

    xor-int/2addr v5, v12

    const v12, -0x34472192    # -2.4231132E7f

    goto/16 :goto_9

    :sswitch_17
    add-int v2, v19, v20

    add-int v23, v2, v2

    const/16 v16, 0x31ac

    .line 171
    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v2, :cond_b

    goto/16 :goto_8

    :cond_b
    const-string v2, "\u06e7\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x941

    const v12, 0x3c0ce504

    xor-int/2addr v5, v12

    const v12, 0x55cba027

    goto/16 :goto_9

    :sswitch_18
    aget-short v25, v17, v18

    mul-int v19, v25, v25

    const v20, 0x9a34b90

    .line 87
    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v2, :cond_c

    :goto_5
    const-string v2, "\u06e4\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, 0x6d

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x78c9

    const v12, 0x1422ff59

    xor-int/2addr v5, v12

    const v12, -0x3f2a967f

    goto/16 :goto_9

    :cond_c
    const-string v2, "\u0736\u06d6"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x2249

    const v12, -0x5412c55e

    xor-int/2addr v5, v12

    const v12, 0x25a8e6

    goto/16 :goto_9

    :sswitch_19
    const/16 v18, 0x1db

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v2, :cond_d

    :goto_6
    const-string v2, "\u06e4\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    mul-int/lit8 v2, v2, -0x61

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, -0x3341

    const v12, -0x5f4d6f76

    xor-int/2addr v5, v12

    const v12, -0x22fa26dd

    goto :goto_9

    :cond_d
    const-string v2, "\u1a75\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v22, v2

    mul-int/lit8 v2, v2, -0x9

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0xb59

    const v12, 0x74bc483d

    xor-int/2addr v5, v12

    const v12, -0x6c3073da

    goto :goto_9

    :sswitch_1a
    sget-object v17, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 77
    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v2, :cond_f

    :cond_e
    :goto_7
    const-string v2, "\u06e2\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, -0x55b3

    const v12, 0x33db746f

    xor-int/2addr v5, v12

    const v12, 0x25844a8d

    goto :goto_9

    :cond_f
    const-string v2, "\u0733\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v5, v2, v21

    mul-int/lit16 v5, v5, 0x4b69

    const v12, 0x3308b3f6

    xor-int/2addr v5, v12

    const v12, -0x54f3f1f7

    goto :goto_9

    :sswitch_1b
    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v2, :cond_11

    :cond_10
    :goto_8
    const-string v2, "\u0733\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x39

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x37c9

    const v12, -0x44756d96

    xor-int/2addr v5, v12

    const v12, 0x28e295a

    goto :goto_9

    :cond_11
    const-string v2, "\u06d6\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v5, v2, v22

    mul-int/lit16 v5, v5, 0x7e7d

    const v12, 0x57928c4a

    xor-int/2addr v5, v12

    const v12, -0x706fa3d

    :goto_9
    xor-int/2addr v2, v12

    move/from16 v26, v5

    move v5, v2

    move/from16 v2, v26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fecb298 -> :sswitch_16
        -0x7caa6dbf -> :sswitch_11
        -0x7a4d0106 -> :sswitch_1b
        -0x79b4084f -> :sswitch_5
        -0x7703a96b -> :sswitch_c
        -0x756146aa -> :sswitch_1
        -0x73620f30 -> :sswitch_16
        -0x6c09f392 -> :sswitch_3
        -0x6aa7595b -> :sswitch_12
        -0x67cbb4ca -> :sswitch_5
        -0x613afb36 -> :sswitch_8
        -0x5ce3de3a -> :sswitch_15
        -0x5a7a9534 -> :sswitch_19
        -0x5719ebf5 -> :sswitch_3
        -0x5481b626 -> :sswitch_8
        -0x53335bf3 -> :sswitch_b
        -0x5234dfd5 -> :sswitch_0
        -0x4e8be158 -> :sswitch_2
        -0x42d96992 -> :sswitch_d
        -0x3aed871b -> :sswitch_9
        -0x3a8c3371 -> :sswitch_11
        -0x302255de -> :sswitch_18
        -0x2c200c90 -> :sswitch_6
        -0x2507cfd7 -> :sswitch_7
        -0x22efc2a5 -> :sswitch_13
        -0xd7798e8 -> :sswitch_2
        -0x37fac33 -> :sswitch_17
        -0x32de253 -> :sswitch_4
        0x421e168 -> :sswitch_18
        0x45cc244 -> :sswitch_1a
        0x45e9b35 -> :sswitch_e
        0x94156bb -> :sswitch_e
        0x11424cb8 -> :sswitch_6
        0x12803b41 -> :sswitch_15
        0x147936b0 -> :sswitch_f
        0x14cb6593 -> :sswitch_1a
        0x152a9e22 -> :sswitch_b
        0x19f2d0c9 -> :sswitch_14
        0x2bda33e4 -> :sswitch_a
        0x31c9f0a1 -> :sswitch_9
        0x33d1483e -> :sswitch_10
        0x3534da05 -> :sswitch_1b
        0x4174424f -> :sswitch_d
        0x427abd74 -> :sswitch_1
        0x445b2500 -> :sswitch_f
        0x452460e3 -> :sswitch_13
        0x45e1fd29 -> :sswitch_7
        0x47c90d82 -> :sswitch_12
        0x49aec0d3 -> :sswitch_0
        0x5547c987 -> :sswitch_a
        0x602419ed -> :sswitch_4
        0x63e05129 -> :sswitch_c
        0x725a642b -> :sswitch_19
        0x74ae3e5a -> :sswitch_14
        0x785b4457 -> :sswitch_10
        0x7f51c5da -> :sswitch_17
    .end sparse-switch
.end method

.method public static final ۧ(Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x1b17c182

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    const-string v4, "\u1a75\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x325

    const v6, -0x7a182aa

    xor-int/2addr v5, v6

    const v6, -0x2d556881

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x58f5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 51
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v4, Ll/۠;->ܺܺܶ:I

    if-gez v4, :cond_5

    goto/16 :goto_2

    .line 149
    :sswitch_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_9

    goto/16 :goto_1

    .line 30
    :sswitch_2
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_1

    .line 105
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    return-void

    :sswitch_4
    const-wide/16 v4, 0xfa

    .line 151
    invoke-virtual {p0, v0, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_4

    .line 91
    :sswitch_5
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v4

    if-ltz v4, :cond_0

    const-string v4, "\u06eb\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ed1

    const v6, -0x762ff504

    xor-int/2addr v5, v6

    const v6, -0x42bbec31

    goto :goto_0

    :cond_0
    const-string v4, "\u06eb\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4bd1

    const v6, -0x67260ce2

    xor-int/2addr v5, v6

    const v6, -0x11823c9e

    goto :goto_0

    .line 145
    :sswitch_6
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0730\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x31b1

    const v6, -0x19a9011a

    xor-int/2addr v5, v6

    const v6, -0x58cc4ad5

    goto/16 :goto_0

    :sswitch_7
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u0730\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2dd3

    const v6, -0x71cbd8d8

    xor-int/2addr v5, v6

    const v6, 0x416b963d

    goto/16 :goto_0

    .line 90
    :sswitch_8
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a78\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x179b

    const v6, -0x469c3ba2

    xor-int/2addr v5, v6

    const v6, -0xa0e959a

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u1a78\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x347f

    const v6, 0x1df17e9d

    xor-int/2addr v5, v6

    const v6, 0x549a3005

    goto/16 :goto_0

    .line 89
    :sswitch_a
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_6

    :cond_5
    const-string v4, "\u06d8\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7fbf

    const v6, 0x43e85d44

    xor-int/2addr v5, v6

    const v6, -0x522d99a7

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x273b

    const v6, -0x3cea9722

    xor-int/2addr v5, v6

    const v6, 0x2be03cf7

    goto/16 :goto_0

    .line 130
    :sswitch_b
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x96f

    const v6, 0x3807a0ad

    xor-int/2addr v5, v6

    const v6, -0x7ce6f2de

    goto/16 :goto_0

    .line 50
    :sswitch_c
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_8

    :goto_1
    const-string v4, "\u06da\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2fbf

    const v6, -0x2304ccd9

    xor-int/2addr v5, v6

    const v6, 0x732794bd

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xa29

    const v6, 0xd4f37a8

    xor-int/2addr v5, v6

    const v6, 0x6dfa2f43

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u1a77\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36d1

    const v6, 0x28a7d12d

    xor-int/2addr v5, v6

    const v6, 0x24b13b49

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x26bd

    const v6, -0x67d07b73

    xor-int/2addr v5, v6

    const v6, 0x69aceb7e

    goto/16 :goto_0

    .line 151
    :sswitch_e
    new-instance v0, Ll/᩶᩸᩷;

    invoke-direct {v0, p0}, Ll/᩶᩸᩷;-><init>(Landroid/view/View;)V

    .line 111
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u06d8\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x602d

    const v6, -0x4f8e2cdd

    xor-int/2addr v5, v6

    const v6, 0x6e0134c2

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4467

    const v6, 0x7f3cdbfb

    xor-int/2addr v5, v6

    const v6, -0x19561871

    goto/16 :goto_0

    :sswitch_f
    return-void

    :sswitch_10
    if-eqz p0, :cond_d

    const-string v4, "\u06da\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1773

    const v6, -0x25dd06a2

    xor-int/2addr v5, v6

    const v6, 0x7e044df8

    goto/16 :goto_0

    :cond_d
    :goto_4
    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1eb

    const v6, -0x12c6458a

    xor-int/2addr v5, v6

    const v6, -0x3ad9c02

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f18bfdd -> :sswitch_f
        -0x79fa5f0a -> :sswitch_3
        -0x77e6c963 -> :sswitch_10
        -0x745a2545 -> :sswitch_f
        -0x72de4692 -> :sswitch_7
        -0x6727d0cd -> :sswitch_b
        -0x667c7fec -> :sswitch_5
        -0x626dcf90 -> :sswitch_c
        -0x5e442e1a -> :sswitch_8
        -0x5b3293f8 -> :sswitch_a
        -0x53f3acac -> :sswitch_4
        -0x51c9bd9e -> :sswitch_3
        -0x4fa23344 -> :sswitch_e
        -0x4e77733f -> :sswitch_b
        -0x4dd2be84 -> :sswitch_a
        -0x472570ad -> :sswitch_2
        -0x33a568a2 -> :sswitch_8
        -0x2d6485c6 -> :sswitch_4
        -0x161be146 -> :sswitch_6
        -0x7ed219b -> :sswitch_0
        -0x27c5cd9 -> :sswitch_5
        0x1c9b8ba -> :sswitch_9
        0x1448582b -> :sswitch_d
        0x1bdb8038 -> :sswitch_6
        0x2dd0b6f8 -> :sswitch_7
        0x331f4b3a -> :sswitch_c
        0x3947113e -> :sswitch_d
        0x3b7ae7f6 -> :sswitch_9
        0x483e52f8 -> :sswitch_e
        0x5338d400 -> :sswitch_1
        0x58f067ac -> :sswitch_0
        0x643e7d22 -> :sswitch_10
        0x7e02ef4c -> :sswitch_2
        0x7e1fd82c -> :sswitch_1
    .end sparse-switch
.end method

.method public static final ܳ()Ljava/lang/String;
    .locals 22

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

    const/4 v15, 0x0

    const v16, 0xac2f1be

    sget v17, Ll/֡᩶;->ܳܶ۠:I

    sget v18, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v19, "\u06e4\u1a73"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v17

    mul-int/lit8 v19, v19, -0x1f

    xor-int v0, v19, v18

    mul-int/lit16 v0, v0, 0x2eb5

    const v21, -0x7bcd9449

    xor-int v0, v0, v21

    const v21, -0x4a2d926a

    xor-int v19, v19, v21

    move-object/from16 v21, v5

    const/16 v20, 0x0

    :goto_0
    xor-int v5, v16, v18

    mul-int/lit16 v5, v5, -0x6a61

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v16, v19, v0

    sparse-switch v16, :sswitch_data_0

    aget-short v7, v21, v6

    .line 132
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_d

    goto/16 :goto_5

    .line 238
    :sswitch_0
    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_c

    goto/16 :goto_2

    .line 21
    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_4

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v0, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    :goto_1
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x2145

    const v19, -0x549cfbd9

    xor-int v5, v5, v19

    const v19, 0x2745f71

    goto/16 :goto_7

    .line 44
    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    const/4 v0, 0x0

    return-object v0

    .line 296
    :sswitch_5
    invoke-static {v4}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v0, "\u05a8\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3341

    const v19, 0x2dafe97f    # 1.999889E-11f

    xor-int v5, v5, v19

    const v19, 0x6af04553

    goto/16 :goto_7

    .line 295
    :sswitch_7
    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u06d7\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x1f

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x454b

    const v19, 0x6bf8b5a3

    xor-int v5, v5, v19

    const v19, 0x70344e43

    goto/16 :goto_7

    :sswitch_8
    return-object v3

    .line 293
    :sswitch_9
    move-object v0, v1

    check-cast v0, Landroid/content/ClipboardManager;

    .line 294
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const-string v0, "\u1a77\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x5609

    const v19, 0x325b0a0e

    xor-int v5, v5, v19

    const v19, -0x22a0a2ae

    goto/16 :goto_7

    :cond_0
    const-string v0, "\u06e0\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x27

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x218d

    const v19, -0x60781e8

    xor-int v5, v5, v19

    const v19, 0x162f113a

    goto/16 :goto_7

    :sswitch_a
    const/16 v0, 0x45

    .line 293
    invoke-static {v14, v15, v0, v10}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u0736\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x1349

    const v19, 0x65cc6f3d

    xor-int v5, v5, v19

    const v19, 0x7c034cf9

    goto/16 :goto_7

    :sswitch_b
    const/16 v15, 0x242

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v0, "\u1a77\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x6f6f

    const v19, 0x5edc0017

    xor-int v5, v5, v19

    const v19, 0x59656161

    goto/16 :goto_7

    .line 293
    :sswitch_c
    invoke-static/range {v20 .. v20}, Ll/ۙ᩸᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u1a76\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x1169

    const v19, 0x5a699395

    xor-int v5, v5, v19

    const v19, 0x3eec7444

    goto/16 :goto_7

    .line 0
    :sswitch_d
    invoke-static {v11, v12, v13, v10}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v20

    .line 211
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_5

    :cond_4
    :goto_2
    const-string v0, "\u1a7a\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x59

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x7729

    const v19, 0x52b49555

    xor-int v5, v5, v19

    const v19, -0x7cf11f42

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u073f\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x157

    const v19, 0x61edb1b7

    xor-int v5, v5, v19

    const v19, -0x2a37860f

    goto/16 :goto_7

    :sswitch_e
    const/16 v13, 0x9

    .line 128
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u1a77\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4bb7

    const v19, -0x6887319e

    xor-int v5, v5, v19

    const v19, 0x24b43caf

    goto/16 :goto_7

    .line 0
    :sswitch_f
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0x239

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_7

    goto :goto_4

    :cond_7
    const-string v0, "\u1a7a\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x1b3f

    const v19, -0x50455d44

    xor-int v5, v5, v19

    const v19, 0x195c2a2f

    goto/16 :goto_7

    :sswitch_10
    const v0, 0x86b1

    const v10, 0x86b1

    goto :goto_3

    :sswitch_11
    const v0, 0xcfae

    const v10, 0xcfae

    :goto_3
    const-string v0, "\u06e2\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x3339

    const v19, -0x79d60977

    xor-int v5, v5, v19

    const v19, 0x3f628445

    goto/16 :goto_7

    :sswitch_12
    mul-int v0, v9, v9

    sub-int v0, v8, v0

    if-gtz v0, :cond_8

    const-string v0, "\u1a76\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3e97

    const v19, -0x7d920f22

    xor-int v5, v5, v19

    const v19, -0x2395da6e

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06e4\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x75

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x4b9f

    const v19, 0x2f0b60f3

    xor-int v5, v5, v19

    const v19, -0x69e51bbd

    goto/16 :goto_7

    :sswitch_13
    add-int/lit16 v9, v7, 0x441e

    .line 189
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_a

    :cond_9
    :goto_4
    const-string v0, "\u05a8\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3a69

    const v19, 0x4d77d142    # 2.59855392E8f

    xor-int v5, v5, v19

    const v19, -0x1a46491d

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xd

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x3b5d

    const v19, 0x5845913a

    xor-int v5, v5, v19

    const v19, 0x42fee96b

    goto/16 :goto_7

    :sswitch_14
    const v0, 0x11078

    mul-int v8, v7, v0

    .line 279
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u06d7\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x6b

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x5171

    const v19, 0x41a0007

    xor-int v5, v5, v19

    const v19, 0x18382b9c

    goto :goto_7

    :cond_c
    :goto_5
    const-string v0, "\u06dc\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x7ca7

    const v19, -0x551787ac

    xor-int v5, v5, v19

    const v19, 0x59dd998d

    goto :goto_7

    :cond_d
    const-string v0, "\u05ab\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x72ad

    const v19, 0x615f2ea5

    xor-int v5, v5, v19

    const v19, -0x5ed44f45

    goto :goto_7

    :sswitch_15
    sget-object v21, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v6, 0x238

    .line 199
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v0

    if-ltz v0, :cond_e

    :goto_6
    const-string v0, "\u06dc\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x21

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x5475

    const v19, -0x750f9970

    xor-int v5, v5, v19

    const v19, -0x716333fb

    goto :goto_7

    :cond_e
    const-string v0, "\u06eb\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x5df5

    const v19, 0x7871f132

    xor-int v5, v5, v19

    const v19, 0x2a8a44f9

    :goto_7
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ec3f800 -> :sswitch_a
        -0x7c3ff38c -> :sswitch_c
        -0x79260e1e -> :sswitch_11
        -0x78137800 -> :sswitch_7
        -0x75696401 -> :sswitch_15
        -0x70878ea9 -> :sswitch_c
        -0x6c6898e8 -> :sswitch_4
        -0x637c222d -> :sswitch_3
        -0x5fffbd6a -> :sswitch_10
        -0x5852da6f -> :sswitch_9
        -0x517e7f97 -> :sswitch_f
        -0x50f31a2f -> :sswitch_b
        -0x4e5866dd -> :sswitch_15
        -0x431cd3ca -> :sswitch_7
        -0x3e7166e7 -> :sswitch_0
        -0x3e171a53 -> :sswitch_d
        -0x3b9323a8 -> :sswitch_10
        -0x37c15648 -> :sswitch_1
        -0x34165928 -> :sswitch_2
        -0x2ac20186 -> :sswitch_f
        -0x2124a9e9 -> :sswitch_1
        -0x1d5e1027 -> :sswitch_13
        -0x46416a4 -> :sswitch_14
        0x708af8 -> :sswitch_8
        0x3bda570 -> :sswitch_14
        0x3d6b42d -> :sswitch_a
        0xb5dd244 -> :sswitch_3
        0x1f3a12bb -> :sswitch_12
        0x25b6c86d -> :sswitch_6
        0x260649b1 -> :sswitch_12
        0x2837184e -> :sswitch_9
        0x30401c27 -> :sswitch_5
        0x31c39394 -> :sswitch_d
        0x36fac5ad -> :sswitch_2
        0x390200b4 -> :sswitch_8
        0x43ef8a52 -> :sswitch_e
        0x446394b6 -> :sswitch_6
        0x491571cf -> :sswitch_b
        0x4a427f2a -> :sswitch_11
        0x5b5d926a -> :sswitch_4
        0x5e162286 -> :sswitch_5
        0x5e7c008d -> :sswitch_13
        0x6a68ab87 -> :sswitch_e
        0x6ec31d27 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final ܺ()Z
    .locals 1

    .line 52
    sget-boolean v0, Ll/ۙ᩸᩷;->ܿ:Z

    return v0
.end method

.method public static final ܽ()Ljava/io/File;
    .locals 19

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

    const v12, 0x49c99af2

    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v14, Ll/ۙۨ;->ۡۗۙ:I

    const-string v15, "\u06d8\u06d6"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x44b9

    const v17, -0x271c0f56

    xor-int v0, v0, v17

    const v17, -0x643373c7

    xor-int v15, v15, v17

    move-object v2, v1

    move-object v11, v10

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0x49c99af2

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, -0x59c1

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto/16 :goto_5

    :sswitch_0
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v16, v1

    goto/16 :goto_3

    .line 138
    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    move-object/from16 v16, v1

    goto/16 :goto_7

    .line 139
    :sswitch_2
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v0, :cond_2

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/16 v0, 0x10

    .line 135
    invoke-static {v11, v12, v0, v10}, Ll/֫᩹;->᩻۟ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :sswitch_5
    const/16 v12, 0x288

    .line 137
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_3

    :cond_2
    :goto_1
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move-object/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x5377

    const v17, -0x28a04493

    xor-int v1, v1, v17

    const v17, -0x4436f063

    goto/16 :goto_8

    :cond_3
    move-object/from16 v16, v1

    const-string v0, "\u06e0\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2fd1

    const v17, 0x634e6d64

    xor-int v1, v1, v17

    const v17, -0x37d23794

    goto/16 :goto_8

    :sswitch_6
    move-object/from16 v16, v1

    .line 135
    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u06eb\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x7

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x7215

    const v17, -0x1229c0d5

    xor-int v1, v1, v17

    const v17, -0x721fd3b5

    goto/16 :goto_8

    :sswitch_7
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u1a7a\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x4d

    move-object/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x6e17

    const v17, 0x1634fbc4

    xor-int v1, v1, v17

    const v17, -0x441c12ae

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v16, v1

    const v0, 0xe056

    const v10, 0xe056

    goto :goto_2

    :sswitch_9
    move-object/from16 v16, v1

    const v0, 0xc9cd

    const v10, 0xc9cd

    :goto_2
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x5735

    const v17, -0x621789c4

    xor-int v1, v1, v17

    const v17, 0x557c7b0f

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v16, v1

    mul-int v0, v9, v9

    sub-int/2addr v0, v7

    if-gtz v0, :cond_6

    const-string v0, "\u06e7\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x2969

    const v17, -0x69c5e154

    xor-int v1, v1, v17

    const v17, -0x549a45e2

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u06e8\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x10a9

    const v17, 0x30c5a867

    xor-int v1, v1, v17

    const v17, 0x1299e583

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v16, v1

    add-int v9, v4, v8

    .line 136
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "\u06e7\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x711f

    const v17, -0x5291a618

    xor-int v1, v1, v17

    const v17, 0x2c11a304

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v16, v1

    add-int v7, v6, v6

    const/16 v8, 0x3893

    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_8

    :goto_3
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2d19

    const v17, 0x53223c1d

    xor-int v1, v1, v17

    const v17, 0x102f0366

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a7b\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2241

    const v17, -0x7f6e414a

    xor-int v1, v1, v17

    const v17, 0x2f5cc052

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v16, v1

    const v0, 0xc80a469

    add-int v6, v5, v0

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06ec\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x403f

    const v17, -0x960117c

    xor-int v1, v1, v17

    const v17, -0x54b288f1

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v16, v1

    mul-int v5, v4, v4

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_a

    :goto_4
    move-object/from16 v1, v16

    goto :goto_5

    :cond_a
    const-string v0, "\u1a7a\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x60d3

    const v17, 0x22cf1977

    xor-int v1, v1, v17

    const v17, 0x27bf1f5a

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v16, v1

    aget-short v4, v2, v3

    .line 138
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_b

    goto :goto_4

    :goto_5
    const-string v0, "\u073f\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move-object/from16 v16, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0xcc5

    const v17, 0x3d571ddc

    xor-int v1, v1, v17

    const v17, 0x5b0c7edc

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u05a1\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x5e01

    const v17, -0x24b743b3

    xor-int v1, v1, v17

    const v17, -0x193ea0a1

    goto :goto_8

    :sswitch_10
    move-object/from16 v16, v1

    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u06d7\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x1b

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x84f

    const v17, -0x180bceea

    xor-int v1, v1, v17

    const v17, -0x46f9d1d3

    goto :goto_8

    :cond_c
    const-string v0, "\u0736\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2e23

    const v17, -0x7e597904

    xor-int v1, v1, v17

    const v17, 0x1e112634

    goto :goto_8

    :sswitch_11
    move-object/from16 v16, v1

    sget-object v2, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v3, 0x287

    .line 139
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_d

    :goto_7
    const-string v0, "\u06d9\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x73d7

    const v17, -0x44b248a9

    xor-int v1, v1, v17

    const v17, -0x637b2dae

    goto :goto_8

    :cond_d
    const-string v0, "\u1a73\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x55

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2569

    const v17, -0x927cdf8

    xor-int v1, v1, v17

    const v17, 0x4f9db800

    :goto_8
    xor-int v0, v0, v17

    move-object/from16 v18, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77e379d8 -> :sswitch_11
        -0x75ba980d -> :sswitch_1
        -0x722147f2 -> :sswitch_9
        -0x72098bff -> :sswitch_c
        -0x56b7a6cc -> :sswitch_5
        -0x5074a74c -> :sswitch_3
        -0x4edeedac -> :sswitch_b
        -0x44ee9c75 -> :sswitch_6
        -0x428877f9 -> :sswitch_11
        -0x3cacd59a -> :sswitch_0
        -0x2e86542e -> :sswitch_e
        -0x276941ce -> :sswitch_a
        -0x225064ac -> :sswitch_5
        -0x1e7fd813 -> :sswitch_6
        -0x1b57cc7b -> :sswitch_1
        -0x19e12b1e -> :sswitch_8
        -0x1254be99 -> :sswitch_9
        -0xe65d023 -> :sswitch_2
        -0xe4b19f6 -> :sswitch_f
        -0xcb2b2fb -> :sswitch_f
        0x64b26a4 -> :sswitch_b
        0xd169d3f -> :sswitch_e
        0x1e37f325 -> :sswitch_10
        0x3223b710 -> :sswitch_a
        0x35d35db4 -> :sswitch_7
        0x364f7c20 -> :sswitch_3
        0x3aaaec19 -> :sswitch_d
        0x4728606b -> :sswitch_4
        0x4fef3dcc -> :sswitch_8
        0x5340a1e5 -> :sswitch_0
        0x57db7c50 -> :sswitch_4
        0x6803c8a1 -> :sswitch_2
        0x693ad0a6 -> :sswitch_c
        0x6d11de4d -> :sswitch_10
        0x7098761c -> :sswitch_d
        0x73c713f3 -> :sswitch_7
    .end sparse-switch
.end method

.method public static final ܽ(I)Ljava/lang/CharSequence;
    .locals 18

    const/4 v0, 0x0

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

    const v11, 0x7411e073

    sget v12, Ll/֡᩶;->ܳܶ۠:I

    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v14, "\u0730\u0733"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x761

    const v16, 0x52ac693f

    xor-int v15, v15, v16

    const v16, 0x79036661

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0xbdd

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move/from16 v14, p0

    move-object/from16 v16, v0

    .line 53
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_c

    goto/16 :goto_b

    .line 86
    :sswitch_0
    sget v14, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v14, :cond_0

    goto :goto_4

    :cond_0
    :goto_2
    move/from16 v14, p0

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v14, Ll/֨۟;->᩹֫᩷:I

    if-eqz v14, :cond_1

    :goto_3
    move/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_b

    :cond_1
    :goto_4
    const-string v14, "\u06e1\u1a7b"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0xd

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x8b9

    const v16, 0x6edc1846

    xor-int v15, v15, v16

    const v16, -0x4fa3a88d

    goto :goto_0

    .line 12
    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v14

    if-nez v14, :cond_2

    goto :goto_3

    :cond_2
    :goto_5
    move/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0xc

    .line 99
    invoke-static {v9, v10, v1, v8}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_6
    const/16 v10, 0x299

    sget v14, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v14, :cond_3

    goto :goto_2

    :cond_3
    const-string v14, "\u1a79\u0733"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x55

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x718b

    const v16, -0x26a43833

    xor-int v15, v15, v16

    const v16, 0x6f1b658a

    goto/16 :goto_0

    :sswitch_7
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 69
    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v14, :cond_4

    goto :goto_5

    :cond_4
    const-string v14, "\u06d6\u06e0"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x3633

    const v16, -0x2e5e2d33

    xor-int v15, v15, v16

    const v16, 0xdadec0    # 2.0100046E-38f

    goto/16 :goto_0

    .line 99
    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    move/from16 v14, p0

    invoke-virtual {v0, v14}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 55
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v15

    if-eqz v15, :cond_5

    goto/16 :goto_9

    :cond_5
    const-string v15, "\u06e0\u05ab"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move-object/from16 v16, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x7539

    const v17, -0x26de3cb7

    xor-int v0, v0, v17

    const v17, 0x5e030763

    goto :goto_7

    :sswitch_9
    move/from16 v14, p0

    const v8, 0x9192

    goto :goto_6

    :sswitch_a
    move/from16 v14, p0

    const v8, 0xba6d

    :goto_6
    const-string v15, "\u1a7b\u06d7"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v12

    mul-int/lit8 v15, v15, 0x53

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x6671

    const v17, -0x151ee436

    xor-int v0, v0, v17

    const v17, 0x49cc7cb

    :goto_7
    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto/16 :goto_d

    :sswitch_b
    move/from16 v14, p0

    move-object/from16 v16, v0

    mul-int v0, v7, v7

    sub-int v0, v5, v0

    if-lez v0, :cond_6

    const-string v0, "\u06dc\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x4e7b

    const v17, 0x65090f92

    xor-int v15, v15, v17

    const v17, 0x4d38a2ca    # 1.93604768E8f

    goto/16 :goto_c

    :cond_6
    const-string v0, "\u06e1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x75ad

    const v17, 0x144b859c

    xor-int v15, v15, v17

    const v17, -0x235ea91d

    goto/16 :goto_c

    :sswitch_c
    move/from16 v14, p0

    move-object/from16 v16, v0

    add-int v7, v3, v6

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_7

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u06e1\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x15

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x2c35

    const v17, 0x14c6cd68

    xor-int v15, v15, v17

    const v17, -0x22a1f6b1    # -9.9996288E17f

    goto/16 :goto_c

    :sswitch_d
    move/from16 v14, p0

    move-object/from16 v16, v0

    mul-int v5, v3, v4

    const/16 v6, 0x20c1

    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_8

    :goto_8
    const-string v0, "\u06db\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x5a61

    const v17, -0x386e9f2f

    xor-int v15, v15, v17

    const v17, 0x24be58bc

    goto/16 :goto_c

    :cond_8
    const-string v0, "\u1a79\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x2b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x7d1d

    const v17, 0x1ca69184

    xor-int v15, v15, v17

    const v17, 0x14643dc3

    goto/16 :goto_c

    :sswitch_e
    move/from16 v14, p0

    move-object/from16 v16, v0

    aget-short v3, v1, v2

    const v4, 0x8304

    .line 54
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_a

    :cond_9
    const-string v0, "\u1a77\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x7a1f

    const v17, -0xc8ddeda

    xor-int v15, v15, v17

    const v17, -0x519938c0

    goto/16 :goto_c

    :sswitch_f
    move/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v2, 0x298

    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_a

    move-object/from16 v0, v16

    :goto_9
    const-string v15, "\u06e7\u0733"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x14f5

    const v17, 0x171225f1

    xor-int v0, v0, v17

    const v17, 0x2fe054e

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u1a73\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x7fb3

    const v17, 0x7b9df35c

    xor-int v15, v15, v17

    const v17, -0x32bfb708

    goto/16 :goto_c

    :sswitch_10
    move/from16 v14, p0

    move-object/from16 v16, v0

    .line 59
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_b

    :goto_a
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x49

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x69d1

    const v17, -0x3066e07e

    xor-int v15, v15, v17

    const v17, -0x6a26eb81

    goto :goto_c

    :cond_b
    const-string v0, "\u1a7b\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x65

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x236f

    const v17, -0x530d3abc    # -6.8999546E-12f

    xor-int v15, v15, v17

    const v17, -0x31163796

    goto :goto_c

    :cond_c
    const-string v0, "\u05a1\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x4af9

    const v17, -0x5c702866

    xor-int v15, v15, v17

    const v17, 0x65787ba4

    goto :goto_c

    :sswitch_11
    move/from16 v14, p0

    move-object/from16 v16, v0

    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_d

    :goto_b
    const-string v0, "\u06d7\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x3891

    const v17, 0x6d3111af

    xor-int v15, v15, v17

    const v17, 0x2a50dc13

    goto :goto_c

    :cond_d
    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x1f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x3829

    const v17, -0x6b61e47d

    xor-int v15, v15, v17

    const v17, 0x1883db8d

    :goto_c
    xor-int v0, v0, v17

    move v14, v0

    :goto_d
    move-object/from16 v0, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x774233fe -> :sswitch_e
        -0x633cbca4 -> :sswitch_1
        -0x5caf7a2e -> :sswitch_9
        -0x551bea60 -> :sswitch_8
        -0x53244b35 -> :sswitch_5
        -0x52d5c5a0 -> :sswitch_b
        -0x3807ddf9 -> :sswitch_7
        -0x379bb4c0 -> :sswitch_c
        -0x3160d882 -> :sswitch_d
        -0x2b3c791f -> :sswitch_9
        -0x285081aa -> :sswitch_c
        -0x1f078033 -> :sswitch_11
        -0x18ffc2ab -> :sswitch_a
        -0x7fd3481 -> :sswitch_f
        -0x736a505 -> :sswitch_2
        0x1986adc -> :sswitch_7
        0x1ccadde2 -> :sswitch_3
        0x2429c758 -> :sswitch_10
        0x2b3658db -> :sswitch_0
        0x2ff1b143 -> :sswitch_4
        0x379e0373 -> :sswitch_d
        0x3807dcd4 -> :sswitch_10
        0x455a46fa -> :sswitch_a
        0x54b88d86 -> :sswitch_e
        0x57f85e88 -> :sswitch_b
        0x584e3724 -> :sswitch_1
        0x5a6aeb4c -> :sswitch_6
        0x5e231da4 -> :sswitch_11
        0x61e38662 -> :sswitch_2
        0x6cf5366d -> :sswitch_8
        0x6e1b0c9d -> :sswitch_f
        0x6f779f78 -> :sswitch_6
        0x70825f53 -> :sswitch_5
        0x70e0e9b1 -> :sswitch_4
        0x7cc38e93 -> :sswitch_0
        0x7e0e6ca6 -> :sswitch_3
    .end sparse-switch
.end method

.method public static final ܽ(Landroid/view/View;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0xb9132c1

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v4, "\u05a8\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x28cf

    const v6, -0x836fbcc

    xor-int/2addr v5, v6

    const v6, -0x43e1db60

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x154b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 v0, 0x0

    .line 62
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v4

    if-gtz v4, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_a

    goto/16 :goto_2

    .line 61
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_4

    goto :goto_1

    .line 17
    :sswitch_2
    sget v4, Ll/۟;->ۗۤۛ:I

    if-nez v4, :cond_1

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto/16 :goto_3

    .line 13
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    .line 165
    :sswitch_5
    invoke-static {v0, p0}, Ll/ۙ᩸᩷;->ۧ(ILandroid/view/View;)V

    goto/16 :goto_6

    .line 64
    :sswitch_6
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u1a76\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x60e5

    const v6, 0x7efbf325

    xor-int/2addr v5, v6

    const v6, 0x2203eeda

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u0736\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x47cf

    const v6, -0x40bdb630

    xor-int/2addr v5, v6

    const v6, -0x75c1870d

    goto :goto_0

    :cond_2
    const-string v4, "\u05a8\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6449

    const v6, 0x79829324

    xor-int/2addr v5, v6

    const v6, 0xb701113

    goto :goto_0

    .line 6
    :sswitch_8
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06eb\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2663

    const v6, -0x7b369525

    xor-int/2addr v5, v6

    const v6, -0x4d2e0ecf

    goto/16 :goto_0

    .line 50
    :sswitch_9
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u05a8\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3049

    const v6, 0x5477649

    xor-int/2addr v5, v6

    const v6, -0x73d65202

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3599

    const v6, 0x7cddef1f

    xor-int/2addr v5, v6

    const v6, 0x1eb4bdb

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06e4\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x41d1

    const v6, 0x157f92b0

    xor-int/2addr v5, v6

    const v6, -0x4dce294f

    goto/16 :goto_0

    .line 118
    :sswitch_b
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u0736\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2625

    const v6, 0x4d5b788c    # 2.30131904E8f

    xor-int/2addr v5, v6

    const v6, -0x19ab7055

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u06ec\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ead

    const v6, 0x46c4c621

    xor-int/2addr v5, v6

    const v6, -0x54ff6550

    goto/16 :goto_0

    .line 58
    :sswitch_d
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_9

    :goto_3
    const-string v4, "\u06d7\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6321

    const v6, 0x1484ee24

    xor-int/2addr v5, v6

    const v6, 0x6a871040

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e2\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x717

    const v6, -0x5c710ac8

    xor-int/2addr v5, v6

    const v6, 0x9d35d2b

    goto/16 :goto_0

    .line 144
    :sswitch_e
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06e7\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4f43

    const v6, 0x72b3b4c1

    xor-int/2addr v5, v6

    const v6, -0x6c58a177

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7739

    const v6, 0x44f8d4bd

    xor-int/2addr v5, v6

    const v6, 0x12714c07

    goto/16 :goto_0

    :goto_5
    const-string v4, "\u1a7b\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fe3

    const v6, 0x62389abe

    xor-int/2addr v5, v6

    const v6, 0x172d3005

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6325

    const v6, 0x62a81912

    xor-int/2addr v5, v6

    const v6, -0x5392b18e

    goto/16 :goto_0

    :sswitch_f
    return-void

    :sswitch_10
    if-eqz p0, :cond_d

    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3b4b

    const v6, -0x2dc72dc6

    xor-int/2addr v5, v6

    const v6, 0x430da516

    goto/16 :goto_0

    :cond_d
    :goto_6
    const-string v4, "\u1a75\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1215

    const v6, -0x5c306c04

    xor-int/2addr v5, v6

    const v6, 0x47f2b28c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ab5d2f4 -> :sswitch_2
        -0x72f79c3d -> :sswitch_5
        -0x6a04394e -> :sswitch_f
        -0x623ff7e4 -> :sswitch_0
        -0x5551d0e3 -> :sswitch_e
        -0x50a38eae -> :sswitch_1
        -0x4f620c94 -> :sswitch_a
        -0x4ceea7a6 -> :sswitch_b
        -0x49c12621 -> :sswitch_8
        -0x3f8a13f0 -> :sswitch_5
        -0x20e7d7fc -> :sswitch_a
        -0x1c86552f -> :sswitch_4
        -0x360af24 -> :sswitch_6
        0xed608a4 -> :sswitch_2
        0xfbd7755 -> :sswitch_10
        0x1257b0b1 -> :sswitch_7
        0x1ce83e71 -> :sswitch_c
        0x253634d8 -> :sswitch_3
        0x2c49323c -> :sswitch_3
        0x374615d3 -> :sswitch_10
        0x3c4e5006 -> :sswitch_4
        0x3df8b2e6 -> :sswitch_9
        0x44b86259 -> :sswitch_d
        0x52dba8a2 -> :sswitch_0
        0x5356f91f -> :sswitch_1
        0x54c53e82 -> :sswitch_9
        0x56fe30f7 -> :sswitch_f
        0x57223ea8 -> :sswitch_8
        0x5db93d80 -> :sswitch_6
        0x65e77090 -> :sswitch_c
        0x66461c17 -> :sswitch_d
        0x7157e654 -> :sswitch_e
        0x7208af81 -> :sswitch_7
        0x73a955b6 -> :sswitch_b
    .end sparse-switch
.end method

.method public static final ܿ()Landroid/app/Application;
    .locals 21

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

    const v14, -0x4f6b4f16

    sget v15, Ll/֫᩵;->ܶ᩻᩷:I

    sget v16, Ll/֡᩶;->ܳܶ۠:I

    const-string v17, "\u1a7b\u0730"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, 0x5e07

    const v19, 0x24b1b9ab

    xor-int v0, v0, v19

    const v19, 0x5be25f00

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int/2addr v14, v15

    mul-int/lit16 v14, v14, 0x661b

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v0, v14

    xor-int v14, v17, v0

    sparse-switch v14, :sswitch_data_0

    move/from16 v17, v14

    const/4 v13, 0x7

    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_1

    goto/16 :goto_4

    .line 49
    :sswitch_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-gez v0, :cond_0

    move/from16 v17, v14

    goto :goto_1

    :cond_0
    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move/from16 v17, v14

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, 0x46bf

    const v19, -0x1cb44de2

    xor-int v14, v14, v19

    const v19, 0x40cee80b

    goto/16 :goto_6

    :sswitch_1
    move/from16 v17, v14

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_b

    goto/16 :goto_3

    :sswitch_2
    move/from16 v17, v14

    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v0, :cond_2

    goto/16 :goto_3

    :sswitch_3
    move/from16 v17, v14

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_3

    .line 51
    :sswitch_4
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v18

    .line 49
    :sswitch_6
    invoke-static {v11, v12, v13, v10}, Ll/ۘۛ;->ۚ᩻֫([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩹;->ᩴۙᩴ(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x4b

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x433f

    const v19, -0x2873f954

    xor-int v14, v14, v19

    const v19, 0x2c85c3f5

    goto/16 :goto_6

    :sswitch_7
    move/from16 v17, v14

    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v12, 0x2a6

    .line 51
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_3

    :cond_2
    :goto_1
    const-string v0, "\u0730\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x68fb

    const v19, 0x61964697

    xor-int v14, v14, v19

    const v19, -0x778158a2

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x11cb

    const v19, 0x5e590ffb

    xor-int v14, v14, v19

    const v19, 0x17184acf

    goto/16 :goto_6

    :sswitch_8
    move/from16 v17, v14

    .line 49
    sget-object v18, Ll/ۙ᩸᩷;->ۧ:Ll/᩶ۡ᩷;

    if-eqz v18, :cond_4

    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x1453

    const v19, -0x6825096a

    xor-int v14, v14, v19

    const v19, 0x6ffa7e44

    goto/16 :goto_6

    :cond_4
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x55

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x1f9

    const v19, 0x1ea0d0ad

    xor-int v14, v14, v19

    const v19, -0x32c94cec

    goto/16 :goto_6

    :sswitch_9
    move/from16 v17, v14

    const v0, 0xfdb6

    const v10, 0xfdb6

    goto :goto_2

    :sswitch_a
    move/from16 v17, v14

    const/16 v0, 0x5aa8

    const/16 v10, 0x5aa8

    :goto_2
    const-string v0, "\u06d7\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x2dd

    const v19, 0x102a0685

    xor-int v14, v14, v19

    const v19, -0x445a3fdd

    goto/16 :goto_6

    :sswitch_b
    move/from16 v17, v14

    mul-int v0, v9, v9

    sub-int v0, v7, v0

    if-lez v0, :cond_5

    const-string v0, "\u06e7\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, 0x1877

    const v19, 0x20da817b

    xor-int v14, v14, v19

    const v19, 0x21582751

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06e8\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x3b

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x7f1d

    const v19, -0x104efd34

    xor-int v14, v14, v19

    const v19, -0x58df08d6

    goto/16 :goto_6

    :sswitch_c
    move/from16 v17, v14

    add-int v9, v3, v8

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u06db\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x75

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0xbb3

    const v19, -0x502db86

    xor-int v14, v14, v19

    const v19, -0x54e5b3aa

    goto/16 :goto_6

    :sswitch_d
    move/from16 v17, v14

    add-int v7, v5, v6

    const/4 v8, 0x1

    .line 52
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u1a73\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x523b

    const v19, -0x8837d5d

    xor-int v14, v14, v19

    const v19, -0x787a4f51

    goto/16 :goto_6

    :sswitch_e
    move/from16 v17, v14

    mul-int v5, v3, v4

    const/4 v6, 0x1

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u1a7a\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x69f9

    const v19, -0x80016eb

    xor-int v14, v14, v19

    const v19, -0x21110a8b

    goto/16 :goto_6

    :sswitch_f
    move/from16 v17, v14

    const/4 v4, 0x2

    .line 50
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_9

    :goto_3
    const-string v0, "\u1a77\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, 0xa59

    const v19, -0x5b5a67ca

    xor-int v14, v14, v19

    const v19, -0x4e1df5bb

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u0730\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x1db1

    const v19, -0x2b1dfd83

    xor-int v14, v14, v19

    const v19, -0x13ad5b42

    goto/16 :goto_6

    :sswitch_10
    move/from16 v17, v14

    aget-short v3, v1, v2

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v0, "\u0730\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x47

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x1249

    const v19, -0x49c3440d

    xor-int v14, v14, v19

    const v19, -0x72090071

    goto/16 :goto_6

    :sswitch_11
    move/from16 v17, v14

    .line 53
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_c

    :cond_b
    :goto_4
    const-string v0, "\u073a\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x29c9

    const v19, 0x337ab9b6

    xor-int v14, v14, v19

    const v19, 0x609a3d9f

    goto :goto_6

    :cond_c
    const-string v0, "\u06eb\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x68bf

    const v19, -0x5bd2f172

    xor-int v14, v14, v19

    const v19, 0x5c327db3

    goto :goto_6

    :sswitch_12
    move/from16 v17, v14

    .line 52
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_5

    :cond_d
    const-string v0, "\u06dc\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v14, v0, v15

    mul-int/lit16 v14, v14, -0x2e61

    const v19, 0xa4643f4

    xor-int v14, v14, v19

    const v19, 0x587e499f

    goto :goto_6

    :sswitch_13
    move/from16 v17, v14

    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x2a5

    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_e

    :goto_5
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0x3351

    const v19, -0x18e77876    # -7.2029996E23f

    xor-int v14, v14, v19

    const v19, 0x26e4b634

    goto :goto_6

    :cond_e
    const-string v0, "\u06ec\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x41

    xor-int v14, v0, v16

    mul-int/lit16 v14, v14, -0xea9

    const v19, -0x76c3e03b

    xor-int v14, v14, v19

    const v19, 0xf0bd528

    :goto_6
    xor-int v0, v0, v19

    move/from16 v20, v17

    move/from16 v17, v0

    move v0, v14

    move/from16 v14, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7eda23b8 -> :sswitch_13
        -0x77b8beb0 -> :sswitch_d
        -0x6fee9601 -> :sswitch_7
        -0x5936990f -> :sswitch_8
        -0x549dd610 -> :sswitch_d
        -0x51037e92 -> :sswitch_1
        -0x491d4d50 -> :sswitch_e
        -0x4644f202 -> :sswitch_10
        -0x41b40968 -> :sswitch_6
        -0x3de404f0 -> :sswitch_5
        -0x3c5a7e94 -> :sswitch_f
        -0x2ed3fa0c -> :sswitch_c
        -0x2d315257 -> :sswitch_3
        -0x1eea3e1a -> :sswitch_8
        -0x176f1386 -> :sswitch_3
        -0x14ae21ba -> :sswitch_4
        -0xe8d7e11 -> :sswitch_12
        -0x816f819 -> :sswitch_a
        -0x3c993b2 -> :sswitch_e
        -0x1d1b1e8 -> :sswitch_11
        0x1518c53 -> :sswitch_13
        0x6824f47 -> :sswitch_10
        0xb6e4032 -> :sswitch_7
        0x1a7eda1c -> :sswitch_1
        0x278e455a -> :sswitch_6
        0x27a4790e -> :sswitch_b
        0x311a7606 -> :sswitch_c
        0x363054c3 -> :sswitch_2
        0x3af866e3 -> :sswitch_2
        0x41b7a178 -> :sswitch_a
        0x4220b2ab -> :sswitch_b
        0x4f1ec4e4 -> :sswitch_0
        0x56dcb7fd -> :sswitch_12
        0x58c9b390 -> :sswitch_11
        0x66f11ddf -> :sswitch_5
        0x704ee274 -> :sswitch_0
        0x76d6f31a -> :sswitch_9
        0x77f27348 -> :sswitch_9
        0x7b84832c -> :sswitch_f
        0x7d9789f0 -> :sswitch_4
    .end sparse-switch
.end method

.method public static final ᩳ()Landroid/content/ContentResolver;
    .locals 17

    const/4 v0, 0x0

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

    const v11, -0x2b3d2293

    sget v12, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    const-string v14, "\u0730\u06e8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x73

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x794b

    const v16, 0x6c117ec5

    xor-int v15, v15, v16

    const v16, 0x4d03c49e    # 1.381688E8f

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x6c83

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    mul-int v14, v3, v7

    sub-int v14, v6, v14

    if-gez v14, :cond_4

    const-string v14, "\u05a8\u06dc"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x6577

    const v16, -0x752a7a9f

    xor-int v15, v15, v16

    const v16, 0xa47e887

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v14

    if-lez v14, :cond_9

    goto/16 :goto_4

    .line 119
    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget-boolean v14, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v14, :cond_1

    goto/16 :goto_4

    :sswitch_2
    sget v14, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v14, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_2

    .line 121
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0x17

    .line 119
    invoke-static {v9, v10, v1, v8}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_6
    const/16 v10, 0x2ae

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v14

    if-ltz v14, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v14, "\u06df\u06ec"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x65

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1759

    const v16, 0x7fe693ad

    xor-int v15, v15, v16

    const v16, 0x2aa2aca4

    goto :goto_0

    :sswitch_7
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 120
    sget v14, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v14, :cond_2

    :cond_1
    const-string v14, "\u0733\u1a77"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x4dcb

    const v16, 0x49733aba    # 996267.6f

    xor-int v15, v15, v16

    const v16, -0x62c9d0fe

    goto/16 :goto_0

    :cond_2
    const-string v14, "\u1a7a\u06eb"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x7d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6845

    const v16, -0x581fda31

    xor-int v15, v15, v16

    const v16, 0x6ea0d7c8

    goto/16 :goto_0

    .line 119
    :sswitch_8
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 120
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v14

    if-ltz v14, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v14, "\u06e1\u06eb"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1db5

    const v16, 0x24b8b018

    xor-int v15, v15, v16

    const v16, 0xecaaaf8

    goto/16 :goto_0

    :sswitch_9
    const v8, 0x9e14

    goto :goto_1

    :sswitch_a
    const v8, 0xca5a

    :goto_1
    const-string v14, "\u06e1\u06d8"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5adb

    const v16, 0x2197c912

    xor-int v15, v15, v16

    const v16, 0x5fb15bca

    goto/16 :goto_0

    :cond_4
    const-string v14, "\u06dc\u06dc"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3497

    const v16, -0x54280ccd

    xor-int v15, v15, v16

    const v16, 0x38ef1676

    goto/16 :goto_0

    :sswitch_b
    add-int v6, v4, v5

    const/16 v7, 0x17aa

    .line 119
    sget v14, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v14, :cond_5

    :goto_2
    const-string v14, "\u1a79\u1a74"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x5b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x79c3

    const v16, 0x74637171

    xor-int v15, v15, v16

    const v16, -0x6959dfa5

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06d7\u1a76"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x150d

    const v16, 0x7245edf6

    xor-int v15, v15, v16

    const v16, -0x7105ec2b

    goto/16 :goto_0

    :sswitch_c
    mul-int v4, v3, v3

    const v5, 0x8bff39

    .line 123
    sget-boolean v14, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v14, :cond_6

    goto :goto_3

    :cond_6
    const-string v14, "\u06d9\u05a1"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x21

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3837

    const v16, 0x230069eb

    xor-int v15, v15, v16

    const v16, -0x3b30912a

    goto/16 :goto_0

    :sswitch_d
    aget-short v3, v1, v2

    .line 121
    sget v14, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v14, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v14, "\u06db\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x48cd

    const v16, 0x49171a19

    xor-int v15, v15, v16

    const v16, -0x2d9c8861

    goto/16 :goto_0

    .line 119
    :sswitch_e
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v14

    if-ltz v14, :cond_8

    :goto_3
    const-string v14, "\u1a77\u1a7b"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x57

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x3945

    const v16, -0x1ba0c7a9

    xor-int v15, v15, v16

    const v16, 0x7e32f775

    goto/16 :goto_0

    :cond_8
    const-string v14, "\u073d\u1a77"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x37

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x20f5

    const v16, -0x77fd3875

    xor-int v15, v15, v16

    const v16, -0xbc6692d

    goto/16 :goto_0

    .line 123
    :sswitch_f
    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v14, :cond_a

    :cond_9
    const-string v14, "\u05a1\u073f"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6d33

    const v16, 0x40a0333f

    xor-int v15, v15, v16

    const v16, 0x5fe1f1dc

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u0736\u1a75"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x2f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x1b19

    const v16, -0x6c055933

    xor-int v15, v15, v16

    const v16, 0x4cfbf4bc    # 1.32097504E8f

    goto/16 :goto_0

    .line 120
    :sswitch_10
    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v14, :cond_b

    goto :goto_4

    :cond_b
    const-string v14, "\u1a73\u0736"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x6b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x42f

    const v16, -0x666a3fd7

    xor-int v15, v15, v16

    const v16, 0x1f6c5daa

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x2ad

    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v14, :cond_d

    :cond_c
    :goto_4
    const-string v14, "\u05ab\u1a77"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x532b

    const v16, 0x62a90a8f

    xor-int v15, v15, v16

    const v16, 0x46b0c350

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u06d7\u0736"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2f23

    const v16, 0x505a96a3

    xor-int v15, v15, v16

    const v16, -0x4cd6fbd2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a74fcdd -> :sswitch_11
        -0x796e98f6 -> :sswitch_7
        -0x788a09c7 -> :sswitch_10
        -0x4f4b23d2 -> :sswitch_a
        -0x4dbcc49f -> :sswitch_0
        -0x490e0760 -> :sswitch_4
        -0x46ac6f6c -> :sswitch_d
        -0x4313cf36 -> :sswitch_0
        -0x33526c60 -> :sswitch_2
        -0x302458d3 -> :sswitch_6
        -0x2fb9a3c5 -> :sswitch_e
        -0x29e7bc1a -> :sswitch_9
        -0x2845aa46 -> :sswitch_1
        -0x281569fb -> :sswitch_8
        -0x26837e96 -> :sswitch_c
        -0x23a9e5b1 -> :sswitch_e
        -0x1c251ff3 -> :sswitch_f
        0x3333c83 -> :sswitch_6
        0x8d35d9b -> :sswitch_f
        0xb4f747a -> :sswitch_4
        0xf37b929 -> :sswitch_10
        0x156dc77e -> :sswitch_2
        0x196b95b3 -> :sswitch_5
        0x3753dfce -> :sswitch_11
        0x3956342f -> :sswitch_3
        0x3bb13a0f -> :sswitch_1
        0x3e1b779b -> :sswitch_9
        0x4000d311 -> :sswitch_d
        0x5747588a -> :sswitch_8
        0x5a38bd22 -> :sswitch_c
        0x5f295425 -> :sswitch_b
        0x61c548f9 -> :sswitch_5
        0x664537ed -> :sswitch_a
        0x72ec2054 -> :sswitch_3
        0x74a85730 -> :sswitch_7
        0x7b346616 -> :sswitch_b
    .end sparse-switch
.end method

.method public static final ᩴ()Ljava/lang/String;
    .locals 17

    const/4 v0, 0x0

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

    const v11, 0x5bd072bb

    sget v12, Ll/֨ۤ;->ܿۖ᩵:I

    sget v13, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v14, "\u0730\u1a78"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x491

    const v16, 0x58749c79

    xor-int v15, v15, v16

    const v16, -0x28451a60

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x7adb

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 143
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 144
    sget v14, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v14, :cond_3

    goto/16 :goto_4

    .line 147
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v14, :cond_c

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v14

    if-eqz v14, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v14, "\u06e2\u073f"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x746f

    const v16, 0x4c4b2655    # 5.3254484E7f

    xor-int v15, v15, v16

    const v16, 0x1ea2203c

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v14, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v14, :cond_8

    goto/16 :goto_5

    .line 144
    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_5

    .line 147
    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0x13

    .line 143
    invoke-static {v9, v10, v1, v8}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :sswitch_6
    const/16 v10, 0x2c6

    .line 145
    sget v14, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v14, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v14, "\u06e8\u06d8"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x35

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1b67

    const v16, -0x3a6846dd

    xor-int v15, v15, v16

    const v16, 0x44653da8

    goto :goto_0

    .line 143
    :sswitch_7
    sget-object v9, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    .line 146
    sget v14, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v14, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v14, "\u06e0\u073d"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x387f

    const v16, -0x7aecef0

    xor-int v15, v15, v16

    const v16, 0x6515e5d3

    goto/16 :goto_0

    :cond_3
    const-string v14, "\u1a74\u06d8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x4f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x734d

    const v16, -0x361820e4    # -1899491.5f

    xor-int v15, v15, v16

    const v16, 0x6606840f

    goto/16 :goto_0

    :sswitch_8
    const v8, 0xfa3f

    goto :goto_2

    :sswitch_9
    const v8, 0xcb12

    :goto_2
    const-string v14, "\u0733\u1a74"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x7

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7bd3

    const v16, 0x70a08717

    xor-int v15, v15, v16

    const v16, -0x2cd0f5ae

    goto/16 :goto_0

    :sswitch_a
    mul-int v14, v3, v7

    sub-int/2addr v14, v6

    if-gtz v14, :cond_4

    const-string v14, "\u1a73\u06dc"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x71

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0xbe1

    const v16, -0x25bff44a

    xor-int v15, v15, v16

    const v16, -0x2b635d62

    goto/16 :goto_0

    :cond_4
    const-string v14, "\u06df\u0730"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x144b

    const v16, 0x66e30ad5

    xor-int v15, v15, v16

    const v16, 0x7a2a8bad

    goto/16 :goto_0

    :sswitch_b
    add-int v6, v4, v5

    const/16 v7, 0x5866

    sget-boolean v14, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v14, :cond_5

    goto :goto_3

    :cond_5
    const-string v14, "\u1a7a\u1a79"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x49

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2b5f

    const v16, -0x2822e56e

    xor-int v15, v15, v16

    const v16, -0x4aaec6d5

    goto/16 :goto_0

    :sswitch_c
    mul-int v4, v3, v3

    const v5, 0x7a19229

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v14

    if-nez v14, :cond_6

    :goto_3
    const-string v14, "\u06e7\u06d7"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x52a5

    const v16, -0x20470b94

    xor-int v15, v15, v16

    const v16, 0x6d36b542

    goto/16 :goto_0

    :cond_6
    const-string v14, "\u06d9\u06e1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2c67

    const v16, 0x56dd4152

    xor-int v15, v15, v16

    const v16, -0x35680246    # -4980445.0f

    goto/16 :goto_0

    :sswitch_d
    aget-short v3, v1, v2

    .line 144
    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v14, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v14, "\u06d7\u1a78"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x33a3

    const v16, -0x1662689

    xor-int v15, v15, v16

    const v16, -0x13550d70

    goto/16 :goto_0

    .line 146
    :sswitch_e
    sget v14, Ll/֡۬;->۠֡᩶:I

    if-gtz v14, :cond_9

    :cond_8
    :goto_4
    const-string v14, "\u06db\u1a78"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x15

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0xdb5

    const v16, 0x5b5c256b

    xor-int v15, v15, v16

    const v16, -0x33f2395a    # -3.716572E7f

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u06e4\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x6199

    const v16, -0x25bbdf70

    xor-int v15, v15, v16

    const v16, -0x57087bf6

    goto/16 :goto_0

    .line 144
    :sswitch_f
    sget v14, Ll/᩺;->ۙۛܶ:I

    if-gtz v14, :cond_a

    :goto_5
    const-string v14, "\u05a1\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3f25

    const v16, 0x2cca7ccb

    xor-int v15, v15, v16

    const v16, 0x1515d4ca

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u1a7b\u1a76"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x57

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x760d

    const v16, -0x2dee72b0

    xor-int v15, v15, v16

    const v16, -0x675a6dea

    goto/16 :goto_0

    .line 145
    :sswitch_10
    sget v14, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v14, :cond_b

    goto :goto_6

    :cond_b
    const-string v14, "\u06e7\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x2b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x5735

    const v16, 0x6e46d6dc

    xor-int v15, v15, v16

    const v16, 0x3dbcac

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v2, 0x2c5

    .line 144
    sget-boolean v14, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v14, :cond_d

    :cond_c
    :goto_6
    const-string v14, "\u06db\u06ec"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2281

    const v16, -0x5862b507

    xor-int v15, v15, v16

    const v16, -0x762fba5f

    goto/16 :goto_0

    :cond_d
    const-string v14, "\u1a7a\u0733"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x3aed

    const v16, -0x76754667

    xor-int v15, v15, v16

    const v16, 0x5e3323e3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72bf2e44 -> :sswitch_c
        -0x7276cd6f -> :sswitch_f
        -0x6c250638 -> :sswitch_2
        -0x67929b37 -> :sswitch_4
        -0x62be04f1 -> :sswitch_e
        -0x5b00f15b -> :sswitch_b
        -0x564ff290 -> :sswitch_11
        -0x53a8952c -> :sswitch_6
        -0x49af2ebb -> :sswitch_11
        -0x465d4cb0 -> :sswitch_3
        -0x3bc6dcca -> :sswitch_3
        -0x3b59068c -> :sswitch_a
        -0x36e2464a -> :sswitch_d
        -0x3288ebdc -> :sswitch_c
        -0x30f1ac34 -> :sswitch_7
        -0x2cb7e28d -> :sswitch_10
        -0x264aca95 -> :sswitch_d
        -0x1fb19305 -> :sswitch_0
        -0x1b1ef90c -> :sswitch_2
        -0x17c5ac83 -> :sswitch_1
        -0x17a9a1e1 -> :sswitch_9
        -0x10bea89 -> :sswitch_5
        0x4f72e3a -> :sswitch_7
        0x4fff423 -> :sswitch_6
        0x1285e533 -> :sswitch_a
        0x1bc09a31 -> :sswitch_8
        0x1c548bc2 -> :sswitch_9
        0x2c611e4f -> :sswitch_1
        0x2dc03a6e -> :sswitch_5
        0x3ab328dd -> :sswitch_8
        0x47ef23fb -> :sswitch_b
        0x4e7d8029 -> :sswitch_f
        0x4ef8a593 -> :sswitch_10
        0x75411bd8 -> :sswitch_4
        0x75f3b328 -> :sswitch_e
        0x7b63c073 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final ᩵()Landroid/content/res/Resources;
    .locals 19

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

    const v12, 0x41ce8027

    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v14, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v15, "\u06e7\u06df"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x45

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x341b

    const v17, 0x1232976

    xor-int v0, v0, v17

    const v17, 0x4bd35e08    # 2.7704336E7f

    xor-int v15, v15, v17

    move-object v2, v1

    move-object v11, v10

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0x41ce8027

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x4aa5

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v15

    const/16 v12, 0x2da

    .line 115
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_3

    goto/16 :goto_4

    .line 119
    :sswitch_0
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_1

    :cond_0
    move/from16 v16, v15

    goto/16 :goto_5

    :cond_1
    move/from16 v16, v15

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v16, v15

    goto/16 :goto_3

    .line 115
    :sswitch_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v0, :cond_0

    goto :goto_1

    .line 116
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    :goto_1
    const-string v0, "\u06e0\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x79

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x2397

    const v17, 0x383401e0

    xor-int v15, v15, v17

    const v17, -0x3790c24e

    goto/16 :goto_7

    .line 115
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x11

    invoke-static {v11, v12, v0, v10}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֫᩺;->֫᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_3
    const-string v0, "\u06e7\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x629b

    const v17, -0x109b002b

    xor-int v15, v15, v17

    const v17, -0x6fe1f841

    goto/16 :goto_7

    :sswitch_6
    move/from16 v16, v15

    sget-object v11, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u06d9\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x2659

    const v17, -0x6ab93ce8

    xor-int v15, v15, v17

    const v17, 0x30021fd2

    goto/16 :goto_7

    :sswitch_7
    move/from16 v16, v15

    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v0

    if-gtz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u073d\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x429b

    const v17, 0x893c892

    xor-int v15, v15, v17

    const v17, 0x3cdc5063

    goto/16 :goto_7

    :sswitch_8
    move/from16 v16, v15

    const/16 v0, 0x1095

    const/16 v10, 0x1095

    goto :goto_2

    :sswitch_9
    move/from16 v16, v15

    const v0, 0xdfd0

    const v10, 0xdfd0

    :goto_2
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x29

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4cfd

    const v17, -0x3be9ca40

    xor-int v15, v15, v17

    const v17, -0x5057ff5e

    goto/16 :goto_7

    :sswitch_a
    move/from16 v16, v15

    add-int v0, v9, v9

    sub-int/2addr v0, v6

    if-ltz v0, :cond_6

    const-string v0, "\u1a7a\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x29b5

    const v17, -0x656142f2

    xor-int v15, v15, v17

    const v17, 0x2c0a2cea

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06d9\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x6513

    const v17, 0x29c81945

    xor-int v15, v15, v17

    const v17, -0x6d747915

    goto/16 :goto_7

    :sswitch_b
    move/from16 v16, v15

    add-int v9, v7, v8

    .line 119
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_7

    :goto_3
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit8 v15, v15, -0x47

    const v17, 0x5d9a84b7

    xor-int v15, v15, v17

    const v17, 0x1ebaa139

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u06e0\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x63

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x2e53

    const v17, 0x18ff898

    xor-int v15, v15, v17

    const v17, -0x70757950

    goto/16 :goto_7

    :sswitch_c
    move/from16 v16, v15

    mul-int v7, v4, v4

    const v8, 0x9012009

    .line 116
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_8

    goto :goto_4

    :cond_8
    const-string v0, "\u05a1\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3ba3

    const v17, 0x65694794

    xor-int v15, v15, v17

    const v17, -0x69d76741

    goto/16 :goto_7

    :sswitch_d
    move/from16 v16, v15

    add-int v0, v4, v5

    mul-int v6, v0, v0

    .line 119
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u06db\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x6f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x1925

    const v17, 0x3b993b43    # 0.004676254f

    xor-int v15, v15, v17

    const v17, 0x5fcf2910

    goto/16 :goto_7

    :sswitch_e
    move/from16 v16, v15

    const/16 v5, 0x3003

    .line 117
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_a

    :goto_4
    const-string v0, "\u0736\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x2315

    const v17, -0x53f46547

    xor-int v15, v15, v17

    const v17, -0x3da2f5dd

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5e11

    const v17, -0x7708a11c

    xor-int v15, v15, v17

    const v17, 0x66c1e072

    goto/16 :goto_7

    :sswitch_f
    move/from16 v16, v15

    aget-short v4, v2, v3

    .line 116
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "\u06e7\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x5daf

    const v17, 0x7c23c8ef

    xor-int v15, v15, v17

    const v17, 0x1211fe68

    goto :goto_7

    :sswitch_10
    move/from16 v16, v15

    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_c

    :goto_5
    const-string v0, "\u06e0\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x6f3d

    const v17, -0x6eecf6a5

    xor-int v15, v15, v17

    const v17, 0x5a187973

    goto :goto_7

    :cond_c
    const-string v0, "\u073a\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4f

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x23c7

    const v17, 0x211298ef

    xor-int v15, v15, v17

    const v17, 0x68922b27

    goto :goto_7

    :sswitch_11
    move/from16 v16, v15

    sget-object v2, Ll/ۙ᩸᩷;->ۘۡܿ:[S

    const/16 v3, 0x2d9

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_d

    :goto_6
    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x589d

    const v17, -0x13477262

    xor-int v15, v15, v17

    const v17, 0x76960ed0

    goto :goto_7

    :cond_d
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x1b7b

    const v17, 0x356fee26

    xor-int v15, v15, v17

    const v17, 0x2c05f6e9

    :goto_7
    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ac40c84 -> :sswitch_3
        -0x6b90b668 -> :sswitch_b
        -0x6b6b9685 -> :sswitch_0
        -0x56965af5 -> :sswitch_1
        -0x564a4018 -> :sswitch_1
        -0x53069c74 -> :sswitch_b
        -0x4dfb0797 -> :sswitch_7
        -0x4dd62a21 -> :sswitch_3
        -0x4b431ac9 -> :sswitch_f
        -0x3da33f6f -> :sswitch_4
        -0x3bbd3899 -> :sswitch_8
        -0x32cd8b76 -> :sswitch_e
        -0x327264a8 -> :sswitch_10
        -0x2c8cfe08 -> :sswitch_10
        -0x2a055723 -> :sswitch_2
        -0x1fc683d3 -> :sswitch_a
        -0x1c001ed9 -> :sswitch_6
        -0xcd5beb1 -> :sswitch_9
        -0xb7531c6 -> :sswitch_6
        -0x1f9f82b -> :sswitch_c
        -0x473b2 -> :sswitch_e
        0x694703b -> :sswitch_d
        0x7ce09f4 -> :sswitch_c
        0xfc9a299 -> :sswitch_f
        0x1319b362 -> :sswitch_7
        0x23a52073 -> :sswitch_a
        0x3008cce2 -> :sswitch_d
        0x3222d279 -> :sswitch_4
        0x4556dbcd -> :sswitch_5
        0x48518799 -> :sswitch_11
        0x4873e160 -> :sswitch_2
        0x4f3d8d58 -> :sswitch_5
        0x6cb1f5d7 -> :sswitch_9
        0x6d1e22b5 -> :sswitch_0
        0x6f47330f -> :sswitch_11
        0x7a21f4bf -> :sswitch_8
    .end sparse-switch
.end method

.method public static final ᩷()Z
    .locals 1

    .line 55
    sget-boolean v0, Ll/ۙ᩸᩷;->ܽ:Z

    return v0
.end method

.method public static final ᩻()Ljava/io/File;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2e96a1e2

    sget v2, Ll/֨᩺;->ۨ֨۬:I

    sget v3, Ll/᩺;->ۙۛܶ:I

    const-string v4, "\u06e8\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x215f

    const v6, 0xef542cc

    xor-int/2addr v5, v6

    const v6, 0x3779829a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x173f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 127
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x18

    if-lt v4, v5, :cond_d

    const-string v4, "\u05a1\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7dff

    const v6, -0x6ada3417

    xor-int/2addr v5, v6

    const v6, 0x11034ee1

    goto :goto_0

    .line 130
    :sswitch_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v4, :cond_1

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_2

    :sswitch_2
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_b

    goto/16 :goto_2

    .line 131
    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    goto/16 :goto_2

    .line 127
    :sswitch_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    const/4 v0, 0x0

    return-object v0

    .line 128
    :sswitch_5
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getDataDir()Ljava/io/File;

    move-result-object v0

    .line 127
    invoke-static {v0}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    return-object v0

    .line 130
    :sswitch_6
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    return-object v0

    .line 131
    :sswitch_7
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v4

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u06dc\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4a7b

    const v6, -0xd874e75

    xor-int/2addr v5, v6

    const v6, 0x5e210850

    goto :goto_0

    .line 128
    :sswitch_8
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_2

    :cond_1
    const-string v4, "\u05a8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x398f

    const v6, -0x5b71046b

    xor-int/2addr v5, v6

    const v6, 0xb46483f

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06da\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c87

    const v6, -0x1a53b221

    xor-int/2addr v5, v6

    const v6, -0x47db91d7

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x15a3

    const v6, -0x2763a0a2

    xor-int/2addr v5, v6

    const v6, 0x6bff7474

    goto/16 :goto_0

    .line 131
    :sswitch_a
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_4

    :goto_1
    const-string v4, "\u1a7a\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6863

    const v6, -0x27cdf57d

    xor-int/2addr v5, v6

    const v6, 0x676a2f48

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a73\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x70fd

    const v6, -0x3ed8f8b2

    xor-int/2addr v5, v6

    const v6, 0xb173474

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v4, "\u073d\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x63a5

    const v6, -0x2a5e727c

    xor-int/2addr v5, v6

    const v6, -0x4d32073a

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u05a1\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1c4d

    const v6, -0xcfc8755

    xor-int/2addr v5, v6

    const v6, 0x311b845d

    goto/16 :goto_0

    .line 128
    :sswitch_d
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u05ab\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5579

    const v6, -0x7260db54

    xor-int/2addr v5, v6

    const v6, 0x22428157

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_9

    :cond_8
    const-string v4, "\u073a\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5563

    const v6, -0x565deca3

    xor-int/2addr v5, v6

    const v6, 0x1e4e4976

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a74\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1053

    const v6, 0x583d3ff7

    xor-int/2addr v5, v6

    const v6, 0x9a9e29b

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_2
    const-string v4, "\u05a1\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1161

    const v6, 0x194e1797

    xor-int/2addr v5, v6

    const v6, 0x1b2ead0b

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a79\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4fe9

    const v6, 0x7f39eaba

    xor-int/2addr v5, v6

    const v6, 0x466b73a7

    goto/16 :goto_0

    .line 130
    :sswitch_10
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u06ec\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa1

    const v6, 0xea4379d

    xor-int/2addr v5, v6

    const v6, 0x4a225beb    # 2660090.8f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a1\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4b47

    const v6, 0x24d2086f

    xor-int/2addr v5, v6

    const v6, 0x670d3ad4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b8f

    const v6, -0x42e0af24

    xor-int/2addr v5, v6

    const v6, -0x7af50e66

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72e71ee5 -> :sswitch_1
        -0x5a776b64 -> :sswitch_5
        -0x4661dedb -> :sswitch_7
        -0x41a41d60 -> :sswitch_c
        -0x393ceeb9 -> :sswitch_10
        -0x38e87d8f -> :sswitch_4
        -0x35c45858 -> :sswitch_7
        -0x2335f878 -> :sswitch_0
        -0x1f1b2bfb -> :sswitch_e
        -0x1e97bafa -> :sswitch_f
        -0x19dc04be -> :sswitch_b
        -0x13c01479 -> :sswitch_d
        -0xc1c98c7 -> :sswitch_10
        0x47580bd -> :sswitch_a
        0x4f837e1 -> :sswitch_b
        0x14f79715 -> :sswitch_c
        0x1deb0981 -> :sswitch_6
        0x24a3cf7b -> :sswitch_0
        0x24e0fc28 -> :sswitch_5
        0x39ca81e1 -> :sswitch_4
        0x3dba8634 -> :sswitch_8
        0x3eacc182 -> :sswitch_3
        0x42e35ade -> :sswitch_1
        0x4a6003e4 -> :sswitch_d
        0x4e59510c -> :sswitch_6
        0x53d950a2 -> :sswitch_2
        0x57e618a7 -> :sswitch_9
        0x5b2092ce -> :sswitch_2
        0x5b629510 -> :sswitch_a
        0x5e1f3c55 -> :sswitch_8
        0x5e953335 -> :sswitch_e
        0x7292a3ff -> :sswitch_f
        0x734c913c -> :sswitch_9
        0x7fc180c2 -> :sswitch_3
    .end sparse-switch
.end method
