.class public final Ll/ۡۜܿ;
.super Ll/۬ᩴܺ;
.source "096Y"


# static fields
.field public static final ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ۢ:Ljava/math/BigDecimal;

.field public static final ܳ:Ll/۫ۘܽ;

.field public static final ܿ:Ll/ۨۘܽ;

.field public static final ᩷:Ll/۫ۘܽ;

.field public static final ᩻:Ll/۫ۘܽ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v2, v1

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Ll/ۡۜܿ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x2

    const-string v1, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)"

    .line 21
    invoke-static {v0, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v1

    sput-object v1, Ll/ۡۜܿ;->ܿ:Ll/ۨۘܽ;

    const-string v1, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])"

    .line 22
    invoke-static {v0, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۡۜܿ;->᩻:Ll/۫ۘܽ;

    const-string v0, "-?\\d+"

    .line 23
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    const-string v0, "-?\\d+(\\.\\d+)?%?"

    .line 24
    invoke-static {v0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    const-wide/16 v0, 0xff

    .line 25
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Ll/ۡۜܿ;->ۢ:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۡۜܿ;->ܽ:I

    iput p2, p0, Ll/ۡۜܿ;->֫:I

    iput p3, p0, Ll/ۡۜܿ;->ᩳ:I

    iput p4, p0, Ll/ۡۜܿ;->ۧ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;ILl/ۖۢܿ;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, -0x1

    const/4 v6, 0x7

    const/4 v7, 0x5

    const/high16 v8, 0x437f0000    # 255.0f

    const/high16 v9, 0x43b40000    # 360.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x3

    const/16 v12, 0xff

    const/4 v13, 0x0

    const/4 v14, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_d

    .line 907
    :pswitch_0
    invoke-static/range {p0 .. p2}, Ll/ۡۜܿ;->֫(Ljava/lang/String;ILl/᩷ۜܿ;)I

    move-result v0

    return v0

    .line 868
    :pswitch_1
    sget-object v2, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 869
    :try_start_0
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    invoke-static {v2, v3, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v3, :cond_0

    .line 871
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    .line 872
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v5

    goto :goto_0

    :cond_0
    move-object v3, v14

    .line 874
    :goto_0
    monitor-exit v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_4

    .line 879
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 880
    :try_start_1
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 947
    invoke-virtual {v2, v5}, Ll/۫ۘܽ;->find(I)Z

    move-result v0

    invoke-static {v2, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_3

    .line 882
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v4

    invoke-static {v2, v4, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v4, :cond_2

    .line 884
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v5

    invoke-static {v2, v5, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v5, :cond_1

    .line 886
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    :cond_1
    move-object/from16 v17, v14

    move-object v14, v0

    move-object/from16 v0, v17

    goto :goto_1

    :cond_2
    move-object v4, v14

    move-object v14, v0

    move-object v0, v4

    goto :goto_1

    :cond_3
    move-object v0, v14

    move-object v4, v0

    .line 890
    :goto_1
    monitor-exit v16

    move-object/from16 v17, v14

    move-object v14, v0

    move-object/from16 v0, v17

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_4
    move-object v0, v14

    move-object v4, v0

    :goto_2
    if-eqz v14, :cond_41

    .line 892
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v11, :cond_5

    goto/16 :goto_d

    .line 895
    :cond_5
    invoke-static {v3}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v1

    .line 896
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 897
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 898
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    cmpg-float v4, v1, v13

    if-ltz v4, :cond_41

    cmpl-float v4, v1, v10

    if-gtz v4, :cond_41

    if-ltz v0, :cond_41

    if-gt v0, v12, :cond_41

    if-ltz v2, :cond_41

    if-gt v2, v12, :cond_41

    if-ltz v3, :cond_41

    if-le v3, v12, :cond_6

    goto/16 :goto_d

    :cond_6
    mul-float v1, v1, v8

    float-to-int v1, v1

    .line 902
    invoke-static {v1, v0, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    :catchall_1
    move-exception v0

    .line 874
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 838
    :pswitch_2
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 839
    :try_start_3
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v2, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_8

    .line 841
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    invoke-static {v2, v3, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v3, :cond_9

    .line 843
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v4

    invoke-static {v2, v4, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v4, :cond_7

    .line 845
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v5

    invoke-static {v2, v5, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v5, :cond_a

    .line 847
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_3

    :cond_7
    move-object v4, v14

    goto :goto_3

    :cond_8
    move-object v0, v14

    :cond_9
    move-object v3, v14

    move-object v4, v3

    .line 852
    :cond_a
    :goto_3
    monitor-exit v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v14, :cond_41

    .line 853
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v11, :cond_b

    goto/16 :goto_d

    .line 856
    :cond_b
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 857
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 858
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 859
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ltz v1, :cond_41

    if-gt v1, v12, :cond_41

    if-ltz v0, :cond_41

    if-gt v0, v12, :cond_41

    if-ltz v2, :cond_41

    if-gt v2, v12, :cond_41

    if-ltz v3, :cond_41

    if-le v3, v12, :cond_c

    goto/16 :goto_d

    .line 863
    :cond_c
    invoke-static {v1, v0, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    :catchall_2
    move-exception v0

    .line 852
    :try_start_4
    monitor-exit v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    .line 592
    :pswitch_3
    sget-object v5, Ll/ۡۜܿ;->᩻:Ll/۫ۘܽ;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 593
    :try_start_5
    invoke-virtual {v5, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v5, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_d

    .line 594
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    .line 596
    :cond_d
    monitor-exit v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v14, :cond_41

    .line 597
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v7, :cond_41

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v6, :cond_e

    goto/16 :goto_d

    .line 444
    :cond_e
    invoke-virtual {v14}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 445
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    const/high16 v5, -0x1000000

    const/16 v8, 0x8

    const/4 v9, 0x4

    if-eq v1, v11, :cond_12

    if-eq v1, v9, :cond_11

    const/4 v10, 0x6

    if-eq v1, v10, :cond_10

    if-ne v1, v8, :cond_f

    .line 477
    aget-char v1, v0, v10

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x1c

    .line 478
    aget-char v5, v0, v6

    invoke-static {v5}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v5

    shl-int/lit8 v5, v5, 0x18

    or-int/2addr v1, v5

    .line 479
    aget-char v2, v0, v2

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x14

    or-int/2addr v1, v2

    .line 480
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    .line 481
    aget-char v2, v0, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    .line 482
    aget-char v2, v0, v11

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v8

    or-int/2addr v1, v2

    .line 483
    aget-char v2, v0, v9

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v9

    or-int/2addr v1, v2

    .line 484
    aget-char v0, v0, v7

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    or-int/2addr v0, v1

    return v0

    .line 487
    :cond_f
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Hex color format error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 469
    :cond_10
    aget-char v1, v0, v2

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr v1, v5

    .line 470
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    .line 471
    aget-char v2, v0, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    .line 472
    aget-char v2, v0, v11

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v8

    or-int/2addr v1, v2

    .line 473
    aget-char v2, v0, v9

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v9

    or-int/2addr v1, v2

    .line 474
    aget-char v0, v0, v7

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    or-int/2addr v0, v1

    return v0

    .line 458
    :cond_11
    aget-char v1, v0, v11

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x1c

    .line 459
    aget-char v5, v0, v11

    invoke-static {v5}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v5

    shl-int/lit8 v5, v5, 0x18

    or-int/2addr v1, v5

    .line 460
    aget-char v5, v0, v2

    invoke-static {v5}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v5

    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v1, v5

    .line 461
    aget-char v2, v0, v2

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    .line 462
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    .line 463
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v8

    or-int/2addr v1, v2

    .line 464
    aget-char v2, v0, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v9

    or-int/2addr v1, v2

    .line 465
    aget-char v0, v0, v4

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    or-int/2addr v0, v1

    return v0

    .line 448
    :cond_12
    aget-char v1, v0, v2

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr v1, v5

    .line 449
    aget-char v2, v0, v2

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    .line 450
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v1, v2

    .line 451
    aget-char v2, v0, v3

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v8

    or-int/2addr v1, v2

    .line 452
    aget-char v2, v0, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v9

    or-int/2addr v1, v2

    .line 453
    aget-char v0, v0, v4

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    or-int/2addr v0, v1

    return v0

    :catchall_3
    move-exception v0

    .line 596
    :try_start_6
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0

    .line 806
    :pswitch_4
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 807
    :try_start_7
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v2, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_14

    .line 809
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    invoke-static {v2, v3, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v3, :cond_15

    .line 811
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v4

    invoke-static {v2, v4, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v4, :cond_13

    .line 813
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v5

    invoke-static {v2, v5, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v5, :cond_16

    .line 815
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    :cond_13
    move-object v4, v14

    goto :goto_4

    :cond_14
    move-object v0, v14

    :cond_15
    move-object v3, v14

    move-object v4, v3

    .line 820
    :cond_16
    :goto_4
    monitor-exit v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    if-eqz v14, :cond_41

    .line 821
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v11, :cond_17

    goto/16 :goto_d

    .line 824
    :cond_17
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 825
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 826
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 827
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ltz v0, :cond_41

    if-gt v0, v12, :cond_41

    if-ltz v1, :cond_41

    if-gt v1, v12, :cond_41

    if-ltz v2, :cond_41

    if-gt v2, v12, :cond_41

    if-ltz v3, :cond_41

    if-le v3, v12, :cond_18

    goto/16 :goto_d

    .line 831
    :cond_18
    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    :catchall_4
    move-exception v0

    .line 820
    :try_start_8
    monitor-exit v16
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v0

    .line 770
    :pswitch_5
    sget-object v5, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 771
    :try_start_9
    invoke-virtual {v5, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v5, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_1a

    .line 773
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v5, v6, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v6, :cond_1b

    .line 775
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v7

    invoke-static {v5, v7, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v7, :cond_19

    .line 777
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v7

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v15

    invoke-static {v5, v15, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v15, :cond_1c

    .line 779
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_5

    :cond_19
    move-object v7, v14

    goto :goto_5

    :cond_1a
    move-object v0, v14

    :cond_1b
    move-object v6, v14

    move-object v7, v6

    .line 784
    :cond_1c
    :goto_5
    monitor-exit v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    if-nez v14, :cond_1d

    goto/16 :goto_d

    .line 788
    :cond_1d
    invoke-static {v0}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v0

    .line 789
    invoke-static {v6}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v1

    .line 790
    invoke-static {v7}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v5

    .line 791
    invoke-static {v14}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v6

    cmpl-float v7, v0, v9

    if-nez v7, :cond_1e

    const/4 v0, 0x0

    :cond_1e
    cmpg-float v7, v0, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v0, v9

    if-gtz v7, :cond_41

    cmpg-float v7, v1, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v1, v10

    if-gtz v7, :cond_41

    cmpg-float v7, v5, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v5, v10

    if-gtz v7, :cond_41

    cmpg-float v7, v6, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v6, v10

    if-lez v7, :cond_1f

    goto/16 :goto_d

    :cond_1f
    mul-float v6, v6, v8

    float-to-int v6, v6

    and-int/2addr v6, v12

    new-array v7, v11, [F

    aput v0, v7, v2

    aput v1, v7, v3

    aput v5, v7, v4

    .line 799
    invoke-static {v6, v7}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    return v0

    :catchall_5
    move-exception v0

    .line 784
    :try_start_a
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    throw v0

    .line 733
    :pswitch_6
    sget-object v5, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 734
    :try_start_b
    invoke-virtual {v5, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v5, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_21

    .line 736
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v5, v6, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v6, :cond_22

    .line 738
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v7

    invoke-static {v5, v7, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v7, :cond_20

    .line 740
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v7

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v15

    invoke-static {v5, v15, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v15, :cond_23

    .line 742
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_6

    :cond_20
    move-object v7, v14

    goto :goto_6

    :cond_21
    move-object v0, v14

    :cond_22
    move-object v6, v14

    move-object v7, v6

    .line 747
    :cond_23
    :goto_6
    monitor-exit v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-nez v14, :cond_24

    goto/16 :goto_d

    .line 751
    :cond_24
    invoke-static {v0}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v0

    .line 752
    invoke-static {v6}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v1

    .line 753
    invoke-static {v7}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v5

    .line 754
    invoke-static {v14}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v6

    cmpl-float v7, v0, v9

    if-nez v7, :cond_25

    const/4 v0, 0x0

    :cond_25
    cmpg-float v7, v0, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v0, v9

    if-gtz v7, :cond_41

    cmpg-float v7, v1, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v1, v10

    if-gtz v7, :cond_41

    cmpg-float v7, v5, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v5, v10

    if-gtz v7, :cond_41

    cmpg-float v7, v6, v13

    if-ltz v7, :cond_41

    cmpl-float v7, v6, v10

    if-lez v7, :cond_26

    goto/16 :goto_d

    :cond_26
    new-array v7, v11, [F

    aput v0, v7, v2

    aput v1, v7, v3

    aput v5, v7, v4

    .line 761
    invoke-static {v7}, Ll/۟ۗ;->֫([F)I

    move-result v0

    const v1, 0xffffff

    and-int/2addr v0, v1

    mul-float v6, v6, v8

    float-to-int v1, v6

    and-int/2addr v1, v12

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0

    :catchall_6
    move-exception v0

    .line 747
    :try_start_c
    monitor-exit v16
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    throw v0

    .line 695
    :pswitch_7
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 696
    :try_start_d
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    invoke-static {v2, v3, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v3, :cond_28

    .line 698
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v4

    invoke-static {v2, v4, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v4, :cond_29

    .line 700
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v2, v6, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v6, :cond_27

    .line 702
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v5

    .line 703
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v2

    goto :goto_8

    :cond_27
    move-object v5, v14

    goto :goto_7

    :cond_28
    move-object v3, v14

    :cond_29
    move-object v4, v14

    move-object v5, v4

    :goto_7
    const/4 v2, -0x1

    .line 707
    :goto_8
    monitor-exit v16
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-eqz v5, :cond_2b

    .line 709
    sget-object v6, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v6

    monitor-enter v16

    .line 710
    :try_start_e
    invoke-virtual {v6, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 947
    invoke-virtual {v6, v2}, Ll/۫ۘܽ;->find(I)Z

    move-result v0

    invoke-static {v6, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_2a

    .line 712
    invoke-virtual {v6}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    .line 714
    :cond_2a
    monitor-exit v16

    goto :goto_9

    :catchall_7
    move-exception v0

    monitor-exit v16
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    throw v0

    :cond_2b
    :goto_9
    if-eqz v14, :cond_41

    .line 716
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v11, :cond_41

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v11, :cond_41

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v11, :cond_2c

    goto/16 :goto_d

    .line 719
    :cond_2c
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 720
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 721
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 722
    invoke-static {v14}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v3

    if-ltz v0, :cond_41

    if-gt v0, v12, :cond_41

    if-ltz v1, :cond_41

    if-gt v1, v12, :cond_41

    if-ltz v2, :cond_41

    if-gt v2, v12, :cond_41

    cmpg-float v4, v3, v13

    if-ltz v4, :cond_41

    cmpl-float v4, v3, v10

    if-lez v4, :cond_2d

    goto/16 :goto_d

    :cond_2d
    mul-float v3, v3, v8

    float-to-int v3, v3

    .line 726
    invoke-static {v3, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0

    :catchall_8
    move-exception v0

    .line 707
    :try_start_f
    monitor-exit v16
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    throw v0

    .line 663
    :pswitch_8
    sget-object v5, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 664
    :try_start_10
    invoke-virtual {v5, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v5, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_2f

    .line 666
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v5, v6, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v6, :cond_2e

    .line 668
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v7

    invoke-static {v5, v7, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v7, :cond_30

    .line 670
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_a

    :cond_2e
    move-object v6, v14

    goto :goto_a

    :cond_2f
    move-object v0, v14

    move-object v6, v0

    .line 674
    :cond_30
    :goto_a
    monitor-exit v16
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    if-nez v14, :cond_31

    goto/16 :goto_d

    .line 678
    :cond_31
    invoke-static {v0}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v0

    .line 679
    invoke-static {v6}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v1

    .line 680
    invoke-static {v14}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v5

    cmpl-float v6, v0, v9

    if-nez v6, :cond_32

    const/4 v0, 0x0

    :cond_32
    cmpg-float v6, v0, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v0, v9

    if-gtz v6, :cond_41

    cmpg-float v6, v1, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v1, v10

    if-gtz v6, :cond_41

    cmpg-float v6, v5, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v5, v10

    if-lez v6, :cond_33

    goto/16 :goto_d

    :cond_33
    new-array v6, v11, [F

    aput v0, v6, v2

    aput v1, v6, v3

    aput v5, v6, v4

    .line 687
    invoke-static {v6}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    return v0

    :catchall_9
    move-exception v0

    .line 674
    :try_start_11
    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    throw v0

    .line 633
    :pswitch_9
    sget-object v5, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object/from16 v16, v5

    monitor-enter v16

    .line 634
    :try_start_12
    invoke-virtual {v5, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v5, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_35

    .line 636
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v5, v6, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v6, :cond_34

    .line 638
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    .line 942
    invoke-virtual {v5}, Ll/۫ۘܽ;->find()Z

    move-result v7

    invoke-static {v5, v7, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v7, :cond_36

    .line 640
    invoke-virtual {v5}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_b

    :cond_34
    move-object v6, v14

    goto :goto_b

    :cond_35
    move-object v0, v14

    move-object v6, v0

    .line 644
    :cond_36
    :goto_b
    monitor-exit v16
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    if-nez v14, :cond_37

    goto/16 :goto_d

    .line 648
    :cond_37
    invoke-static {v0}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v0

    .line 649
    invoke-static {v6}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v1

    .line 650
    invoke-static {v14}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v5

    cmpl-float v6, v0, v9

    if-nez v6, :cond_38

    const/4 v0, 0x0

    :cond_38
    cmpg-float v6, v0, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v0, v9

    if-gtz v6, :cond_41

    cmpg-float v6, v1, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v1, v10

    if-gtz v6, :cond_41

    cmpg-float v6, v5, v13

    if-ltz v6, :cond_41

    cmpl-float v6, v5, v10

    if-lez v6, :cond_39

    goto/16 :goto_d

    :cond_39
    new-array v6, v11, [F

    aput v0, v6, v2

    aput v1, v6, v3

    aput v5, v6, v4

    .line 657
    invoke-static {v6}, Ll/۟ۗ;->֫([F)I

    move-result v0

    return v0

    :catchall_a
    move-exception v0

    .line 644
    :try_start_13
    monitor-exit v16
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    throw v0

    .line 606
    :pswitch_a
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 607
    :try_start_14
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v2, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_3b

    .line 609
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v0

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    invoke-static {v2, v3, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v3, :cond_3a

    .line 611
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v4

    invoke-static {v2, v4, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v4, :cond_3c

    .line 613
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    goto :goto_c

    :cond_3a
    move-object v3, v14

    goto :goto_c

    :cond_3b
    move-object v0, v14

    move-object v3, v0

    .line 617
    :cond_3c
    :goto_c
    monitor-exit v16
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    if-eqz v14, :cond_41

    .line 618
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v11, :cond_41

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v11, :cond_3d

    goto :goto_d

    .line 621
    :cond_3d
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 622
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 623
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ltz v0, :cond_41

    if-gt v0, v12, :cond_41

    if-ltz v1, :cond_41

    if-gt v1, v12, :cond_41

    if-ltz v2, :cond_41

    if-le v2, v12, :cond_3e

    goto :goto_d

    .line 627
    :cond_3e
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    return v0

    :catchall_b
    move-exception v0

    .line 617
    :try_start_15
    monitor-exit v16
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    throw v0

    .line 580
    :pswitch_b
    sget-object v2, Ll/ۡۜܿ;->᩻:Ll/۫ۘܽ;

    move-object/from16 v16, v2

    monitor-enter v16

    .line 581
    :try_start_16
    invoke-virtual {v2, v0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 942
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v0

    invoke-static {v2, v0, v1}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    if-eqz v0, :cond_3f

    .line 582
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v14

    .line 584
    :cond_3f
    monitor-exit v16
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    if-eqz v14, :cond_41

    .line 585
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v7, :cond_41

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v6, :cond_40

    goto :goto_d

    .line 588
    :cond_40
    invoke-static {v14}, Ll/ۢ᩺ۡ;->᩷(Ljava/lang/String;)I

    move-result v0

    return v0

    :catchall_c
    move-exception v0

    .line 584
    :try_start_17
    monitor-exit v16
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    throw v0

    :cond_41
    :goto_d
    const v0, 0x161616

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;ILl/᩷ۜܿ;)I
    .locals 9

    const/16 v0, 0xb

    const/4 v1, 0x3

    if-ne p1, v0, :cond_0

    const/4 v0, 0x3

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    const/4 v2, 0x4

    .line 915
    :goto_0
    new-array v3, v2, [F

    .line 916
    sget-object v4, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v4

    monitor-enter v0

    .line 917
    :try_start_0
    invoke-virtual {v4, p0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    const/4 p0, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_4

    .line 942
    invoke-virtual {v4}, Ll/۫ۘܽ;->find()Z

    move-result v6

    invoke-static {v4, v6, p2}, Ll/ۡۜܿ;->֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V

    const v7, 0x161616

    if-nez v6, :cond_1

    .line 920
    monitor-exit v0

    return v7

    .line 922
    :cond_1
    invoke-virtual {v4}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۡۜܿ;->ۧ(Ljava/lang/String;)F

    move-result v6

    aput v6, v3, v5

    const/4 v8, 0x0

    cmpg-float v8, v6, v8

    if-ltz v8, :cond_3

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v6, v6, v8

    if-lez v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 924
    :cond_3
    :goto_2
    monitor-exit v0

    return v7

    .line 927
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p2, 0xc

    if-ne p1, p2, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    const/high16 v2, 0x437f0000    # 255.0f

    if-eq p1, p2, :cond_7

    const/16 p0, 0xd

    if-eq p1, p0, :cond_6

    const/16 p0, 0xff

    goto :goto_5

    .line 931
    :cond_6
    aget p0, v3, v1

    goto :goto_4

    .line 930
    :cond_7
    aget p0, v3, p0

    :goto_4
    mul-float p0, p0, v2

    float-to-int p0, p0

    .line 934
    :goto_5
    aget p1, v3, v0

    mul-float p1, p1, v2

    float-to-int p1, p1

    add-int/lit8 p2, v0, 0x1

    aget p2, v3, p2

    mul-float p2, p2, v2

    float-to-int p2, p2

    add-int/lit8 v0, v0, 0x2

    aget v0, v3, v0

    mul-float v0, v0, v2

    float-to-int v0, v0

    invoke-static {p0, p1, p2, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0

    :catchall_0
    move-exception p0

    .line 927
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(IILjava/lang/String;)Ljava/lang/String;
    .locals 8

    const v1, 0xffffff

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/high16 v4, -0x1000000

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    goto/16 :goto_3

    .line 531
    :pswitch_0
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result p0

    .line 532
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    .line 533
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    .line 534
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    filled-new-array {p0, v0, v1, p1}, [I

    move-result-object p0

    .line 530
    invoke-static {p2, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 525
    :pswitch_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    .line 526
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 527
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 528
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    filled-new-array {p0, v0, v1, p1}, [I

    move-result-object p0

    .line 524
    invoke-static {p2, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 520
    :pswitch_2
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result p0

    .line 521
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    .line 522
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    filled-new-array {p0, v0, p1}, [I

    move-result-object p0

    .line 519
    invoke-static {p2, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 486
    :pswitch_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 488
    sget-object v1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v1

    monitor-enter v0

    .line 489
    :try_start_0
    invoke-virtual {v1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 490
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-nez v2, :cond_0

    .line 491
    monitor-exit v0

    return-object v6

    .line 493
    :cond_0
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {p0, p2, v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 494
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    invoke-static {v3, v2}, Ll/ۡۜܿ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v1

    .line 496
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 497
    sget-object v2, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object v0, v2

    monitor-enter v0

    .line 498
    :try_start_1
    invoke-virtual {v2, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 499
    invoke-virtual {v2, v1}, Ll/۫ۘܽ;->find(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 500
    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 501
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 502
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v1

    .line 503
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 504
    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 505
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 506
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result v1

    .line 507
    invoke-virtual {v2}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 508
    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 509
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 510
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p2, p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 511
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 515
    :cond_1
    monitor-exit v0

    return-object v6

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :catchall_1
    move-exception p0

    .line 496
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    .line 457
    :pswitch_4
    sget-object p0, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object v0, p0

    monitor-enter v0

    .line 458
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    invoke-virtual {p0, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 461
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 462
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v1, p2, v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 463
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 465
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 466
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 467
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 468
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 469
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 470
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 471
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 472
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 473
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 474
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 475
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 476
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 477
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 482
    :cond_2
    monitor-exit v0

    return-object v6

    :catchall_2
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p0

    :pswitch_5
    and-int p0, p1, v4

    if-ne p0, v4, :cond_3

    const-string p0, "%06X"

    and-int/2addr p1, v1

    .line 240
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v7

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-string p0, "%06X%02X"

    and-int v0, p1, v1

    .line 242
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    ushr-int/lit8 p1, p1, 0x18

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    aput-object v0, v1, v7

    aput-object p1, v1, v5

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 244
    :goto_0
    sget-object p1, Ll/ۡۜܿ;->᩻:Ll/۫ۘܽ;

    move-object v0, p1

    monitor-enter v0

    .line 245
    :try_start_4
    invoke-virtual {p1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 246
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {p2, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 249
    :cond_4
    monitor-exit v0

    return-object v6

    :catchall_3
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw p0

    .line 428
    :pswitch_6
    sget-object p0, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object v0, p0

    monitor-enter v0

    .line 429
    :try_start_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    invoke-virtual {p0, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 432
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 433
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v1, p2, v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 434
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 435
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 436
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 437
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 438
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 439
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 440
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 441
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 442
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 443
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 444
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 445
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 446
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 448
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 453
    :cond_5
    monitor-exit v0

    return-object v6

    :catchall_4
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw p0

    :pswitch_7
    new-array p0, v3, [F

    .line 398
    invoke-static {p1, p0}, Ll/۟۫ۡ;->֫(I[F)V

    .line 399
    sget-object v1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v1

    monitor-enter v0

    .line 400
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    invoke-virtual {v1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 403
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 404
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v3, p2, v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 405
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget v7, p0, v7

    invoke-static {v4, v7}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v4

    .line 407
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 408
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v7

    invoke-virtual {v3, p2, v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 409
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget v5, p0, v5

    invoke-static {v4, v5}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v4

    .line 411
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 412
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v5

    invoke-virtual {v3, p2, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 413
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget p0, p0, v2

    invoke-static {v4, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result p0

    .line 415
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 416
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v3, p2, p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 417
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-static {p1, p0}, Ll/ۡۜܿ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v3, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 419
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 424
    :cond_6
    monitor-exit v0

    return-object v6

    :catchall_5
    move-exception p0

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    throw p0

    :pswitch_8
    new-array p0, v3, [F

    .line 367
    invoke-static {p1, p0}, Ll/۟ۗ;->֫(I[F)V

    .line 368
    sget-object v1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v1

    monitor-enter v0

    .line 369
    :try_start_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    invoke-virtual {v1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 372
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 373
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v3, p2, v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 374
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget v7, p0, v7

    invoke-static {v4, v7}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v4

    .line 376
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 377
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v7

    invoke-virtual {v3, p2, v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 378
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget v5, p0, v5

    invoke-static {v4, v5}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v4

    .line 380
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 381
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v5

    invoke-virtual {v3, p2, v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 382
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v4

    aget p0, p0, v2

    invoke-static {v4, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result p0

    .line 384
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 385
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v3, p2, p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 386
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-static {p1, p0}, Ll/ۡۜܿ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v3, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 388
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 393
    :cond_7
    monitor-exit v0

    return-object v6

    :catchall_6
    move-exception p0

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    throw p0

    .line 329
    :pswitch_9
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    sget-object v1, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object v0, v1

    monitor-enter v0

    .line 333
    :try_start_8
    invoke-virtual {v1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 334
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 335
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {p0, p2, v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 336
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 337
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 338
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 339
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 340
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 342
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 343
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 344
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 345
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v1

    goto :goto_1

    :cond_8
    move v7, v2

    :cond_9
    const/4 v5, 0x0

    move v1, v7

    .line 350
    :goto_1
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-nez v5, :cond_a

    goto/16 :goto_3

    .line 354
    :cond_a
    sget-object v2, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v2

    monitor-enter v0

    .line 355
    :try_start_9
    invoke-virtual {v2, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 356
    invoke-virtual {v2, v1}, Ll/۫ۘܽ;->find(I)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 357
    invoke-virtual {v2}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {p0, p2, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 358
    invoke-virtual {v2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-static {p1, v1}, Ll/ۡۜܿ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    invoke-virtual {v2}, Ll/۫ۘܽ;->end()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p2, p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 360
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 362
    :cond_b
    monitor-exit v0

    return-object v6

    :catchall_7
    move-exception p0

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    throw p0

    :catchall_8
    move-exception p0

    .line 350
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    throw p0

    :pswitch_a
    new-array p0, v3, [F

    .line 304
    invoke-static {p1, p0}, Ll/۟۫ۡ;->֫(I[F)V

    .line 305
    sget-object p1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, p1

    monitor-enter v0

    .line 306
    :try_start_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    invoke-virtual {p1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 309
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 310
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 311
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget v4, p0, v7

    invoke-static {v3, v4}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result v3

    .line 313
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 314
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v1, p2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 315
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget v4, p0, v5

    invoke-static {v3, v4}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result v3

    .line 317
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 318
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v1, p2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 319
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget p0, p0, v2

    invoke-static {v3, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 321
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 325
    :cond_c
    monitor-exit v0

    return-object v6

    :catchall_9
    move-exception p0

    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    throw p0

    :pswitch_b
    new-array p0, v3, [F

    .line 278
    invoke-static {p1, p0}, Ll/۟ۗ;->֫(I[F)V

    .line 279
    sget-object p1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, p1

    monitor-enter v0

    .line 280
    :try_start_c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    invoke-virtual {p1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 283
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_d

    .line 284
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 285
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget v4, p0, v7

    invoke-static {v3, v4}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result v3

    .line 287
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 288
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v1, p2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 289
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget v4, p0, v5

    invoke-static {v3, v4}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result v3

    .line 291
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 292
    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v4

    invoke-virtual {v1, p2, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 293
    invoke-virtual {p1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v3

    aget p0, p0, v2

    invoke-static {v3, p0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 295
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 299
    :cond_d
    monitor-exit v0

    return-object v6

    :catchall_a
    move-exception p0

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    throw p0

    .line 253
    :pswitch_c
    sget-object p0, Ll/ۡۜܿ;->᩷:Ll/۫ۘܽ;

    move-object v0, p0

    monitor-enter v0

    .line 254
    :try_start_d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    invoke-virtual {p0, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 257
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 258
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {v1, p2, v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 259
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 261
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 262
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 263
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2

    .line 265
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 266
    invoke-virtual {p0}, Ll/۫ۘܽ;->start()I

    move-result v3

    invoke-virtual {v1, p2, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 267
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p2, p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 269
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 273
    :cond_e
    monitor-exit v0

    return-object v6

    :catchall_b
    move-exception p0

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    throw p0

    :pswitch_d
    and-int p0, p1, v4

    if-ne p0, v4, :cond_f

    const-string p0, "%06X"

    and-int/2addr p1, v1

    .line 225
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v7

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_f
    const-string p0, "%08X"

    .line 227
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p1, v0, v7

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 229
    :goto_2
    sget-object p1, Ll/ۡۜܿ;->᩻:Ll/۫ۘܽ;

    move-object v0, p1

    monitor-enter v0

    .line 230
    :try_start_e
    invoke-virtual {p1, p2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/۫ۘܽ;->start()I

    move-result v2

    invoke-virtual {p2, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    invoke-virtual {p1}, Ll/۫ۘܽ;->end()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 234
    :cond_10
    monitor-exit v0

    return-object v6

    :catchall_c
    move-exception p0

    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    throw p0

    :goto_3
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;F)Ljava/lang/String;
    .locals 3

    const-string v0, "%"

    .line 977
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float p1, p1, v1

    :cond_0
    if-eqz p0, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    .line 980
    :goto_0
    new-instance v2, Ljava/math/BigDecimal;

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object p1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 981
    invoke-virtual {v2, v1, p1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p1

    .line 0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    move-result v1

    if-nez v1, :cond_2

    new-instance p1, Ljava/math/BigDecimal;

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object p1

    .line 983
    :goto_1
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p1

    if-eqz p0, :cond_3

    .line 0
    invoke-static {p1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object p1
.end method

.method public static varargs ֫(Ljava/lang/String;[I)Ljava/lang/String;
    .locals 8

    .line 541
    sget-object v1, Ll/ۡۜܿ;->ܳ:Ll/۫ۘܽ;

    move-object v0, v1

    monitor-enter v0

    .line 542
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 543
    invoke-virtual {v1, p0}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    .line 545
    array-length v3, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget v6, p1, v4

    .line 546
    invoke-virtual {v1}, Ll/۫ۘܽ;->find()Z

    move-result v7

    if-nez v7, :cond_0

    const/4 p0, 0x0

    .line 547
    monitor-exit v0

    return-object p0

    .line 549
    :cond_0
    invoke-virtual {v1}, Ll/۫ۘܽ;->start()I

    move-result v7

    invoke-virtual {v2, p0, v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 550
    invoke-virtual {v1}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Ll/ۡۜܿ;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    invoke-virtual {v1}, Ll/۫ۘܽ;->end()I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 553
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v2, p0, v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 554
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 555
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۡۜܿ;
    .locals 9

    .line 46
    sget-object v0, Ll/ۡۜܿ;->ܿ:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x1

    .line 50
    invoke-virtual {v0, v1}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "_"

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, -0x2

    const-string v5, "auto"

    const/4 v6, -0x1

    if-eqz v3, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, -0x2

    goto :goto_0

    .line 84
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_0
    const/4 v3, 0x2

    .line 51
    invoke-virtual {v0, v3}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v4, -0x1

    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    .line 84
    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    :goto_1
    const-string v2, "Illegal arguments: "

    if-gez v1, :cond_5

    if-ltz v4, :cond_4

    goto :goto_2

    .line 53
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {v2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 53
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    const/4 v5, 0x3

    .line 56
    invoke-virtual {v0, v5}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/4 v8, 0x4

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v7, "RGBAF"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_3

    :cond_6
    const/16 v6, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v7, "ARGBF"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const/16 v6, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v7, "XRGB"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_3

    :cond_8
    const/16 v6, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v7, "RGBX"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_3

    :cond_9
    const/16 v6, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v7, "RGBF"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_3

    :cond_a
    const/16 v6, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v7, "RGBA"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_3

    :cond_b
    const/16 v6, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v7, "HSVA"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_3

    :cond_c
    const/4 v6, 0x7

    goto :goto_3

    :sswitch_7
    const-string v7, "HSLA"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_3

    :cond_d
    const/4 v6, 0x6

    goto :goto_3

    :sswitch_8
    const-string v7, "HEXA"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_3

    :cond_e
    const/4 v6, 0x5

    goto :goto_3

    :sswitch_9
    const-string v7, "ARGB"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto :goto_3

    :cond_f
    const/4 v6, 0x4

    goto :goto_3

    :sswitch_a
    const-string v7, "RGB"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_3

    :cond_10
    const/4 v6, 0x3

    goto :goto_3

    :sswitch_b
    const-string v7, "HSV"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_3

    :cond_11
    const/4 v6, 0x2

    goto :goto_3

    :sswitch_c
    const-string v7, "HSL"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_3

    :cond_12
    const/4 v6, 0x1

    goto :goto_3

    :sswitch_d
    const-string v7, "HEX"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_3

    :cond_13
    const/4 v6, 0x0

    :goto_3
    packed-switch v6, :pswitch_data_0

    .line 72
    new-instance v0, Ljava/lang/RuntimeException;

    .line 0
    invoke-static {v2, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 72
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 v3, 0xd

    goto :goto_4

    :pswitch_1
    const/16 v3, 0xc

    goto :goto_4

    :pswitch_2
    const/4 v3, 0x7

    goto :goto_4

    :pswitch_3
    const/16 v3, 0x9

    goto :goto_4

    :pswitch_4
    const/16 v3, 0xb

    goto :goto_4

    :pswitch_5
    const/4 v3, 0x4

    goto :goto_4

    :pswitch_6
    const/4 v3, 0x6

    goto :goto_4

    :pswitch_7
    const/4 v3, 0x5

    goto :goto_4

    :pswitch_8
    const/16 v3, 0x8

    goto :goto_4

    :pswitch_9
    const/16 v3, 0xa

    goto :goto_4

    :pswitch_a
    const/4 v3, 0x1

    goto :goto_4

    :pswitch_b
    const/4 v3, 0x3

    goto :goto_4

    :pswitch_c
    const/4 v3, 0x0

    .line 74
    :goto_4
    :pswitch_d
    invoke-virtual {v0, v8}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p0

    .line 75
    new-instance v0, Ll/ۡۜܿ;

    invoke-direct {v0, v1, v4, v3, p0}, Ll/ۡۜܿ;-><init>(IIII)V

    return-object v0

    .line 48
    :cond_14
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Parse failed: "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 48
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x116fb -> :sswitch_d
        0x118a1 -> :sswitch_c
        0x118ab -> :sswitch_b
        0x13cad -> :sswitch_a
        0x1ec8cc -> :sswitch_9
        0x21c8a6 -> :sswitch_8
        0x21fbc0 -> :sswitch_7
        0x21fcf6 -> :sswitch_6
        0x265934 -> :sswitch_5
        0x265939 -> :sswitch_4
        0x26594b -> :sswitch_3
        0x293d55 -> :sswitch_2
        0x3ba50fa -> :sswitch_1
        0x4a4cd92 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/۫ۘܽ;ZLl/᩷ۜܿ;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 954
    :try_start_0
    check-cast p2, Ll/ۖۢܿ;

    iget-object p1, p2, Ll/ۖۢܿ;->֫:Ll/ۗۢܿ;

    invoke-static {p1, p0}, Ll/ۗۢܿ;->֫(Ll/ۗۢܿ;Ll/۫ۘܽ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 956
    new-instance p1, Ll/ۢۜܿ;

    invoke-direct {p1, p0}, Ll/ۢۜܿ;-><init>(Ljava/lang/RuntimeException;)V

    throw p1

    :cond_0
    return-void
.end method

.method public static ۧ(Ljava/lang/String;)F
    .locals 2

    const-string v0, "%"

    .line 964
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v1, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    .line 968
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    if-eqz v1, :cond_1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p0, v0

    :cond_1
    return p0
.end method

.method public static ۧ(ILjava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 572
    invoke-static {p1, p0, v0}, Ll/ۡۜܿ;->֫(Ljava/lang/String;ILl/ۖۢܿ;)I

    move-result p0

    return p0
.end method

.method private ۧ(Ll/᩸᩷ܿ;Ll/᩸᩷ܿ;Ll/۫ۘܽ;Ll/ۖۢܿ;)Ll/᩸᩷ܿ;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 103
    :try_start_0
    iget v4, v0, Ll/ۡۜܿ;->ܽ:I

    .line 104
    iget v5, v0, Ll/ۡۜܿ;->֫:I

    .line 109
    invoke-virtual/range {p3 .. p3}, Ll/۫ۘܽ;->groupCount()I

    move-result v6

    if-gt v4, v6, :cond_11

    invoke-virtual/range {p3 .. p3}, Ll/۫ۘܽ;->groupCount()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-le v5, v6, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v6, 0x1

    const v7, 0x161616

    .line 112
    iget v8, v0, Ll/ۡۜܿ;->ᩳ:I

    const/4 v9, -0x1

    const/4 v10, 0x0

    if-ltz v4, :cond_3

    .line 113
    :try_start_1
    invoke-virtual {v2, v4}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_1

    const/4 v4, -0x1

    goto :goto_0

    .line 117
    :cond_1
    invoke-static {v11, v8, v3}, Ll/ۡۜܿ;->֫(Ljava/lang/String;ILl/ۖۢܿ;)I

    move-result v11

    if-eq v11, v7, :cond_2

    const/4 v12, 0x1

    move v12, v11

    const/4 v13, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, -0x1

    move v12, v11

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    const/4 v13, 0x0

    :goto_2
    if-ltz v5, :cond_6

    .line 126
    invoke-virtual {v2, v5}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const/4 v2, 0x0

    const/4 v3, 0x0

    goto :goto_3

    .line 130
    :cond_4
    invoke-static {v2, v8, v3}, Ll/ۡۜܿ;->֫(Ljava/lang/String;ILl/ۖۢܿ;)I

    move-result v2

    move v3, v2

    if-eq v2, v7, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    const/4 v5, -0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_4
    const/4 v6, 0x0

    :goto_5
    if-gez v4, :cond_7

    if-gez v5, :cond_7

    goto/16 :goto_a

    :cond_7
    const/4 v7, -0x2

    if-ne v4, v7, :cond_9

    if-nez p2, :cond_8

    .line 143
    invoke-static {}, Ll/ۜ᩷ܿ;->ܿ()Ll/᩸᩷ܿ;

    move-result-object v4

    goto :goto_6

    :cond_8
    move-object/from16 v4, p2

    .line 144
    :goto_6
    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ᩳ()I

    move-result v8

    invoke-static {v2, v8}, Ll/۟۫ۡ;->ۧ(II)I

    move-result v11

    .line 145
    invoke-virtual {v4}, Ll/᩸᩷ܿ;->᩵()I

    move-result v4

    invoke-static {v3, v4}, Ll/۟۫ۡ;->ۧ(II)I

    move-result v12

    const/4 v4, 0x0

    :cond_9
    move v15, v11

    move/from16 v17, v12

    if-ne v5, v7, :cond_c

    .line 139
    invoke-static {v15}, Ll/۟۫ۡ;->֫(I)I

    move-result v2

    const/16 v3, 0x82

    if-le v2, v3, :cond_a

    const/high16 v2, -0x1000000

    goto :goto_7

    :cond_a
    const/4 v2, -0x1

    :goto_7
    invoke-static/range {v17 .. v17}, Ll/۟۫ۡ;->֫(I)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-le v5, v3, :cond_b

    const/high16 v9, -0x1000000

    :cond_b
    move/from16 v20, v2

    move/from16 v22, v9

    goto :goto_8

    :cond_c
    move/from16 v20, v2

    move/from16 v22, v3

    move v10, v5

    :goto_8
    const-string v2, "0"

    const-string v3, "1"

    if-eqz v13, :cond_d

    move-object v5, v3

    goto :goto_9

    :cond_d
    move-object v5, v2

    :goto_9
    if-eqz v6, :cond_e

    move-object v2, v3

    .line 155
    :cond_e
    :try_start_2
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    if-ltz v4, :cond_f

    if-ltz v10, :cond_f

    const/16 v19, 0x40

    move-object/from16 v14, v18

    move/from16 v16, v20

    move/from16 v18, v22

    .line 157
    invoke-static/range {v14 .. v19}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v1

    return-object v1

    :cond_f
    if-ltz v4, :cond_10

    const v2, 0x161616

    const/16 v19, 0x40

    const v16, 0x161616

    move-object/from16 v14, v18

    move/from16 v18, v2

    .line 159
    invoke-static/range {v14 .. v19}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v1

    return-object v1

    :cond_10
    const v21, 0x161616

    const/16 v23, 0x40

    const v19, 0x161616

    .line 161
    invoke-static/range {v18 .. v23}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩸᩷ܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_11
    :goto_a
    return-object v1
.end method

.method public static ܽ(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "%"

    .line 560
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    int-to-long v1, p0

    if-eqz p1, :cond_0

    const-wide/16 v3, 0x64

    mul-long v1, v1, v3

    :cond_0
    if-eqz p1, :cond_1

    const/4 p0, 0x2

    goto :goto_0

    :cond_1
    const/4 p0, 0x3

    .line 563
    :goto_0
    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    sget-object v2, Ll/ۡۜܿ;->ۢ:Ljava/math/BigDecimal;

    sget-object v3, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 564
    invoke-virtual {v1, v2, p0, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p0

    .line 0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->signum()I

    move-result v1

    if-nez v1, :cond_2

    new-instance p0, Ljava/math/BigDecimal;

    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object p0

    .line 566
    :goto_1
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_3

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method public static ᩻()Ljava/lang/String;
    .locals 2

    .line 988
    sget-object v0, Ll/ۡۜܿ;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    const/16 v1, 0x24

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 18
    instance-of v0, p1, Ll/ۡۜܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡۜܿ;

    iget v0, p0, Ll/ۡۜܿ;->ܽ:I

    iget v1, p1, Ll/ۡۜܿ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۡۜܿ;->֫:I

    iget v1, p1, Ll/ۡۜܿ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۡۜܿ;->ᩳ:I

    iget v1, p1, Ll/ۡۜܿ;->ᩳ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۡۜܿ;->ۧ:I

    iget p1, p1, Ll/ۡۜܿ;->ۧ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->ܽ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۡۜܿ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۡۜܿ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۡۜܿ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->ܽ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۡۜܿ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ۡۜܿ;->ᩳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/ۡۜܿ;->ۧ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const-string v1, "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v5, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ColorParser["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v3, v1

    if-ge v5, v3, :cond_2

    aget-object v3, v1, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v4, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v3, v1

    sub-int/2addr v3, v0

    if-eq v5, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->֫:I

    return v0
.end method

.method public final ֫(Ll/᩸᩷ܿ;Ll/᩸᩷ܿ;Ll/۫ۘܽ;Ll/ۖۢܿ;)Ll/᩸᩷ܿ;
    .locals 0

    .line 92
    :try_start_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۡۜܿ;->ۧ(Ll/᩸᩷ܿ;Ll/᩸᩷ܿ;Ll/۫ۘܽ;Ll/ۖۢܿ;)Ll/᩸᩷ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۢۜܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 94
    invoke-static {p1}, Ll/ۢۜܿ;->֫(Ll/ۢۜܿ;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public final ܳ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->ᩳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->ۧ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ۡۜܿ;->ܽ:I

    return v0
.end method
