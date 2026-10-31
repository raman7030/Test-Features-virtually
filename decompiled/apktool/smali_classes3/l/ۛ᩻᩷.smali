.class public final Ll/ۛ᩻᩷;
.super Ljava/lang/Object;
.source "N3YD"

# interfaces
.implements Lbin/mt/plugin/api/preference/PluginPreference$Builder;


# static fields
.field public static final ۜ:Ljava/lang/Class;

.field private static final ۜ֨ᩳ:[S


# instance fields
.field public ֫:Lbin/mt/plugin/api/PluginContext;

.field public ۧ:Ljava/util/ArrayList;

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:Lbin/mt/plugin/api/LocalString;

.field public ܿ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

.field public ᩳ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

.field public ᩻:Ljava/lang/CharSequence;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x53

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    const/4 v0, 0x0

    const v1, 0x7bf9f134

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x383

    const v6, -0x1ac0e49f

    xor-int/2addr v5, v6

    const v6, -0x4b101927

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x1a79

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 15
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    goto/16 :goto_5

    .line 13
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_9

    goto/16 :goto_5

    :sswitch_1
    return-void

    .line 18
    :sswitch_2
    :try_start_0
    const-class v4, Ll/ᩴܳ᩷;

    sget v5, Ll/ᩴܳ᩷;->ۖۧ:I

    sput-object v4, Ll/ۛ᩻᩷;->ۜ:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "\u06df\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa5b

    const v6, -0x3039e258

    xor-int/2addr v5, v6

    const v6, -0x5cc322b7

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v4, "\u06d9\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x8e5

    const v6, -0x55331f6d

    xor-int/2addr v5, v6

    const v6, -0x70c8f484

    goto :goto_0

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v4, :cond_5

    goto/16 :goto_5

    .line 20
    :sswitch_5
    new-instance v4, Ljava/lang/RuntimeException;

    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_0

    goto :goto_1

    .line 13
    :cond_0
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_1

    goto :goto_3

    .line 10
    :cond_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 4
    :cond_2
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_3

    goto :goto_2

    :cond_3
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u06da\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5fa3

    const v6, -0x53f84bdf

    xor-int/2addr v5, v6

    const v6, -0x7c908c4e

    goto/16 :goto_0

    .line 7
    :cond_6
    sget-boolean v5, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06e7\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ca3

    const v6, 0x53a8f873

    xor-int/2addr v5, v6

    const v6, -0x41d318ca

    goto/16 :goto_0

    :cond_a
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_b

    :goto_3
    const-string v4, "\u1a73\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5425

    const v6, 0x1f628a2d

    xor-int/2addr v5, v6

    const v6, 0x5a57b315

    goto/16 :goto_0

    .line 20
    :cond_b
    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 16
    :sswitch_6
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v4, :cond_c

    goto :goto_5

    :cond_c
    :goto_4
    const-string v4, "\u06e2\u1a74"

    .line 7
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x15c3

    const v6, -0x4a9b5050

    xor-int/2addr v5, v6

    const v6, 0x8fb04b

    goto/16 :goto_0

    :goto_5
    const-string v4, "\u1a73\u05a1"

    .line 16
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1739

    const v6, 0x1d0cc41b

    xor-int/2addr v5, v6

    const v6, -0x479c6570

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6656e034 -> :sswitch_6
        -0x619619e3 -> :sswitch_5
        -0x61461a32 -> :sswitch_6
        -0x29e077b1 -> :sswitch_4
        -0x280abdc5 -> :sswitch_5
        -0x1a78e321 -> :sswitch_4
        0x65946ae -> :sswitch_3
        0x8f5828f -> :sswitch_2
        0x2437a302 -> :sswitch_3
        0x268a42c6 -> :sswitch_1
        0x41c2552c -> :sswitch_1
        0x4ae608f8 -> :sswitch_0
        0x4ed3fb79 -> :sswitch_2
        0x65f6aa99 -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x108s
        -0x3698s
        -0x36a1s
        -0x36aes
        -0x36b5s
        -0x36a5s
        -0x36e2s
        -0x36afs
        -0x36a8s
        -0x36e2s
        -0x36e2s
        -0x36a3s
        -0x36a1s
        -0x36b0s
        -0x36e2s
        -0x36b0s
        -0x36afs
        -0x36b6s
        -0x36e2s
        -0x36a4s
        -0x36a5s
        -0x36e2s
        -0x36b0s
        -0x36b5s
        -0x36aes
        -0x36aes
        0xfc8s
        -0x51efs
        -0x51f4s
        -0x51efs
        -0x51f7s
        -0x5200s
        0x877s
        -0x4320s
        -0x4303s
        -0x4320s
        -0x4308s
        -0x430fs
        -0x4301s
        -0x430fs
        -0x4313s
        0x4d1s
        0x4656s
        0x464bs
        0x4656s
        0x464es
        0x4647s
        0x4649s
        0x4647s
        0x465bs
        0x1f4s
        -0x72c6s
        -0x72d9s
        -0x72c6s
        -0x72des
        -0x72d5s
        -0x72dbs
        -0x72d5s
        -0x72c9s
        0x967s
        -0x1fa6s
        -0x1fb9s
        -0x1fa6s
        -0x1fbes
        -0x1fb5s
        -0x1fbbs
        -0x1fb5s
        -0x1fa9s
        0x19efs
        0x3c05s
        0x3c18s
        0x3c05s
        0x3c1ds
        0x3c14s
        0x25bbs
        0x599s
        0x584s
        0x599s
        0x581s
        0x588s
        0x586s
        0x588s
        0x594s
    .end array-data
.end method

.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x66a1fda2

    sget v2, Ll/᩺;->ۙۛܶ:I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u073d\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2e8d

    const v6, 0x79743180

    xor-int/2addr v5, v6

    const v6, 0x118be58

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x20f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_2

    .line 13
    :sswitch_0
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_b

    goto/16 :goto_4

    .line 33
    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v4, :cond_6

    goto :goto_1

    :sswitch_2
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v4, :cond_8

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    :goto_1
    const-string v4, "\u1a76\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x76fd

    const v6, -0x7f23803

    xor-int/2addr v5, v6

    const v6, 0x55623693

    goto :goto_0

    .line 17
    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 25
    :sswitch_5
    iput-object v0, p0, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    .line 34
    iput-object p1, p0, Ll/ۛ᩻᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    return-void

    .line 32
    :sswitch_6
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u0730\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ab5

    const v6, -0x7e6bc159

    xor-int/2addr v5, v6

    const v6, -0x32f8a0b4

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x623f

    const v6, 0x7dd60223

    xor-int/2addr v5, v6

    const v6, 0x6af4fbcb

    goto/16 :goto_0

    .line 19
    :sswitch_8
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xc27

    const v6, -0xb092cfa

    xor-int/2addr v5, v6

    const v6, 0x36aa499d

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u0736\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2d25

    const v6, -0x22a6cc80

    xor-int/2addr v5, v6

    const v6, 0x7fec8fba

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    const-string v4, "\u06df\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6811

    const v6, 0x79a34f99

    xor-int/2addr v5, v6

    const v6, 0x7a9ef6d7

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u06d7\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x545f

    const v6, 0xcdcecb8

    xor-int/2addr v5, v6

    const v6, 0x59ed78d6

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073f\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6f71

    const v6, -0xd3ac3d3

    xor-int/2addr v5, v6

    const v6, -0x6e90557b

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u1a75\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1bf5

    const v6, 0xe8b5128

    xor-int/2addr v5, v6

    const v6, 0x506692eb

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x568f

    const v6, 0xeb3b252

    xor-int/2addr v5, v6

    const v6, 0x6f29f204

    goto/16 :goto_0

    .line 13
    :sswitch_c
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_9

    :cond_8
    :goto_4
    const-string v4, "\u06da\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1097

    const v6, 0x43beaab4

    xor-int/2addr v5, v6

    const v6, -0x2c0a1530

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u05ab\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7871

    const v6, 0x455f8805

    xor-int/2addr v5, v6

    const v6, 0x1458176

    goto/16 :goto_0

    .line 17
    :sswitch_d
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u05ab\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4dbf

    const v6, -0x361fdbea

    xor-int/2addr v5, v6

    const v6, -0x38bf7b63

    goto/16 :goto_0

    .line 25
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4569

    const v6, -0x276e0713

    xor-int/2addr v5, v6

    const v6, -0x5a991632

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x688b

    const v6, -0x78241bed

    xor-int/2addr v5, v6

    const v6, 0x1f6c9c97

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cc73633 -> :sswitch_0
        -0x78cc83cb -> :sswitch_6
        -0x6d5769a1 -> :sswitch_5
        -0x5071851d -> :sswitch_d
        -0x4f9b63d2 -> :sswitch_d
        -0x4dc20367 -> :sswitch_3
        -0x4722dd10 -> :sswitch_2
        -0x3a03695f -> :sswitch_6
        -0x362a618d -> :sswitch_a
        -0x305c81a4 -> :sswitch_7
        -0x2a696339 -> :sswitch_9
        -0x1aacc9e9 -> :sswitch_0
        -0x19e9c88c -> :sswitch_3
        -0x181e7657 -> :sswitch_e
        -0x14cb814d -> :sswitch_8
        -0x11ac441f -> :sswitch_8
        -0xd5ccb0e -> :sswitch_c
        -0x5f23bf -> :sswitch_4
        0xa6eb86d -> :sswitch_1
        0x15cef590 -> :sswitch_5
        0x1b26b300 -> :sswitch_b
        0x1f37e62f -> :sswitch_4
        0x24f83e08 -> :sswitch_b
        0x2bf449c0 -> :sswitch_1
        0x41d1277d -> :sswitch_9
        0x46ca6183 -> :sswitch_a
        0x505393b0 -> :sswitch_e
        0x6586daaa -> :sswitch_2
        0x6802ac30 -> :sswitch_7
        0x7d7f3058 -> :sswitch_c
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/String;)V
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

    const v9, -0xc222618

    sget v10, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v11, Ll/֡۬;->۠֡᩶:I

    const-string v12, "\u05a1\u1a76"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x69

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x23c5

    const v14, 0x66100802

    xor-int/2addr v13, v14

    const v14, -0x5db3df98

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x436f

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    .line 81
    sget v12, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v12, :cond_1

    :cond_0
    :goto_2
    move-object/from16 v14, p1

    move/from16 v16, v9

    goto/16 :goto_7

    :cond_1
    :goto_3
    move-object/from16 v14, p1

    move/from16 v16, v9

    goto/16 :goto_9

    .line 62
    :sswitch_0
    sget v12, Ll/۟;->ۗۤۛ:I

    if-nez v12, :cond_3

    goto :goto_2

    .line 5
    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget-boolean v12, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v12, :cond_0

    :goto_4
    move-object/from16 v14, p1

    move/from16 v16, v9

    goto/16 :goto_8

    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto :goto_4

    .line 43
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    :sswitch_4
    return-void

    .line 132
    :sswitch_5
    new-instance v12, Ljava/lang/NullPointerException;

    sget-object v13, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    const/4 v14, 0x1

    sget-boolean v15, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v15, :cond_2

    goto :goto_5

    :cond_2
    const/16 v15, 0x9

    sget v16, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v16, :cond_4

    :cond_3
    :goto_5
    const-string v12, "\u1a75\u073a"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0xf

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x3007

    const v14, 0x43f1726e

    xor-int/2addr v13, v14

    const v14, -0x792d5f63

    goto :goto_0

    :cond_4
    invoke-static {v13, v14, v15, v8}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 36
    sget v15, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v15, :cond_5

    goto :goto_3

    :cond_5
    const/16 v15, 0xa

    move/from16 v16, v9

    const/16 v9, 0x10

    .line 132
    invoke-static {v14, v15, v9, v8}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v9

    sget-boolean v14, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v14, :cond_6

    move-object/from16 v14, p1

    goto/16 :goto_7

    :cond_6
    move-object/from16 v14, p1

    .line 0
    invoke-static {v13, v14, v9}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 132
    invoke-direct {v12, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_6
    move-object/from16 v14, p1

    move/from16 v16, v9

    if-eqz p0, :cond_7

    const-string v9, "\u05a8\u0736"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, 0x62c5

    const v13, -0x7ff75880

    xor-int/2addr v13, v12

    const v12, -0x3b6cf544

    goto/16 :goto_a

    :cond_7
    const-string v9, "\u0736\u06e2"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x1eb7

    const v13, -0x5067305c

    xor-int/2addr v13, v12

    const v12, -0x529c2c25

    goto/16 :goto_a

    :sswitch_7
    move-object/from16 v14, p1

    move/from16 v16, v9

    const v8, 0xe86a

    goto :goto_6

    :sswitch_8
    move-object/from16 v14, p1

    move/from16 v16, v9

    const v8, 0xc93e

    :goto_6
    const-string v9, "\u06e1\u0736"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v11

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, -0xa7

    const v13, -0x77d5ec84

    xor-int/2addr v13, v12

    const v12, -0x15dc204b

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v14, p1

    move/from16 v16, v9

    add-int v9, v6, v7

    add-int/2addr v9, v9

    sub-int v9, v5, v9

    if-gtz v9, :cond_8

    const-string v9, "\u1a7b\u1a74"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v11

    mul-int/lit8 v9, v9, 0xb

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, -0x4f2b

    const v13, -0x4b573420

    xor-int/2addr v13, v12

    const v12, -0xbc52083

    goto/16 :goto_a

    :cond_8
    const-string v9, "\u05ab\u1a7b"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    mul-int/lit8 v9, v9, 0x51

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x55ab

    const v13, 0x7d1b1b7d

    xor-int/2addr v13, v12

    const v12, -0x66578a58

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v14, p1

    move/from16 v16, v9

    mul-int v5, v4, v4

    mul-int v6, v2, v2

    const v7, 0x36ddf41

    .line 5
    sget-boolean v9, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v9, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v9, "\u06e8\u073d"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v11

    mul-int/lit8 v9, v9, -0x6b

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, -0x28b1

    const v13, 0x271c64a9

    xor-int/2addr v13, v12

    const v12, 0x2d4ed6bd

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v14, p1

    move/from16 v16, v9

    add-int v4, v2, v3

    .line 130
    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v9, :cond_a

    const-string v9, "\u06d6\u1a7a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v11

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, 0x5b7d

    const v13, -0x50183004

    xor-int/2addr v13, v12

    const v12, 0x5119f887

    goto/16 :goto_a

    :cond_a
    const-string v9, "\u06d9\u0736"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x70f

    const v13, -0x2a63129c

    xor-int/2addr v13, v12

    const v12, -0xdc2f0ca

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v14, p1

    move/from16 v16, v9

    aget-short v2, v0, v1

    const/16 v3, 0x1da1

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_8

    :cond_b
    const-string v9, "\u06eb\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, 0x4b31

    const v13, -0x62c43bf

    xor-int/2addr v13, v12

    const v12, 0x117b9df8

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v14, p1

    move/from16 v16, v9

    const/4 v1, 0x0

    .line 50
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v9

    if-gtz v9, :cond_c

    :goto_7
    const-string v9, "\u05a8\u06ec"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    mul-int/lit8 v9, v9, 0x6d

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x5ebd

    const v13, 0x3088810    # 4.0123E-37f

    xor-int/2addr v13, v12

    const v12, 0x2dab494d

    goto/16 :goto_a

    :cond_c
    const-string v9, "\u05a8\u06e4"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v11

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, -0x599f

    const v13, -0x289c6507

    xor-int/2addr v13, v12

    const v12, -0x43039602

    goto :goto_a

    :sswitch_e
    move-object/from16 v14, p1

    move/from16 v16, v9

    sget-object v0, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    sget v9, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v9, :cond_d

    :goto_8
    const-string v9, "\u05a8\u06da"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v11

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, 0x6597

    const v13, 0x3067dacb

    xor-int/2addr v13, v12

    const v12, 0x457a1e19

    goto :goto_a

    :cond_d
    const-string v9, "\u06eb\u073a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v11

    xor-int v12, v9, v10

    mul-int/lit16 v12, v12, 0x13d3

    const v13, -0x4fd24fb2

    xor-int/2addr v13, v12

    const v12, -0x2b63cd42

    goto :goto_a

    :sswitch_f
    move-object/from16 v14, p1

    move/from16 v16, v9

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v9

    if-eqz v9, :cond_e

    :goto_9
    const-string v9, "\u06db\u1a74"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x1db

    const v13, -0xfe10ddd

    xor-int/2addr v13, v12

    const v12, 0x2896bc7c

    goto :goto_a

    :cond_e
    const-string v9, "\u1a76\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v10

    xor-int v12, v9, v11

    mul-int/lit16 v12, v12, -0x14af

    const v13, -0x66b22b1e

    xor-int/2addr v13, v12

    const v12, -0x2e229dd4

    :goto_a
    xor-int/2addr v12, v9

    move/from16 v9, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c21abbf -> :sswitch_5
        -0x70dab66e -> :sswitch_9
        -0x60af16a7 -> :sswitch_4
        -0x5be8633d -> :sswitch_c
        -0x47ff554d -> :sswitch_9
        -0x38efd914 -> :sswitch_f
        -0x34806079 -> :sswitch_2
        -0x338853f0 -> :sswitch_d
        -0x2f562f2a -> :sswitch_5
        -0x25395caa -> :sswitch_0
        -0x237f4a43 -> :sswitch_a
        -0x1985695d -> :sswitch_8
        -0x15d1223c -> :sswitch_4
        -0xf384bf5 -> :sswitch_8
        -0xd37bf3f -> :sswitch_6
        -0x8225571 -> :sswitch_6
        -0x9cb299 -> :sswitch_e
        0x62b3373 -> :sswitch_0
        0xcd4389b -> :sswitch_1
        0x20ac8800 -> :sswitch_7
        0x257ae128 -> :sswitch_b
        0x3a7ac8b6 -> :sswitch_2
        0x3fc621ba -> :sswitch_b
        0x42fde1d6 -> :sswitch_d
        0x490ba8ef -> :sswitch_e
        0x53ab2c0e -> :sswitch_7
        0x550b04d1 -> :sswitch_c
        0x583548d2 -> :sswitch_3
        0x5d91eb2a -> :sswitch_3
        0x65633872 -> :sswitch_f
        0x70da6085 -> :sswitch_1
        0x7908c233 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final addHeader(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 19

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

    const v12, 0x4e4984a0    # 8.4522803E8f

    sget v13, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v14, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v15, "\u06d9\u06dc"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, 0x7195

    const v17, 0x2ec88a75

    xor-int v1, v1, v17

    const v17, -0x4e59d556

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v10, v9

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x4e4984a0    # 8.4522803E8f

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x53d9

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v16, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v1, p0

    move/from16 v16, v15

    const v8, 0x9b5e

    .line 3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v0

    if-ltz v0, :cond_8

    goto/16 :goto_6

    .line 36
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-nez v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_3

    :cond_1
    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v1, :cond_0

    goto :goto_1

    .line 12
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_2

    move-object/from16 v1, p0

    move/from16 v16, v15

    goto/16 :goto_6

    :cond_2
    :goto_1
    const-string v1, "\u0733\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    move/from16 v16, v15

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x3827

    const v17, 0x351a4369

    xor-int v15, v15, v17

    const v17, 0x2ce09275

    xor-int v1, v1, v17

    move/from16 v18, v16

    move/from16 v16, v1

    move v1, v15

    goto :goto_2

    :sswitch_3
    move/from16 v16, v15

    .line 49
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-object/from16 v1, p0

    goto/16 :goto_6

    .line 18
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 56
    iget-object v0, v1, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :sswitch_6
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 13
    invoke-static {v10, v11, v12, v9}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v15

    .line 14
    invoke-static {v0, v15}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iput-object v0, v2, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 2
    sget v15, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v15, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v15, "\u06dc\u1a75"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x79

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x2135

    const v17, 0x738fe833

    xor-int v0, v0, v17

    const v17, -0x68f63f17

    xor-int v15, v15, v17

    move v1, v0

    move-object/from16 v0, p1

    move/from16 v18, v16

    move/from16 v16, v15

    :goto_2
    move/from16 v15, v18

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v11, 0x1b

    const/4 v12, 0x5

    .line 35
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "\u1a7b\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x6bbd

    const v17, -0xed973d2

    xor-int v15, v15, v17

    const v17, 0x4eafe1dc    # 1.47540736E9f

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 13
    sget-object v10, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 10
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u05a8\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1e89

    const v17, -0x6cde5194

    xor-int v15, v15, v17

    const v17, -0x8f5e43

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 55
    new-instance v2, Ll/ۨ᩻᩷;

    .line 13
    invoke-direct {v2}, Ll/۟᩻᩷;-><init>()V

    .line 30
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_6

    :goto_3
    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x214f

    const v17, -0x1fe8c1c0

    xor-int v15, v15, v17

    const v17, -0x43e615c3

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u06da\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x5c49

    const v17, 0x7975c350

    xor-int v15, v15, v17

    const v17, -0x57e4a7bb

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v0, 0x71a2

    const/16 v9, 0x71a2

    goto :goto_4

    :sswitch_b
    move-object/from16 v1, p0

    move/from16 v16, v15

    const v0, 0xae65

    const v9, 0xae65

    :goto_4
    const-string v0, "\u1a75\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x45

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x7975

    const v17, -0x3b7f3019

    xor-int v15, v15, v17

    const v17, 0x2bee8c02

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v1, p0

    move/from16 v16, v15

    mul-int v0, v5, v8

    sub-int/2addr v0, v7

    if-gtz v0, :cond_7

    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0xcff

    const v17, 0x657150b0

    xor-int v15, v15, v17

    const v17, -0x30bd774a

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u06db\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x37e1

    const v17, 0x77c12edb

    xor-int v15, v15, v17

    const v17, 0x1937ca2d

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u0733\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x3eef

    const v17, 0x6fa370e4

    xor-int v15, v15, v17

    const v17, -0x4b93da1c

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v1, p0

    move/from16 v16, v15

    const v0, 0x1792bda1

    add-int v7, v6, v0

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_9

    goto :goto_5

    :cond_9
    const-string v0, "\u06dc\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x73

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x586b

    const v17, -0x5eddddb6

    xor-int v15, v15, v17

    const v17, 0x553d8e9a

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v1, p0

    move/from16 v16, v15

    aget-short v5, v3, v4

    mul-int v6, v5, v5

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_a

    :goto_5
    const-string v0, "\u1a7a\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x65cb

    const v17, -0x122e07f2

    xor-int v15, v15, v17

    const v17, -0x5fe44d16

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06eb\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x70bf

    const v17, -0x72443545

    xor-int v15, v15, v17

    const v17, -0x71c9cce1

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v1, p0

    move/from16 v16, v15

    const/16 v4, 0x1a

    .line 36
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    const-string v0, "\u073d\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x6c81

    const v17, 0x33623777

    xor-int v15, v15, v17

    const v17, -0x20b07059

    goto :goto_8

    :sswitch_10
    move-object/from16 v1, p0

    move/from16 v16, v15

    sget-object v3, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 46
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-gtz v0, :cond_c

    :goto_6
    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x4d25

    const v17, 0x5cf115a

    xor-int v15, v15, v17

    const v17, 0x5a62f743

    goto :goto_8

    :cond_c
    const-string v0, "\u06d9\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x4b85

    const v17, -0x145a4e06

    xor-int v15, v15, v17

    const v17, -0x6bda4abd

    goto :goto_8

    :sswitch_11
    move-object/from16 v1, p0

    move/from16 v16, v15

    .line 37
    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_d

    :goto_7
    const-string v0, "\u06e0\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x6f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x3159

    const v17, -0x31a7d51a

    xor-int v15, v15, v17

    const v17, 0xc9921a7

    goto :goto_8

    :cond_d
    const-string v0, "\u06d8\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1bad

    const v17, -0x23156c99

    xor-int v15, v15, v17

    const v17, 0x64a1294b

    :goto_8
    xor-int v0, v0, v17

    move v1, v15

    move/from16 v15, v16

    move/from16 v16, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76ffb1da -> :sswitch_10
        -0x75f88d10 -> :sswitch_d
        -0x74a0b5cf -> :sswitch_1
        -0x58bb43da -> :sswitch_3
        -0x5109e55f -> :sswitch_f
        -0x393d0a58 -> :sswitch_5
        -0x3227a1db -> :sswitch_7
        -0x314dcbc5 -> :sswitch_11
        -0x27313630 -> :sswitch_9
        -0x21474e3c -> :sswitch_10
        -0x1d8207c4 -> :sswitch_5
        -0xb6967e7 -> :sswitch_a
        0x229d185 -> :sswitch_4
        0xe739de0 -> :sswitch_c
        0x12d19ec5 -> :sswitch_7
        0x162a1cad -> :sswitch_2
        0x1f81a637 -> :sswitch_f
        0x23bf7ecc -> :sswitch_8
        0x2ada7a28 -> :sswitch_0
        0x2afe8091 -> :sswitch_2
        0x3a0239dd -> :sswitch_11
        0x3de9f4f6 -> :sswitch_b
        0x3fc81415 -> :sswitch_c
        0x44e6a6bf -> :sswitch_b
        0x4db900a8 -> :sswitch_0
        0x4e379ca2 -> :sswitch_6
        0x5336b45e -> :sswitch_e
        0x54eba0b4 -> :sswitch_e
        0x55d6ce9a -> :sswitch_3
        0x58c8fdf5 -> :sswitch_9
        0x59b9d744 -> :sswitch_6
        0x5c40f8a2 -> :sswitch_a
        0x63974a1f -> :sswitch_d
        0x74b8d580 -> :sswitch_4
        0x7864381d -> :sswitch_8
        0x7f6c2567 -> :sswitch_1
    .end sparse-switch
.end method

.method public final addHeader(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
    .locals 19

    move-object/from16 v0, p1

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

    const/4 v12, 0x0

    const v13, 0x79d95bf1

    sget v14, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v15, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v16, "\u073d\u06e7"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v14, v16

    mul-int/lit8 v16, v16, -0x67

    xor-int v2, v16, v15

    mul-int/lit16 v2, v2, -0x5b11

    const v18, -0x618eda93

    xor-int v2, v2, v18

    const v18, 0x65c32c0e

    xor-int v16, v16, v18

    move-object/from16 v18, v4

    move-object v10, v9

    move-object v13, v12

    move/from16 v17, v16

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v16, 0x79d95bf1

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v16, v15

    mul-int/lit16 v5, v5, -0x6799

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v16, v17, v2

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v2, p0

    .line 46
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v1

    if-ltz v1, :cond_c

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v2

    if-ltz v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_7

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 57
    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_0

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    .line 15
    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto :goto_1

    .line 17
    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/۟᩻᩷;->ܽ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 63
    iget-object v0, v2, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v14

    xor-int v1, v5, v15

    mul-int/lit16 v1, v1, -0x24cb

    const v17, -0x56be4ea3

    xor-int v1, v1, v17

    const v17, -0x3bb2d4ed

    xor-int v17, v5, v17

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    const/16 v1, 0x26

    const/4 v4, 0x3

    .line 19
    invoke-static {v13, v1, v4, v9}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 13
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-ltz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u073a\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x55

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x23cd

    const v17, 0x1ae3999f

    xor-int v5, v5, v17

    const v17, -0x248578fd

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    .line 18
    invoke-static {v10, v11, v12, v9}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 26
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u1a7a\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x47

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0xb3d

    const v17, -0x26c5475e

    xor-int v5, v5, v17

    const v17, 0x6253e0a4

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    const/16 v11, 0x21

    const/4 v12, 0x5

    .line 21
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a77\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x1c77

    const v17, 0x50061b48    # 8.9997394E9f

    xor-int v5, v5, v17

    const v17, -0x347a516

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 62
    new-instance v3, Ll/ۨ᩻᩷;

    .line 18
    invoke-direct {v3}, Ll/۟᩻᩷;-><init>()V

    sget-object v10, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 48
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_7

    :goto_2
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7b33

    const v17, -0x44216c10

    xor-int v5, v5, v17

    const v17, 0x5a0f03ad

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u1a78\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x23

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1ebf

    const v17, -0x31711417

    xor-int v5, v5, v17

    const v17, 0xaba0422

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    const/16 v1, 0x4983

    const/16 v9, 0x4983

    goto :goto_3

    :sswitch_c
    move-object/from16 v2, p0

    const v1, 0xbc94

    const v9, 0xbc94

    :goto_3
    const-string v1, "\u0733\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x57db

    const v17, -0x7fd370ca

    xor-int v5, v5, v17

    const v17, 0x4fbb05fe

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    const v1, 0xcf74a49

    add-int/2addr v1, v8

    sub-int/2addr v1, v7

    if-ltz v1, :cond_8

    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x70b1

    const v17, -0x764c43e1

    xor-int v5, v5, v17

    const v17, 0x3bc2d5c6

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u1a79\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x67

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0xddd

    const v17, 0x590f4fa2

    xor-int v5, v5, v17

    const v17, 0x34f5be7d

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    mul-int/lit16 v7, v6, 0x733a

    mul-int v8, v6, v6

    .line 60
    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u06ec\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x37

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x2a87

    const v17, 0x297704d4

    xor-int v5, v5, v17

    const v17, 0x636984ec

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x20

    aget-short v6, v18, v1

    .line 50
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v1

    if-ltz v1, :cond_a

    :goto_4
    const-string v1, "\u1a76\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x7c4d

    const v17, -0x384e71d4

    xor-int v5, v5, v17

    const v17, -0x16b6f0f7

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1a0d

    const v17, 0x7573f7a9

    xor-int v5, v5, v17

    const v17, -0x4f9edc0e

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v18, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_b

    :goto_5
    const-string v1, "\u06d7\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x73

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x27ef

    const v17, -0x602979ba

    xor-int v5, v5, v17

    const v17, -0x2fd3ea1

    goto :goto_8

    :cond_b
    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x3a53

    const v17, 0x7bdafc00

    xor-int v5, v5, v17

    const v17, 0x75cba331

    goto :goto_8

    :goto_6
    const-string v1, "\u1a77\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x4865

    const v17, 0x516cb461

    xor-int v5, v5, v17

    const v17, -0x5c6dd1bf

    goto :goto_8

    :cond_c
    const-string v1, "\u073d\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x7d4b

    const v17, 0x7ad70b4c

    xor-int v5, v5, v17

    const v17, -0x16dcc6a8

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    .line 19
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_7
    const-string v1, "\u073a\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x49

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x6a5d

    const v17, 0x196bafac

    xor-int v5, v5, v17

    const v17, -0x4c36e45c

    goto :goto_8

    :cond_d
    const-string v1, "\u06d9\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x4ef9

    const v17, 0x393ff5a

    xor-int v5, v5, v17

    const v17, -0x15857a03

    :goto_8
    xor-int v17, v1, v17

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e17c70c -> :sswitch_4
        -0x7c56c624 -> :sswitch_f
        -0x7893eddc -> :sswitch_0
        -0x655930dc -> :sswitch_a
        -0x5ba7ca6f -> :sswitch_c
        -0x517788c0 -> :sswitch_3
        -0x45c436bb -> :sswitch_2
        -0x453d0a08 -> :sswitch_b
        -0x44c3c24f -> :sswitch_a
        -0x3d981a9e -> :sswitch_e
        -0x3d4a7cd9 -> :sswitch_8
        -0x30ba3058 -> :sswitch_c
        -0x2d19abd0 -> :sswitch_6
        -0x2873bc13 -> :sswitch_1
        -0x259b0823 -> :sswitch_1
        -0x213db39e -> :sswitch_8
        -0x1c6d3909 -> :sswitch_7
        -0x19cdc6d3 -> :sswitch_4
        -0x14657b67 -> :sswitch_6
        -0xd3e6128 -> :sswitch_7
        -0xb72ea5d -> :sswitch_d
        -0x782db9b -> :sswitch_11
        0xc5e9fc5 -> :sswitch_11
        0x1677ffe3 -> :sswitch_b
        0x1da40262 -> :sswitch_10
        0x1eafde31 -> :sswitch_3
        0x2534f9c8 -> :sswitch_0
        0x30c9a441 -> :sswitch_5
        0x444bafa3 -> :sswitch_e
        0x4bfa381e -> :sswitch_5
        0x4fc1cf23 -> :sswitch_9
        0x54752a28 -> :sswitch_10
        0x57b2271c -> :sswitch_f
        0x64a46070 -> :sswitch_9
        0x67151751 -> :sswitch_2
        0x69600819 -> :sswitch_d
    .end sparse-switch
.end method

.method public final addInput(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Input;
    .locals 20

    move-object/from16 v0, p1

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

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, -0x4b5e902

    sget v15, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v16, Ll/ۘۨ;->۫᩸۠:I

    const-string v17, "\u1a76\u05a1"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v2, v17, v16

    mul-int/lit16 v2, v2, 0x5bb

    const v19, -0x2389ce34

    xor-int v2, v2, v19

    const v19, 0x6bc41453

    xor-int v17, v17, v19

    move-object/from16 v19, v4

    move-object v12, v11

    move/from16 v18, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, -0x4b5e902

    move-object v11, v10

    const/4 v10, 0x0

    :goto_0
    xor-int v5, v17, v16

    mul-int/lit16 v5, v5, 0x25b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v17, v18, v2

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v2, p0

    .line 83
    new-instance v3, Ll/᩺᩻᩷;

    .line 22
    invoke-direct {v3}, Ll/۟᩻᩷;-><init>()V

    const/4 v4, 0x1

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-ltz v1, :cond_7

    goto/16 :goto_2

    .line 55
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-nez v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_5

    :cond_1
    const-string v2, "\u06e1\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v15

    mul-int/lit8 v2, v2, -0x4f

    xor-int v5, v2, v16

    mul-int/lit16 v5, v5, -0x4de7

    const v18, 0x6b5694f9

    xor-int v5, v5, v18

    const v18, 0x619f2d0c

    xor-int v18, v2, v18

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v2

    if-gez v2, :cond_2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v2, :cond_0

    goto :goto_1

    .line 65
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto :goto_1

    .line 57
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    const/4 v0, 0x0

    return-object v0

    .line 25
    :sswitch_5
    iput-object v0, v3, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/۟᩻᩷;->ܽ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 84
    iget-object v0, v2, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_6
    move-object/from16 v2, p0

    .line 23
    invoke-static {v12, v13, v14, v10}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-static {v1, v5}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v5, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v5, "\u06d8\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v16

    xor-int v1, v5, v15

    mul-int/lit16 v1, v1, 0xfd9

    const v18, 0x2494da6d

    xor-int v1, v1, v18

    const v18, -0x760ae0b4

    xor-int v18, v5, v18

    move v2, v1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    .line 23
    sget-object v12, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    const/16 v13, 0x2f

    const/4 v14, 0x3

    .line 44
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-ltz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u06df\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x33

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x460f

    const v18, 0x12f62392

    xor-int v5, v5, v18

    const v18, 0x77275605

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v1, 0x2a

    const/4 v5, 0x5

    .line 19
    invoke-static {v11, v1, v5, v10}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u0730\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7b03

    const v18, 0x707b8fad

    xor-int v5, v5, v18

    const v18, 0x75be14fe

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v2, p0

    .line 19
    iput v4, v3, Ll/᩺᩻᩷;->ۢ:I

    sget-object v11, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u06da\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x41

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x31e1

    const v18, 0x5cd5cf29

    xor-int v5, v5, v18

    const v18, 0x14e41a8c

    goto/16 :goto_7

    :goto_2
    const-string v1, "\u0730\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x25

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x4a37

    const v18, -0x712e865c

    xor-int v5, v5, v18

    const v18, -0x2e84aced

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06e7\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x10f5

    const v18, 0x17a77e88

    xor-int v5, v5, v18

    const v18, -0x520c0f0b

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v2, p0

    const v1, 0xe172

    const v10, 0xe172

    goto :goto_3

    :sswitch_b
    move-object/from16 v2, p0

    const/16 v1, 0x4622

    const/16 v10, 0x4622

    :goto_3
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x1a2f

    const v18, -0x3cd7fc08

    xor-int v5, v5, v18

    const v18, 0x441eafdd

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v2, p0

    add-int v1, v6, v9

    mul-int v1, v1, v1

    sub-int v1, v8, v1

    if-gez v1, :cond_8

    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x51

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x1703

    const v18, -0x142926ec

    xor-int v5, v5, v18

    const v18, -0xdcb0db2

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06d8\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6a75

    const v18, -0x33887584    # -6.4891376E7f

    xor-int v5, v5, v18

    const v18, 0x2bd930a1

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v2, p0

    const/16 v9, 0x3b10

    .line 31
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u06da\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5f4d

    const v18, 0x158d0e6c

    xor-int v5, v5, v18

    const v18, 0x43b5d52e

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v2, p0

    const v1, 0xda06100

    add-int/2addr v1, v7

    add-int v8, v1, v1

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_a

    :goto_4
    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7cd1

    const v18, 0x74a92ef3

    xor-int v5, v5, v18

    const v18, -0x6614dd5c

    goto/16 :goto_7

    :cond_a
    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x63

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4db5

    const v18, -0x36059fb9

    xor-int v5, v5, v18

    const v18, 0x38833872

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x29

    aget-short v6, v19, v1

    mul-int v7, v6, v6

    .line 77
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_b

    goto :goto_5

    :cond_b
    const-string v1, "\u1a7a\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x671d

    const v18, 0x21a86f61

    xor-int v5, v5, v18

    const v18, 0x791db90

    goto :goto_7

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v19, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_c

    :goto_5
    const-string v1, "\u05a1\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2e27

    const v18, 0x7a2079ca

    xor-int v5, v5, v18

    const v18, -0x660be207

    goto :goto_7

    :cond_c
    const-string v1, "\u06d8\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x71

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x75b

    const v18, 0x540eeed

    xor-int v5, v5, v18

    const v18, 0x327bc77

    goto :goto_7

    :sswitch_11
    move-object/from16 v2, p0

    .line 66
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_d

    :goto_6
    const-string v1, "\u05a8\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6f39

    const v18, -0x6934860f

    xor-int v5, v5, v18

    const v18, -0x34bb2ef7    # -1.2898569E7f

    goto :goto_7

    :cond_d
    const-string v1, "\u06d6\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4edd

    const v18, -0x1d563658

    xor-int v5, v5, v18

    const v18, 0x3c16ca06

    :goto_7
    xor-int v18, v1, v18

    move-object/from16 v1, p2

    :goto_8
    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78ccb60c -> :sswitch_e
        -0x706e6f2f -> :sswitch_0
        -0x6864c9a4 -> :sswitch_5
        -0x5bc7e1d1 -> :sswitch_10
        -0x5aa9d7fa -> :sswitch_c
        -0x5a693be3 -> :sswitch_b
        -0x58c86ad4 -> :sswitch_9
        -0x4da6f677 -> :sswitch_10
        -0x44ec557e -> :sswitch_2
        -0x3e528565 -> :sswitch_a
        -0x36a40ec8 -> :sswitch_8
        -0x32bc4f94 -> :sswitch_7
        -0x325eb4eb -> :sswitch_4
        -0x306f3d14 -> :sswitch_d
        -0x27cb1fee -> :sswitch_d
        -0x24f74248 -> :sswitch_11
        -0x213fa223 -> :sswitch_f
        -0x208fd2ce -> :sswitch_6
        -0x1e8e39dd -> :sswitch_e
        -0x1a77c85b -> :sswitch_11
        -0x830b0a8 -> :sswitch_3
        -0x40e1720 -> :sswitch_7
        -0x1639908 -> :sswitch_1
        0x5c62130 -> :sswitch_a
        0x6609f75 -> :sswitch_2
        0xfd70f5c -> :sswitch_b
        0x1515139b -> :sswitch_c
        0x1653c525 -> :sswitch_f
        0x3a235262 -> :sswitch_0
        0x450b7d57 -> :sswitch_4
        0x4b100a33 -> :sswitch_9
        0x6f16e255 -> :sswitch_5
        0x74feffd2 -> :sswitch_1
        0x77b9894c -> :sswitch_6
        0x7a62b590 -> :sswitch_8
        0x7f178e87 -> :sswitch_3
    .end sparse-switch
.end method

.method public final addList(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List;
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v13, 0x18e71230

    sget v14, Ll/ۘܿ;->ۘܰ۫:I

    sget v15, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v16, "\u073f\u05a8"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v2, v16, v14

    mul-int/lit16 v2, v2, 0x49b3

    const v18, -0x5fa32906

    xor-int v2, v2, v18

    const v18, -0x7aacc33c

    xor-int v16, v16, v18

    move-object/from16 v19, v4

    move-object v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x18e71230

    move-object v10, v9

    const/4 v9, 0x0

    :goto_0
    xor-int v5, v16, v14

    mul-int/lit16 v5, v5, 0x70b7

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v16, v17, v2

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v2, p0

    sget-object v19, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 92
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_c

    goto/16 :goto_6

    .line 6
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v2

    if-gez v2, :cond_1

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_6

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_7

    .line 38
    :sswitch_1
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v2, :cond_0

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_4

    .line 86
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 42
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    .line 23
    :sswitch_5
    iput-object v0, v4, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 24
    iput-object v1, v4, Ll/۟᩻᩷;->ܽ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 98
    iget-object v0, v2, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v4}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v4

    :sswitch_6
    move-object/from16 v2, p0

    .line 21
    invoke-static {v11, v12, v13, v9}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 22
    invoke-static {v1, v5}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v5, "\u06e2\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v15

    xor-int v1, v5, v14

    mul-int/lit16 v1, v1, -0xa7f

    const v17, 0x3000c219

    xor-int v1, v1, v17

    const v17, -0x31c6100e

    xor-int v17, v5, v17

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :sswitch_7
    move-object/from16 v2, p0

    .line 21
    sget-object v11, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    const/16 v12, 0x38

    const/4 v13, 0x3

    .line 9
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u1a73\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x4891

    const v17, 0x36bfcbb0

    xor-int v5, v5, v17

    const v17, 0x6e1c31c6

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v1, 0x33

    const/4 v5, 0x5

    .line 18
    invoke-static {v10, v1, v5, v9}, Ll/֨᩺;->ۘ֫֨([SIII)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u1a7a\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2835

    const v17, 0x4a3be911    # 3078724.2f

    xor-int v5, v5, v17

    const v17, -0x6f1cac91

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    .line 18
    iput-object v3, v4, Ll/֫ۜ᩷;->᩷:Ljava/util/ArrayList;

    sget-object v10, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 63
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u06eb\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x19

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x6a0f

    const v17, 0x22c9928d

    xor-int v5, v5, v17

    const v17, 0x747fe317

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    .line 97
    new-instance v4, Ll/֫ۜ᩷;

    .line 20
    invoke-direct {v4}, Ll/۟᩻᩷;-><init>()V

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    const-string v1, "\u1a75\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x71

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x6725

    const v5, -0x5963b30d

    xor-int/2addr v3, v5

    const v5, -0x47ef7c95

    xor-int v17, v1, v5

    move-object/from16 v1, p2

    move v2, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u1a76\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5f

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x70f9

    const v17, -0x2b458d44

    xor-int v5, v5, v17

    const v17, 0x6f13a98c

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v2, p0

    const/16 v1, 0x6bb4

    const/16 v9, 0x6bb4

    goto :goto_3

    :sswitch_c
    move-object/from16 v2, p0

    const v1, 0x8d4e

    const v9, 0x8d4e

    :goto_3
    const-string v1, "\u1a76\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x1f

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1e31

    const v17, 0x2960c147

    xor-int v5, v5, v17

    const v17, -0xd1848a4

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    add-int v1, v6, v8

    mul-int v1, v1, v1

    sub-int/2addr v1, v7

    if-gez v1, :cond_9

    const-string v1, "\u06dc\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x74af

    const v17, -0x27176d20

    xor-int v5, v5, v17

    const v17, -0x4cfdfbc5

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u05a8\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x294f

    const v17, 0x2c50f114

    xor-int v5, v5, v17

    const v17, -0x53798a7e

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    const v1, 0xd550

    mul-int v7, v6, v1

    const/16 v8, 0x3554

    .line 43
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v1

    if-gtz v1, :cond_a

    :goto_4
    const-string v1, "\u0736\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x4f

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7861

    const v17, -0x7d4e36e8

    xor-int v5, v5, v17

    const v17, -0x2b6993d3

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u06da\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2127

    const v17, -0x601af4

    xor-int v5, v5, v17

    const v17, 0x33d99e4a

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x32

    aget-short v6, v19, v1

    .line 51
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_b

    :goto_5
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x1f

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x6bb9

    const v17, -0x2c70af3d

    xor-int v5, v5, v17

    const v17, -0x193f3a7d

    goto :goto_8

    :cond_b
    const-string v1, "\u073f\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x3c7d

    const v17, 0x5b06effb

    xor-int v5, v5, v17

    const v17, 0x28e7fe11

    goto :goto_8

    :goto_6
    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x79

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x610f

    const v17, 0x5eccd22b

    xor-int v5, v5, v17

    const v17, 0xe4fb6a4

    goto :goto_8

    :cond_c
    const-string v1, "\u06d7\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x57

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0xa5d

    const v17, -0x439c9be7

    xor-int v5, v5, v17

    const v17, -0x4276c6cf

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    .line 10
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_d

    :goto_7
    const-string v1, "\u06e2\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x3ebf

    const v17, 0x636897c4

    xor-int v5, v5, v17

    const v17, 0x7e8ab54a

    goto :goto_8

    :cond_d
    const-string v1, "\u1a75\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x4863

    const v17, 0x29e20fbe

    xor-int v5, v5, v17

    const v17, -0x19adb008

    :goto_8
    xor-int v17, v1, v17

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fb97e2c -> :sswitch_f
        -0x7ee4b886 -> :sswitch_c
        -0x7cd1b17d -> :sswitch_2
        -0x70543a06 -> :sswitch_a
        -0x70278252 -> :sswitch_d
        -0x6cd41f73 -> :sswitch_1
        -0x6906cc41 -> :sswitch_0
        -0x4e48e04d -> :sswitch_5
        -0x447dab52 -> :sswitch_d
        -0x40cf38c7 -> :sswitch_8
        -0x3ab96f64 -> :sswitch_e
        -0x2e81af22 -> :sswitch_8
        -0x206aac79 -> :sswitch_4
        -0x7ca2bc9 -> :sswitch_a
        0x41d72d6 -> :sswitch_6
        0x647c71a -> :sswitch_f
        0x8e44ac5 -> :sswitch_6
        0xa5322b8 -> :sswitch_4
        0x18bb7929 -> :sswitch_7
        0x1f6867e6 -> :sswitch_e
        0x2398ba3f -> :sswitch_5
        0x24ddd268 -> :sswitch_c
        0x37fcef1b -> :sswitch_3
        0x3b6a0e28 -> :sswitch_9
        0x3f0e3568 -> :sswitch_3
        0x427b2268 -> :sswitch_1
        0x4b8bbe31 -> :sswitch_2
        0x4cc3c496 -> :sswitch_7
        0x4d8e9813 -> :sswitch_b
        0x5ea362d0 -> :sswitch_b
        0x5f3fc0dc -> :sswitch_9
        0x68f2537d -> :sswitch_10
        0x749e8354 -> :sswitch_10
        0x7808c178 -> :sswitch_0
    .end sparse-switch
.end method

.method public final addSwitch(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Switch;
    .locals 21

    move-object/from16 v0, p1

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

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, 0x5632c0ba

    sget v16, Ll/֨ۤ;->ܿۖ᩵:I

    sget v17, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v18, "\u1a74\u1a77"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v2, v18, v17

    mul-int/lit16 v2, v2, 0x1b7

    const v20, -0x46082ebb

    xor-int v2, v2, v20

    const v20, 0x4bd93a5c    # 2.8472504E7f

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

    const v18, 0x5632c0ba

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x1a99

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v2, v5

    xor-int v18, v19, v2

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v2, p0

    .line 20
    invoke-static {v1, v4}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_3

    goto :goto_2

    .line 15
    :sswitch_0
    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v2, :cond_0

    :goto_1
    move-object/from16 v2, p0

    goto :goto_2

    :cond_0
    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 9
    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v2

    if-lez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    const/4 v0, 0x0

    return-object v0

    .line 21
    :sswitch_5
    iput-object v0, v3, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 22
    iput-object v1, v3, Ll/۟᩻᩷;->ܽ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 91
    iget-object v0, v2, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :goto_2
    const-string v5, "\u1a7b\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v16

    xor-int v1, v5, v17

    mul-int/lit16 v1, v1, -0x647f

    const v19, 0x7cb16f1a

    xor-int v1, v1, v19

    const v19, 0x56c3ebd6

    xor-int v19, v5, v19

    move v2, v1

    move-object/from16 v1, p2

    goto :goto_0

    :cond_3
    const-string v1, "\u06e1\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x45

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x3201

    const v19, -0x23bb10e6

    xor-int v5, v5, v19

    const v19, -0x9dda661

    goto/16 :goto_8

    :sswitch_6
    move-object/from16 v2, p0

    const/16 v1, 0x41

    const/4 v4, 0x3

    .line 19
    invoke-static {v15, v1, v4, v11}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u073a\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x4aab

    const v19, -0x476e2e1a

    xor-int v5, v5, v19

    const v19, 0x2120580

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v2, p0

    .line 18
    invoke-static {v12, v13, v14, v11}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 73
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u073a\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5509

    const v19, 0x14ebc40f

    xor-int v5, v5, v19

    const v19, 0x2e40fcc1

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v2, p0

    const/16 v13, 0x3c

    const/4 v14, 0x5

    .line 55
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a7a\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x61d3

    const v19, -0x243a9007

    xor-int v5, v5, v19

    const v19, 0x6d35bf20

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v2, p0

    .line 90
    new-instance v3, Ll/ܽۜ᩷;

    .line 18
    invoke-direct {v3}, Ll/۟᩻᩷;-><init>()V

    sget-object v12, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u1a74\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x257

    const v19, -0x155f7371

    xor-int v5, v5, v19

    const v19, -0x3a3ba589

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v2, p0

    const/16 v1, 0x4405

    const/16 v11, 0x4405

    goto :goto_3

    :sswitch_b
    move-object/from16 v2, p0

    const v1, 0xe02e

    const v11, 0xe02e

    :goto_3
    const-string v1, "\u1a77\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x65df

    const v19, 0x7777e6f

    xor-int v5, v5, v19

    const v19, -0x4b86b869

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v2, p0

    add-int v1, v9, v10

    add-int/2addr v1, v1

    sub-int v1, v8, v1

    if-lez v1, :cond_8

    const-string v1, "\u0736\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xf

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x229d

    const v19, 0x138a2aeb

    xor-int v5, v5, v19

    const v19, 0x2c428f6c

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u06e8\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x416b

    const v19, -0x59466131    # -1.2879999E-15f

    xor-int v5, v5, v19

    const v19, -0x2774959c

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v2, p0

    const v10, 0xb9a40

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v1

    if-gtz v1, :cond_9

    :goto_4
    const-string v1, "\u06dc\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x41bd

    const v19, 0x682cfed

    xor-int v5, v5, v19

    const v19, 0xfa50c91

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u073d\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x683b

    const v19, 0x204335ed

    xor-int v5, v5, v19

    const v19, 0x31c91c8b

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v2, p0

    add-int v1, v6, v7

    mul-int v8, v1, v1

    mul-int v9, v6, v6

    .line 51
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_a

    :goto_5
    const-string v1, "\u05ab\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x29

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5ff9

    const v19, -0x2d7eb859

    xor-int v5, v5, v19

    const v19, 0x76618171

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u1a7a\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0xf3f

    const v19, -0x5cba7d70

    xor-int v5, v5, v19

    const v19, 0x71d69191

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v2, p0

    const/16 v1, 0x3b

    aget-short v6, v20, v1

    const/16 v7, 0x368

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_b

    goto :goto_6

    :cond_b
    const-string v1, "\u06e0\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x192b

    const v19, 0x6e86b583

    xor-int v5, v5, v19

    const v19, 0x4a53578a    # 3462626.5f

    goto :goto_8

    :sswitch_10
    move-object/from16 v2, p0

    sget-object v20, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 14
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_c

    :goto_6
    const-string v1, "\u1a7a\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x5a41

    const v19, 0x540fedac

    xor-int v5, v5, v19

    const v19, 0x4c158fc3    # 3.9206668E7f

    goto :goto_8

    :cond_c
    const-string v1, "\u06d8\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x51df

    const v19, -0x38310969

    xor-int v5, v5, v19

    const v19, -0x6d9b16f0

    goto :goto_8

    :sswitch_11
    move-object/from16 v2, p0

    .line 81
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v1

    if-ltz v1, :cond_d

    :goto_7
    const-string v1, "\u06e1\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x27

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x1cf3

    const v19, 0x6bfb1251

    xor-int v5, v5, v19

    const v19, -0x21254cc2

    goto :goto_8

    :cond_d
    const-string v1, "\u06db\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x615b

    const v19, -0x13a7dbfa

    xor-int v5, v5, v19

    const v19, 0x3f1ee10f

    :goto_8
    xor-int v19, v1, v19

    move-object/from16 v1, p2

    move v2, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f1d4bb9 -> :sswitch_3
        -0x7623c9b1 -> :sswitch_9
        -0x665759a4 -> :sswitch_a
        -0x591a3ae8 -> :sswitch_10
        -0x53b7e455 -> :sswitch_0
        -0x4b37935f -> :sswitch_b
        -0x3e914f33 -> :sswitch_2
        -0x3d3b2df8 -> :sswitch_0
        -0x3a2b1829 -> :sswitch_6
        -0x395d8e4a -> :sswitch_11
        -0x37124770 -> :sswitch_d
        -0x2c57b842 -> :sswitch_e
        -0x24475e1d -> :sswitch_4
        -0x20e741c1 -> :sswitch_1
        -0x13a820cf -> :sswitch_c
        -0x12f72080 -> :sswitch_2
        -0x10accecc -> :sswitch_a
        -0xde8c68e -> :sswitch_b
        -0x35250b7 -> :sswitch_d
        0x6c95c1c -> :sswitch_5
        0x1f1c371b -> :sswitch_f
        0x22b089b8 -> :sswitch_7
        0x25caa8f1 -> :sswitch_3
        0x2a3c0e63 -> :sswitch_4
        0x2d81f6e7 -> :sswitch_9
        0x2fa98a0b -> :sswitch_c
        0x48bf66b3 -> :sswitch_8
        0x4f0fbb28 -> :sswitch_10
        0x57e082a0 -> :sswitch_11
        0x5b56d561 -> :sswitch_8
        0x5f200cf3 -> :sswitch_7
        0x62f7805a -> :sswitch_6
        0x745ff177 -> :sswitch_1
        0x76890e4e -> :sswitch_5
        0x7cf20fa8 -> :sswitch_f
        0x7dcba65c -> :sswitch_e
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
    .locals 20

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

    const v14, 0x31012a6a

    sget v15, Ll/ۛ;->᩺᩻֫:I

    sget v16, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v17, "\u1a7a\u06d7"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0x273b

    const v19, 0x28b57813

    xor-int v1, v1, v19

    const v19, 0x527490e6

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

    const v17, 0x31012a6a

    :goto_0
    xor-int v3, v17, v15

    mul-int/lit16 v3, v3, 0x30f5

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    move-object/from16 v1, p0

    add-int v0, v9, v10

    add-int/2addr v0, v0

    sub-int/2addr v0, v8

    if-gez v0, :cond_6

    const-string v0, "\u1a79\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x3d

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x5cb3

    const v18, 0x60d58ecb

    xor-int v3, v3, v18

    const v18, -0x336579d1    # -8.101516E7f

    goto/16 :goto_8

    .line 48
    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v1, :cond_0

    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_6

    :cond_0
    move-object/from16 v1, p0

    goto/16 :goto_5

    .line 12
    :sswitch_1
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v1, p0

    goto :goto_3

    :sswitch_2
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    const-string v1, "\u05a1\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x730f

    const v18, 0x7c701903

    xor-int v3, v3, v18

    const v18, 0x522350d0

    xor-int v18, v1, v18

    goto/16 :goto_9

    .line 32
    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto :goto_1

    .line 37
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v1, p0

    .line 70
    iget-object v0, v1, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v2

    :sswitch_6
    move-object/from16 v1, p0

    .line 17
    invoke-static {v12, v13, v14, v11}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-static {v0, v3}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iput-object v0, v2, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 31
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u073d\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x77

    xor-int v0, v3, v15

    mul-int/lit16 v0, v0, 0x5715

    const v18, -0x3802befa

    xor-int v0, v0, v18

    const v18, 0x544caf8b

    xor-int v18, v3, v18

    move v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v1, p0

    const/16 v13, 0x45

    const/4 v14, 0x5

    .line 10
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_4

    :goto_3
    const-string v0, "\u0730\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x1b

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x470f

    const v18, -0x1b87d70

    xor-int v3, v3, v18

    const v18, 0x53e9b95c

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u1a75\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x53dd

    const v18, -0x51f0cdae

    xor-int v3, v3, v18

    const v18, 0x327e3176

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v1, p0

    .line 69
    new-instance v2, Ll/ᩳۜ᩷;

    .line 17
    invoke-direct {v2}, Ll/۟᩻᩷;-><init>()V

    sget-object v12, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 22
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u05a8\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x43fd

    const v18, 0x247f17d5

    xor-int v3, v3, v18

    const v18, -0x1ae99cd9

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v1, p0

    const/16 v0, 0xed0

    const/16 v11, 0xed0

    goto :goto_4

    :sswitch_a
    move-object/from16 v1, p0

    const/16 v0, 0x3c71

    const/16 v11, 0x3c71

    :goto_4
    const-string v0, "\u1a74\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x22b9

    const v18, -0xdba7cd7

    xor-int v3, v3, v18

    const v18, -0x58c25c62

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u06db\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x4f

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x713f

    const v18, 0x2a1308c9

    xor-int v3, v3, v18

    const v18, -0x5a727d7

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v1, p0

    const v10, 0x95eb424

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u073d\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x1f4b

    const v18, -0x3dbb8f0e

    xor-int v3, v3, v18

    const v18, -0x30f2448c

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v1, p0

    mul-int v8, v7, v7

    mul-int v9, v5, v5

    .line 4
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x36ff

    const v18, -0x25ec7950

    xor-int v3, v3, v18

    const v18, 0x7d0155ea

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v1, p0

    add-int v7, v5, v6

    .line 6
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x77

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0xd99

    const v18, -0x1a6c4e8d

    xor-int v3, v3, v18

    const v18, -0x4719d8ad

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v1, p0

    aget-short v5, v19, v4

    const/16 v6, 0x30fa

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_a

    :goto_5
    const-string v0, "\u06d6\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x17c7

    const v18, 0x730be863

    xor-int v3, v3, v18

    const v18, 0x3cbfd855

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u06d8\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x1251

    const v18, -0x3916e8b2

    xor-int v3, v3, v18

    const v18, -0x4db58171

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v1, p0

    const/16 v4, 0x44

    .line 67
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_b

    goto :goto_7

    :cond_b
    const-string v0, "\u1a75\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x79

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x1315

    const v18, 0x1eb6af1a

    xor-int v3, v3, v18

    const v18, -0x799b2916

    goto :goto_8

    :sswitch_10
    move-object/from16 v1, p0

    sget-object v19, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_c

    :goto_6
    const-string v0, "\u1a74\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0xf2f

    const v18, 0x3685640b

    xor-int v3, v3, v18

    const v18, -0x2c617295

    goto :goto_8

    :cond_c
    const-string v0, "\u06e2\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x3a3

    const v18, 0x567c6e70

    xor-int v3, v3, v18

    const v18, -0x7893fb7b

    goto :goto_8

    :sswitch_11
    move-object/from16 v1, p0

    .line 46
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_d

    :goto_7
    const-string v0, "\u0736\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x69a3

    const v18, -0x42699e21

    xor-int v3, v3, v18

    const v18, -0x40aa5550

    goto :goto_8

    :cond_d
    const-string v0, "\u1a7a\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x4ef9

    const v18, -0x23dee759

    xor-int v3, v3, v18

    const v18, 0x334c773e

    :goto_8
    xor-int v18, v0, v18

    move-object/from16 v0, p1

    :goto_9
    move v1, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c9ea7a6 -> :sswitch_2
        -0x7c656b9d -> :sswitch_3
        -0x7c3158cf -> :sswitch_11
        -0x752dcea4 -> :sswitch_6
        -0x6feb244e -> :sswitch_5
        -0x534748c2 -> :sswitch_b
        -0x50c85025 -> :sswitch_d
        -0x4beebb77 -> :sswitch_a
        -0x4b3d5e1a -> :sswitch_9
        -0x49f026a1 -> :sswitch_9
        -0x49cc3afc -> :sswitch_1
        -0x42015adf -> :sswitch_a
        -0x4085ce0e -> :sswitch_c
        -0x33751b8e -> :sswitch_0
        -0x2fb0970f -> :sswitch_7
        -0x2e77dd40 -> :sswitch_1
        -0x20b5d5b5 -> :sswitch_6
        -0x1d09bf15 -> :sswitch_10
        -0x199053f3 -> :sswitch_b
        -0xd860db0 -> :sswitch_8
        0x20de7f2 -> :sswitch_c
        0x7f39a8d -> :sswitch_f
        0x234ddec2 -> :sswitch_10
        0x279ccaa2 -> :sswitch_11
        0x2935fece -> :sswitch_5
        0x34afa6a6 -> :sswitch_7
        0x35635333 -> :sswitch_e
        0x3eaae3be -> :sswitch_4
        0x42db583c -> :sswitch_3
        0x570858c8 -> :sswitch_2
        0x589f2604 -> :sswitch_e
        0x5f7d85ba -> :sswitch_d
        0x6a5bf898 -> :sswitch_f
        0x6e93eb84 -> :sswitch_4
        0x6eec408c -> :sswitch_0
        0x7687e151 -> :sswitch_8
    .end sparse-switch
.end method

.method public final addText(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
    .locals 19

    move-object/from16 v0, p1

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

    const v12, 0x3b41ce2a

    sget v13, Ll/֡֡;->֫ۤܳ:I

    sget v14, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v15, "\u1a75\u1a76"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x7

    xor-int v2, v15, v14

    mul-int/lit16 v2, v2, 0x3b19

    const v17, -0x46a34222    # -2.1051566E-4f

    xor-int v2, v2, v17

    const v17, 0x76c83e06

    xor-int v15, v15, v17

    move-object v5, v4

    move-object v9, v8

    move-object v12, v11

    move/from16 v16, v15

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v15, 0x3b41ce2a

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x4b0f

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    .line 9
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_0
    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v2, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v2, p0

    move/from16 v16, v15

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v2

    if-lez v2, :cond_1

    :goto_1
    move-object/from16 v2, p0

    move/from16 v16, v15

    goto/16 :goto_5

    :cond_1
    move-object/from16 v2, p0

    move/from16 v16, v15

    goto/16 :goto_6

    .line 40
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v2

    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    const-string v2, "\u1a7b\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, 0x47

    move/from16 v16, v15

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, -0x5b63

    const v17, -0x2aa8600e

    xor-int v15, v15, v17

    const v17, -0x739151f4

    xor-int v2, v2, v17

    move/from16 v18, v16

    move/from16 v16, v2

    move v2, v15

    goto :goto_3

    :sswitch_3
    move/from16 v16, v15

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-object/from16 v2, p0

    goto/16 :goto_5

    .line 25
    :sswitch_4
    iput-object v0, v3, Ll/۟᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 26
    iput-object v1, v3, Ll/۟᩻᩷;->ܽ:Ljava/lang/String;

    move-object/from16 v2, p0

    .line 77
    iget-object v0, v2, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :sswitch_5
    move-object/from16 v2, p0

    move/from16 v16, v15

    .line 24
    invoke-static {v1, v4}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget v15, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v15, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v15, "\u0736\u06dc"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, 0x2cf3

    const v17, 0x412331a7

    xor-int v1, v1, v17

    const v17, 0x2a406c9c

    xor-int v15, v15, v17

    move v2, v1

    move-object/from16 v1, p2

    move/from16 v18, v16

    move/from16 v16, v15

    :goto_3
    move/from16 v15, v18

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v2, p0

    move/from16 v16, v15

    const/16 v1, 0x50

    const/4 v4, 0x3

    .line 23
    invoke-static {v12, v1, v4, v8}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06dc\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, 0xf

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x345f

    const v17, 0x7e4535f2

    xor-int v15, v15, v17

    const v17, 0x5d599478

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v2, p0

    move/from16 v16, v15

    invoke-static {v9, v10, v11, v8}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Ll/ۛ᩻᩷;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u0730\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x33

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x3015

    const v17, 0x271f8f8f

    xor-int v15, v15, v17

    const v17, -0x5e761ca4

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v2, p0

    move/from16 v16, v15

    const/16 v10, 0x4b

    const/4 v11, 0x5

    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v1, "\u1a78\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x2d

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x2545

    const v17, 0x2f46fa7c

    xor-int v15, v15, v17

    const v17, -0x1d3e8885

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v2, p0

    move/from16 v16, v15

    .line 76
    new-instance v3, Ll/ᩳۜ᩷;

    .line 22
    invoke-direct {v3}, Ll/۟᩻᩷;-><init>()V

    sget-object v9, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    .line 63
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u06da\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x38c1

    const v17, -0x708a89ef

    xor-int v15, v15, v17

    const v17, -0x1e4be8cd

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v2, p0

    move/from16 v16, v15

    const v1, 0xed25

    const v8, 0xed25

    goto :goto_4

    :sswitch_b
    move-object/from16 v2, p0

    move/from16 v16, v15

    const/16 v1, 0x5ed

    const/16 v8, 0x5ed

    :goto_4
    const-string v1, "\u1a7a\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0xb

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x449f

    const v17, 0x1b709a7

    xor-int v15, v15, v17

    const v17, 0x7e41ff90

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v2, p0

    move/from16 v16, v15

    mul-int/lit16 v1, v6, 0xc16

    sub-int v1, v7, v1

    if-ltz v1, :cond_8

    const-string v1, "\u06e2\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x75

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x74cb

    const v17, 0x35cd5655

    xor-int v15, v15, v17

    const v17, -0x36487061

    goto/16 :goto_9

    :cond_8
    const-string v1, "\u06ec\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x4b

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x161d

    const v17, 0x6e8882f0

    xor-int v15, v15, v17

    const v17, -0x4505f0b5

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v2, p0

    move/from16 v16, v15

    mul-int v1, v6, v6

    const v7, 0x248479

    add-int/2addr v7, v1

    .line 9
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_9

    :goto_5
    const-string v1, "\u06da\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x2dbf

    const v17, -0x54e1db28

    xor-int v15, v15, v17

    const v17, 0x38c0d862

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u073d\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x6d

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x43b5

    const v17, 0x2175d9f9

    xor-int v15, v15, v17

    const v17, 0x2dba7072

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v2, p0

    move/from16 v16, v15

    const/16 v1, 0x4a

    aget-short v6, v5, v1

    .line 4
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_a

    :goto_6
    const-string v1, "\u0733\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x7303

    const v17, -0x6bccf903

    xor-int v15, v15, v17

    const v17, -0x71fa345b

    goto/16 :goto_9

    :cond_a
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x27c3

    const v17, 0x2e44c7f8

    xor-int v15, v15, v17

    const v17, -0x3ea22d08

    goto/16 :goto_9

    :sswitch_f
    move-object/from16 v2, p0

    move/from16 v16, v15

    sget-object v5, Ll/ۛ᩻᩷;->ۜ֨ᩳ:[S

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_b

    goto :goto_8

    :cond_b
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x51

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x1adf

    const v17, 0x3c46d67a

    xor-int v15, v15, v17

    const v17, 0x33e56fc7

    goto :goto_9

    :sswitch_10
    move-object/from16 v2, p0

    move/from16 v16, v15

    .line 35
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_c

    :goto_7
    const-string v1, "\u06ec\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x4187

    const v17, 0x94b5839

    xor-int v15, v15, v17

    const v17, 0x1d3d83dd

    goto :goto_9

    :cond_c
    const-string v1, "\u06d6\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x49ff

    const v17, -0x6a8bf674

    xor-int v15, v15, v17

    const v17, -0x73ceaf05

    goto :goto_9

    :sswitch_11
    move-object/from16 v2, p0

    move/from16 v16, v15

    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_d

    :goto_8
    const-string v1, "\u06e1\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x2293

    const v17, -0x40af165d

    xor-int v15, v15, v17

    const v17, -0x42f2e62f

    goto :goto_9

    :cond_d
    const-string v1, "\u1a75\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0x3d

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x8a3

    const v17, -0x1b3bd1b2

    xor-int v15, v15, v17

    const v17, -0x6d77e4b8

    :goto_9
    xor-int v1, v1, v17

    move v2, v15

    move/from16 v15, v16

    move/from16 v16, v1

    move-object/from16 v1, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b3d6647 -> :sswitch_b
        -0x77aad65b -> :sswitch_6
        -0x6f38df6a -> :sswitch_5
        -0x5d207d37 -> :sswitch_3
        -0x5a85d657 -> :sswitch_9
        -0x4d83dd5b -> :sswitch_c
        -0x4c17402b -> :sswitch_1
        -0x4520787d -> :sswitch_5
        -0x43d8f0eb -> :sswitch_e
        -0x424c88f8 -> :sswitch_7
        -0x3b4d7e4d -> :sswitch_d
        -0x2d29a268 -> :sswitch_4
        -0x291a684f -> :sswitch_4
        -0x26800aeb -> :sswitch_8
        -0x1e67906f -> :sswitch_1
        -0x1d4502fc -> :sswitch_a
        -0x13dfc7e4 -> :sswitch_9
        0x6b78907 -> :sswitch_11
        0xbc5484c -> :sswitch_6
        0xeaa3c71 -> :sswitch_10
        0x149617aa -> :sswitch_8
        0x1b129e3c -> :sswitch_f
        0x2ffb19e8 -> :sswitch_c
        0x3656e36f -> :sswitch_2
        0x3df8135d -> :sswitch_d
        0x419378be -> :sswitch_b
        0x482f2cf1 -> :sswitch_0
        0x5fe4d657 -> :sswitch_10
        0x61bb8a9c -> :sswitch_11
        0x637a51dd -> :sswitch_0
        0x6b86a8ab -> :sswitch_a
        0x72a030e2 -> :sswitch_2
        0x74a581aa -> :sswitch_7
        0x7679d4d6 -> :sswitch_e
        0x77aba356 -> :sswitch_3
        0x7913640f -> :sswitch_f
    .end sparse-switch
.end method

.method public final onCreated(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 110
    iput-object p1, p0, Ll/ۛ᩻᩷;->ᩳ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;

    return-object p0
.end method

.method public final onPreferenceChange(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 104
    iput-object p1, p0, Ll/ۛ᩻᩷;->ܿ:Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;

    return-object p0
.end method

.method public final setLocalString(Lbin/mt/plugin/api/LocalString;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ۛ᩻᩷;->ܽ:Lbin/mt/plugin/api/LocalString;

    return-void
.end method

.method public final subtitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 49
    iput-object p1, p0, Ll/ۛ᩻᩷;->ܳ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final title(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
    .locals 0

    .line 43
    iput-object p1, p0, Ll/ۛ᩻᩷;->᩻:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 25

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

    const/16 v17, 0x0

    const v18, 0x32ff3c3e

    sget v19, Ll/ۗۚ;->ܶۛᩴ:I

    sget v20, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v21, "\u1a7a\u073a"

    invoke-static/range {v21 .. v21}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v21

    add-int v21, v21, v20

    mul-int/lit8 v21, v21, 0x6b

    xor-int v1, v21, v19

    mul-int/lit16 v1, v1, -0x2033

    const v23, 0x7ade05b5

    xor-int v1, v1, v23

    const v23, -0x19d8a1a5

    xor-int v21, v21, v23

    move-object/from16 v23, v5

    move-object v7, v6

    move-object v8, v15

    move-object/from16 v5, v16

    move/from16 v22, v21

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const v21, 0x32ff3c3e

    move-object v15, v14

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v24, v3

    move-object v3, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v4

    move-object/from16 v4, v24

    :goto_0
    xor-int v6, v21, v19

    mul-int/lit16 v6, v6, 0x7643

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v6, v18

    move-object/from16 v18, v2

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v1

    if-eqz v1, :cond_11

    goto/16 :goto_c

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_9

    :cond_1
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x794f

    const v22, -0xcbc491d

    xor-int v6, v6, v22

    const v22, 0x6c82f5e6

    goto/16 :goto_6

    .line 55
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u06df\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x27db

    const v22, -0x158c0d4e

    xor-int v6, v6, v22

    const v22, -0x68c53bb9

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v1

    if-gez v1, :cond_3

    goto/16 :goto_4

    :cond_3
    :goto_2
    const-string v1, "\u06eb\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x5aef

    const v22, 0x6db11b9a

    xor-int v6, v6, v22

    const v22, 0x5651da45

    goto/16 :goto_6

    .line 12
    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v1, :cond_4

    :goto_3
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_d

    :cond_4
    const-string v1, "\u1a78\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x435

    const v22, -0x3c9de7ed

    xor-int v6, v6, v22

    const v22, -0x23db1e53

    goto/16 :goto_6

    .line 7
    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v1

    if-lez v1, :cond_5

    goto/16 :goto_1

    :cond_5
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    goto/16 :goto_10

    .line 54
    :sswitch_5
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v1, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x663b

    const v22, 0x15aa59c8

    xor-int v6, v6, v22

    const v22, 0x430eb3d5

    goto/16 :goto_6

    .line 26
    :sswitch_6
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_4
    const-string v1, "\u1a77\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0xd

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x29fd

    const v22, -0x6d44ff49

    xor-int v6, v6, v22

    const v22, 0x29eaf54

    goto/16 :goto_6

    :sswitch_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_0

    goto :goto_3

    .line 10
    :sswitch_8
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto :goto_3

    .line 93
    :sswitch_9
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    const/4 v1, 0x0

    return-object v1

    .line 172
    :sswitch_a
    invoke-static {v3, v2}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v5, v1

    goto/16 :goto_5

    :sswitch_b
    invoke-static {v3, v8}, Ll/֨֫;->֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    move-object v14, v1

    move-object/from16 v6, v18

    goto/16 :goto_8

    .line 0
    :sswitch_c
    invoke-static {v10, v2}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_9

    const-string v1, "\u05ab\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x5d81

    const v22, 0x1add3178

    xor-int v6, v6, v22

    const v22, 0x278bb161

    goto/16 :goto_6

    :sswitch_d
    invoke-static {v10, v8}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v9, :cond_8

    const-string v1, "\u0733\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, -0x71c9

    const v22, 0x7c979e08

    xor-int v6, v6, v22

    const v22, -0x1af3dd86

    goto/16 :goto_6

    .line 171
    :sswitch_e
    invoke-static {v2, v12}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_9

    const-string v1, "\u06e2\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x3de1

    const v22, -0x292c4588

    xor-int v6, v6, v22

    const v22, 0x19055a10

    goto/16 :goto_6

    :sswitch_f
    invoke-static {v8, v12}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v11, :cond_8

    const-string v1, "\u06db\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x6883

    const v22, 0x14e8e963

    xor-int v6, v6, v22

    const v22, 0x5086b0f1

    goto/16 :goto_6

    :sswitch_10
    move-object v2, v15

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_9

    const-string v1, "\u073a\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x6f

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x7aa9

    const v22, 0x749f3bd2

    xor-int v6, v6, v22

    const v22, 0xea5ad8

    goto :goto_6

    .line 126
    :sswitch_11
    iput-object v5, v0, Ll/ۛ᩻᩷;->ܳ:Ljava/lang/CharSequence;

    return-object v4

    .line 171
    :sswitch_12
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v13, :cond_8

    const-string v1, "\u06d6\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v6, v1, v20

    mul-int/lit16 v6, v6, 0x4c19

    const v22, 0x378bafff

    xor-int v6, v6, v22

    const v22, 0x26e32ca3

    goto :goto_6

    :cond_8
    move-object/from16 v6, v18

    goto/16 :goto_7

    .line 125
    :sswitch_13
    iput-object v14, v0, Ll/ۛ᩻᩷;->᩻:Ljava/lang/CharSequence;

    .line 126
    iget-object v15, v0, Ll/ۛ᩻᩷;->ܳ:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v15, Ljava/lang/String;

    if-eqz v1, :cond_9

    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x21

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, 0x2759

    const v22, 0x64b0ae28

    xor-int v6, v6, v22

    const v22, -0x25944bea

    goto :goto_6

    :cond_9
    move-object v5, v15

    :goto_5
    const-string v1, "\u06e8\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0xd

    xor-int v6, v1, v19

    mul-int/lit16 v6, v6, -0x6245

    const v22, -0x5ff13cfc

    xor-int v6, v6, v22

    const v22, -0x32edd2d8

    :goto_6
    xor-int v22, v1, v22

    goto/16 :goto_11

    .line 117
    :sswitch_14
    invoke-static/range {v23 .. v23}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟᩻᩷;

    move-object/from16 v6, v18

    .line 118
    invoke-virtual {v1, v6}, Ll/۟᩻᩷;->֫(Lbin/mt/plugin/api/LocalString;)V

    move-object/from16 v18, v2

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v6, v18

    .line 121
    invoke-static/range {v17 .. v17}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟᩻᩷;

    .line 122
    invoke-virtual {v1, v3}, Ll/۟᩻᩷;->֫(Lbin/mt/plugin/api/PluginContext;)V

    move-object/from16 v18, v2

    goto/16 :goto_b

    :sswitch_16
    move-object/from16 v6, v18

    const/4 v12, 0x0

    const/4 v13, 0x3

    if-eqz v16, :cond_a

    const-string v1, "\u1a75\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x76ff

    const v22, -0x29bdc0

    xor-int v11, v11, v22

    const v22, -0x2cb1907f

    xor-int v22, v1, v22

    move-object/from16 v18, v6

    move v1, v11

    const/16 v11, 0x7b

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0x7b

    :goto_7
    move-object v14, v7

    :goto_8
    const-string v1, "\u06dc\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x1f

    move-object/from16 v18, v2

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x20cb

    const v22, 0x48bda0c

    xor-int v2, v2, v22

    const v22, -0x719afc9e

    goto/16 :goto_e

    :sswitch_17
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/4 v10, 0x1

    .line 127
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_c

    :cond_b
    const-string v1, "\u1a73\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x6f

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0xaef

    const v22, 0x6a10c9c0

    xor-int v2, v2, v22

    const v22, -0x169a795c

    goto/16 :goto_e

    :sswitch_18
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    const/16 v9, 0x7d

    .line 161
    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_c

    :goto_9
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0xdd9

    const v22, -0x766fb590

    xor-int v2, v2, v22

    const v22, -0x1e22837f

    goto/16 :goto_e

    :cond_c
    const-string v1, "\u06d8\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x29

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x368f

    const v22, 0x17cbe4ca

    xor-int v2, v2, v22

    const v22, -0xc2184c9

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 125
    iget-object v7, v0, Ll/ۛ᩻᩷;->᩻:Ljava/lang/CharSequence;

    .line 171
    instance-of v1, v7, Ljava/lang/String;

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v2, :cond_d

    move/from16 v16, v1

    goto/16 :goto_10

    :cond_d
    const-string v2, "\u06d9\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v20

    mul-int/lit8 v2, v2, -0x69

    move/from16 v16, v1

    xor-int v1, v2, v19

    mul-int/lit16 v1, v1, 0x6e97

    const v22, 0x34858236

    xor-int v1, v1, v22

    const v22, 0x716d0e1b    # 1.17384E30f

    xor-int v22, v2, v22

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static/range {v23 .. v23}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u06d6\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x2be1

    const v22, -0x74419a17

    xor-int v2, v2, v22

    const v22, -0x3a2ba839

    goto/16 :goto_e

    :sswitch_1b
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static/range {v17 .. v17}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u06d7\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x642b

    const v22, -0x337fdc44    # -6.7182048E7f

    xor-int v2, v2, v22

    const v22, 0x4a477790    # 3268068.0f

    goto/16 :goto_e

    :cond_e
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x57

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x2b2b

    const v22, 0x1bf3aa6d

    xor-int v2, v2, v22

    const v22, -0x3eb9a121

    goto/16 :goto_e

    :sswitch_1c
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 117
    invoke-static {v4}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v23, v1

    :goto_a
    const-string v1, "\u0736\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x5f4b

    const v22, 0x4850de03

    xor-int v2, v2, v22

    const v22, 0x6f5b7080

    goto/16 :goto_e

    :sswitch_1d
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 121
    invoke-static {v4}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v17, v1

    :goto_b
    const-string v1, "\u06d9\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x37a7

    const v22, -0x71fa1e03

    xor-int v2, v2, v22

    const v22, 0x26250ad3

    goto/16 :goto_e

    :sswitch_1e
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 116
    iget-object v3, v0, Ll/ۛ᩻᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    iget-object v4, v0, Ll/ۛ᩻᩷;->ۧ:Ljava/util/ArrayList;

    if-eqz v6, :cond_f

    const-string v1, "\u06e8\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x6c41

    const v22, 0x52fa1e55

    xor-int v2, v2, v22

    const v22, -0xee4606e

    goto/16 :goto_e

    :cond_f
    const-string v1, "\u06d8\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x64f

    const v22, 0x7b463cd4

    xor-int v2, v2, v22

    const v22, -0xd071f0d

    goto/16 :goto_e

    :sswitch_1f
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v1

    if-eqz v1, :cond_10

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u06e8\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x1f

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x6f89

    const v22, -0x7509a94

    xor-int v2, v2, v22

    const v22, 0x17da7092

    goto/16 :goto_e

    :goto_c
    const-string v1, "\u05a1\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x4119

    const v22, -0x6448db

    xor-int v2, v2, v22

    const v22, 0x1f867161

    goto/16 :goto_e

    :cond_11
    const-string v1, "\u06db\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x31

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x1c3f

    const v22, 0x39bd75b2

    xor-int v2, v2, v22

    const v22, 0x69e1008

    goto/16 :goto_e

    :sswitch_20
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_12

    goto :goto_d

    :cond_12
    const-string v1, "\u0733\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x1f61

    const v22, 0x6ada3e9d

    xor-int v2, v2, v22

    const v22, -0x47d03849

    goto/16 :goto_e

    :sswitch_21
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    .line 150
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_13

    goto :goto_d

    :cond_13
    const-string v1, "\u06d6\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x12b3

    const v22, 0x4fe3b19d

    xor-int v2, v2, v22

    const v22, -0x6829e19e

    goto :goto_e

    :sswitch_22
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_14

    :goto_d
    const-string v1, "\u06db\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x7f

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x78f1

    const v22, -0xe90113e

    xor-int v2, v2, v22

    const v22, -0x77b277c4

    goto :goto_e

    :cond_14
    const-string v1, "\u073a\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, 0x2925

    const v22, -0x693f6c4c

    xor-int v2, v2, v22

    const v22, -0x3ebf41be

    goto :goto_e

    :sswitch_23
    move-object/from16 v6, v18

    move-object/from16 v18, v2

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_15

    goto :goto_10

    :cond_15
    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x57

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x35df

    const v22, 0x415fa94a

    xor-int v2, v2, v22

    const v22, -0x6da107fc

    :goto_e
    xor-int v22, v1, v22

    move v1, v2

    :goto_f
    move-object/from16 v2, v18

    move-object/from16 v18, v6

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v18, v2

    .line 115
    iget-object v1, v0, Ll/ۛ᩻᩷;->ܽ:Lbin/mt/plugin/api/LocalString;

    sget-boolean v2, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v2, :cond_16

    move-object v6, v1

    :goto_10
    const-string v1, "\u06dc\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, 0x463b

    const v22, -0x696a9f63

    xor-int v2, v2, v22

    const v22, -0x628ce2cb

    goto :goto_e

    :cond_16
    const-string v2, "\u06eb\u06e7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v19

    mul-int/lit16 v6, v6, 0x4d73

    const v22, 0x46f04bce

    xor-int v6, v6, v22

    const v22, -0x197d70f6

    xor-int v22, v2, v22

    move-object/from16 v2, v18

    move-object/from16 v18, v1

    :goto_11
    move v1, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x740616ea -> :sswitch_0
        -0x6d5e8264 -> :sswitch_c
        -0x697e6246 -> :sswitch_14
        -0x68a720d5 -> :sswitch_18
        -0x676bd408 -> :sswitch_13
        -0x666afe77 -> :sswitch_1c
        -0x62665896 -> :sswitch_16
        -0x5ef335f2 -> :sswitch_24
        -0x5dacfd59 -> :sswitch_7
        -0x5819ef1e -> :sswitch_15
        -0x5095355c -> :sswitch_23
        -0x504521b5 -> :sswitch_1a
        -0x4bf4cbb8 -> :sswitch_d
        -0x47d2d246 -> :sswitch_22
        -0x46e16eb9 -> :sswitch_24
        -0x43738bb3 -> :sswitch_a
        -0x43064366 -> :sswitch_1f
        -0x41e32120 -> :sswitch_c
        -0x3efd3106 -> :sswitch_13
        -0x379518d2 -> :sswitch_18
        -0x3756be9c -> :sswitch_6
        -0x35d50d43 -> :sswitch_a
        -0x34bd807f -> :sswitch_f
        -0x347ba52f -> :sswitch_1b
        -0x345b6e62 -> :sswitch_4
        -0x296fe5de -> :sswitch_21
        -0x294b1bd1 -> :sswitch_20
        -0x25cfcd2a -> :sswitch_10
        -0x24dd5c34 -> :sswitch_d
        -0x220a31cf -> :sswitch_3
        -0x20b496c4 -> :sswitch_1e
        -0x208b134c -> :sswitch_16
        -0x1b00a14a -> :sswitch_1a
        -0x14aab527 -> :sswitch_17
        -0xdd8b210 -> :sswitch_0
        -0xb82d972 -> :sswitch_9
        -0x8ad3e1a -> :sswitch_5
        -0x37686e9 -> :sswitch_19
        -0x2f81485 -> :sswitch_17
        0xb1da11 -> :sswitch_1
        0x81550ac -> :sswitch_e
        0x8ad4d83 -> :sswitch_b
        0xe8498e5 -> :sswitch_14
        0xe9c0c5e -> :sswitch_e
        0x12b12fa0 -> :sswitch_b
        0x1394a178 -> :sswitch_7
        0x1c9ed053 -> :sswitch_2
        0x1e547514 -> :sswitch_11
        0x2078b2d9 -> :sswitch_8
        0x221aa04e -> :sswitch_19
        0x25b92c54 -> :sswitch_11
        0x28c91315 -> :sswitch_2
        0x2eacc473 -> :sswitch_1e
        0x3039703c -> :sswitch_15
        0x31865398 -> :sswitch_4
        0x31e0f8c4 -> :sswitch_9
        0x3a66aaa9 -> :sswitch_6
        0x3eecdd67 -> :sswitch_12
        0x3f62ddca -> :sswitch_1f
        0x4a15b503 -> :sswitch_21
        0x538c00dd -> :sswitch_22
        0x583c198e -> :sswitch_1
        0x5c38dc69 -> :sswitch_12
        0x5c7ae6f8 -> :sswitch_f
        0x5dce6773 -> :sswitch_20
        0x60398b67 -> :sswitch_1d
        0x6a796f70 -> :sswitch_8
        0x6abf0b4e -> :sswitch_10
        0x6d269a02 -> :sswitch_23
        0x70d27bd8 -> :sswitch_5
        0x77255c6f -> :sswitch_3
        0x795cc63c -> :sswitch_1d
        0x7abfa74b -> :sswitch_1c
        0x7b1e9eca -> :sswitch_1b
    .end sparse-switch
.end method
