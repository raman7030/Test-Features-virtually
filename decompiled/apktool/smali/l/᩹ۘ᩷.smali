.class public final synthetic Ll/᩹ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۘ᩷;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4472f18f    # -0.0043047f

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v4, "\u06dc\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x23a5

    const v6, 0x57da8420

    xor-int/2addr v5, v6

    const v6, 0x1a5b2bf6

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x73ab

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 1826
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_a

    goto/16 :goto_3

    .line 1932
    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-lez v4, :cond_b

    goto/16 :goto_2

    .line 1911
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_7

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u1a74\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3d7b

    const v6, 0x2a4e8c97

    xor-int/2addr v5, v6

    const v6, -0x6f4f5ed6

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto/16 :goto_2

    .line 1238
    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    const/4 p1, 0x0

    return p1

    .line 4
    :sswitch_5
    check-cast p2, Ll/ۙᩴ᩷;

    .line 6
    sget p1, Ll/֫᩵᩷;->ۛۧ:I

    .line 2291
    iget-object p1, p0, Ll/᩹ۘ᩷;->᩸:Ljava/util/Comparator;

    invoke-interface {p1, p2, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 2
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩷;

    .line 1386
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06d9\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7433

    const v6, 0x61962377

    xor-int/2addr v5, v6

    const v6, 0x264188ff

    goto :goto_0

    .line 1587
    :sswitch_7
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06dc\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3a89

    const v6, -0x4d7bb5c3

    xor-int/2addr v5, v6

    const v6, 0x644ca848

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u05ab\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1bdf

    const v6, -0x78a259b9

    xor-int/2addr v5, v6

    const v6, 0x54449f79

    goto/16 :goto_0

    .line 122
    :sswitch_9
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a78\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x72d3

    const v6, -0x1fdb1081

    xor-int/2addr v5, v6

    const v6, 0x4a0e2e09    # 2329474.2f

    goto/16 :goto_0

    .line 784
    :sswitch_a
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-ltz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u1a7b\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6e3f

    const v6, -0x15a02499

    xor-int/2addr v5, v6

    const v6, -0x2a6fd420

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u1a7b\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x35bf

    const v6, 0x3d00ced6

    xor-int/2addr v5, v6

    const v6, 0x4d1cedb5    # 1.64551504E8f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x807

    const v6, 0x11ad03f4

    xor-int/2addr v5, v6

    const v6, 0x238bcbfd

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6401

    const v6, 0x11d34db8

    xor-int/2addr v5, v6

    const v6, 0x47a8126a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06eb\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x623b

    const v6, -0x6b1017be

    xor-int/2addr v5, v6

    const v6, 0x48667807    # 236000.11f

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a77\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1bf

    const v6, -0x34e64926    # -1.0073818E7f

    xor-int/2addr v5, v6

    const v6, 0x3e2788c0

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u1a79\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5fd1

    const v6, -0x2c14fa89

    xor-int/2addr v5, v6

    const v6, 0x61016a8a

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073d\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x49db

    const v6, 0x68ff9332

    xor-int/2addr v5, v6

    const v6, 0x2dc7ad70

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06df\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7fb5

    const v6, -0x5f0a1d4b

    xor-int/2addr v5, v6

    const v6, 0x3df9ccf7

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x35ff

    const v6, 0x516596e1

    xor-int/2addr v5, v6

    const v6, 0x7d761966

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d543a25 -> :sswitch_e
        -0x7ca501e8 -> :sswitch_9
        -0x77656cbf -> :sswitch_7
        -0x6218864f -> :sswitch_1
        -0x53908ea0 -> :sswitch_3
        -0x4769570f -> :sswitch_8
        -0x3313bd5b -> :sswitch_c
        -0x31a3f231 -> :sswitch_5
        -0x28ed6c8d -> :sswitch_a
        -0x1eb1e2fa -> :sswitch_8
        -0x1dba34c3 -> :sswitch_b
        0xe67c2cc -> :sswitch_3
        0x116166ac -> :sswitch_2
        0x1a29a795 -> :sswitch_6
        0x1ea69db7 -> :sswitch_c
        0x22ae7fb8 -> :sswitch_6
        0x27df700e -> :sswitch_4
        0x2b23ae7f -> :sswitch_2
        0x30f90798 -> :sswitch_a
        0x325fa794 -> :sswitch_9
        0x47ab9e60 -> :sswitch_5
        0x4c2d8740 -> :sswitch_d
        0x4c926a2b -> :sswitch_e
        0x5c13da82 -> :sswitch_1
        0x64b06dae -> :sswitch_b
        0x651b3196 -> :sswitch_0
        0x6e9862cd -> :sswitch_7
        0x75d43f79 -> :sswitch_4
        0x7aca45b4 -> :sswitch_0
        0x7c31345f -> :sswitch_d
    .end sparse-switch
.end method
