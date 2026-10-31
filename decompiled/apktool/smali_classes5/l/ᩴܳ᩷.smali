.class public Ll/ᩴܳ᩷;
.super Ll/ۗܺ᩷;
.source "O3YD"


# static fields
.field public static final synthetic ۖۧ:I

.field private static final ۧ۠۟:[S


# instance fields
.field public ۜۧ:Ljava/util/ArrayList;

.field public ۡۧ:Ll/ۖۢۡ;

.field public ۢۧ:Ll/ۘܳ᩷;

.field public ܳۧ:Lbin/mt/plugin/api/PluginContext;

.field public ܺۧ:Ljava/util/ArrayList;

.field public ܿۧ:Ll/ۛ᩻᩷;

.field public ᩳۧ:Ll/ܳܳ᩷;

.field public ᩷ۧ:Lbin/mt/plugin/api/preference/PluginPreference;

.field public ᩻ۧ:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    return-void

    :array_0
    .array-data 2
        0x2090s
        0x2d09s
        0x2d2es
        0x2d33s
        0x2d34s
        0x2d21s
        0x2d2es
        0x2d23s
        0x2d25s
        0x2d60s
        0x2d2ds
        0x2d21s
        0x2d29s
        0x2d2es
        0x2d60s
        0x2d30s
        0x2d32s
        0x2d25s
        0x2d26s
        0x2d25s
        0x2d32s
        0x2d25s
        0x2d2es
        0x2d23s
        0x2d25s
        0x2d60s
        0x2d26s
        0x2d21s
        0x2d29s
        0x2d2cs
        0x2d25s
        0x2d24s
        -0x5581s
        -0x47d9s
        0x759es
        0x1d61s
        -0x72bs
        -0xebes
        0x375es
        0xf55s
        0x3b0as
        0x3a22s
        0x32f7s
        -0x6ebs
        -0x1fb3s
        0x6648s
        0x6654s
        0x664ds
        0x665fs
        0x6651s
        0x6656s
        0x6671s
        0x665cs
        0x6668s
        0x6654s
        0x664ds
        0x665fs
        0x6651s
        0x6656s
        0x6618s
        0x6656s
        0x6657s
        0x664cs
        0x6618s
        0x665es
        0x6657s
        0x664ds
        0x6656s
        0x665cs
        0x6602s
        0x6618s
        0x6648s
        0x6654s
        0x664ds
        0x665fs
        0x6651s
        0x6656s
        0x6668s
        0x664as
        0x665ds
        0x665es
        0x665ds
        0x664as
        0x665ds
        0x6656s
        0x665bs
        0x665ds
        0x667as
        0x664ds
        0x6651s
        0x6654s
        0x665cs
        0x6618s
        0x6648s
        0x664as
        0x665ds
        0x665es
        0x665ds
        0x664as
        0x665ds
        0x6656s
        0x665bs
        0x665ds
        0x6618s
        0x665es
        0x6659s
        0x6651s
        0x6654s
        0x665ds
        0x665cs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 59
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩵()V

    return-void
.end method

.method public static ֫(Ll/ᩴܳ᩷;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x42bbf5d4

    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v7, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v8, "\u1a76\u1a7b"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7d77

    const v10, -0x671a0d12

    xor-int/2addr v9, v10

    const v10, 0x5943b7a0

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x6fb

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 53
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto/16 :goto_2

    .line 138
    :sswitch_0
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v8, "\u0733\u06d9"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xeef

    const v10, -0x3eb37634

    xor-int/2addr v9, v10

    const v10, 0x758883f2

    goto :goto_0

    .line 68
    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v8

    if-nez v8, :cond_5

    goto/16 :goto_2

    .line 176
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v8, :cond_7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v8

    if-eqz v8, :cond_c

    goto/16 :goto_2

    .line 7
    :sswitch_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    const/4 p0, 0x0

    return-object p0

    :sswitch_5
    return-object v4

    .line 172
    :sswitch_6
    invoke-static {v1, v2}, Ll/֨֫;->֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    const-string v8, "\u1a79\u0730"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x1f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x99b

    const v10, -0x4217c2f3

    xor-int/2addr v9, v10

    const v10, -0xd9ae0e9

    goto :goto_0

    :sswitch_7
    const/4 v8, 0x1

    .line 0
    invoke-static {v8, v2}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v8

    const/16 v9, 0x7d

    if-ne v8, v9, :cond_e

    const-string v8, "\u06e0\u1a73"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3b19

    const v10, 0x7d40349d

    xor-int/2addr v9, v10

    const v10, 0x347388f3

    goto/16 :goto_0

    :sswitch_8
    const/4 v8, 0x0

    .line 171
    invoke-static {v2, v8}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v8

    const/16 v9, 0x7b

    if-ne v8, v9, :cond_e

    const-string v8, "\u05a8\u06da"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x53

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x66df

    const v10, 0x336876d3

    xor-int/2addr v9, v10

    const v10, -0x3ba12e07

    goto/16 :goto_0

    .line 196
    :sswitch_9
    check-cast p1, Ljava/lang/String;

    .line 197
    invoke-static {v0, p1}, Ll/᩶᩻᩷;->֫(Lbin/mt/plugin/api/LocalString;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :sswitch_a
    const/4 v8, 0x3

    if-lt v3, v8, :cond_e

    const-string v8, "\u073a\u06e2"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2967

    const v10, 0x4d5e9cdd    # 2.33426384E8f

    xor-int/2addr v9, v10

    const v10, -0x1c7f770e

    goto/16 :goto_0

    .line 91
    :sswitch_b
    sget v8, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v8, :cond_1

    goto :goto_1

    :cond_1
    const-string v8, "\u06e1\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4cc7

    const v10, 0x2432e7e3

    xor-int/2addr v9, v10

    const v10, 0x4aad1a16    # 5672203.0f

    goto/16 :goto_0

    .line 9
    :sswitch_c
    sget v8, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v8, :cond_2

    goto :goto_3

    :cond_2
    const-string v8, "\u06d7\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xdcd

    const v10, 0x5c0d7645

    xor-int/2addr v9, v10

    const v10, 0x4b4ab0c9    # 1.3283529E7f

    goto/16 :goto_0

    .line 77
    :sswitch_d
    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v8, :cond_3

    :goto_1
    const-string v8, "\u06e8\u06d8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3863

    const v10, -0x3f0dc5ac

    xor-int/2addr v9, v10

    const v10, -0x7e15d6b5

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u073a\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1f97

    const v10, 0x6052b13f

    xor-int/2addr v9, v10

    const v10, 0x1b447fa5

    goto/16 :goto_0

    .line 125
    :sswitch_e
    sget v8, Ll/֡۬;->۠֡᩶:I

    if-gtz v8, :cond_4

    :goto_2
    const-string v8, "\u06e2\u1a73"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x50ff

    const v10, 0x526d023

    xor-int/2addr v9, v10

    const v10, -0x319a46fe

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u06da\u1a7a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x4b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x325

    const v10, -0x7feb68f4

    xor-int/2addr v9, v10

    const v10, -0x7ad9aaa2

    goto/16 :goto_0

    .line 69
    :sswitch_f
    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_6

    :cond_5
    :goto_3
    const-string v8, "\u06d6\u0736"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1105

    const v10, 0x6bee7fae

    xor-int/2addr v9, v10

    const v10, 0x15cd0624

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u1a75\u1a7b"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x33

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x58f

    const v10, 0x146afcb5

    xor-int/2addr v9, v10

    const v10, 0x6ceb9020

    goto/16 :goto_0

    :sswitch_10
    sget v8, Ll/ۛ;->᩺᩻֫:I

    if-ltz v8, :cond_8

    :cond_7
    const-string v8, "\u06eb\u0730"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3ff7

    const v10, 0x6b51f979

    xor-int/2addr v9, v10

    const v10, -0x73e0cf36

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u073d\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x1f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x384d

    const v10, 0x79b45a98

    xor-int/2addr v9, v10

    const v10, -0x154a2151

    goto/16 :goto_0

    .line 161
    :sswitch_11
    sget v8, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v8, :cond_9

    goto :goto_4

    :cond_9
    const-string v8, "\u0733\u05a1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7bf

    const v10, -0x4e0c06e3

    xor-int/2addr v9, v10

    const v10, -0x5dfc85d9

    goto/16 :goto_0

    :sswitch_12
    sget v8, Ll/֨۟;->᩹֫᩷:I

    if-eqz v8, :cond_a

    goto :goto_4

    :cond_a
    const-string v8, "\u0736\u06ec"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x63

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3487

    const v10, 0x40f768a8

    xor-int/2addr v9, v10

    const v10, -0x53378c3c

    goto/16 :goto_0

    :sswitch_13
    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v8, :cond_b

    goto :goto_4

    :cond_b
    const-string v8, "\u073a\u06e1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4bf5

    const v10, -0x2d04b0a5

    xor-int/2addr v9, v10

    const v10, 0x2dfe4e3e

    goto/16 :goto_0

    .line 171
    :sswitch_14
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v8

    if-ltz v8, :cond_d

    :cond_c
    :goto_4
    const-string v8, "\u05a8\u06e4"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x71

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5c21

    const v10, -0xb607a60

    xor-int/2addr v9, v10

    const v10, 0x5d408bc6

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u1a78\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3139

    const v10, 0x5df8522

    xor-int/2addr v9, v10

    const v10, 0x5acc0ab4

    goto/16 :goto_0

    :sswitch_15
    return-object p1

    .line 196
    :sswitch_16
    instance-of v8, p1, Ljava/lang/String;

    if-eqz v8, :cond_e

    const-string v8, "\u06d9\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x17e1

    const v10, 0x7bbbab3

    xor-int/2addr v9, v10

    const v10, 0x6711e1be

    goto/16 :goto_0

    .line 200
    :sswitch_17
    iget-object v1, p0, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    .line 171
    instance-of v8, p1, Ljava/lang/String;

    if-eqz v8, :cond_e

    const-string v8, "\u06e0\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x51b9

    const v10, -0x3e63c45

    xor-int/2addr v9, v10

    const v10, -0x3a0dd3a3

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06dc\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4909

    const v10, 0x5bb05c6a

    xor-int/2addr v9, v10

    const v10, -0x5c52870c

    goto/16 :goto_0

    :sswitch_18
    const/4 p0, 0x0

    return-object p0

    .line 195
    :sswitch_19
    iget-object v0, p0, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    iget-object v0, v0, Ll/ۛ᩻᩷;->ܽ:Lbin/mt/plugin/api/LocalString;

    if-eqz v0, :cond_f

    const-string v8, "\u0736\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7939

    const v10, 0x53d44778

    xor-int/2addr v9, v10

    const v10, -0x78eecdad

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u1a7b\u06e0"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x479f

    const v10, -0x15cdb85a

    xor-int/2addr v9, v10

    const v10, -0x58903f32

    goto/16 :goto_0

    :sswitch_1a
    if-nez p1, :cond_10

    const-string v8, "\u06db\u06eb"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x57

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2689

    const v10, -0x46950661

    xor-int/2addr v9, v10

    const v10, -0x1fbd9b4c

    goto/16 :goto_0

    :cond_10
    const-string v8, "\u1a76\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x19

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2545

    const v10, -0x611f8319

    xor-int/2addr v9, v10

    const v10, -0x666e3304

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e865ae3 -> :sswitch_15
        -0x7d955c49 -> :sswitch_8
        -0x6a715c5f -> :sswitch_a
        -0x69e927c3 -> :sswitch_14
        -0x669992f5 -> :sswitch_6
        -0x6456e50a -> :sswitch_e
        -0x5abc3393 -> :sswitch_13
        -0x58abe391 -> :sswitch_18
        -0x5734fd07 -> :sswitch_10
        -0x5554cc09 -> :sswitch_1
        -0x53b35352 -> :sswitch_19
        -0x5353438c -> :sswitch_a
        -0x4dedfb75 -> :sswitch_d
        -0x47cd9372 -> :sswitch_9
        -0x415007a4 -> :sswitch_12
        -0x3db891d9 -> :sswitch_15
        -0x3c16acbc -> :sswitch_10
        -0x30617282 -> :sswitch_f
        -0x2931c7d3 -> :sswitch_5
        -0x1fffc7ea -> :sswitch_0
        -0x1904e534 -> :sswitch_16
        -0x1834eef1 -> :sswitch_11
        -0x14afce9d -> :sswitch_6
        -0x148d958e -> :sswitch_4
        -0x120adf3e -> :sswitch_3
        -0x117bcb57 -> :sswitch_e
        -0x107ed4e8 -> :sswitch_0
        -0x10617e64 -> :sswitch_f
        -0xd220126 -> :sswitch_12
        -0xa0660b1 -> :sswitch_c
        -0x8fedfc3 -> :sswitch_2
        -0x29bb110 -> :sswitch_16
        0x114600d0 -> :sswitch_4
        0x1a31b59b -> :sswitch_1a
        0x1acb9026 -> :sswitch_3
        0x1ad1a659 -> :sswitch_14
        0x202aa5db -> :sswitch_17
        0x25cd9de1 -> :sswitch_d
        0x2aa0a780 -> :sswitch_b
        0x38aa34c8 -> :sswitch_1a
        0x38ea5dbc -> :sswitch_8
        0x401fb091 -> :sswitch_11
        0x4754c468 -> :sswitch_18
        0x491cc5e3 -> :sswitch_1
        0x5d398695 -> :sswitch_7
        0x6dff0002 -> :sswitch_13
        0x7274ef0c -> :sswitch_19
        0x742710a9 -> :sswitch_2
        0x7628247b -> :sswitch_b
        0x784fad08 -> :sswitch_17
        0x7aae54e9 -> :sswitch_c
        0x7b0510b4 -> :sswitch_7
        0x7c2632c0 -> :sswitch_9
        0x7cb18ba3 -> :sswitch_5
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ᩴܳ᩷;)Ll/ܳܳ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ᩳۧ:Ll/ܳܳ᩷;

    return-object p0
.end method

.method private ֫(Ll/ܽܳ᩷;Lbin/mt/plugin/api/preference/PluginPreference;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x2b70428a

    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    sget v14, Ll/֡۬;->۠֡᩶:I

    const-string v15, "\u06ec\u1a7a"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v2, v15, v14

    mul-int/lit16 v2, v2, 0x41d9

    const v17, 0x6f1a000c

    xor-int v2, v2, v17

    const v17, 0x613b61e4

    xor-int v15, v15, v17

    move-object v5, v4

    move-object v7, v6

    move/from16 v16, v15

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x2b70428a

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x3ae5

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v16, v5

    .line 135
    iput-object v1, v0, Ll/ᩴܳ᩷;->᩷ۧ:Lbin/mt/plugin/api/preference/PluginPreference;

    .line 136
    invoke-static {}, Ll/۬ܿ᩷;->ᩳ()Ll/ۚۡ֫;

    move-result-object v3

    new-instance v4, Ll/ۢܶܳ;

    const/4 v2, 0x1

    move-object/from16 v5, p1

    invoke-direct {v4, v2, v0, v5}, Ll/ۢܶܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    sget-boolean v2, Ll/֨۫;->۬᩷᩶:Z

    if-nez v2, :cond_9

    goto/16 :goto_a

    .line 37
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    if-ltz v2, :cond_1

    :cond_0
    move-object/from16 v16, v5

    goto :goto_4

    :cond_1
    move-object/from16 v16, v5

    goto/16 :goto_6

    :sswitch_1
    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v2, :cond_0

    :goto_1
    move-object/from16 v16, v5

    :goto_2
    move-object/from16 v5, p1

    goto/16 :goto_a

    .line 87
    :sswitch_2
    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v16, v5

    :goto_3
    move-object/from16 v5, p1

    goto/16 :goto_b

    .line 31
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto :goto_1

    .line 76
    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    return-void

    .line 147
    :sswitch_5
    new-instance v1, Ll/ۘܳ᩷;

    invoke-direct {v1, v0}, Ll/ۘܳ᩷;-><init>(Ll/ᩴܳ᩷;)V

    iput-object v1, v0, Ll/ᩴܳ᩷;->ۢۧ:Ll/ۘܳ᩷;

    .line 148
    invoke-direct/range {p0 .. p0}, Ll/ᩴܳ᩷;->ۨ()V

    return-void

    .line 142
    :sswitch_6
    move-object v2, v5

    check-cast v2, Ll/ۖۢۡ;

    iput-object v2, v0, Ll/ᩴܳ᩷;->ۡۧ:Ll/ۖۢۡ;

    .line 143
    invoke-virtual {v2}, Ll/ۖۢۡ;->ܳ()V

    .line 144
    iget-object v2, v0, Ll/ᩴܳ᩷;->ۡۧ:Ll/ۖۢۡ;

    move-object/from16 v16, v5

    new-instance v5, Ll/᩻ܳ᩷;

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v17

    if-gtz v17, :cond_3

    :goto_4
    const-string v2, "\u0730\u1a79"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v5, v2, v14

    mul-int/lit16 v5, v5, 0x6f9

    const v17, 0x6cad0ebd

    xor-int v5, v5, v17

    const v17, -0x7970f29

    goto/16 :goto_7

    :cond_3
    invoke-direct {v5, v0}, Ll/᩻ܳ᩷;-><init>(Ll/ᩴܳ᩷;)V

    invoke-virtual {v2, v5}, Ll/۬۬ۧ;->addItemDecoration(Ll/۟ۗۧ;)V

    .line 145
    new-instance v2, Ll/ܳܳ᩷;

    .line 30
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_4

    goto :goto_2

    .line 145
    :cond_4
    invoke-direct {v2, v0}, Ll/ܳܳ᩷;-><init>(Ll/ᩴܳ᩷;)V

    iput-object v2, v0, Ll/ᩴܳ᩷;->ᩳۧ:Ll/ܳܳ᩷;

    .line 146
    iget-object v5, v0, Ll/ᩴܳ᩷;->ۡۧ:Ll/ۖۢۡ;

    invoke-static {v5, v2}, Ll/֨ᩴ;->ᩴۡܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "\u073d\u06e0"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x11

    xor-int v5, v2, v14

    mul-int/lit16 v5, v5, 0x22eb

    const v17, 0x6a1a923    # 6.0809993E-35f

    xor-int v5, v5, v17

    const v17, -0x3c7b6a38

    goto/16 :goto_7

    :sswitch_7
    const v2, 0x7d042750

    xor-int/2addr v2, v6

    .line 142
    invoke-static {v0, v2}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v5

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v2

    if-nez v2, :cond_6

    move-object/from16 v16, v5

    :goto_5
    move-object/from16 v5, p1

    goto/16 :goto_9

    :cond_6
    const-string v2, "\u1a77\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    move-object/from16 v16, v5

    xor-int v5, v2, v13

    mul-int/lit16 v5, v5, -0x5d13

    const v17, -0x4ae9c533

    xor-int v5, v5, v17

    const v17, -0x5846a15c

    goto :goto_7

    :sswitch_8
    move-object/from16 v16, v5

    .line 141
    sget-object v2, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v5, 0x20

    const/4 v6, 0x3

    invoke-static {v2, v5, v6, v12}, Ll/ۘۛ;->ۚ᩻֫([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    .line 107
    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v2, :cond_7

    goto :goto_5

    :cond_7
    const-string v2, "\u1a76\u1a73"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x5d

    xor-int v5, v2, v14

    mul-int/lit16 v5, v5, -0x33b5

    const v17, 0x44cffbda

    xor-int v5, v5, v17

    const v17, 0x470f9e3f

    goto :goto_7

    :sswitch_9
    move-object/from16 v16, v5

    .line 136
    invoke-static {v3, v0, v4}, Ll/֨۫;->۠۬᩵(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    iget-object v2, v0, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v2}, Lbin/mt/plugin/api/PluginContext;->getPreferences()Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, v0, Ll/ᩴܳ᩷;->᩻ۧ:Landroid/content/SharedPreferences;

    .line 9
    sget-boolean v2, Ll/֨۫;->۬᩷᩶:Z

    if-nez v2, :cond_8

    :goto_6
    const-string v2, "\u06e7\u0733"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, 0x53

    xor-int v5, v2, v13

    mul-int/lit16 v5, v5, -0x7a11

    const v17, 0x525a1574

    xor-int v5, v5, v17

    const v17, -0x2e210b0d

    goto :goto_7

    :cond_8
    const-string v2, "\u1a77\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x19

    xor-int v5, v2, v14

    mul-int/lit16 v5, v5, -0x171f

    const v17, 0x491ae65

    xor-int v5, v5, v17

    const v17, -0x2b3ecbc8

    :goto_7
    xor-int v2, v2, v17

    move-object/from16 v18, v16

    move/from16 v16, v2

    move v2, v5

    move-object/from16 v5, v18

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u05ab\u0736"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x59

    xor-int v0, v2, v13

    mul-int/lit16 v0, v0, -0x1855

    const v17, -0x39de2a4a

    xor-int v0, v0, v17

    const v17, 0x20e0d32

    xor-int v2, v2, v17

    move-object/from16 v5, v16

    move/from16 v16, v2

    move v2, v0

    goto/16 :goto_d

    .line 134
    :sswitch_a
    new-instance v0, Ljava/lang/NullPointerException;

    sget-object v1, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/4 v2, 0x1

    const/16 v3, 0x1f

    invoke-static {v1, v2, v3, v12}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_b
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    if-eqz v1, :cond_a

    const-string v0, "\u073a\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x7fad

    const v17, 0x6c633da2

    xor-int v2, v2, v17

    const v17, 0x2a970057

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u06d8\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x1f

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x53cf

    const v17, 0x3f25216a

    xor-int v2, v2, v17

    const v17, -0x49dc2d10

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    const/16 v0, 0x5f09

    const/16 v12, 0x5f09

    goto :goto_8

    :sswitch_d
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    const/16 v0, 0x2d40

    const/16 v12, 0x2d40

    :goto_8
    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x42e3

    const v17, -0x8ca552

    xor-int v2, v2, v17

    const v17, -0x136ec35

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    add-int v0, v8, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-ltz v0, :cond_b

    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x71a5

    const v17, -0x5ef37e66

    xor-int v2, v2, v17

    const v17, -0xbae2100

    goto/16 :goto_c

    :cond_b
    const-string v0, "\u1a73\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x33

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x5cbd

    const v17, -0x618592c1

    xor-int v2, v2, v17

    const v17, 0x405be6aa

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    mul-int v0, v8, v9

    add-int/lit8 v10, v0, 0x1

    const/4 v11, 0x1

    .line 25
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v0

    if-gtz v0, :cond_c

    :goto_9
    const-string v0, "\u06df\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x45

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x1e6d

    const v17, -0x77d9d155    # -5.0008666E-34f

    xor-int v2, v2, v17

    const v17, -0x1141d206

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u05a8\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0xc69

    const v17, 0x76ed3efb

    xor-int v2, v2, v17

    const v17, -0x3cdbc779

    goto :goto_c

    :sswitch_10
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    const/4 v0, 0x0

    aget-short v8, v7, v0

    const/4 v9, 0x2

    .line 23
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_d

    :goto_a
    const-string v0, "\u1a78\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x21

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x7c1f

    const v17, 0x7b63ff59

    xor-int v2, v2, v17

    const v17, -0x451fea05

    goto :goto_c

    :cond_d
    const-string v0, "\u06d7\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x79

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0xb77

    const v17, -0x422346bb

    xor-int v2, v2, v17

    const v17, 0x97f52b

    goto :goto_c

    :sswitch_11
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    sget-object v7, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    .line 83
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_e

    :goto_b
    const-string v0, "\u06da\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, -0x2f61

    const v17, 0x43b184ac

    xor-int v2, v2, v17

    const v17, 0x99738f0

    goto :goto_c

    :cond_e
    const-string v0, "\u0733\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v2, v0, v13

    mul-int/lit16 v2, v2, 0x4745

    const v17, -0x1d643cd4

    xor-int v2, v2, v17

    const v17, -0x5da02795

    :goto_c
    xor-int v0, v0, v17

    move-object/from16 v5, v16

    move/from16 v16, v0

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f1c3f89 -> :sswitch_f
        -0x7c901759 -> :sswitch_10
        -0x77ee9804 -> :sswitch_9
        -0x70f62779 -> :sswitch_4
        -0x67c789cd -> :sswitch_b
        -0x67b3b244 -> :sswitch_c
        -0x52ce1282 -> :sswitch_5
        -0x4dbc1ad2 -> :sswitch_a
        -0x4aee482a -> :sswitch_11
        -0x479641eb -> :sswitch_1
        -0x454b828e -> :sswitch_10
        -0x4437ced1 -> :sswitch_d
        -0x438a7468 -> :sswitch_e
        -0x40aed851 -> :sswitch_6
        -0x3dde0f04 -> :sswitch_1
        -0x37a585e2 -> :sswitch_4
        -0x323604d0 -> :sswitch_7
        -0x2aa09c59 -> :sswitch_5
        -0x24303244 -> :sswitch_e
        -0x19dd73ce -> :sswitch_b
        -0x146f0924 -> :sswitch_3
        -0xd120235 -> :sswitch_2
        -0x83fc3e4 -> :sswitch_8
        0x4641b47 -> :sswitch_c
        0x1dc5d706 -> :sswitch_a
        0x2078c31f -> :sswitch_d
        0x2683c610 -> :sswitch_0
        0x2c422ea2 -> :sswitch_2
        0x30a35926 -> :sswitch_3
        0x3b1e1b89 -> :sswitch_6
        0x3e6083ab -> :sswitch_0
        0x48c40a9e -> :sswitch_f
        0x5513381c -> :sswitch_7
        0x57f98c94 -> :sswitch_9
        0x6cc2ffbf -> :sswitch_8
        0x6cf2dce1 -> :sswitch_11
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ᩴܳ᩷;Lbin/mt/plugin/api/PluginContext;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴܳ᩷;Ll/ܽܳ᩷;Lbin/mt/plugin/api/preference/PluginPreference;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ᩴܳ᩷;->֫(Ll/ܽܳ᩷;Lbin/mt/plugin/api/preference/PluginPreference;)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ᩴܳ᩷;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ܺۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic ۡ(Ll/ᩴܳ᩷;)Ll/ۢᩴ;
    .locals 0

    .line 47
    iget-object p0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ᩴܳ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴܳ᩷;->᩺()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ᩴܳ᩷;)Ll/ۛ᩻᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    return-object p0
.end method

.method private ۨ()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x2b69fbfe

    sget v11, Ll/᩺;->ۙۛܶ:I

    sget v12, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v13, "\u073f\u06db"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x6d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4f5b

    const v15, 0x6a3f5d05

    xor-int/2addr v14, v15

    const v15, 0x5fe4163b

    xor-int/2addr v13, v15

    move-object v15, v2

    move-object/from16 v17, v3

    move-object v3, v0

    move-object v0, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object/from16 v4, v17

    :goto_0
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x1bd

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 130
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_4

    .line 71
    :sswitch_0
    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v13, :cond_10

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v13

    if-eqz v13, :cond_6

    goto/16 :goto_7

    :sswitch_2
    sget-boolean v13, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u0736\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3fc1

    const v16, 0xf826f85

    xor-int v14, v14, v16

    const v16, 0x5a98d14d

    goto/16 :goto_a

    .line 95
    :sswitch_3
    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v13, :cond_b

    goto/16 :goto_7

    .line 125
    :sswitch_4
    sget v13, Ll/ۛ;->᩺᩻֫:I

    if-gez v13, :cond_e

    goto/16 :goto_4

    .line 144
    :sswitch_5
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    :sswitch_6
    return-void

    :sswitch_7
    const/4 v13, 0x0

    .line 546
    invoke-static {v1, v0, v13}, Ll/ۗ᩶;->۠ۛۚ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 185
    :sswitch_8
    iget-object v13, v1, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v13, v0}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    .line 79
    sget-boolean v13, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v13, :cond_1

    goto/16 :goto_9

    :cond_1
    const-string v13, "\u073f\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4a41

    const v16, -0x377ef41d

    xor-int v14, v14, v16

    const v16, 0x76132d5a

    goto/16 :goto_a

    .line 182
    :sswitch_9
    :try_start_0
    new-instance v13, Ll/ᩳۢ᩷;

    iget-object v14, v1, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    invoke-direct {v13, v14, v1}, Ll/ᩳۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V

    .line 183
    iget-object v14, v1, Ll/ᩴܳ᩷;->ۢۧ:Ll/ۘܳ᩷;

    invoke-interface {v9, v13, v14}, Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;->onPreferenceScreenCreated(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/preference/PluginPreference$PreferenceScreen;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v13, "\u06dc\u06d6"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x4b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x725

    const v16, 0x39792b43

    xor-int v14, v14, v16

    const v16, -0x78fc0399

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    const-string v13, "\u06db\u06d9"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x5f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1271

    const v16, 0x1f1e38ca

    xor-int v14, v14, v16

    const v16, -0xafbc844

    goto/16 :goto_a

    :sswitch_a
    return-void

    .line 177
    :sswitch_b
    iget-object v13, v1, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-static {v13, v8}, Ll/᩺;->ۗ֫᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 180
    :sswitch_c
    iget-object v9, v1, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    iget-object v9, v9, Ll/ۛ᩻᩷;->ᩳ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

    if-eqz v9, :cond_2

    const-string v13, "\u06e2\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x76d5

    const v16, -0x1311e465

    xor-int v14, v14, v16

    const v16, 0x2cb50eb0

    goto/16 :goto_a

    :cond_2
    :goto_1
    const-string v13, "\u06e4\u1a75"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7803

    const v16, -0x13711bd8

    xor-int v14, v14, v16

    const v16, 0x14b7ffa9

    goto/16 :goto_a

    .line 174
    :sswitch_d
    invoke-virtual {v1, v7}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 176
    :sswitch_e
    iget-object v8, v1, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    iget-object v8, v8, Ll/ۛ᩻᩷;->ܳ:Ljava/lang/CharSequence;

    if-eqz v8, :cond_3

    const-string v13, "\u06ec\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3b03

    const v16, 0x20c7dcfc

    xor-int v14, v14, v16

    const v16, 0x6d1ad7ca

    goto/16 :goto_a

    :cond_3
    :goto_2
    const-string v13, "\u073d\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6e1f

    const v16, -0x31ee2335

    xor-int v14, v14, v16

    const v16, 0x5176a5db

    goto/16 :goto_a

    .line 172
    :sswitch_f
    invoke-direct/range {p0 .. p0}, Ll/ᩴܳ᩷;->᩺()V

    .line 173
    iget-object v7, v1, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    iget-object v7, v7, Ll/ۛ᩻᩷;->᩻:Ljava/lang/CharSequence;

    if-eqz v7, :cond_4

    const-string v13, "\u06d9\u1a7b"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x197

    const v16, -0x6ed7a87

    xor-int v14, v14, v16

    const v16, 0x757daf47

    goto/16 :goto_a

    :cond_4
    :goto_3
    const-string v13, "\u1a77\u06dc"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5b7f

    const v16, 0x30f77363

    xor-int v14, v14, v16

    const v16, 0x17569a52

    goto/16 :goto_a

    .line 171
    :sswitch_10
    iput-object v6, v1, Ll/ᩴܳ᩷;->ۜۧ:Ljava/util/ArrayList;

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v13

    if-eqz v13, :cond_5

    goto/16 :goto_9

    :cond_5
    const-string v13, "\u06e1\u06d6"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x485b

    const v16, 0x602ea43a

    xor-int v14, v14, v16

    const v16, 0x3a0b342b

    goto/16 :goto_a

    :sswitch_11
    invoke-virtual {v5}, Ll/ۛ᩻᩷;->֫()Ljava/util/ArrayList;

    move-result-object v6

    .line 403
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v13

    if-gtz v13, :cond_7

    :cond_6
    const-string v13, "\u1a73\u06da"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x55

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x23cf

    const v16, 0x29c4ce8c

    xor-int v14, v14, v16

    const v16, 0x2ba07af5

    goto/16 :goto_a

    :cond_7
    const-string v13, "\u06d8\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x79

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x35a9

    const v16, 0x6ee3df11

    xor-int v14, v14, v16

    const v16, 0x2a4500a4

    goto/16 :goto_a

    .line 170
    :sswitch_12
    invoke-interface {v3, v4, v15}, Lbin/mt/plugin/api/preference/PluginPreference;->onBuild(Lbin/mt/plugin/api/PluginContext;Lbin/mt/plugin/api/preference/PluginPreference$Builder;)V

    .line 171
    iget-object v5, v1, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    .line 51
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v13

    if-ltz v13, :cond_8

    goto :goto_4

    :cond_8
    const-string v13, "\u1a77\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x78db

    const v16, -0xf6ad52c

    xor-int v14, v14, v16

    const v16, -0x79601fbd

    goto/16 :goto_a

    .line 170
    :sswitch_13
    iget-object v4, v1, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    sget v13, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v13, :cond_9

    goto :goto_6

    :cond_9
    const-string v13, "\u06e8\u1a77"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6bf7

    const v16, -0x7cb5647d

    xor-int v14, v14, v16

    const v16, -0xa978711

    goto/16 :goto_a

    .line 169
    :sswitch_14
    iput-object v15, v1, Ll/ᩴܳ᩷;->ܿۧ:Ll/ۛ᩻᩷;

    .line 170
    iget-object v3, v1, Ll/ᩴܳ᩷;->᩷ۧ:Lbin/mt/plugin/api/preference/PluginPreference;

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v13

    if-ltz v13, :cond_a

    :goto_4
    const-string v13, "\u1a74\u06e4"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xef5

    const v16, -0x2b96d05f

    xor-int v14, v14, v16

    const v16, 0x75a920fe

    goto/16 :goto_a

    :cond_a
    const-string v13, "\u1a7a\u1a77"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x4d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x819

    const v16, 0x174a6537

    xor-int v14, v14, v16

    const v16, 0x1f003ae

    goto/16 :goto_a

    .line 169
    :sswitch_15
    new-instance v15, Ll/ۛ᩻᩷;

    sget v13, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v13, :cond_c

    :cond_b
    :goto_5
    const-string v13, "\u1a76\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1dcb

    const v15, 0x1424996b

    xor-int/2addr v14, v15

    const v15, 0x440df76d

    goto :goto_8

    .line 378
    :cond_c
    sget v13, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v13, :cond_d

    :goto_6
    const-string v13, "\u1a7b\u06e2"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x19

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xb57

    const v15, 0x332fd1a0

    xor-int/2addr v14, v15

    const v15, 0x2ddbe07c

    goto :goto_8

    .line 169
    :cond_d
    iget-object v13, v1, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    .line 266
    sget v14, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v14, :cond_f

    :cond_e
    :goto_7
    const-string v13, "\u1a73\u06d8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6b71

    const v15, -0x464e5b85

    xor-int/2addr v14, v15

    const v15, 0x3c1dabbe

    :goto_8
    xor-int/2addr v13, v15

    move-object v15, v2

    goto/16 :goto_0

    .line 169
    :cond_f
    invoke-direct {v15, v13}, Ll/ۛ᩻᩷;-><init>(Lbin/mt/plugin/api/PluginContext;)V

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v13

    if-ltz v13, :cond_11

    :cond_10
    :goto_9
    const-string v13, "\u1a79\u06dc"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3199

    const v16, 0x17d06cd2

    xor-int v14, v14, v16

    const v16, 0x9042a34

    goto :goto_a

    :cond_11
    const-string v13, "\u1a79\u06e4"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x5

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x40c7

    const v16, 0x1e1f4cf5

    xor-int v14, v14, v16

    const v16, -0x5e2a1a26

    :goto_a
    xor-int v13, v13, v16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x736b7040 -> :sswitch_10
        -0x64406019 -> :sswitch_4
        -0x5f3ebc50 -> :sswitch_11
        -0x515cb720 -> :sswitch_15
        -0x47a2e8c4 -> :sswitch_e
        -0x3f74717d -> :sswitch_12
        -0x3f31a8d0 -> :sswitch_6
        -0x3ec87b71 -> :sswitch_6
        -0x3ded6f18 -> :sswitch_b
        -0x372c72ff -> :sswitch_2
        -0x26e483fa -> :sswitch_7
        -0x15c3f3a9 -> :sswitch_b
        -0xd15217b -> :sswitch_a
        -0xbea11e7 -> :sswitch_8
        -0xa6f7e24 -> :sswitch_3
        -0xa41bc07 -> :sswitch_d
        -0x94397f4 -> :sswitch_1
        -0x8b417e3 -> :sswitch_4
        -0x4493061 -> :sswitch_0
        -0x1a6497c -> :sswitch_13
        0xa523dac -> :sswitch_e
        0xfe8eedd -> :sswitch_f
        0x142a3755 -> :sswitch_15
        0x1956d415 -> :sswitch_9
        0x278b9068 -> :sswitch_f
        0x29946df7 -> :sswitch_11
        0x35317f3a -> :sswitch_14
        0x35863468 -> :sswitch_13
        0x38c5359a -> :sswitch_14
        0x40491ced -> :sswitch_5
        0x409e4766 -> :sswitch_d
        0x4819ef7d -> :sswitch_8
        0x488d6007 -> :sswitch_c
        0x4c840a9a -> :sswitch_7
        0x4fa0d7ab -> :sswitch_3
        0x50bc83dc -> :sswitch_2
        0x63adf654 -> :sswitch_9
        0x649544ae -> :sswitch_c
        0x6c3b64d4 -> :sswitch_5
        0x6ea762e6 -> :sswitch_0
        0x6f416958 -> :sswitch_10
        0x70e65b7f -> :sswitch_12
        0x7629eac3 -> :sswitch_1
        0x7c78ba3e -> :sswitch_a
    .end sparse-switch
.end method

.method public static bridge synthetic ܳ(Ll/ᩴܳ᩷;)Ll/ۘܳ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ۢۧ:Ll/ۘܳ᩷;

    return-object p0
.end method

.method public static synthetic ܺ(Ll/ᩴܳ᩷;)Ll/ۢᩴ;
    .locals 0

    .line 47
    iget-object p0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴܳ᩷;)Lbin/mt/plugin/api/PluginContext;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩴܳ᩷;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ۜۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴܳ᩷;)Landroid/content/SharedPreferences;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->᩻ۧ:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static ᩷(Ll/ᩴܳ᩷;)V
    .locals 0

    .line 161
    invoke-direct {p0}, Ll/ᩴܳ᩷;->ۨ()V

    .line 162
    iget-object p0, p0, Ll/ᩴܳ᩷;->ᩳۧ:Ll/ܳܳ᩷;

    invoke-static {p0}, Ll/֨ᩴ;->۬ۖܺ(Ljava/lang/Object;)V

    return-void
.end method

.method private ᩺()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x4799be20

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v6, "\u06d8\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6945

    const v8, 0x731dfa1a

    xor-int/2addr v7, v8

    const v8, -0x47692f7f

    :goto_0
    xor-int/2addr v6, v8

    move-object v8, v0

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x1caf

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    return-void

    .line 75
    :sswitch_0
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_a

    goto/16 :goto_5

    .line 127
    :sswitch_1
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v6, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v6, :cond_2

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v6, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v6, :cond_5

    goto/16 :goto_5

    .line 19
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_5

    .line 70
    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 155
    :sswitch_5
    iget-object v6, p0, Ll/ᩴܳ᩷;->ܺۧ:Ljava/util/ArrayList;

    invoke-static {v6, v2}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_2

    .line 153
    :sswitch_6
    invoke-static {v1}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟᩻᩷;

    .line 154
    iget-boolean v6, v2, Ll/۟᩻᩷;->᩻:Z

    if-eqz v6, :cond_1

    const-string v6, "\u06d6\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x479f

    const v9, 0x3db398e2

    xor-int/2addr v7, v9

    const v9, 0x4e4d2e42    # 8.6059021E8f

    goto/16 :goto_7

    .line 153
    :sswitch_7
    invoke-static {v1}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "\u0736\u0733"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7233

    const v9, -0x90bdfe1

    xor-int/2addr v7, v9

    const v9, 0x2e0167e5

    goto/16 :goto_7

    :cond_0
    const-string v6, "\u06df\u1a75"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x76c1

    const v9, -0x5c1a1202

    xor-int/2addr v7, v9

    const v9, -0x717f7f6

    goto/16 :goto_7

    .line 152
    :sswitch_8
    iput-object v8, p0, Ll/ᩴܳ᩷;->ܺۧ:Ljava/util/ArrayList;

    .line 153
    iget-object v1, p0, Ll/ᩴܳ᩷;->ۜۧ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_2
    const-string v6, "\u06e8\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x39cb

    const v9, 0x72280f2

    xor-int/2addr v7, v9

    const v9, 0x202d3e69

    goto/16 :goto_7

    .line 152
    :sswitch_9
    new-instance v8, Ljava/util/ArrayList;

    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_3

    :cond_2
    const-string v6, "\u06d6\u06d9"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x386f

    const v8, -0x1fbd63f5

    xor-int/2addr v7, v8

    const v8, -0x1896ceb

    goto/16 :goto_0

    :cond_3
    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v6, :cond_6

    :cond_5
    :goto_3
    const-string v6, "\u06dc\u06e2"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5cdf

    const v8, 0x1fd27e61

    xor-int/2addr v7, v8

    const v8, -0x6d07fca3

    goto/16 :goto_0

    :cond_6
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_7

    goto :goto_6

    .line 20
    :cond_7
    sget v6, Ll/۠;->ܺܺܶ:I

    if-ltz v6, :cond_8

    goto :goto_6

    .line 82
    :cond_8
    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v6, :cond_9

    goto :goto_4

    .line 127
    :cond_9
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v6

    if-ltz v6, :cond_b

    :cond_a
    :goto_4
    const-string v6, "\u073d\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1da7

    const v8, -0x680cce67

    xor-int/2addr v7, v8

    const v8, -0x38e60003

    goto/16 :goto_0

    .line 154
    :cond_b
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_c

    goto :goto_5

    .line 38
    :cond_c
    sget v6, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v6, :cond_d

    :goto_5
    const-string v6, "\u073d\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6f3b

    const v8, -0x58257060

    xor-int/2addr v7, v8

    const v8, -0x701383ac

    goto/16 :goto_0

    .line 152
    :cond_d
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 112
    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_e

    :goto_6
    const-string v6, "\u06d7\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x32fd

    const v8, 0x60174979

    xor-int/2addr v7, v8

    const v8, 0x713b6a8a

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06d8\u1a77"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x76cf

    const v9, -0x299296fe

    xor-int/2addr v7, v9

    const v9, 0x2e037275

    :goto_7
    xor-int/2addr v6, v9

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e915c98 -> :sswitch_5
        -0x526a3c81 -> :sswitch_4
        -0x4f7e7f4d -> :sswitch_3
        -0x3abca719 -> :sswitch_4
        -0x2bd990d2 -> :sswitch_8
        -0x2052fa78 -> :sswitch_5
        -0x1bc79014 -> :sswitch_1
        -0xedd28a5 -> :sswitch_6
        -0xe98cbf4 -> :sswitch_7
        -0xce2a61a -> :sswitch_6
        0x7ad845f -> :sswitch_3
        0x1312a118 -> :sswitch_0
        0x15dbb315 -> :sswitch_9
        0x183a5329 -> :sswitch_1
        0x21551fd5 -> :sswitch_2
        0x2b6585f4 -> :sswitch_8
        0x4f4cbe4f -> :sswitch_7
        0x5342e803 -> :sswitch_0
        0x6d6929bc -> :sswitch_9
        0x79f17706 -> :sswitch_2
    .end sparse-switch
.end method

.method public static bridge synthetic ᩻(Ll/ᩴܳ᩷;)Ll/ۖۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ᩷;->ۡۧ:Ll/ۖۢۡ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 29

    move-object/from16 v1, p0

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

    const/16 v20, 0x0

    const v21, 0x4045996e

    sget v22, Ll/ۙۨ;->ۡۗۙ:I

    sget v23, Ll/᩺;->ۙۛܶ:I

    const-string v24, "\u1a7a\u1a76"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    xor-int v0, v24, v23

    mul-int/lit16 v0, v0, 0x56dd

    const v26, 0x4f100019

    xor-int v0, v0, v26

    const v26, -0xc50b27b

    xor-int v24, v24, v26

    move-object v6, v5

    move-object v10, v9

    move-object/from16 v20, v14

    move-object/from16 v13, v16

    move-object/from16 v15, v19

    move/from16 v25, v24

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const v24, 0x4045996e

    const/16 v26, 0x0

    move-object v5, v4

    move-object v9, v8

    move-object v4, v3

    move-object v8, v7

    const/4 v7, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v11, v24, v23

    mul-int/lit16 v11, v11, -0x7b43

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v0, v11

    xor-int v24, v25, v0

    sparse-switch v24, :sswitch_data_0

    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v20, v19

    move/from16 v19, v26

    const/16 v0, 0x6638

    const/16 v14, 0x6638

    goto/16 :goto_12

    .line 603
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    :goto_1
    move/from16 v25, v2

    move-object/from16 v27, v9

    goto/16 :goto_7

    :cond_1
    move/from16 v25, v2

    move-object/from16 v27, v9

    :goto_2
    move/from16 v2, v26

    goto/16 :goto_a

    .line 674
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    const-string v0, "\u06dc\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v11, v0, v23

    mul-int/lit16 v11, v11, 0x4d9f

    const v25, -0x3009fa8f

    xor-int v11, v11, v25

    const v25, 0x1ccf0e2

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v0, v19

    move/from16 v9, v21

    move/from16 v19, v26

    goto/16 :goto_13

    :cond_4
    const-string v0, "\u06e4\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x5441

    const v25, 0x6140782a

    xor-int v11, v11, v25

    const v25, -0x682f0a7f

    goto/16 :goto_5

    .line 752
    :sswitch_3
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_7

    goto :goto_1

    :sswitch_4
    sget v0, Ll/۟;->ۗۤۛ:I

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    :goto_3
    const-string v0, "\u1a73\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x6caf

    const v25, -0x78a4c17d

    xor-int v11, v11, v25

    const v25, 0x5ae07e35

    goto/16 :goto_5

    .line 803
    :sswitch_5
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_4

    .line 418
    :sswitch_6
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_3

    :cond_6
    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v20, v19

    move/from16 v19, v26

    goto/16 :goto_11

    :sswitch_7
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    .line 526
    :sswitch_8
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    :goto_4
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x5f

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x2ac5

    const v25, 0x1207cbc0

    xor-int v11, v11, v25

    const v25, -0x7a8faa2c

    goto :goto_5

    .line 103
    :sswitch_9
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    :sswitch_a
    return-void

    :sswitch_b
    const/16 v0, 0x17

    .line 879
    invoke-static {v15, v2, v0, v14}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0, v9}, Ll/ۤ᩻᩷;->log(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    invoke-virtual {v1, v9, v7}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Z)V

    return-void

    .line 879
    :sswitch_c
    invoke-virtual {v8}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ll/ۤ᩻᩷;

    sget-object v15, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v2, 0x57

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_8

    :cond_7
    const-string v0, "\u06e4\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v23

    mul-int/lit16 v11, v11, -0x74e7

    const v25, -0x19746bea

    xor-int v11, v11, v25

    const v25, 0x554e6148

    goto :goto_5

    :cond_8
    const-string v0, "\u1a76\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v23

    mul-int/lit16 v11, v11, -0xa61

    const v25, -0x4f292ac

    xor-int v11, v11, v25

    const v25, 0x656ceecd

    :goto_5
    xor-int v25, v0, v25

    move v0, v11

    goto/16 :goto_0

    .line 88
    :sswitch_d
    :try_start_0
    invoke-static/range {p0 .. p0}, Ll/ۘ᩶;->ܶۖۘ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v0

    sget-object v11, Ll/ᩴܳ᩷;->ۧ۠۟:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move/from16 v25, v2

    const/16 v2, 0x47

    move-object/from16 v27, v9

    const/16 v9, 0x10

    :try_start_1
    invoke-static {v11, v2, v9, v14}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ll/ܽܳ᩷;->ᩳ(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference;

    move-result-object v0

    .line 89
    invoke-virtual {v8}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v2

    iput-object v2, v1, Ll/ᩴܳ᩷;->ܳۧ:Lbin/mt/plugin/api/PluginContext;

    .line 90
    invoke-direct {v1, v8, v0}, Ll/ᩴܳ᩷;->֫(Ll/ܽܳ᩷;Lbin/mt/plugin/api/preference/PluginPreference;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "\u0730\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x475

    const v9, -0x47879cb0

    xor-int/2addr v2, v9

    const v9, -0x50de9d4a

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    move/from16 v25, v2

    :goto_6
    move-object v9, v0

    const-string v0, "\u073f\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, 0x5701

    const v11, -0x5015871e

    xor-int/2addr v2, v11

    const v11, -0x7d587bcc

    xor-int/2addr v0, v11

    goto/16 :goto_f

    .line 97
    :sswitch_e
    new-instance v0, Ll/ᩳܳ᩷;

    invoke-direct {v0, v1, v8}, Ll/ᩳܳ᩷;-><init>(Ll/ᩴܳ᩷;Ll/ܽܳ᩷;)V

    .line 126
    invoke-static {v0}, Ll/֨۟;->ۤۘܺ(Ljava/lang/Object;)V

    return-void

    :sswitch_f
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v2, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v9, 0x35

    const/16 v11, 0x12

    invoke-static {v2, v9, v11, v14}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v9

    if-ltz v9, :cond_9

    :goto_7
    const-string v0, "\u06dc\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, 0x7da5

    const v9, 0x19efe4a1

    xor-int/2addr v2, v9

    const v9, -0x551c8b5e

    goto/16 :goto_9

    :cond_9
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v6}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v7}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    :sswitch_10
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 86
    invoke-virtual {v8}, Ll/ܽܳ᩷;->᩸()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x1d

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, 0x5a5d

    const v9, 0x547ab35f

    xor-int/2addr v2, v9

    const v9, -0x6cb433c0

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06e0\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, -0x376d

    const v9, -0x2f0c51f0

    xor-int/2addr v2, v9

    const v9, 0x15dc145f

    goto/16 :goto_9

    :sswitch_11
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 79
    invoke-static {v6}, Ll/۬ܿ᩷;->ܽ(Ljava/lang/String;)Ll/ܽܳ᩷;

    move-result-object v0

    goto :goto_8

    :sswitch_12
    move/from16 v25, v2

    move-object/from16 v27, v9

    const/4 v7, 0x1

    if-nez v8, :cond_b

    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x1b

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x56b

    const v9, -0x2566a86e

    xor-int/2addr v2, v9

    const v9, -0x47fedb98

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06d9\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x25

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, 0x11f

    const v9, -0x5d2cfbab

    xor-int/2addr v2, v9

    const v9, -0x66c1201b

    goto/16 :goto_9

    :sswitch_13
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 78
    invoke-static {v6}, Ll/֫ܺ;->᩺ۜ۠(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "\u05a1\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, -0x679

    const v9, -0x3f0fc4e2

    xor-int/2addr v2, v9

    const v9, -0xbbbab4b

    goto/16 :goto_9

    :sswitch_14
    move/from16 v25, v2

    move-object/from16 v27, v9

    const/4 v0, 0x0

    :goto_8
    move-object v8, v0

    const-string v0, "\u06dc\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x79

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, 0x7d97

    const v9, -0x6738bb49

    xor-int/2addr v2, v9

    const v9, -0x6d87c402

    goto/16 :goto_9

    :sswitch_15
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 76
    sget-object v0, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v2, 0x2d

    const/16 v6, 0x8

    invoke-static {v0, v2, v6, v14}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/֫᩵;->ܶܰۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_c

    const-string v0, "\u073d\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x7e5f

    const v9, 0x534657ae

    xor-int/2addr v2, v9

    const v9, -0x5cebbb97

    goto :goto_9

    :cond_c
    const-string v0, "\u06da\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, 0x3cb3

    const v9, 0x4ed4ec5d

    xor-int/2addr v2, v9

    const v9, -0x3e0d7437

    goto :goto_9

    :sswitch_16
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 75
    new-instance v0, Ll/ܶ᩻ᩳ;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Ll/ܶ᩻ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v4, v0}, Ll/֫᩵;->֡ۛۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    invoke-static/range {p0 .. p0}, Ll/ۘ᩶;->ܶۖۘ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v5

    .line 386
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_d

    goto/16 :goto_2

    :cond_d
    const-string v0, "\u073a\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x3b

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, -0x765d

    const v9, -0x2570a0ef

    xor-int/2addr v2, v9

    const v9, -0x17cb0cb2

    goto :goto_9

    :sswitch_17
    move/from16 v25, v2

    move-object/from16 v27, v9

    .line 72
    iput-object v3, v1, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 73
    invoke-static {v1, v3}, Ll/֨۫;->֡֨ۖ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    invoke-static/range {p0 .. p0}, Ll/֡ܶ;->ۢۖܶ(Ljava/lang/Object;)V

    .line 75
    iget-object v4, v1, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 151
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v0

    if-gtz v0, :cond_e

    goto/16 :goto_c

    :cond_e
    const-string v0, "\u0730\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, 0x11ad

    const v9, -0x652b3ccc

    xor-int/2addr v2, v9

    const v9, 0x60f40b4c

    :goto_9
    xor-int/2addr v0, v9

    goto/16 :goto_e

    :sswitch_18
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v2, v26

    .line 71
    invoke-static {v13, v2, v12, v14}, Ll/֨ۤ;->᩻ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7e582fcd

    xor-int/2addr v0, v3

    .line 72
    invoke-static {v1, v0}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۢᩴ;

    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_f

    :goto_a
    const-string v0, "\u1a75\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v9, v0, v23

    mul-int/lit16 v9, v9, -0x52b5

    const v11, -0x3fcb5fec

    xor-int/2addr v9, v11

    const v11, 0x33de596b

    goto :goto_b

    :cond_f
    const-string v0, "\u1a74\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v9, v0, v22

    mul-int/lit16 v9, v9, -0x7235

    const v11, -0x53df667a

    xor-int/2addr v9, v11

    const v11, -0x17117c40

    :goto_b
    xor-int/2addr v0, v11

    move/from16 v26, v2

    move/from16 v2, v25

    move/from16 v25, v0

    move v0, v9

    move-object/from16 v9, v27

    goto/16 :goto_0

    :sswitch_19
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v9, v21

    .line 71
    invoke-static {v1, v9}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v13, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v26, 0x2a

    const/4 v12, 0x3

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_10

    move/from16 v21, v9

    :goto_c
    move/from16 v9, v19

    move-object/from16 v11, v20

    goto :goto_d

    :cond_10
    const-string v0, "\u06df\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, 0x5baf

    const v11, -0x6a9cf8dd

    xor-int/2addr v2, v11

    const v11, -0x38bae5ed

    xor-int/2addr v0, v11

    move/from16 v21, v9

    goto :goto_e

    :sswitch_1a
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v2, v26

    const/4 v0, 0x3

    move/from16 v9, v19

    move-object/from16 v11, v20

    .line 70
    invoke-static {v11, v9, v0, v14}, Ll/ۖ۫;->ᩴ۟ۚ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v19, 0x7e856e1c    # 8.867952E37f

    xor-int v21, v0, v19

    .line 839
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v0

    if-eqz v0, :cond_11

    move/from16 v26, v2

    :goto_d
    const-string v0, "\u1a73\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x1d

    xor-int v2, v0, v22

    mul-int/lit16 v2, v2, -0x51f7

    const v19, 0x15809c62

    xor-int v2, v2, v19

    const v19, -0xcb9632a

    xor-int v0, v0, v19

    move/from16 v19, v9

    move-object/from16 v20, v11

    goto :goto_e

    :cond_11
    const-string v0, "\u1a79\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x25

    move/from16 v19, v2

    xor-int v2, v0, v23

    mul-int/lit16 v2, v2, -0x3e41

    const v20, 0x40fe838b

    xor-int v2, v2, v20

    const v20, 0x41991335

    xor-int v0, v0, v20

    move-object/from16 v20, v11

    move/from16 v26, v19

    move/from16 v19, v9

    :goto_e
    move-object/from16 v9, v27

    :goto_f
    move/from16 v28, v25

    move/from16 v25, v0

    move v0, v2

    goto :goto_10

    :sswitch_1b
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v9, v21

    move/from16 v19, v26

    const v0, 0x7d6a4094

    xor-int v0, v18, v0

    .line 70
    invoke-static {v1, v0}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v20, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v0, 0x27

    .line 99
    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-eqz v2, :cond_12

    goto/16 :goto_13

    :cond_12
    const-string v2, "\u06e2\u06d9"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, -0x49

    xor-int v11, v2, v23

    mul-int/lit16 v11, v11, 0x192f

    const v21, -0x4b788c57

    xor-int v11, v11, v21

    const v21, 0x2077f246

    xor-int v2, v2, v21

    move/from16 v21, v9

    move v0, v11

    move/from16 v26, v19

    move-object/from16 v9, v27

    const/16 v19, 0x27

    move/from16 v28, v25

    move/from16 v25, v2

    :goto_10
    move/from16 v2, v28

    goto/16 :goto_0

    :sswitch_1c
    move/from16 v25, v2

    move-object/from16 v27, v9

    move/from16 v2, v19

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v19, v26

    .line 69
    invoke-super/range {p0 .. p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v1, 0x24

    move/from16 v20, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v14}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_13

    :goto_11
    const-string v0, "\u1a77\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x5d3f

    const v2, -0x392c09e6

    xor-int/2addr v1, v2

    const v2, 0x3cf33103

    goto/16 :goto_14

    :cond_13
    const-string v0, "\u06df\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x62e1

    const v2, -0x309aad06

    xor-int/2addr v1, v2

    const v2, -0x74cef860

    goto/16 :goto_14

    :sswitch_1d
    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v20, v19

    move/from16 v19, v26

    const/16 v0, 0x698f

    const/16 v14, 0x698f

    :goto_12
    const-string v0, "\u06e2\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x118f

    const v2, 0x42dccb7b

    xor-int/2addr v1, v2

    const v2, -0x3e83bbda

    goto/16 :goto_14

    :sswitch_1e
    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v20, v19

    move/from16 v19, v26

    mul-int v0, v16, v17

    mul-int v1, v16, v16

    const v2, 0xb3e92f1

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    if-gez v1, :cond_14

    const-string v0, "\u1a7a\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0xce3

    const v2, 0x31d981d8

    xor-int/2addr v1, v2

    const v2, -0x19a59daf

    goto :goto_14

    :cond_14
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x61

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x6d21

    const v2, 0x3d02d74a

    xor-int/2addr v1, v2

    const v2, 0x6a1bc4ea

    goto :goto_14

    :sswitch_1f
    move/from16 v25, v2

    move-object/from16 v27, v9

    move-object/from16 v11, v20

    move/from16 v9, v21

    move/from16 v20, v19

    move/from16 v19, v26

    sget-object v0, Ll/ᩴܳ᩷;->ۧ۠۟:[S

    const/16 v1, 0x23

    aget-short v16, v0, v1

    const/16 v17, 0x6b4e

    .line 873
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_15

    move/from16 v0, v20

    move-object/from16 v20, v11

    :goto_13
    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, 0x7965

    const v11, 0x3e72cd7a

    xor-int/2addr v2, v11

    const v11, -0x333448da

    xor-int/2addr v1, v11

    move/from16 v21, v9

    move/from16 v26, v19

    move-object/from16 v9, v27

    move/from16 v19, v0

    move v0, v2

    move/from16 v2, v25

    move/from16 v25, v1

    goto :goto_15

    :cond_15
    const-string v0, "\u06d8\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x330b

    const v2, 0x10855d1a

    xor-int/2addr v1, v2

    const v2, 0x43f87ef

    :goto_14
    xor-int/2addr v0, v2

    move/from16 v21, v9

    move/from16 v26, v19

    move/from16 v19, v20

    move/from16 v2, v25

    move-object/from16 v9, v27

    move/from16 v25, v0

    move v0, v1

    move-object/from16 v20, v11

    :goto_15
    move-object/from16 v1, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73a78e7d -> :sswitch_6
        -0x6f513650 -> :sswitch_7
        -0x69085ad8 -> :sswitch_13
        -0x653d7e1c -> :sswitch_a
        -0x626d3212 -> :sswitch_14
        -0x5dccd0e4 -> :sswitch_3
        -0x5da7b366 -> :sswitch_12
        -0x5be34278 -> :sswitch_c
        -0x58b0fc59 -> :sswitch_13
        -0x5140201c -> :sswitch_b
        -0x4ea1f950 -> :sswitch_10
        -0x4604b7f3 -> :sswitch_2
        -0x4125819d -> :sswitch_19
        -0x3758697a -> :sswitch_5
        -0x3574300c -> :sswitch_0
        -0x2d00c0e1 -> :sswitch_11
        -0x2b242a29 -> :sswitch_1a
        -0x2ae82387 -> :sswitch_1f
        -0x26dfcfa3 -> :sswitch_19
        -0x25545982 -> :sswitch_11
        -0x22f1345e -> :sswitch_17
        -0x1f2dfc5d -> :sswitch_1f
        -0x1bd84cd8 -> :sswitch_6
        -0x1af0890e -> :sswitch_a
        -0x1a37afa2 -> :sswitch_18
        -0x18388ac2 -> :sswitch_1c
        -0x1706da39 -> :sswitch_f
        -0xd5939ae -> :sswitch_18
        -0xce54e72 -> :sswitch_1c
        -0xbeea99e -> :sswitch_14
        -0x9b4c8ab -> :sswitch_3
        -0x6d7a9db -> :sswitch_7
        -0x5b2e36d -> :sswitch_15
        0x1c173c7 -> :sswitch_d
        0xa82455a -> :sswitch_1b
        0xc2403ce -> :sswitch_f
        0x1566bcbd -> :sswitch_1
        0x15f4f3f8 -> :sswitch_15
        0x17ac13c6 -> :sswitch_0
        0x1b0acd04 -> :sswitch_9
        0x1b174d35 -> :sswitch_c
        0x1f13093e -> :sswitch_1b
        0x22848223 -> :sswitch_1e
        0x22b7c1ea -> :sswitch_8
        0x23fd5575 -> :sswitch_12
        0x26d31986 -> :sswitch_8
        0x317c3b1c -> :sswitch_1d
        0x3223c8f7 -> :sswitch_16
        0x33671697 -> :sswitch_e
        0x34137d2e -> :sswitch_1
        0x39344436 -> :sswitch_e
        0x3c2dd37d -> :sswitch_4
        0x43d47ec9 -> :sswitch_b
        0x45dbfe52 -> :sswitch_17
        0x464f303e -> :sswitch_16
        0x50cc5fc5 -> :sswitch_10
        0x5797e390 -> :sswitch_1a
        0x5e538b3d -> :sswitch_1d
        0x6246e808 -> :sswitch_2
        0x6f0036be -> :sswitch_5
        0x6f6b5f3c -> :sswitch_1e
        0x73f56353 -> :sswitch_4
        0x7664384e -> :sswitch_d
        0x7aeacd1c -> :sswitch_9
    .end sparse-switch
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
