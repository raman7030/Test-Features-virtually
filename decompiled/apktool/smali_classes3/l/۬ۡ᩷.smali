.class public Ll/۬ۡ᩷;
.super Landroid/app/Service;
.source "F5X0"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static ۗ:Ljava/lang/String; = null

.field public static ۫:Ljava/lang/String; = ""

.field public static ۬:Ll/۫ܽܽ;

.field private static final ۬ܽ۠:[S


# instance fields
.field public final ۙ:Landroid/content/BroadcastReceiver;

.field public ᩶:Ll/᩹ۢۡ;

.field public ᩸:Ll/۫ܽܽ;

.field public ᩹:Ll/ۗۡ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۡ᩷;->۬ܽ۠:[S

    return-void

    :array_0
    .array-data 2
        0x24dds
        0x354bs
        0x3558s
        0x3559s
        0x3549s
        0x68bas
        -0x42fds
        0x65aes
        -0x5855s
        0x5a1as
        -0x4901s
        0x356bs
        0x3569s
        0x357es
        0x3563s
        0x3565s
        0x3564s
        0x3575s
        0x3567s
        0x357es
        0x3575s
        0x3569s
        0x3566s
        0x3565s
        0x3579s
        0x356fs
        0x3575s
        0x3578s
        0x356fs
        0x3579s
        0x3565s
        0x357fs
        0x3578s
        0x3569s
        0x356fs
        0x3575s
        0x357bs
        0x357fs
        0x356fs
        0x3578s
        0x3563s
        0x356fs
        0x3578s
        0xd0cs
        0x47ees
        0x47e9s
        0x47ees
        0x47f3s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x6579e8d2

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    .line 20
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v4, "\u06e4\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xbc5

    const v6, 0x72cd1889

    xor-int/2addr v5, v6

    const v6, -0x36b98821

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7439

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 105
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_6

    goto/16 :goto_2

    .line 39
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    .line 14
    :sswitch_1
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_5

    goto :goto_1

    .line 24
    :sswitch_2
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v4, "\u1a74\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3bfb

    const v6, 0x1f9a49ca

    xor-int/2addr v5, v6

    const v6, 0x6b07d898

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 120
    :sswitch_5
    iput-object v0, p0, Ll/۬ۡ᩷;->ۙ:Landroid/content/BroadcastReceiver;

    return-void

    .line 54
    :sswitch_6
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06eb\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6c99

    const v6, 0x565aacb1

    xor-int/2addr v5, v6

    const v6, 0x53b7d454

    goto :goto_0

    .line 78
    :sswitch_7
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u06e0\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xd6b

    const v6, 0x16ae81d7

    xor-int/2addr v5, v6

    const v6, 0x1f870997

    goto :goto_0

    :cond_3
    const-string v4, "\u1a78\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c99

    const v6, -0x7f908634

    xor-int/2addr v5, v6

    const v6, 0x46e47ad1

    goto/16 :goto_0

    .line 16
    :sswitch_8
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06ec\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x68f3

    const v6, 0x1ce9d037

    xor-int/2addr v5, v6

    const v6, -0x75cb9521

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4de5

    const v6, -0x1d906f5c

    xor-int/2addr v5, v6

    const v6, -0x5f96e053

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e2\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4cd5

    const v6, 0xc2a59a7

    xor-int/2addr v5, v6

    const v6, 0x52819bc4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v4

    if-ltz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x31f5

    const v6, -0x2481dc5

    xor-int/2addr v5, v6

    const v6, -0x28d465c3

    goto/16 :goto_0

    .line 71
    :sswitch_a
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u1a7a\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x679d

    const v6, 0x34607a66

    xor-int/2addr v5, v6

    const v6, -0x47e2d236

    goto/16 :goto_0

    .line 111
    :sswitch_b
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u06db\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3817

    const v6, 0xaf72268

    xor-int/2addr v5, v6

    const v6, 0x1390b326

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u1a73\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1697

    const v6, 0x22e4aded

    xor-int/2addr v5, v6

    const v6, -0x45f84776

    goto/16 :goto_0

    .line 41
    :sswitch_d
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-eqz v4, :cond_b

    :goto_3
    const-string v4, "\u06ec\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3d47

    const v6, -0x4b6cb71b

    xor-int/2addr v5, v6

    const v6, 0x1e2ff47b

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x51c1

    const v6, 0x7603f94

    xor-int/2addr v5, v6

    const v6, -0x1a8f44d8

    goto/16 :goto_0

    .line 120
    :sswitch_e
    new-instance v0, Ll/ۙۡ᩷;

    invoke-direct {v0, p0}, Ll/ۙۡ᩷;-><init>(Ll/۬ۡ᩷;)V

    .line 85
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u06e7\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x19b1

    const v6, 0x56677109

    xor-int/2addr v5, v6

    const v6, -0x339073b0    # -6.2796096E7f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d9\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x37e9

    const v6, -0x6448f96f

    xor-int/2addr v5, v6

    const v6, -0x6b7b9ed8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a2e980b -> :sswitch_6
        -0x780ceba4 -> :sswitch_3
        -0x73d39f99 -> :sswitch_4
        -0x6e22e2e1 -> :sswitch_b
        -0x6db1e791 -> :sswitch_a
        -0x66fb9cbc -> :sswitch_9
        -0x5888d6a0 -> :sswitch_1
        -0x55a16dce -> :sswitch_5
        -0x537f077d -> :sswitch_e
        -0x4d0a7181 -> :sswitch_b
        -0x4c466b2c -> :sswitch_c
        -0x2302d300 -> :sswitch_7
        -0x7af5b34 -> :sswitch_c
        -0x985758 -> :sswitch_a
        0x62ea9b8 -> :sswitch_8
        0x102eaf75 -> :sswitch_6
        0x18968cef -> :sswitch_d
        0x21405239 -> :sswitch_5
        0x24b67879 -> :sswitch_4
        0x24bb33de -> :sswitch_d
        0x2565d987 -> :sswitch_3
        0x25b159eb -> :sswitch_e
        0x3a18acf4 -> :sswitch_9
        0x48e6b2e9 -> :sswitch_0
        0x494e49fb -> :sswitch_1
        0x4c9dd1e1 -> :sswitch_2
        0x5a6a1b8c -> :sswitch_2
        0x643547a2 -> :sswitch_0
        0x738f7228 -> :sswitch_8
        0x7df1b6d4 -> :sswitch_7
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/۬ۡ᩷;)Ll/۫ܽܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۡ᩷;->᩸:Ll/۫ܽܽ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬ۡ᩷;)Ll/᩹ۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    return-object p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 48
    iget-object p1, p0, Ll/۬ۡ᩷;->᩹:Ll/ۗۡ᩷;

    return-object p1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x75dd307c

    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    const-string v5, "\u06e8\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3523

    const v7, -0x49eec603

    xor-int/2addr v6, v7

    const v7, -0x62d1f09

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x6de9

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 26
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v5

    if-eqz v5, :cond_e

    goto/16 :goto_7

    .line 14
    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v5

    if-gtz v5, :cond_5

    goto/16 :goto_6

    .line 21
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v5

    if-gtz v5, :cond_c

    goto/16 :goto_4

    :sswitch_2
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v5, :cond_7

    goto/16 :goto_7

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    .line 114
    :sswitch_5
    sput-object p1, Ll/۬ۡ᩷;->۫:Ljava/lang/String;

    goto/16 :goto_2

    :sswitch_6
    const/16 v5, 0xd

    .line 113
    invoke-static {p1, v5}, Ll/ۗۗ;->᩶۫ۡ(Ljava/lang/Object;I)I

    move-result v5

    if-ne v5, v1, :cond_3

    const-string v5, "\u1a7b\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3d7d

    const v8, 0x2e388eb3

    xor-int/2addr v6, v8

    const v8, -0x1f8e12df

    goto/16 :goto_8

    :sswitch_7
    const/16 v1, 0xa

    .line 112
    invoke-static {p1, v1}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v1

    const/4 v5, -0x1

    if-ne v1, v5, :cond_0

    const-string v1, "\u06d7\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v3

    xor-int v6, v1, v4

    mul-int/lit16 v6, v6, 0x2df

    const v8, 0x131036b4

    xor-int/2addr v6, v8

    const v8, -0xe5619d8

    xor-int/2addr v1, v8

    move v5, v1

    const/4 v1, -0x1

    goto :goto_1

    :cond_0
    const/4 v1, -0x1

    goto :goto_2

    .line 111
    :sswitch_8
    invoke-static {p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v5

    const/16 v6, 0x64

    if-ge v5, v6, :cond_3

    const-string v5, "\u1a76\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7223

    const v8, 0x48502805

    xor-int/2addr v6, v8

    const v8, -0x4f3fb510

    goto/16 :goto_8

    :sswitch_9
    const/high16 p1, 0x10000000

    .line 116
    invoke-static {v7, p1}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 117
    invoke-static {p0, v7}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 115
    :sswitch_a
    new-instance v7, Landroid/content/Intent;

    const-class v5, Ll/۫ۡ᩷;

    .line 66
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v6

    if-ltz v6, :cond_1

    goto :goto_3

    .line 115
    :cond_1
    invoke-direct {v7, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 89
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v5, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v5, "\u06d7\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4b71

    const v8, -0x3c37b475

    xor-int/2addr v6, v8

    const v8, -0x1c84987c

    goto/16 :goto_8

    .line 110
    :sswitch_b
    invoke-static {}, Ll/ۗܺ᩷;->ۛ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v5, "\u06e2\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1e53

    const v8, -0x39953123

    xor-int/2addr v6, v8

    const v8, -0x54fb4617

    goto/16 :goto_8

    :cond_3
    :goto_2
    const-string v5, "\u073f\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x736d

    const v8, -0x7810fb63

    xor-int/2addr v6, v8

    const v8, -0x161d4a4e

    goto/16 :goto_8

    .line 15
    :sswitch_c
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u1a76\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2017

    const v8, -0x5b088d70

    xor-int/2addr v6, v8

    const v8, 0xf1ba65d

    goto/16 :goto_8

    .line 66
    :sswitch_d
    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_6

    :cond_5
    :goto_3
    const-string v5, "\u06db\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2115

    const v7, 0x19a87054

    xor-int/2addr v6, v7

    const v7, -0x24cd0af

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a75\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x496d

    const v8, -0x285d2ed4

    xor-int/2addr v6, v8

    const v8, -0x7c9e6164

    goto/16 :goto_8

    .line 86
    :sswitch_e
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_8

    :cond_7
    :goto_4
    const-string v5, "\u1a74\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x77d3

    const v8, -0x1b18002d

    xor-int/2addr v6, v8

    const v8, 0x2e71572

    goto/16 :goto_8

    :cond_8
    const-string v5, "\u06d9\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5221

    const v8, 0x5cd94f69

    xor-int/2addr v6, v8

    const v8, -0x290afa17

    goto/16 :goto_8

    .line 75
    :sswitch_f
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u1a78\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5d5

    const v8, 0x25e5f845

    xor-int/2addr v6, v8

    const v8, 0x32c8d396

    goto/16 :goto_8

    .line 22
    :sswitch_10
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_a

    :goto_5
    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1b5b

    const v8, -0x1986c17c

    xor-int/2addr v6, v8

    const v8, 0x3d8ab1b0

    goto/16 :goto_8

    :cond_a
    const-string v5, "\u1a74\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3ca5

    const v8, -0x60ad4c82

    xor-int/2addr v6, v8

    const v8, -0x6ec587a

    goto :goto_8

    .line 42
    :sswitch_11
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_b

    goto :goto_6

    :cond_b
    const-string v5, "\u0733\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5dc5

    const v8, -0x421a702d

    xor-int/2addr v6, v8

    const v8, -0x3acc3524

    goto :goto_8

    :sswitch_12
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_6
    const-string v5, "\u05ab\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2513

    const v8, -0x63173fc

    xor-int/2addr v6, v8

    const v8, -0xca30ec0

    goto :goto_8

    :cond_d
    const-string v5, "\u1a74\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7547

    const v8, -0x4703e09b

    xor-int/2addr v6, v8

    const v8, -0x400b8a88

    goto :goto_8

    :goto_7
    const-string v5, "\u1a7b\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x521

    const v8, -0x47b92605

    xor-int/2addr v6, v8

    const v8, -0x1001d667

    goto :goto_8

    :cond_e
    const-string v5, "\u1a75\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5845

    const v8, -0xef7868b

    xor-int/2addr v6, v8

    const v8, -0x4ec50d13

    :goto_8
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d29855c -> :sswitch_d
        -0x7cd6be60 -> :sswitch_9
        -0x6987250d -> :sswitch_7
        -0x66b36ea1 -> :sswitch_11
        -0x631965b6 -> :sswitch_11
        -0x5beffe0a -> :sswitch_3
        -0x5a756702 -> :sswitch_6
        -0x566f9a65 -> :sswitch_1
        -0x52e61e94 -> :sswitch_e
        -0x52ccb2d0 -> :sswitch_f
        -0x4d56cea0 -> :sswitch_6
        -0x4a9e7cfe -> :sswitch_4
        -0x423e1561 -> :sswitch_a
        -0x41156cc3 -> :sswitch_c
        -0x3935fec4 -> :sswitch_0
        -0x29ca8138 -> :sswitch_12
        -0x1ae5e7bb -> :sswitch_12
        -0x16a714a4 -> :sswitch_c
        -0x1424d73f -> :sswitch_0
        -0xc358644 -> :sswitch_f
        -0x81c5ec3 -> :sswitch_2
        0x147036ed -> :sswitch_e
        0x165fb9ea -> :sswitch_7
        0x245f85cd -> :sswitch_3
        0x27d4f148 -> :sswitch_9
        0x29a343af -> :sswitch_b
        0x397fb98c -> :sswitch_b
        0x40fd08bd -> :sswitch_5
        0x4527320c -> :sswitch_8
        0x4aafd7d0 -> :sswitch_10
        0x4b5c23c4 -> :sswitch_4
        0x52fd4971 -> :sswitch_5
        0x5b2601bb -> :sswitch_2
        0x5e5e84e1 -> :sswitch_1
        0x60100c2e -> :sswitch_8
        0x72b5966f -> :sswitch_10
        0x776226eb -> :sswitch_a
        0x7764c8e0 -> :sswitch_d
    .end sparse-switch
.end method

.method public final onCreate()V
    .locals 25

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const v17, -0x35159c12    # -7680503.0f

    sget v18, Ll/ۗ᩵;->֫۠۟:I

    sget v19, Ll/ۛ;->᩺᩻֫:I

    const-string v20, "\u073f\u06e2"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    add-int v20, v20, v19

    mul-int/lit8 v20, v20, -0x27

    xor-int v1, v20, v18

    mul-int/lit16 v1, v1, -0xea7

    const v22, -0x1e21c85f

    xor-int v1, v1, v22

    const v22, -0x3d078b9f

    xor-int v20, v20, v22

    move-object v3, v2

    move-object/from16 v23, v9

    move-object v13, v12

    move-object v15, v14

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const v20, -0x35159c12    # -7680503.0f

    const/16 v22, 0x0

    :goto_0
    xor-int v10, v20, v18

    mul-int/lit16 v10, v10, -0xff3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    move/from16 v21, v6

    const/4 v1, 0x3

    .line 37
    invoke-static {v13, v14, v1, v9}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7e780656

    xor-int/2addr v5, v1

    .line 79
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_8

    goto/16 :goto_6

    .line 50
    :sswitch_0
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-lez v1, :cond_1

    goto/16 :goto_2

    .line 20
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    move/from16 v21, v6

    goto/16 :goto_6

    :cond_0
    move/from16 v21, v6

    move-object/from16 v1, v23

    goto/16 :goto_9

    .line 57
    :sswitch_2
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_4

    goto :goto_1

    .line 99
    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto :goto_1

    .line 83
    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    return-void

    .line 41
    :sswitch_5
    iget-object v1, v0, Ll/۬ۡ᩷;->ۙ:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v8}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 42
    new-instance v1, Ll/ۗۡ᩷;

    invoke-direct {v1, v0}, Ll/ۗۡ᩷;-><init>(Ll/۬ۡ᩷;)V

    iput-object v1, v0, Ll/۬ۡ᩷;->᩹:Ll/ۗۡ᩷;

    return-void

    :sswitch_6
    const v1, 0x7d39f044

    xor-int/2addr v1, v6

    .line 39
    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 41
    new-instance v8, Landroid/content/IntentFilter;

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_2

    :cond_1
    const-string v1, "\u06ec\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v8, v1, v18

    mul-int/lit8 v8, v8, 0x7d

    const v10, 0x49da4712

    xor-int/2addr v8, v10

    const v10, -0x42bb0074

    xor-int v21, v1, v10

    move v1, v8

    const/4 v8, 0x0

    goto :goto_0

    :cond_2
    sget-object v1, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/16 v10, 0xb

    move/from16 v21, v6

    const/16 v6, 0x20

    invoke-static {v1, v10, v6, v9}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 64
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x152f

    const v10, -0xe4bb320

    xor-int/2addr v6, v10

    const v10, -0x198d7123

    goto/16 :goto_7

    .line 38
    :sswitch_7
    invoke-static {v15, v4, v7, v9}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    .line 89
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_5

    :cond_4
    :goto_2
    const-string v1, "\u1a76\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x73

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x3293

    const v21, -0x4c5069c4    # -8.1764E-8f

    xor-int v10, v10, v21

    const v21, 0x22294444

    goto :goto_3

    :cond_5
    const-string v1, "\u06d8\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0xb

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x2713

    const v21, 0x3ab16137    # 0.0013533001f

    xor-int v10, v10, v21

    const v21, -0x37cf9587

    :goto_3
    xor-int v21, v1, v21

    move v1, v10

    goto/16 :goto_0

    :sswitch_8
    move/from16 v21, v6

    .line 38
    iput-object v2, v0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    sget-object v15, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/16 v4, 0x8

    const/4 v7, 0x3

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u0733\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x7427

    const v10, -0x767f0bf

    xor-int/2addr v6, v10

    const v10, -0x5e7fdd0f

    goto/16 :goto_7

    :sswitch_9
    move/from16 v21, v6

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-static {v3, v5, v1}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v1

    .line 99
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    invoke-static {v2, v0}, Ll/ۘ᩶;->ۜ᩺᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_7

    :goto_4
    move-object/from16 v1, v23

    goto :goto_5

    :cond_7
    const-string v1, "\u06d8\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x1d

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x3a6f

    const v10, -0x55236546

    xor-int/2addr v6, v10

    const v10, 0x5d9ba93f

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06dc\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x3fc5

    const v10, -0x3e2d7fe8

    xor-int/2addr v6, v10

    const v10, -0x7c7d5a99

    goto/16 :goto_7

    :sswitch_a
    move/from16 v21, v6

    move-object/from16 v1, v23

    .line 34
    invoke-static {v1, v11, v12, v9}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-static {v0, v2}, Ll/᩹ۢۡ;->֫(Landroid/app/Service;Ljava/lang/String;)Ll/᩹ۢۡ;

    move-result-object v2

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget-object v13, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/4 v14, 0x5

    .line 103
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_9

    goto :goto_5

    :cond_9
    const-string v6, "\u06e4\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    mul-int/lit8 v6, v6, 0x47

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x3341

    const v23, -0x46548f6d

    xor-int v10, v10, v23

    const v23, 0x4d38fa8a    # 1.93964192E8f

    goto/16 :goto_a

    :sswitch_b
    move/from16 v21, v6

    move-object/from16 v1, v23

    const/4 v11, 0x1

    const/4 v12, 0x4

    .line 52
    sget v6, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v6, :cond_a

    :goto_5
    const-string v6, "\u1a78\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v18

    mul-int/lit8 v6, v6, 0x3

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, 0xd4d

    const v23, -0x4fec39f6

    xor-int v10, v10, v23

    const v23, -0x5404983b

    goto/16 :goto_a

    :cond_a
    const-string v6, "\u1a77\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x2b07

    const v23, -0x203558c2

    xor-int v10, v10, v23

    const v23, 0x3e8142e1

    goto/16 :goto_a

    :sswitch_c
    move/from16 v21, v6

    .line 33
    invoke-super/range {p0 .. p0}, Landroid/app/Service;->onCreate()V

    .line 34
    invoke-static {}, Ll/ᩳ۬᩷;->ۢ֫()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->setTheme(I)V

    sget-object v23, Ll/۬ۡ᩷;->۬ܽ۠:[S

    .line 93
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_6
    const-string v1, "\u1a7b\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x40fb

    const v10, -0x4729fd26

    xor-int/2addr v6, v10

    const v10, 0x634a29e4

    goto :goto_7

    :cond_b
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x7b

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x3813

    const v10, 0x17b3c5b

    xor-int/2addr v6, v10

    const v10, 0x55ddb1fd

    :goto_7
    xor-int/2addr v1, v10

    move/from16 v24, v21

    move/from16 v21, v1

    move v1, v6

    goto/16 :goto_b

    :sswitch_d
    move/from16 v21, v6

    move-object/from16 v1, v23

    const/16 v6, 0x7c8c

    const/16 v9, 0x7c8c

    goto :goto_8

    :sswitch_e
    move/from16 v21, v6

    move-object/from16 v1, v23

    const/16 v6, 0x352a

    const/16 v9, 0x352a

    :goto_8
    const-string v6, "\u06ec\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    mul-int/lit8 v6, v6, -0x2d

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, 0x2bed

    const v23, 0x1bb975cc

    xor-int v10, v10, v23

    const v23, -0x1ce82c60

    goto/16 :goto_a

    :sswitch_f
    move/from16 v21, v6

    move-object/from16 v1, v23

    mul-int v6, v17, v22

    mul-int v10, v17, v17

    const v23, 0xca88b69

    add-int v10, v10, v23

    sub-int/2addr v10, v6

    if-gez v10, :cond_c

    const-string v6, "\u1a7a\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0x3f4d

    const v23, -0x7c774a36

    xor-int v10, v10, v23

    const v23, -0x5f3439cd

    goto :goto_a

    :cond_c
    const-string v6, "\u073f\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v19

    xor-int v10, v6, v18

    mul-int/lit16 v10, v10, -0xcff

    const v23, 0x6d1de9ec

    xor-int v10, v10, v23

    const v23, -0x2d4dcebd

    goto :goto_a

    :sswitch_10
    move/from16 v21, v6

    move-object/from16 v1, v23

    sget-object v6, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/4 v10, 0x0

    aget-short v17, v6, v10

    const/16 v22, 0x71da

    .line 92
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v6

    if-gtz v6, :cond_d

    :goto_9
    const-string v6, "\u06eb\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, -0x31bf

    const v23, 0x77916ffe

    xor-int v10, v10, v23

    const v23, 0x4a942d83    # 4855489.5f

    goto :goto_a

    :cond_d
    const-string v6, "\u06e4\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v18

    xor-int v10, v6, v19

    mul-int/lit16 v10, v10, -0x38dd

    const v23, 0x2decae96

    xor-int v10, v10, v23

    const v23, 0x373ac7

    :goto_a
    xor-int v6, v6, v23

    move-object/from16 v23, v1

    move v1, v10

    move/from16 v24, v21

    move/from16 v21, v6

    :goto_b
    move/from16 v6, v24

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x60b79c76 -> :sswitch_9
        -0x53919dda -> :sswitch_3
        -0x4fb3f3dc -> :sswitch_0
        -0x4b425c9b -> :sswitch_0
        -0x4adc6e03 -> :sswitch_f
        -0x4669671c -> :sswitch_5
        -0x45e00a74 -> :sswitch_f
        -0x40a89168 -> :sswitch_3
        -0x378c4f37 -> :sswitch_c
        -0x2c4aa604 -> :sswitch_a
        -0x29a2b690 -> :sswitch_4
        -0x244fe779 -> :sswitch_e
        -0x1d752416 -> :sswitch_2
        -0x6aa7726 -> :sswitch_6
        -0x7f5435 -> :sswitch_2
        0x10f3f5da -> :sswitch_1
        0x1494807c -> :sswitch_7
        0x195b749b -> :sswitch_4
        0x1bafe442 -> :sswitch_6
        0x1e8eb9ab -> :sswitch_10
        0x202aa94f -> :sswitch_a
        0x233fb898 -> :sswitch_10
        0x2dcae2fd -> :sswitch_8
        0x36962595 -> :sswitch_9
        0x3f85f758 -> :sswitch_e
        0x4022b335 -> :sswitch_d
        0x44aa6f63 -> :sswitch_c
        0x4dffddc5 -> :sswitch_d
        0x50732ed3 -> :sswitch_1
        0x536609c1 -> :sswitch_5
        0x55ada403 -> :sswitch_b
        0x64d36bd3 -> :sswitch_b
        0x68bf380b -> :sswitch_7
        0x7d36273a -> :sswitch_8
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x74617696

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2857

    const v6, -0x75edd3d3

    xor-int/2addr v5, v6

    const v6, 0x254b483d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7a97

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 94
    sput-object v0, Ll/۬ۡ᩷;->ۗ:Ljava/lang/String;

    .line 70
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_1

    goto/16 :goto_2

    .line 79
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_9

    goto/16 :goto_3

    .line 48
    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_1

    .line 49
    :sswitch_2
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_b

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    goto :goto_1

    .line 23
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    return-void

    .line 96
    :sswitch_5
    iget-object v0, p0, Ll/۬ۡ᩷;->ۙ:Landroid/content/BroadcastReceiver;

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;)V

    return-void

    .line 95
    :sswitch_6
    iget-object v4, p0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    invoke-virtual {v4}, Ll/᩹ۢۡ;->ܽ()V

    .line 70
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a75\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x190d

    const v6, -0x2e5bdbe1

    xor-int/2addr v5, v6

    const v6, 0x66a9f20e

    goto :goto_0

    :cond_1
    const-string v4, "\u1a78\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2453

    const v6, 0x30d4fc8c

    xor-int/2addr v5, v6

    const v6, 0xb20db38

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x0

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_2

    :goto_1
    const-string v4, "\u0733\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x579f

    const v6, -0x246f6e39

    xor-int/2addr v5, v6

    const v6, 0x1de7a4ca

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06eb\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x9dd

    const v6, 0x58344b4c

    xor-int/2addr v5, v6

    const v6, 0x4697f39c

    goto/16 :goto_0

    .line 73
    :sswitch_8
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06df\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb5d

    const v6, -0x35d02324    # -2881335.0f

    xor-int/2addr v5, v6

    const v6, 0x1078273f

    goto/16 :goto_0

    .line 58
    :sswitch_9
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5fdb

    const v6, -0x2300b9ed

    xor-int/2addr v5, v6

    const v6, -0x5b5cc476

    goto/16 :goto_0

    .line 56
    :sswitch_a
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_5

    :goto_2
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x38e3

    const v6, -0x23d9e717

    xor-int/2addr v5, v6

    const v6, 0x104d099a

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a78\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x59d1

    const v6, -0x76d0eacc

    xor-int/2addr v5, v6

    const v6, -0x5edf74b8

    goto/16 :goto_0

    .line 83
    :sswitch_b
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06df\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x60bb

    const v6, 0x7ab437ee

    xor-int/2addr v5, v6

    const v6, 0x7168809

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x204d

    const v6, -0x32299a58

    xor-int/2addr v5, v6

    const v6, 0x6015cac4

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x711d

    const v6, -0x57cef2d0

    xor-int/2addr v5, v6

    const v6, 0x44d8e9c8

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2711

    const v6, -0xe1de5a1

    xor-int/2addr v5, v6

    const v6, -0x75ebb2a3

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d9\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2809

    const v6, -0x56a3fa25

    xor-int/2addr v5, v6

    const v6, 0x1b502dee

    goto/16 :goto_0

    .line 93
    :sswitch_e
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06e1\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x48e9

    const v6, -0x3accba6a

    xor-int/2addr v5, v6

    const v6, 0x78710728

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13a1

    const v6, 0x4800db72

    xor-int/2addr v5, v6

    const v6, 0x25ee2b61

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79c0b7f5 -> :sswitch_6
        -0x77ab04da -> :sswitch_d
        -0x5d9a2957 -> :sswitch_c
        -0x57e11a01 -> :sswitch_a
        -0x4fbe663d -> :sswitch_e
        -0x4d1014bb -> :sswitch_4
        -0x4ba7bf25 -> :sswitch_c
        -0x3e51d9ab -> :sswitch_3
        -0x34c6a279 -> :sswitch_8
        -0x28f3d6b7 -> :sswitch_5
        -0x2158f55d -> :sswitch_2
        -0x7ac2db1 -> :sswitch_6
        -0x7383908 -> :sswitch_0
        0x289d034 -> :sswitch_9
        0x201fa8e1 -> :sswitch_5
        0x24352b87 -> :sswitch_a
        0x251c4de2 -> :sswitch_1
        0x2f103116 -> :sswitch_8
        0x32b9f70b -> :sswitch_7
        0x33d3d54d -> :sswitch_2
        0x3bbb009b -> :sswitch_3
        0x421532f7 -> :sswitch_7
        0x42bb2c6a -> :sswitch_9
        0x4355b298 -> :sswitch_1
        0x44505347 -> :sswitch_4
        0x53870929 -> :sswitch_0
        0x66242d8d -> :sswitch_d
        0x6682dd6b -> :sswitch_e
        0x72e660a1 -> :sswitch_b
        0x73c6b834 -> :sswitch_b
    .end sparse-switch
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 10

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x29a21ce5

    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v6, Ll/֨۬;->۫ۙ᩺:I

    const-string v7, "\u1a79\u06df"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6e11

    const v9, 0x7d29b2e6

    xor-int/2addr v8, v9

    const v9, 0x55223b57

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x44d7

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    if-eqz p1, :cond_3

    const-string v7, "\u06e2\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7da7

    const v9, 0xf9aa50d

    xor-int/2addr v8, v9

    const v9, 0x32fb8ef6

    goto :goto_0

    .line 78
    :sswitch_0
    sget v7, Ll/᩺;->ۙۛܶ:I

    if-gtz v7, :cond_a

    goto/16 :goto_5

    .line 59
    :sswitch_1
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget v7, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v7, :cond_7

    goto/16 :goto_8

    .line 84
    :sswitch_2
    sget v7, Ll/ۗ᩵;->֫۠۟:I

    if-gez v7, :cond_f

    goto/16 :goto_7

    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_7

    .line 81
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    const/4 p1, 0x0

    return p1

    .line 101
    :sswitch_5
    iget-object v7, p0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    invoke-virtual {v7}, Ll/᩹ۢۡ;->show()V

    goto :goto_1

    .line 103
    :sswitch_6
    iget-object v7, p0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    invoke-virtual {v7}, Ll/᩹ۢۡ;->֫()V

    goto :goto_1

    :sswitch_7
    const/4 p1, 0x2

    return p1

    .line 81
    :sswitch_8
    sget-object v7, Ll/۬ۡ᩷;->۬:Ll/۫ܽܽ;

    iput-object v7, p0, Ll/۬ۡ᩷;->᩸:Ll/۫ܽܽ;

    const/4 v7, 0x0

    .line 82
    sput-object v7, Ll/۬ۡ᩷;->۬:Ll/۫ܽܽ;

    goto/16 :goto_2

    .line 100
    :sswitch_9
    iget-object v7, p0, Ll/۬ۡ᩷;->᩶:Ll/᩹ۢۡ;

    invoke-virtual {v7}, Ll/᩹ۢۡ;->ۧ()Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06dc\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1f63

    const v9, -0x4b5f08f8

    xor-int/2addr v8, v9

    const v9, -0x4b429500

    goto :goto_0

    :cond_0
    const-string v7, "\u0730\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1c9f

    const v9, -0x72da57b7

    xor-int/2addr v8, v9

    const v9, -0x5d4d17d7

    goto/16 :goto_0

    .line 87
    :sswitch_a
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :goto_1
    const-string v7, "\u06db\u06ec"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x1d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xdb9

    const v9, -0x2b5d80a

    xor-int/2addr v8, v9

    const v9, 0x64199d3d

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {v1, v2, v3, v0}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    .line 80
    invoke-virtual {p1, v7, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u06eb\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1cad

    const v9, 0x6e714e0c

    xor-int/2addr v8, v9

    const v9, -0x7577c34

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-object v1, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/16 v2, 0x2c

    const/4 v3, 0x4

    sget v7, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u1a79\u1a76"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7a4f

    const v9, -0x7a78673a

    xor-int/2addr v8, v9

    const v9, -0x7157e9d8

    goto/16 :goto_0

    .line 84
    :sswitch_d
    iget-object v7, p0, Ll/۬ۡ᩷;->᩸:Ll/۫ܽܽ;

    if-eqz v7, :cond_2

    const-string v7, "\u06e7\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3fc3

    const v9, 0x3942bbf8

    xor-int/2addr v8, v9

    const v9, -0x28eb9c28

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u05a8\u1a74"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7353

    const v9, -0x2133d381

    xor-int/2addr v8, v9

    const v9, 0x2a57cb36

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x60f1

    const v9, -0x39ada78b

    xor-int/2addr v8, v9

    const v9, -0x42b7b9f3

    goto/16 :goto_0

    :sswitch_e
    const v0, 0xd5aa

    goto :goto_3

    :sswitch_f
    const/16 v0, 0x4787

    :goto_3
    const-string v7, "\u06da\u1a73"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1369

    const v9, -0x55b12a0

    xor-int/2addr v8, v9

    const v9, 0x6a0a809d

    goto/16 :goto_0

    :sswitch_10
    const v7, 0x8ecc

    mul-int v7, v7, p2

    sub-int v7, p3, v7

    if-ltz v7, :cond_4

    const-string v7, "\u1a7a\u06ec"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0xd

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x22f

    const v9, -0x71602a31

    xor-int/2addr v8, v9

    const v9, 0x1eb45f5e

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06db\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2539

    const v9, 0x6664ad7c

    xor-int/2addr v8, v9

    const v9, -0x5abade86

    goto/16 :goto_0

    :sswitch_11
    add-int/lit16 p3, p2, 0x23b3

    mul-int p3, p3, p3

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v7

    if-gtz v7, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v7, "\u06d6\u06d6"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xa9b

    const v9, -0x1a2c6242

    xor-int/2addr v8, v9

    const v9, 0x45755114

    goto/16 :goto_0

    :sswitch_12
    sget-object p2, Ll/۬ۡ᩷;->۬ܽ۠:[S

    const/16 v7, 0x2b

    aget-short p2, p2, v7

    sget v7, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v7, :cond_6

    :goto_4
    const-string v7, "\u06e1\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x65

    xor-int v8, v7, v6

    mul-int/lit8 v8, v8, -0x7b

    const v9, 0x90359a0

    xor-int/2addr v8, v9

    const v9, -0x75d741b0

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u0736\u06d9"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x25

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1717

    const v9, 0x38527068

    xor-int/2addr v8, v9

    const v9, -0xc17c37a

    goto/16 :goto_0

    .line 100
    :sswitch_13
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v7

    if-eqz v7, :cond_8

    :cond_7
    :goto_5
    const-string v7, "\u1a73\u0736"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xe0f

    const v9, -0x7d648d44

    xor-int/2addr v8, v9

    const v9, -0x18b18221

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06df\u1a7a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x7d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2ec1

    const v9, -0x6a89e7bb

    xor-int/2addr v8, v9

    const v9, -0x2aa83f85

    goto/16 :goto_0

    .line 71
    :sswitch_14
    sget v7, Ll/۟;->ۗۤۛ:I

    if-eqz v7, :cond_9

    goto :goto_6

    :cond_9
    const-string v7, "\u1a77\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7b89

    const v9, 0x4c14f6b2    # 3.9049928E7f

    xor-int/2addr v8, v9

    const v9, 0x1e461713

    goto/16 :goto_0

    :sswitch_15
    sget-boolean v7, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v7, :cond_b

    :cond_a
    :goto_6
    const-string v7, "\u06db\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x62dd

    const v9, 0xa4631fa

    xor-int/2addr v8, v9

    const v9, 0x5cd7e7d6

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06e7\u05ab"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1bef

    const v9, -0xa29fd12

    xor-int/2addr v8, v9

    const v9, -0x2eee2fb3

    goto/16 :goto_0

    .line 1
    :sswitch_16
    sget v7, Ll/۟;->ۗۤۛ:I

    if-eqz v7, :cond_c

    goto :goto_7

    :cond_c
    const-string v7, "\u1a73\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x257

    const v9, -0x3fca9b00

    xor-int/2addr v8, v9

    const v9, -0x2b5e76be

    goto/16 :goto_0

    :sswitch_17
    sget v7, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v7, :cond_d

    goto :goto_8

    :cond_d
    const-string v7, "\u073f\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5305

    const v9, 0xde9b11e

    xor-int/2addr v8, v9

    const v9, -0x3019c2e5

    goto/16 :goto_0

    :sswitch_18
    sget v7, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v7, :cond_e

    :goto_7
    const-string v7, "\u06dc\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x53

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3905

    const v9, -0x478dea02

    xor-int/2addr v8, v9

    const v9, -0x166e2506

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u1a7a\u06d6"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5e95

    const v9, 0x321fc476

    xor-int/2addr v8, v9

    const v9, -0x5d0ca3c9

    goto/16 :goto_0

    .line 34
    :sswitch_19
    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_10

    :cond_f
    :goto_8
    const-string v7, "\u1a77\u05a8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x49bb

    const v9, 0x78a785b9

    xor-int/2addr v8, v9

    const v9, 0x6ef7c66d

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u05ab\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x3f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x407f

    const v9, -0x4c56e076

    xor-int/2addr v8, v9

    const v9, -0x7e0dc5f1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a455d3a -> :sswitch_e
        -0x76f8e098 -> :sswitch_5
        -0x6b4d8645 -> :sswitch_e
        -0x66aa32a9 -> :sswitch_18
        -0x64caeaf5 -> :sswitch_16
        -0x5f1cdea4 -> :sswitch_10
        -0x54c96d6a -> :sswitch_9
        -0x502020cd -> :sswitch_18
        -0x4d6bd16a -> :sswitch_12
        -0x4c1f94e7 -> :sswitch_2
        -0x4bca4e39 -> :sswitch_7
        -0x47c4076e -> :sswitch_f
        -0x458acdd6 -> :sswitch_d
        -0x43c67c29 -> :sswitch_5
        -0x3dc645e7 -> :sswitch_f
        -0x389d22a2 -> :sswitch_16
        -0x2eafdff9 -> :sswitch_a
        -0x2c9f8f84 -> :sswitch_11
        -0x2ad75210 -> :sswitch_8
        -0x206f4733 -> :sswitch_9
        -0x1e8dc23a -> :sswitch_3
        -0x1a267648 -> :sswitch_4
        -0x1a037f07 -> :sswitch_19
        -0x18f46da1 -> :sswitch_c
        -0x183639f9 -> :sswitch_19
        -0x1720af14 -> :sswitch_4
        -0x1036becc -> :sswitch_2
        -0x906a3ca -> :sswitch_12
        -0x78baae3 -> :sswitch_17
        0xa807a3 -> :sswitch_14
        0x51bbfc7 -> :sswitch_15
        0x113aec28 -> :sswitch_0
        0x120618fe -> :sswitch_1
        0x16c12b42 -> :sswitch_13
        0x1c06ab3c -> :sswitch_d
        0x22d30532 -> :sswitch_a
        0x291152ca -> :sswitch_8
        0x34678a1c -> :sswitch_0
        0x36a895d4 -> :sswitch_10
        0x36e410e1 -> :sswitch_11
        0x3f72f1eb -> :sswitch_c
        0x4daa8648 -> :sswitch_6
        0x5a4e28ce -> :sswitch_1
        0x5f12557f -> :sswitch_b
        0x5f28afcb -> :sswitch_14
        0x6a547e12 -> :sswitch_15
        0x6c7f3ea8 -> :sswitch_b
        0x6cebdfb6 -> :sswitch_7
        0x730b01d1 -> :sswitch_6
        0x73496be1 -> :sswitch_17
        0x79b16a83 -> :sswitch_13
        0x7bf59f32 -> :sswitch_3
    .end sparse-switch
.end method
