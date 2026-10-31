.class public final Ll/ۜܺᩳ;
.super Ll/ۘܺᩳ;
.source "K1X4"


# instance fields
.field public final synthetic ܳ:Ll/ܺܺᩳ;


# direct methods
.method public constructor <init>(Ll/ܺܺᩳ;)V
    .locals 0

    .line 504
    iput-object p1, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    .line 87
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string p1, "bin.mt.dstr.ipc.IDecryptorAidlInterface"

    .line 88
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method private ᩻([B)Ljava/lang/Object;
    .locals 13

    .line 606
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 607
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 608
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v6

    .line 609
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v7

    .line 610
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    .line 611
    new-array v8, p1, [Ljava/lang/Class;

    .line 612
    new-array v9, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_1

    .line 614
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v5

    const-class v10, Ljava/lang/Object;

    packed-switch v5, :pswitch_data_0

    .line 676
    new-instance p1, Ljava/lang/Exception;

    const-string v2, "Unsupported parameter type"

    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1

    .line 672
    :pswitch_0
    const-class v5, [I

    aput-object v5, v8, v4

    .line 673
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۖ()[I

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 668
    :pswitch_1
    const-class v5, [C

    aput-object v5, v8, v4

    .line 669
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩻()C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 664
    :pswitch_2
    const-class v5, [S

    aput-object v5, v8, v4

    .line 240
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    .line 241
    new-array v10, v5, [S

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v5, :cond_0

    .line 243
    invoke-virtual {v2}, Ll/۬ۜܽ;->readShort()S

    move-result v12

    aput-short v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 665
    :cond_0
    aput-object v10, v9, v4

    goto/16 :goto_2

    .line 660
    :pswitch_3
    aput-object v10, v8, v4

    .line 661
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 656
    :pswitch_4
    const-class v5, [B

    aput-object v5, v8, v4

    .line 657
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 652
    :pswitch_5
    aput-object v10, v8, v4

    .line 653
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 648
    :pswitch_6
    const-class v5, Ljava/lang/String;

    aput-object v5, v8, v4

    .line 649
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v9, v4

    goto/16 :goto_2

    .line 644
    :pswitch_7
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 645
    invoke-virtual {v2}, Ll/۬ۜܽ;->ܳ()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 640
    :pswitch_8
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 199
    invoke-virtual {v2}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v10

    .line 641
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 636
    :pswitch_9
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 637
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۜ()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 632
    :pswitch_a
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 633
    invoke-virtual {v2}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 628
    :pswitch_b
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 629
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 624
    :pswitch_c
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 625
    invoke-virtual {v2}, Ll/۬ۜܽ;->᩻()C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 620
    :pswitch_d
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 621
    invoke-virtual {v2}, Ll/۬ۜܽ;->readShort()S

    move-result v5

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    aput-object v5, v9, v4

    goto :goto_2

    .line 616
    :pswitch_e
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 617
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v5

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    aput-object v5, v9, v4

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 680
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 681
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    if-ge v3, p1, :cond_2

    .line 682
    aget-object v5, v8, v3

    .line 683
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 685
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 686
    invoke-static {v0}, Ll/ܺܺᩳ;->ܽ(Ll/ܺܺᩳ;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 687
    new-instance v2, Ljava/lang/Exception;

    const-string v3, "Disabled method: "

    .line 0
    invoke-static {v3, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 687
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1

    .line 691
    :cond_3
    :try_start_0
    invoke-static {v0}, Ll/ܺܺᩳ;->ܿ(Ll/ܺܺᩳ;)Ljava/util/Map;

    move-result-object v2

    check-cast v2, Ll/ۧۤᩴ;

    invoke-virtual {v2, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-nez v2, :cond_4

    .line 693
    new-instance v2, Ll/ܽܺᩳ;

    move-object v3, v2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v8}, Ll/ܽܺᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    invoke-static {v2}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    .line 713
    :cond_4
    invoke-static {}, Ll/ܺܺᩳ;->֫()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    new-instance v4, Ll/ᩳܺᩳ;

    invoke-direct {v4, p0, v2, v9}, Ll/ᩳܺᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 715
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-interface {v2, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catch_0
    move-exception v3

    .line 720
    :try_start_2
    invoke-static {v0, v3}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    const/4 v3, 0x1

    .line 721
    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 722
    invoke-static {v0}, Ll/ܺܺᩳ;->ܽ(Ll/ܺܺᩳ;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :catch_1
    move-exception p1

    .line 717
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    return-object v1

    :catchall_0
    move-exception p1

    .line 726
    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
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


# virtual methods
.method public final exit()V
    .locals 1

    .line 578
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    const/4 v0, 0x0

    .line 579
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public final ֨()I
    .locals 1

    .line 601
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {v0}, Ll/ܺܺᩳ;->ܳ(Ll/ܺܺᩳ;)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;ZZZ)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "Native hook init failed: "

    .line 508
    iget-object v3, v1, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 509
    invoke-static {v3}, Ll/ܺܺᩳ;->᩻(Ll/ܺܺᩳ;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    .line 510
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Decryptor session already loaded"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return v6

    :cond_0
    const/4 v5, 0x1

    .line 513
    invoke-static {v3, v5}, Ll/ܺܺᩳ;->ܽ(Ll/ܺܺᩳ;Z)V

    .line 515
    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v7

    .line 948
    new-instance v8, Ljava/io/File;

    const-string v9, "decrypt"

    invoke-direct {v8, v7, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v7

    .line 949
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v8

    .line 950
    invoke-virtual {v7, v8}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 516
    new-instance v11, Ljava/io/File;

    const-string v0, "base.apk"

    invoke-direct {v11, v8, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 517
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 520
    new-instance v14, Ljava/io/File;

    const-string v0, "lib"

    invoke-direct {v14, v8, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 521
    new-instance v0, Ljava/io/File;

    const-string v7, "opt"

    invoke-direct {v0, v8, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 522
    new-instance v15, Ljava/io/File;

    const-string v7, "data"

    invoke-direct {v15, v8, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 523
    new-instance v7, Ljava/io/File;

    const-string v9, "tmp"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 996
    new-instance v9, Ljava/io/File;

    const-string v10, "lib_abi"

    invoke-direct {v9, v8, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 997
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_0

    .line 1000
    :cond_1
    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v9}, Ll/ܺۢ֡;->ܳ(Ljava/io/File;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 1001
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    :goto_0
    move-object/from16 v16, v4

    goto :goto_1

    :cond_2
    move-object/from16 v16, v9

    .line 961
    :goto_1
    invoke-static {v14}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    invoke-static {v0}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    invoke-static {v7}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    .line 528
    new-instance v7, Ljava/io/File;

    const-string v9, "files"

    invoke-direct {v7, v15, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 961
    invoke-static {v7}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    .line 529
    new-instance v7, Ljava/io/File;

    const-string v9, "cache"

    invoke-direct {v7, v15, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 961
    invoke-static {v7}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    .line 530
    new-instance v7, Ljava/io/File;

    const-string v9, "code_cache"

    invoke-direct {v7, v15, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 961
    invoke-static {v7}, Ll/ܺۢ֡;->ᩳ(Ljava/io/File;)V

    .line 532
    invoke-virtual {v11}, Ljava/io/File;->setReadOnly()Z

    .line 533
    new-instance v7, Ll/ۨۢᩳ;

    invoke-virtual {v11}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :try_start_1
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 36
    invoke-virtual {v12}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    :cond_3
    :try_start_2
    invoke-direct {v7, v9, v0, v10, v4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 533
    invoke-static {v3, v7}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ll/ۨۢᩳ;)V

    .line 534
    new-instance v0, Ll/ۛۢᩳ;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    .line 535
    invoke-virtual {v11}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩶ۛ᩻;->֫(Ljava/lang/String;)Landroid/content/pm/Signature;

    move-result-object v12

    invoke-static {v3}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;)Ll/ۨۢᩳ;

    move-result-object v13

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Ll/ۛۢᩳ;-><init>(Landroid/content/Context;Ljava/io/File;Landroid/content/pm/Signature;Ll/ۨۢᩳ;Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v3, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ll/ۛۢᩳ;)V

    if-eqz p3, :cond_4

    .line 539
    invoke-static {}, Ll/ܶܺᩳ;->ᩳ()V

    .line 542
    :cond_4
    invoke-static {}, Ll/ܺܺᩳ;->ܽ()Ll/᩶۫᩷;

    move-result-object v0

    invoke-static {v3}, Ll/ܺܺᩳ;->ۧ(Ll/ܺܺᩳ;)Ll/ۛۢᩳ;

    move-result-object v4

    .line 543
    invoke-virtual {v4}, Ll/ۛۢᩳ;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 544
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    .line 545
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3}, Ll/ܺܺᩳ;->ۧ(Ll/ܺܺᩳ;)Ll/ۛۢᩳ;

    move-result-object v9

    .line 546
    invoke-virtual {v9}, Ll/ۛۢᩳ;->ܽ()Ljava/lang/String;

    move-result-object v9

    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v7, v8, v9}, Lbin/mt/plus/Features2;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_6

    if-eqz p4, :cond_5

    .line 553
    invoke-static {}, Ll/ܺܺᩳ;->ᩳ()Ll/᩶۫᩷;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xf

    invoke-static {v0}, Lbin/mt/plus/Features2;->installSeccomp(I)I

    move-result v0

    invoke-static {v3, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;I)V

    goto :goto_2

    .line 555
    :cond_5
    invoke-static {v3}, Ll/ܺܺᩳ;->᩷(Ll/ܺܺᩳ;)V

    .line 558
    :goto_2
    new-instance v0, Ll/ܿܺᩳ;

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Ll/ܿܺᩳ;-><init>(Ll/ۜܺᩳ;Z)V

    invoke-static {v0}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    .line 562
    invoke-static {v3}, Ll/ܺܺᩳ;->ۜ(Ll/ܺܺᩳ;)V

    return v5

    .line 550
    :cond_6
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 518
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Missing base.apk"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 951
    :cond_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v4, "Unsupported work dir: "

    .line 0
    invoke-static {v4, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 951
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 567
    invoke-static {v3, v6}, Ll/ܺܺᩳ;->ܽ(Ll/ܺܺᩳ;Z)V

    .line 568
    invoke-static {v3, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return v6
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 3

    .line 827
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 829
    :try_start_0
    new-instance v2, Ll/۟ۡᩳ;

    invoke-direct {v2, p0, p1, p2}, Ll/۟ۡᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 850
    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final ֫([B)[I
    .locals 0

    .line 776
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    return-object p1
.end method

.method public final ۚ()[Ljava/lang/String;
    .locals 4

    .line 584
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {v0}, Ll/ܺܺᩳ;->ᩳ(Ll/ܺܺᩳ;)Ljava/lang/Throwable;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 586
    :cond_0
    invoke-static {v0}, Ll/ܺܺᩳ;->ᩳ(Ll/ܺܺᩳ;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 587
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 588
    :cond_1
    invoke-static {v0}, Ll/ܺܺᩳ;->ᩳ(Ll/ܺܺᩳ;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 590
    :cond_2
    invoke-static {v0}, Ll/ܺܺᩳ;->ᩳ(Ll/ܺܺᩳ;)Ljava/lang/Throwable;

    move-result-object v3

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    .line 591
    invoke-static {v0, v2}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 592
    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 781
    iget-object v1, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    invoke-static {v1, v0}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 783
    :try_start_0
    new-instance v0, Ll/۬ۡᩳ;

    invoke-direct {v0, p0, p1, p2}, Ll/۬ۡᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    move-exception p1

    .line 797
    invoke-static {v1, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ([B)[B
    .locals 0

    .line 747
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public final ܳ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 804
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 806
    :try_start_0
    new-instance v2, Ll/ܰۡᩳ;

    invoke-direct {v2, p0, p1, p2}, Ll/ܰۡᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 820
    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final ܳ([B)Ljava/lang/String;
    .locals 0

    .line 739
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 742
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 3

    .line 887
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 889
    :try_start_0
    new-instance v2, Ll/ۧܺᩳ;

    invoke-direct {v2, p0, p1, p2}, Ll/ۧܺᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 903
    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final ܽ([B)[I
    .locals 3

    .line 764
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [C

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 767
    :cond_0
    array-length v0, p1

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 768
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 769
    aget-char v2, p1, v1

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 910
    invoke-static {p1, p2}, Ll/ܶܺᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ([B)[I
    .locals 3

    .line 752
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [S

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 755
    :cond_0
    array-length v0, p1

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 756
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 757
    aget-short v2, p1, v1

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ᩳ([B)Ljava/lang/String;
    .locals 0

    .line 733
    invoke-direct {p0, p1}, Ll/ۜܺᩳ;->᩻([B)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 734
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 3

    .line 857
    iget-object v0, p0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    .line 859
    :try_start_0
    new-instance v2, Ll/֫ܺᩳ;

    invoke-direct {v2, p0, p1, p2}, Ll/֫ܺᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܺܺᩳ;->֫(Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 880
    invoke-static {v0, p1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ljava/lang/Throwable;)V

    return-object v1
.end method
