.class public final Ll/ۗۖ᩷;
.super Ljava/lang/Object;
.source "V60Y"


# static fields
.field public static final ֫:Ljava/util/HashMap;

.field public static ۧ:Ljava/lang/Class;

.field public static final ܽ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x2b71f1bd

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6819

    const v6, 0x5a66c072

    xor-int/2addr v5, v6

    const v6, -0x1abc8522

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4e75

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 38
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    .line 42
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v4

    if-gez v4, :cond_b

    goto :goto_1

    :sswitch_1
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    .line 23
    :sswitch_2
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 89
    :sswitch_5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۗۖ᩷;->֫:Ljava/util/HashMap;

    return-void

    .line 19
    :sswitch_6
    sput-object v0, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    .line 72
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u1a77\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xee9

    const v6, 0x6a9b573a

    xor-int/2addr v5, v6

    const v6, 0x5c460fbd

    goto :goto_0

    .line 64
    :sswitch_7
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u06d7\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2f4d

    const v6, -0x1d997dca

    xor-int/2addr v5, v6

    const v6, -0x57cee952

    goto :goto_0

    :cond_2
    const-string v4, "\u073f\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x8ff

    const v6, 0x715df8d2

    xor-int/2addr v5, v6

    const v6, -0x6d1bfe12

    goto/16 :goto_0

    .line 76
    :sswitch_8
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u05a8\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6919

    const v6, -0x480b848e

    xor-int/2addr v5, v6

    const v6, 0x14f92598

    goto/16 :goto_0

    .line 34
    :sswitch_9
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u1a74\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xf5b

    const v6, -0x48968669

    xor-int/2addr v5, v6

    const v6, 0x6c2ef773

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a79\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x140f

    const v6, 0x5b10a1c3

    xor-int/2addr v5, v6

    const v6, -0x2db39986

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u1a76\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x62ef

    const v6, -0x5635a2f6

    xor-int/2addr v5, v6

    const v6, -0x59db3e34

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073a\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x19cb

    const v6, 0x2dbb79f

    xor-int/2addr v5, v6

    const v6, -0x4a8337b4

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u073d\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x337d

    const v6, 0x4ab1ac69    # 5822004.5f

    xor-int/2addr v5, v6

    const v6, -0x2e628dff

    goto/16 :goto_0

    .line 53
    :sswitch_c
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v4

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x45ff

    const v6, 0x1008617e

    xor-int/2addr v5, v6

    const v6, -0x4ea5f779

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a8\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2f81

    const v6, -0x4dd58f66

    xor-int/2addr v5, v6

    const v6, 0x622d30ca

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a75\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x424f

    const v6, 0x2492e776

    xor-int/2addr v5, v6

    const v6, 0x4fa94f4c

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5181

    const v6, 0x5862bf70

    xor-int/2addr v5, v6

    const v6, 0x2d26f745

    goto/16 :goto_0

    .line 19
    :sswitch_e
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06da\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5c97

    const v6, 0x34b26aa5

    xor-int/2addr v5, v6

    const v6, 0x5f584c49

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0730\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x622f

    const v6, 0x4288b34a

    xor-int/2addr v5, v6

    const v6, -0x7bb17ca0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e03c376 -> :sswitch_2
        -0x7d0f7464 -> :sswitch_4
        -0x69900047 -> :sswitch_c
        -0x565490ca -> :sswitch_2
        -0x560fc31e -> :sswitch_5
        -0x3e753ec6 -> :sswitch_e
        -0x3bbfd672 -> :sswitch_d
        -0x39b6085b -> :sswitch_5
        -0x30f40487 -> :sswitch_9
        -0x2ba37c2e -> :sswitch_8
        -0x21b6213d -> :sswitch_3
        -0x122e0fcf -> :sswitch_e
        -0x60f2777 -> :sswitch_0
        0x3073915 -> :sswitch_6
        0x20b9273d -> :sswitch_0
        0x22e6ab26 -> :sswitch_b
        0x24ce5a7a -> :sswitch_1
        0x26355367 -> :sswitch_c
        0x2ce0e52c -> :sswitch_8
        0x3d1164a0 -> :sswitch_a
        0x407e4b2f -> :sswitch_a
        0x43acf64f -> :sswitch_9
        0x49312752 -> :sswitch_7
        0x4ad00d57 -> :sswitch_4
        0x4c7fd4b2 -> :sswitch_6
        0x589ad104 -> :sswitch_3
        0x5927da7a -> :sswitch_b
        0x6815105a -> :sswitch_1
        0x68b993b7 -> :sswitch_d
        0x749f048b -> :sswitch_7
    .end sparse-switch
.end method

.method public static ֫()Ljava/lang/Class;
    .locals 1

    .line 132
    sget-object v0, Ll/ۗۖ᩷;->ۧ:Ljava/lang/Class;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 0
    const-class v0, Ll/ۗۖ᩷;

    monitor-enter v0

    .line 79
    :try_start_0
    sget-object v1, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    invoke-static {v1, p0}, Ll/֨۟;->ᩳۨ᩺(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۙۖ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 81
    monitor-exit v0

    return-object v1

    .line 152
    :cond_0
    :try_start_1
    iget-object p0, p0, Ll/ۙۖ᩷;->ۧ:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p0, :cond_1

    .line 84
    monitor-exit v0

    return-object v1

    .line 86
    :cond_1
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 2
    const-class v0, Ll/ۗۖ᩷;

    .line 3
    monitor-enter v0

    .line 28
    :try_start_0
    sget-object v1, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    new-instance v2, Ll/ۙۖ᩷;

    invoke-direct {v2, p0, p1}, Ll/ۙۖ᩷;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    invoke-static {v1, p2, v2}, Ll/ۘۛ;->ᩳۚ᩺(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ll/ۗܺ᩷;)V
    .locals 5

    .line 2
    const-class v0, Ll/ۗۖ᩷;

    .line 3
    monitor-enter v0

    .line 107
    :try_start_0
    invoke-static {p0}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p0

    .line 108
    sget-object v1, Ll/ۗۖ᩷;->ۧ:Ljava/lang/Class;

    if-eq v1, p0, :cond_0

    .line 110
    sput-object p0, Ll/ۗۖ᩷;->ۧ:Ljava/lang/Class;

    .line 112
    :cond_0
    sget-object v1, Ll/ۗۖ᩷;->֫:Ljava/util/HashMap;

    invoke-static {}, Ll/֫ܿ;->ۤ֨ۨ()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ۘᩴ;->᩵᩺ܳ(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, p0, v2}, Ll/ۘۛ;->ᩳۚ᩺(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v1, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/ۗ᩵;->ۧ֡֫(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-static {v1}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 116
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙۖ᩷;

    iget-object v4, v4, Ll/ۙۖ᩷;->֫:Ljava/lang/Class;

    if-ne v4, p0, :cond_1

    if-nez v2, :cond_2

    .line 118
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 119
    :cond_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v2, v3}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    .line 123
    invoke-static {v2}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p0}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 124
    sget-object v2, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 128
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 0
    const-class v0, Ll/ۗۖ᩷;

    monitor-enter v0

    .line 62
    :try_start_0
    sget-object v1, Ll/ۗۖ᩷;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۙۖ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 64
    monitor-exit v0

    return-object v1

    .line 152
    :cond_0
    :try_start_1
    iget-object p0, p0, Ll/ۙۖ᩷;->ۧ:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p0, :cond_1

    .line 67
    monitor-exit v0

    return-object v1

    .line 69
    :cond_1
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method
