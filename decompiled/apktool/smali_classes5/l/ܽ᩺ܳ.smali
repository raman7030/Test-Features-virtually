.class public Ll/ܽ᩺ܳ;
.super Ll/᩹ܶۢ;
.source "E29Y"


# instance fields
.field public ۘ֫:Ljava/util/ArrayList;

.field public ᩴ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 818
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    const-string v0, "null"

    .line 819
    iput-object v0, p0, Ll/ܽ᩺ܳ;->ᩴ֫:Ljava/lang/String;

    .line 820
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽ᩺ܳ;->ۘ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 6

    const-string p1, "compressToAnother"

    .line 930
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 931
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    :goto_0
    move v2, p1

    .line 932
    iget-object p1, p0, Ll/ܽ᩺ܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/᩻᩺ܳ;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    move-object v0, p4

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v0 .. v5}, Ll/᩻᩺ܳ;->֫(Ll/ܿ۠ۢ;ZZLl/ܽۢܳ;Ll/ܽۢܳ;Ljava/util/List;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    .line 829
    iget-object v0, p0, Ll/ܽ᩺ܳ;->ᩴ֫:Ljava/lang/String;

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

    .line 824
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 23

    move-object/from16 v1, p0

    const-string v0, "/"

    const-string v2, "outputDir"

    .line 841
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    const-string v3, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const-string v4, "password"

    .line 843
    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "level"

    .line 844
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v5

    const-string v6, "deleteSources"

    .line 845
    invoke-virtual {v1, v6}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v6

    .line 846
    new-instance v7, Ll/ܳ᩺ܳ;

    const/4 v8, 0x0

    invoke-direct {v7, v1, v3, v8}, Ll/ܳ᩺ܳ;-><init>(Ll/᩹ܶۢ;[Ljava/lang/String;Z)V

    .line 847
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 848
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 850
    :cond_0
    array-length v9, v3

    const/4 v10, 0x0

    :goto_0
    iget-object v11, v1, Ll/ܽ᩺ܳ;->ۘ֫:Ljava/util/ArrayList;

    if-ge v10, v9, :cond_b

    .line 851
    aget-object v12, v3, v10

    new-array v8, v8, [Ljava/lang/String;

    invoke-static {v12, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v8

    .line 852
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v8

    .line 853
    :goto_1
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".zip"

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v8

    const/4 v12, 0x1

    .line 1147
    invoke-virtual {v8, v12}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v8

    .line 854
    invoke-virtual {v8}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v12

    iput-object v12, v1, Ll/ܽ᩺ܳ;->ᩴ֫:Ljava/lang/String;

    .line 856
    invoke-virtual {v7, v10}, Ll/ܳ᩺ܳ;->֫(I)Ll/֫ۤܳ;

    move-result-object v12

    .line 858
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 859
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    :try_start_0
    new-instance v14, Ll/ۡܰۡ;

    invoke-direct {v14, v8}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 861
    :try_start_1
    invoke-virtual {v14, v4}, Ll/ۡܰۡ;->ᩳ(Ljava/lang/String;)V

    .line 862
    invoke-static {v5, v14}, Ll/᩷֨ܳ;->֫(ILl/ۡܰۡ;)Z

    move-result v8

    .line 863
    new-instance v15, Ll/ܶܶܽ;

    invoke-direct {v15}, Ll/ܶܶܽ;-><init>()V

    if-eqz v8, :cond_4

    move-object/from16 v16, v2

    .line 865
    iget-object v2, v12, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v2

    move-object/from16 v2, v17

    check-cast v2, Ll/۟۫ܳ;

    move-object/from16 v17, v4

    .line 866
    iget-boolean v4, v2, Ll/۟۫ܳ;->ᩳ:Z

    if-nez v4, :cond_2

    iget-object v4, v2, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    move/from16 v19, v5

    const-string v5, "AndroidManifest.xml"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 867
    iget-object v2, v2, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    :try_start_2
    invoke-static {v2}, Ll/ܶۨۡ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶۨۡ;

    move-result-object v2

    .line 200
    invoke-static {v2}, Ll/᩹ۨۡ;->ܳ(Ll/ܶۨۡ;)Z

    move-result v4

    iput-boolean v4, v15, Ll/ܶܶܽ;->ܽ:Z

    .line 201
    invoke-static {v2}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result v2

    iput-boolean v2, v15, Ll/ܶܶܽ;->ۧ:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catch_0
    const/4 v2, 0x0

    .line 203
    :try_start_3
    iput-boolean v2, v15, Ll/ܶܶܽ;->ܽ:Z

    .line 204
    iput-boolean v2, v15, Ll/ܶܶܽ;->ۧ:Z

    goto :goto_3

    :cond_2
    move/from16 v19, v5

    :cond_3
    move-object/from16 v4, v17

    move-object/from16 v2, v18

    move/from16 v5, v19

    goto :goto_2

    :cond_4
    move-object/from16 v16, v2

    :cond_5
    move-object/from16 v17, v4

    move/from16 v19, v5

    .line 875
    :goto_3
    iget-object v2, v12, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟۫ܳ;

    .line 876
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_7

    .line 878
    :cond_6
    invoke-virtual {v7}, Ll/ܳ᩺ܳ;->ܿ()V

    .line 879
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const v12, 0x7f1201df

    invoke-static {v12}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "("

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/ܳ᩺ܳ;->֫()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/ܳ᩺ܳ;->ܽ()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ")"

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 881
    iget-boolean v5, v4, Ll/۟۫ܳ;->ᩳ:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v18, v2

    move-object v12, v3

    iget-wide v2, v4, Ll/۟۫ܳ;->ۢ:J

    move/from16 v20, v9

    iget-object v9, v4, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    if-eqz v5, :cond_7

    .line 882
    :try_start_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 883
    new-instance v5, Ll/ۗ᩺ۡ;

    invoke-direct {v5, v4}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 884
    invoke-virtual {v5, v2, v3}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 885
    invoke-virtual {v14, v5}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    move-object/from16 v21, v0

    move/from16 v22, v8

    goto :goto_6

    .line 889
    :cond_7
    iget-object v5, v4, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    if-eqz v8, :cond_8

    move-object/from16 v21, v0

    .line 891
    invoke-static {v9, v15}, Ll/᩸ܶܽ;->֫(Ljava/lang/String;Ll/ܶܶܽ;)I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ۡܰۡ;->ۧ(I)V

    goto :goto_5

    :cond_8
    move-object/from16 v21, v0

    .line 893
    :goto_5
    invoke-virtual {v1, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 894
    new-instance v0, Ll/ۗ᩺ۡ;

    invoke-direct {v0, v9}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    move/from16 v22, v8

    .line 895
    iget-wide v8, v4, Ll/۟۫ܳ;->᩷:J

    invoke-virtual {v0, v8, v9}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 896
    invoke-virtual {v0, v2, v3}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 897
    invoke-virtual {v14, v0}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 898
    invoke-virtual {v14}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v0

    new-instance v2, Ll/ۧ᩺ܳ;

    invoke-direct {v2, v1, v7}, Ll/ۧ᩺ܳ;-><init>(Ll/ܽ᩺ܳ;Ll/ܳ᩺ܳ;)V

    invoke-virtual {v5, v0, v2}, Ll/ܶ᩵ܿ;->֫(Ljava/io/OutputStream;Ll/֨᩸ܿ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_6
    move-object v3, v12

    move-object/from16 v2, v18

    move/from16 v9, v20

    move-object/from16 v0, v21

    move/from16 v8, v22

    goto/16 :goto_4

    :cond_9
    :goto_7
    move-object/from16 v21, v0

    move-object v12, v3

    move/from16 v20, v9

    .line 912
    :try_start_5
    invoke-virtual {v14}, Ll/ۡܰۡ;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 916
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 917
    invoke-static {v13}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 918
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 920
    :cond_a
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v10, v10, 0x1

    const/4 v8, 0x0

    move-object v3, v12

    move-object/from16 v2, v16

    move-object/from16 v4, v17

    move/from16 v5, v19

    move/from16 v9, v20

    move-object/from16 v0, v21

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 860
    :try_start_6
    invoke-virtual {v14}, Ll/ۡܰۡ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_7
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :catch_1
    move-exception v0

    .line 913
    invoke-static {v13}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 914
    throw v0

    :cond_b
    move-object v12, v3

    .line 922
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_c

    if-eqz v6, :cond_c

    .line 923
    invoke-virtual {v7}, Ll/ܳ᩺ܳ;->ܽ()I

    move-result v0

    invoke-static {v1, v12, v11, v0}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V

    .line 925
    :cond_c
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 937
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 834
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 835
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
