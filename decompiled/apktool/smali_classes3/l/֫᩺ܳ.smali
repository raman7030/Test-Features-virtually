.class public Ll/֫᩺ܳ;
.super Ll/᩹ܶۢ;
.source "E29Y"


# instance fields
.field public ۘ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 652
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 1

    .line 301
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 801
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object p1

    return-object p1

    .line 350
    :cond_0
    invoke-static {p1}, Ll/ܿ۠ۢ;->֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 6

    const-string p1, "compressToAnother"

    .line 806
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 807
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    :goto_0
    move v2, p1

    .line 808
    iget-object p1, p0, Ll/֫᩺ܳ;->ۘ֫:Ll/ܶ᩵ܿ;

    .line 809
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v0, p4

    move-object v3, p2

    move-object v4, p3

    .line 808
    invoke-static/range {v0 .. v5}, Ll/᩻᩺ܳ;->֫(Ll/ܿ۠ۢ;ZZLl/ܽۢܳ;Ll/ܽۢܳ;Ljava/util/List;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "output"

    .line 662
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a26

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 657
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 21

    move-object/from16 v1, p0

    const-string v0, "output"

    .line 674
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, v1, Ll/֫᩺ܳ;->ۘ֫:Ll/ܶ᩵ܿ;

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 676
    invoke-static {}, Ll/ۜ֨ܳ;->values()[Ll/ۜ֨ܳ;

    move-result-object v2

    const-string v3, "format"

    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v3

    aget-object v2, v2, v3

    const-string v3, "level"

    .line 677
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v3

    const-string v4, "deleteSources"

    .line 678
    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "replaceExisting"

    .line 679
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    .line 681
    invoke-static {v1, v0, v6}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Z)Ll/֫ۤܳ;

    move-result-object v7

    iget-object v8, v7, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    .line 682
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 683
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 686
    :cond_0
    iget-boolean v9, v2, Ll/ۜ֨ܳ;->᩶:Z

    if-eqz v9, :cond_2

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ne v9, v6, :cond_1

    goto :goto_0

    .line 687
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected to be a single file, but file size = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 690
    :cond_2
    :goto_0
    iget-object v6, v1, Ll/֫᩺ܳ;->ۘ֫:Ll/ܶ᩵ܿ;

    invoke-static {v6, v5}, Ll/᩹۟ܳ;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩹۟ܳ;

    move-result-object v5

    .line 691
    invoke-virtual {v5}, Ll/᩹۟ܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 692
    iget-boolean v9, v2, Ll/ۜ֨ܳ;->᩶:Z

    const v10, 0x7f1201df

    const/4 v11, 0x0

    if-eqz v9, :cond_5

    .line 693
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۟۫ܳ;

    .line 694
    invoke-static {v10}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 695
    iget-object v9, v8, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    iget-object v10, v8, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 446
    :try_start_0
    invoke-virtual {v6, v11}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v9

    .line 696
    invoke-virtual {v10}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v11

    invoke-virtual {v2, v9, v3, v11, v12}, Ll/ۜ֨ܳ;->֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 697
    :try_start_1
    new-instance v3, Ll/ܰۨܳ;

    invoke-direct {v3, v1, v8}, Ll/ܰۨܳ;-><init>(Ll/֫᩺ܳ;Ll/۟۫ܳ;)V

    invoke-virtual {v10, v2, v3}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_3

    .line 709
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_3
    move-object/from16 v18, v0

    move/from16 v19, v4

    move-object/from16 v20, v5

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_4

    .line 696
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_1
    throw v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 710
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۫()Z

    .line 711
    throw v0

    .line 714
    :cond_5
    iget-object v2, v2, Ll/ۜ֨ܳ;->᩹:Ll/ۜ֨ܳ;

    .line 716
    :try_start_5
    new-instance v9, Ll/᩸᩷֡;

    if-nez v2, :cond_6

    .line 717
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v2

    goto :goto_2

    .line 446
    :cond_6
    invoke-virtual {v6, v11}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v10

    const-wide/16 v11, -0x1

    .line 718
    invoke-virtual {v2, v10, v3, v11, v12}, Ll/ۜ֨ܳ;->֫(Ljava/io/OutputStream;IJ)Ljava/io/OutputStream;

    move-result-object v2

    :goto_2
    invoke-direct {v9, v2}, Ll/᩸᩷֡;-><init>(Ljava/io/OutputStream;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 719
    :try_start_6
    invoke-virtual {v9}, Ll/᩸᩷֡;->᩻()V

    .line 720
    invoke-virtual {v9}, Ll/᩸᩷֡;->ܳ()V

    .line 721
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟۫ܳ;

    .line 722
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v8

    if-eqz v8, :cond_7

    goto/16 :goto_8

    .line 724
    :cond_7
    invoke-virtual {v7}, Ll/֫ۤܳ;->ܿ()V

    .line 726
    iget-boolean v8, v3, Ll/۟۫ܳ;->ᩳ:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    iget-wide v10, v3, Ll/۟۫ܳ;->᩷:J

    iget-object v12, v3, Ll/۟۫ܳ;->ܳ:Ljava/lang/String;

    iget-wide v13, v3, Ll/۟۫ܳ;->ۢ:J

    iget-object v15, v3, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    move-object/from16 v17, v2

    iget-boolean v2, v3, Ll/۟۫ܳ;->ܿ:Z

    move-object/from16 v18, v0

    const-string v0, "/"

    if-eqz v8, :cond_b

    .line 727
    :try_start_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 728
    new-instance v8, Ll/֨᩷֡;

    if-eqz v2, :cond_8

    const/16 v10, 0x32

    goto :goto_4

    :cond_8
    const/16 v10, 0x35

    :goto_4
    invoke-direct {v8, v10, v0}, Ll/֨᩷֡;-><init>(BLjava/lang/String;)V

    .line 1882
    invoke-static {v13, v14}, Ll/ۙ۠ᩴ;->fromMillis(J)Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-virtual {v8, v0}, Ll/֨᩷֡;->֫(Ll/ۙ۠ᩴ;)V

    .line 730
    iget-boolean v0, v3, Ll/۟۫ܳ;->ܽ:Z

    if-eqz v0, :cond_9

    .line 732
    iget v0, v3, Ll/۟۫ܳ;->᩻:I

    or-int/lit16 v0, v0, 0x4000

    invoke-virtual {v8, v0}, Ll/֨᩷֡;->֫(I)V

    .line 733
    iget-object v0, v3, Ll/۟۫ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ll/֨᩷֡;->ᩳ(Ljava/lang/String;)V

    .line 734
    iget-object v0, v3, Ll/۟۫ܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ll/֨᩷֡;->֫(Ljava/lang/String;)V

    :cond_9
    if-eqz v2, :cond_a

    .line 737
    invoke-virtual {v8, v12}, Ll/֨᩷֡;->ۧ(Ljava/lang/String;)V

    .line 739
    :cond_a
    invoke-virtual {v9, v8}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;)V

    .line 740
    invoke-virtual {v9}, Ll/᩸᩷֡;->ᩳ()V

    move/from16 v19, v4

    move-object/from16 v20, v5

    goto/16 :goto_7

    .line 744
    :cond_b
    iget-object v8, v3, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    move/from16 v19, v4

    .line 745
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v5

    const v16, 0x7f1201df

    invoke-static/range {v16 .. v16}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/֫ۤܳ;->֫()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/֫ۤܳ;->ܽ()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 746
    invoke-virtual {v1, v15}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 747
    new-instance v0, Ll/֨᩷֡;

    if-eqz v2, :cond_c

    const/16 v4, 0x32

    goto :goto_5

    :cond_c
    const/16 v4, 0x30

    :goto_5
    invoke-direct {v0, v4, v15}, Ll/֨᩷֡;-><init>(BLjava/lang/String;)V

    if-eqz v2, :cond_d

    const-wide/16 v4, 0x0

    goto :goto_6

    :cond_d
    move-wide v4, v10

    .line 748
    :goto_6
    invoke-virtual {v0, v4, v5}, Ll/֨᩷֡;->ۧ(J)V

    .line 1882
    invoke-static {v13, v14}, Ll/ۙ۠ᩴ;->fromMillis(J)Ll/ۙ۠ᩴ;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/֨᩷֡;->֫(Ll/ۙ۠ᩴ;)V

    .line 750
    iget-boolean v4, v3, Ll/۟۫ܳ;->ܽ:Z

    if-eqz v4, :cond_e

    .line 752
    iget v4, v3, Ll/۟۫ܳ;->᩻:I

    const v5, 0x8000

    or-int/2addr v4, v5

    invoke-virtual {v0, v4}, Ll/֨᩷֡;->֫(I)V

    .line 753
    iget-object v4, v3, Ll/۟۫ܳ;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ll/֨᩷֡;->ᩳ(Ljava/lang/String;)V

    .line 754
    iget-object v3, v3, Ll/۟۫ܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ll/֨᩷֡;->֫(Ljava/lang/String;)V

    :cond_e
    if-eqz v2, :cond_f

    .line 757
    invoke-virtual {v0, v12}, Ll/֨᩷֡;->ۧ(Ljava/lang/String;)V

    .line 759
    :cond_f
    invoke-virtual {v9, v0}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;)V

    if-nez v2, :cond_10

    .line 761
    new-instance v0, Ll/۟ۨܳ;

    invoke-direct {v0, v1, v7}, Ll/۟ۨܳ;-><init>(Ll/֫᩺ܳ;Ll/֫ۤܳ;)V

    invoke-virtual {v8, v9, v0}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V

    .line 774
    :cond_10
    invoke-virtual {v9}, Ll/᩸᩷֡;->ᩳ()V

    .line 775
    invoke-virtual {v7, v10, v11}, Ll/֫ۤܳ;->֫(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_7
    move-object/from16 v2, v17

    move-object/from16 v0, v18

    move/from16 v4, v19

    move-object/from16 v5, v20

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    goto :goto_a

    :cond_11
    :goto_8
    move-object/from16 v18, v0

    move/from16 v19, v4

    move-object/from16 v20, v5

    .line 777
    :try_start_8
    invoke-virtual {v9}, Ll/᩸᩷֡;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 782
    :goto_9
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 783
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۫()Z

    .line 784
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 787
    :cond_12
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v2, Ll/᩸۟ܳ;->᩹:Ll/᩸۟ܳ;

    move-object/from16 v3, v20

    .line 786
    invoke-virtual {v3, v0, v2}, Ll/᩹۟ܳ;->֫(Ljava/util/List;Ll/᩸۟ܳ;)Ljava/util/List;

    move-result-object v0

    .line 789
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_13

    .line 790
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_13
    if-eqz v19, :cond_14

    .line 793
    invoke-virtual {v7}, Ll/֫ۤܳ;->ܽ()I

    move-result v2

    move-object/from16 v3, v18

    invoke-static {v1, v3, v0, v2}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V

    .line 795
    :cond_14
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :goto_a
    move-object v2, v0

    .line 716
    :try_start_9
    invoke-virtual {v9}, Ll/᩸᩷֡;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_b

    :catchall_3
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    move-exception v0

    .line 778
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۫()Z

    .line 779
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 814
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 667
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 668
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
