.class public final Ll/۟᩹֫;
.super Ljava/lang/Object;
.source "U8HK"

# interfaces
.implements Ll/᩻۬֫;


# instance fields
.field public final ֫:Ll/۫ܰ֫;

.field public final ۧ:Landroid/content/ContextWrapper;

.field public ܽ:I


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p1, p0, Ll/۟᩹֫;->ۧ:Landroid/content/ContextWrapper;

    .line 125
    new-instance v0, Ll/۫ܰ֫;

    invoke-direct {v0, p1}, Ll/۫ܰ֫;-><init>(Landroid/content/ContextWrapper;)V

    iput-object v0, p0, Ll/۟᩹֫;->֫:Ll/۫ܰ֫;

    const/4 p1, 0x0

    .line 126
    iput p1, p0, Ll/۟᩹֫;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x2

    .line 145
    iput v0, p0, Ll/۟᩹֫;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/֫۬֫;)V
    .locals 0

    .line 844
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Landroid/os/Handler;Ll/ܽۜۧ;Ll/ۚ۫֫;Ll/ۡᩳۧ;Ll/ۤ۟֫;)[Ll/֫۬֫;
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v8, p5

    .line 368
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 369
    iget v3, v1, Ll/۟᩹֫;->ܽ:I

    const-wide/16 v4, 0x1388

    .line 476
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 434
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v6, Ll/ܽۜۧ;

    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    new-instance v10, Ll/ۧ᩻ۧ;

    iget-object v11, v1, Ll/۟᩹֫;->ۧ:Landroid/content/ContextWrapper;

    invoke-direct {v10, v11}, Ll/ۧ᩻ۧ;-><init>(Landroid/content/ContextWrapper;)V

    .line 436
    iget-object v12, v1, Ll/۟᩹֫;->֫:Ll/۫ܰ֫;

    invoke-virtual {v10, v12}, Ll/ۧ᩻ۧ;->֫(Ll/ܰܰ֫;)V

    .line 438
    invoke-virtual {v10}, Ll/ۧ᩻ۧ;->ۧ()V

    .line 440
    invoke-virtual {v10, v0}, Ll/ۧ᩻ۧ;->֫(Landroid/os/Handler;)V

    .line 441
    invoke-virtual {v10, v2}, Ll/ۧ᩻ۧ;->֫(Ll/ܽۜۧ;)V

    const/16 v13, 0x32

    .line 479
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 442
    invoke-virtual {v10}, Ll/ۧ᩻ۧ;->ܽ()V

    .line 450
    invoke-virtual {v10}, Ll/ۧ᩻ۧ;->֫()Ll/ܿ᩻ۧ;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v10, "Error instantiating FFmpeg extension"

    const/4 v15, 0x2

    const/16 v16, 0x1

    .line 452
    const-class v17, Landroid/os/Handler;

    if-nez v3, :cond_0

    const/4 v2, 0x0

    const/16 v18, 0x0

    goto/16 :goto_4

    .line 455
    :cond_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v18

    if-ne v3, v15, :cond_1

    add-int/lit8 v18, v18, -0x1

    :cond_1
    move/from16 v3, v18

    :try_start_0
    const-string v15, "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/16 v18, 0x0

    .line 462
    :try_start_1
    invoke-static {v15}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v14, 0x4

    const/16 v20, 0x2

    :try_start_2
    new-array v14, v14, [Ljava/lang/Class;

    aput-object v7, v14, v18

    aput-object v17, v14, v16

    aput-object v6, v14, v20

    const/16 v19, 0x3

    aput-object v5, v14, v19

    .line 467
    invoke-virtual {v15, v14}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v14

    const/4 v15, 0x4

    new-array v15, v15, [Ljava/lang/Object;

    aput-object v4, v15, v18

    aput-object v0, v15, v16

    aput-object v2, v15, v20

    const/16 v19, 0x3

    aput-object v13, v15, v19

    .line 475
    invoke-virtual {v14, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/֫۬֫;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    add-int/lit8 v15, v3, 0x1

    .line 480
    :try_start_3
    invoke-virtual {v9, v3, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v3, "Loaded LibvpxVideoRenderer."

    .line 481
    invoke-static {v3}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_0
    move v3, v15

    goto :goto_0

    :catch_1
    const/16 v20, 0x2

    goto :goto_0

    :catch_2
    move-exception v0

    .line 486
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating VP9 extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_3
    const/16 v20, 0x2

    const/16 v18, 0x0

    :catch_4
    :goto_0
    move v15, v3

    :goto_1
    :try_start_4
    const-string v3, "androidx.media3.decoder.av1.Libgav1VideoRenderer"

    .line 491
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/4 v14, 0x4

    new-array v14, v14, [Ljava/lang/Class;

    .line 495
    aput-object v7, v14, v18

    aput-object v17, v14, v16

    aput-object v6, v14, v20

    const/16 v19, 0x3

    aput-object v5, v14, v19

    .line 496
    invoke-virtual {v3, v14}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v14, 0x4

    new-array v14, v14, [Ljava/lang/Object;

    .line 508
    aput-object v4, v14, v18

    aput-object v0, v14, v16

    aput-object v2, v14, v20

    const/16 v19, 0x3

    aput-object v13, v14, v19

    .line 504
    invoke-virtual {v3, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫۬֫;
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    add-int/lit8 v14, v15, 0x1

    .line 509
    :try_start_5
    invoke-virtual {v9, v15, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v3, "Loaded Libgav1VideoRenderer."

    .line 510
    invoke-static {v3}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_3

    :catch_5
    move v15, v14

    goto :goto_2

    :catch_6
    move-exception v0

    .line 515
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating AV1 extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_7
    :goto_2
    move v14, v15

    .line 521
    :goto_3
    :try_start_6
    const-class v3, Ll/۫᩸֫;

    const/4 v15, 0x4

    new-array v15, v15, [Ljava/lang/Class;

    .line 525
    aput-object v7, v15, v18

    aput-object v17, v15, v16

    aput-object v6, v15, v20

    const/4 v6, 0x3

    aput-object v5, v15, v6

    .line 526
    invoke-virtual {v3, v15}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    .line 538
    aput-object v4, v5, v18

    aput-object v0, v5, v16

    aput-object v2, v5, v20

    const/4 v2, 0x3

    aput-object v13, v5, v2

    .line 534
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;

    .line 539
    invoke-virtual {v9, v14, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded FfmpegVideoRenderer."

    .line 540
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8

    goto :goto_4

    :catch_8
    move-exception v0

    .line 545
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v10, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_9
    nop

    .line 829
    :goto_4
    new-instance v2, Ll/᩷ۤ֫;

    invoke-direct {v2, v11}, Ll/᩷ۤ֫;-><init>(Landroid/content/ContextWrapper;)V

    .line 832
    invoke-virtual {v2}, Ll/᩷ۤ֫;->֫()Ll/۠ۤ֫;

    move-result-object v13

    .line 382
    iget v14, v1, Ll/۟᩹֫;->ܽ:I

    .line 572
    const-class v15, Landroid/content/Context;

    const-class v20, Ll/ۙ۫֫;

    const-class v21, Ll/ۚ۫֫;

    new-instance v7, Ll/ۙۤ֫;

    move-object v2, v7

    move-object v3, v11

    move-object v4, v12

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    move-object v12, v7

    move-object v7, v13

    .line 575
    invoke-direct/range {v2 .. v7}, Ll/ۙۤ֫;-><init>(Landroid/content/ContextWrapper;Ll/ܰܰ֫;Landroid/os/Handler;Ll/ۚ۫֫;Ll/۠ۤ֫;)V

    .line 581
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v14, :cond_2

    goto/16 :goto_f

    .line 586
    :cond_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v14, v3, :cond_3

    add-int/lit8 v2, v2, -0x1

    .line 593
    :cond_3
    :try_start_7
    const-class v3, Ll/ܳ᩹֫;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Class;

    .line 597
    aput-object v15, v4, v18

    aput-object v17, v4, v16

    const/4 v5, 0x2

    aput-object v21, v4, v5

    const/4 v5, 0x3

    aput-object v20, v4, v5

    .line 598
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    .line 604
    aput-object v11, v4, v18

    aput-object v0, v4, v16

    const/4 v5, 0x2

    aput-object p3, v4, v5

    const/4 v5, 0x3

    aput-object v13, v4, v5

    .line 605
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫۬֫;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_c
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_b

    add-int/lit8 v4, v2, 0x1

    .line 606
    :try_start_8
    invoke-virtual {v9, v2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded MidiRenderer."

    .line 607
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_a
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_b

    goto :goto_6

    :catch_a
    move v2, v4

    goto :goto_5

    :catch_b
    move-exception v0

    .line 612
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating MIDI extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_c
    :goto_5
    move v4, v2

    :goto_6
    :try_start_9
    const-string v2, "androidx.media3.decoder.opus.LibopusAudioRenderer"

    .line 617
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x3

    new-array v5, v3, [Ljava/lang/Class;

    .line 621
    aput-object v17, v5, v18

    aput-object v21, v5, v16

    const/4 v6, 0x2

    aput-object v20, v5, v6

    .line 622
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 627
    aput-object v0, v3, v18

    aput-object p3, v3, v16

    aput-object v13, v3, v6

    .line 628
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_f
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_e

    add-int/lit8 v3, v4, 0x1

    .line 629
    :try_start_a
    invoke-virtual {v9, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibopusAudioRenderer."

    .line 630
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_d
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_e

    goto :goto_8

    :catch_d
    move v4, v3

    goto :goto_7

    :catch_e
    move-exception v0

    .line 635
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating Opus extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_f
    :goto_7
    move v3, v4

    :goto_8
    :try_start_b
    const-string v2, "androidx.media3.decoder.flac.LibflacAudioRenderer"

    .line 640
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v4, 0x3

    new-array v5, v4, [Ljava/lang/Class;

    .line 644
    aput-object v17, v5, v18

    aput-object v21, v5, v16

    const/4 v6, 0x2

    aput-object v20, v5, v6

    .line 645
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v4, v4, [Ljava/lang/Object;

    .line 650
    aput-object v0, v4, v18

    aput-object p3, v4, v16

    aput-object v13, v4, v6

    .line 651
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_12
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_11

    add-int/lit8 v4, v3, 0x1

    .line 652
    :try_start_c
    invoke-virtual {v9, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibflacAudioRenderer."

    .line 653
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_10
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_11

    goto :goto_a

    :catch_10
    move v3, v4

    goto :goto_9

    :catch_11
    move-exception v0

    .line 658
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating FLAC extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_12
    :goto_9
    move v4, v3

    .line 663
    :goto_a
    :try_start_d
    const-class v2, Ll/ۛ᩸֫;

    const/4 v3, 0x3

    new-array v5, v3, [Ljava/lang/Class;

    .line 667
    aput-object v17, v5, v18

    aput-object v21, v5, v16

    const/4 v6, 0x2

    aput-object v20, v5, v6

    .line 668
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 673
    aput-object v0, v3, v18

    aput-object p3, v3, v16

    aput-object v13, v3, v6

    .line 674
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;
    :try_end_d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_d .. :try_end_d} :catch_15
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_14

    add-int/lit8 v3, v4, 0x1

    .line 675
    :try_start_e
    invoke-virtual {v9, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded FfmpegAudioRenderer."

    .line 676
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_13
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_14

    goto :goto_c

    :catch_13
    move v4, v3

    goto :goto_b

    :catch_14
    move-exception v0

    .line 681
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v10, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_15
    :goto_b
    move v3, v4

    :goto_c
    :try_start_f
    const-string v2, "androidx.media3.decoder.iamf.LibiamfAudioRenderer"

    .line 687
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Class;

    .line 691
    aput-object v15, v4, v18

    aput-object v17, v4, v16

    const/4 v5, 0x2

    aput-object v21, v4, v5

    const/4 v5, 0x3

    aput-object v20, v4, v5

    .line 692
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    .line 698
    aput-object v11, v4, v18

    aput-object v0, v4, v16

    const/4 v5, 0x2

    aput-object p3, v4, v5

    const/4 v5, 0x3

    aput-object v13, v4, v5

    .line 699
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;
    :try_end_f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_f .. :try_end_f} :catch_18
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_17

    add-int/lit8 v4, v3, 0x1

    .line 700
    :try_start_10
    invoke-virtual {v9, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded LibiamfAudioRenderer."

    .line 701
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/lang/ClassNotFoundException; {:try_start_10 .. :try_end_10} :catch_16
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_17

    goto :goto_e

    :catch_16
    move v3, v4

    goto :goto_d

    :catch_17
    move-exception v0

    .line 706
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating IAMF extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_18
    :goto_d
    move v4, v3

    :goto_e
    :try_start_11
    const-string v2, "androidx.media3.decoder.mpegh.MpeghAudioRenderer"

    .line 711
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x3

    new-array v5, v3, [Ljava/lang/Class;

    .line 712
    aput-object v17, v5, v18

    aput-object v21, v5, v16

    const/4 v6, 0x2

    aput-object v20, v5, v6

    .line 713
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    .line 717
    aput-object v0, v3, v18

    aput-object p3, v3, v16

    aput-object v13, v3, v6

    .line 718
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫۬֫;

    .line 719
    invoke-virtual {v9, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const-string v2, "Loaded MpeghAudioRenderer."

    .line 720
    invoke-static {v2}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/ClassNotFoundException; {:try_start_11 .. :try_end_11} :catch_1a
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_19

    goto :goto_f

    :catch_19
    move-exception v0

    .line 725
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Error instantiating MPEG-H extension"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 395
    :catch_1a
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    .line 744
    new-instance v3, Ll/ܺᩳۧ;

    move-object/from16 v4, p4

    invoke-direct {v3, v4, v2}, Ll/ܺᩳۧ;-><init>(Ll/ۡᩳۧ;Landroid/os/Looper;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    invoke-virtual/range {p1 .. p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    .line 762
    new-instance v2, Ll/ۛ۟֫;

    invoke-direct {v2, v8, v0}, Ll/ۛ۟֫;-><init>(Ll/ۤ۟֫;Landroid/os/Looper;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    new-instance v2, Ll/ۛ۟֫;

    invoke-direct {v2, v8, v0}, Ll/ۛ۟֫;-><init>(Ll/ۤ۟֫;Landroid/os/Looper;)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 775
    new-instance v0, Ll/ۢۜۧ;

    invoke-direct {v0}, Ll/ۢۜۧ;-><init>()V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 783
    new-instance v0, Ll/᩵ܰ֫;

    .line 924
    new-instance v2, Ll/᩻ܰ֫;

    invoke-direct {v2, v11}, Ll/᩻ܰ֫;-><init>(Landroid/content/ContextWrapper;)V

    .line 783
    invoke-direct {v0, v2}, Ll/᩵ܰ֫;-><init>(Ll/᩻ܰ֫;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    new-array v0, v0, [Ll/֫۬֫;

    .line 407
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֫۬֫;

    return-object v0
.end method
