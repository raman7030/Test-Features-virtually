.class public final synthetic Ll/ۤۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/ۛۘۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۘۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۘۡ;->᩸:Ll/ۛۘۡ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, -0x5cce729

    sget v1, Ll/᩺;->ۙۛܶ:I

    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x604f

    const v5, 0x6ce3c76d

    xor-int/2addr v4, v5

    const v5, -0x296f23f7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4723

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    iget-object p1, p0, Ll/ۤۘۡ;->᩸:Ll/ۛۘۡ;

    invoke-static {p1}, Ll/ۛۘۡ;->ܽ(Ll/ۛۘۡ;)Ll/۠۠᩵;

    move-result-object p1

    return-object p1

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-lez v3, :cond_7

    goto :goto_1

    .line 4
    :sswitch_1
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73dd

    const v5, 0x6a541689

    xor-int/2addr v4, v5

    const v5, 0x6a7eb8fd

    goto :goto_0

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_a

    goto/16 :goto_4

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    const/4 p1, 0x0

    return-object p1

    .line 0
    :sswitch_5
    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    .line 4
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_1

    const-string v3, "\u073d\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71f1

    const v5, -0x53bd7486

    xor-int/2addr v4, v5

    const v5, 0x60ab086

    goto :goto_0

    :cond_1
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6df5

    const v5, 0x3d63ed0f

    xor-int/2addr v4, v5

    const v5, 0x7b3eda6c

    goto :goto_0

    :sswitch_6
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7fcf

    const v5, -0x6e9dc13

    xor-int/2addr v4, v5

    const v5, -0x1a79ef2f

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06da\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5bad

    const v5, -0x783686b1

    xor-int/2addr v4, v5

    const v5, -0x1cbf0203

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u05ab\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ec7

    const v5, 0x7ee47930

    xor-int/2addr v4, v5

    const v5, -0x15dbc59f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3fd3

    const v5, 0x2ca14106

    xor-int/2addr v4, v5

    const v5, -0x6dac00d5

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u073a\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x249b

    const v5, 0x537c620c

    xor-int/2addr v4, v5

    const v5, -0x114b77bd

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u1a78\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x615

    const v5, 0x4e8f807a

    xor-int/2addr v4, v5

    const v5, -0x74e7c0fa

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a75\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f91

    const v5, -0x4d1232a2

    xor-int/2addr v4, v5

    const v5, 0x5dfb1302

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a41

    const v5, 0x37c6fbf0

    xor-int/2addr v4, v5

    const v5, 0x1199fb61

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u0736\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xff1

    const v5, 0x4aec81c7    # 7749859.5f

    xor-int/2addr v4, v5

    const v5, -0x2ab992ff

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x76d7

    const v5, 0x3b024982

    xor-int/2addr v4, v5

    const v5, -0x3f53888b

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7189

    const v5, 0x289059a

    xor-int/2addr v4, v5

    const v5, 0x6b52d594

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x13a5

    const v5, 0x22c9eb21

    xor-int/2addr v4, v5

    const v5, 0x2b001f2c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71aeb9eb -> :sswitch_0
        -0x70e1f573 -> :sswitch_6
        -0x663dc87f -> :sswitch_b
        -0x5ca42a72 -> :sswitch_d
        -0x4804edfd -> :sswitch_5
        -0x4107fd71 -> :sswitch_1
        -0x22ecf295 -> :sswitch_6
        -0x20387593 -> :sswitch_7
        -0x1f280401 -> :sswitch_0
        -0xbf4cd56 -> :sswitch_4
        -0x4f02f6f -> :sswitch_7
        0x3130a50 -> :sswitch_1
        0x12cd7071 -> :sswitch_2
        0x15795a77 -> :sswitch_e
        0x18f16b40 -> :sswitch_a
        0x1a081fff -> :sswitch_8
        0x1cb24c3f -> :sswitch_3
        0x295be952 -> :sswitch_8
        0x2b505024 -> :sswitch_a
        0x2d375b75 -> :sswitch_4
        0x41fc282d -> :sswitch_9
        0x4f944f7e -> :sswitch_3
        0x5ecb1683 -> :sswitch_e
        0x63829011 -> :sswitch_c
        0x6dddf118 -> :sswitch_5
        0x730b6b4c -> :sswitch_b
        0x73e7742b -> :sswitch_2
        0x78b3f98f -> :sswitch_c
        0x7ed6464a -> :sswitch_d
        0x7f6a7b13 -> :sswitch_9
    .end sparse-switch
.end method
