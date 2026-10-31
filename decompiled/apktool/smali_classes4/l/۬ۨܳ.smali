.class public Ll/۬ۨܳ;
.super Ll/᩹ܶۢ;
.source "E29Y"


# instance fields
.field public ۘ֫:Ljava/util/ArrayList;

.field public ᩴ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 941
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    const-string v0, "null"

    .line 942
    iput-object v0, p0, Ll/۬ۨܳ;->ᩴ֫:Ljava/lang/String;

    .line 943
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬ۨܳ;->ۘ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 6

    const-string p1, "compressToAnother"

    .line 1051
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1052
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    :goto_0
    move v2, p1

    .line 1053
    iget-object p1, p0, Ll/۬ۨܳ;->ۘ֫:Ljava/util/ArrayList;

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

    .line 952
    iget-object v0, p0, Ll/۬ۨܳ;->ᩴ֫:Ljava/lang/String;

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

    .line 947
    sget-object v0, Ll/᩻ܶۢ;->ۚ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 25

    move-object/from16 v9, p0

    const-string v0, "outputDir"

    .line 964
    invoke-virtual {v9, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "ARG_PATHS"

    .line 141
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    const-string v1, "password"

    .line 966
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "level"

    .line 967
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v12

    const-string v1, "headerEncryption"

    .line 968
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v13

    const-string v1, "deleteSources"

    .line 969
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v14

    const-string v1, "splitSize"

    .line 970
    invoke-virtual {v9, v1}, Ll/ۘ۠ۢ;->ۖ(Ljava/lang/String;)J

    move-result-wide v15

    .line 973
    array-length v8, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v7, v9, Ll/۬ۨܳ;->ۘ֫:Ljava/util/ArrayList;

    if-ge v1, v8, :cond_3

    .line 974
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f1201df

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    int-to-long v3, v6

    move/from16 v17, v6

    int-to-long v5, v8

    .line 975
    invoke-virtual {v9, v3, v4, v5, v6}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 977
    aget-object v3, v10, v1

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 978
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v3

    .line 979
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".7z"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const/4 v4, 0x1

    .line 1147
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 980
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v9, Ll/۬ۨܳ;->ᩴ֫:Ljava/lang/String;

    .line 982
    aget-object v1, v10, v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v9, v1, v3}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Z)Ll/֫ۤܳ;

    move-result-object v6

    .line 983
    invoke-virtual {v6}, Ll/֫ۤܳ;->ܽ()I

    move-result v1

    add-int v18, v1, v2

    .line 984
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 985
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 986
    :cond_1
    new-instance v3, Ll/᩹ܳᩳ;

    invoke-direct {v3}, Ll/᩹ܳᩳ;-><init>()V

    .line 987
    iget-object v1, v6, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v3, Ll/᩹ܳᩳ;->᩹:I

    .line 988
    iput v12, v3, Ll/᩹ܳᩳ;->᩶:I

    .line 989
    iput-boolean v13, v3, Ll/᩹ܳᩳ;->᩸:Z

    .line 990
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 992
    :try_start_0
    new-instance v2, Ll/ۗۨܳ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v1, v2

    move-object/from16 v19, v0

    move-object v0, v2

    move-object/from16 v2, p0

    move-object/from16 v21, v4

    move/from16 v20, v12

    move-object v12, v3

    move-wide v3, v15

    move-object/from16 v22, v6

    move-object/from16 v6, v21

    move/from16 v23, v13

    move-object v13, v7

    move-object v7, v11

    move/from16 v24, v8

    move-object/from16 v8, v22

    :try_start_1
    invoke-direct/range {v1 .. v8}, Ll/ۗۨܳ;-><init>(Ll/۬ۨܳ;JLl/ܶ᩵ܿ;Ljava/util/ArrayList;Ljava/lang/String;Ll/֫ۤܳ;)V

    invoke-static {v12, v0}, Ll/۬ܳᩳ;->֫(Ll/᩹ܳᩳ;Ll/ۙܳᩳ;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1037
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1038
    invoke-static/range {v21 .. v21}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 1039
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_2
    move-object/from16 v1, v21

    .line 1041
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move/from16 v1, v17

    move/from16 v2, v18

    move-object/from16 v0, v19

    move/from16 v12, v20

    move/from16 v13, v23

    move/from16 v8, v24

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object/from16 v1, v21

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, v4

    .line 1034
    :goto_2
    invoke-static {v1}, Ll/᩻᩺ܳ;->֫(Ljava/util/ArrayList;)V

    .line 1035
    throw v0

    :cond_3
    move-object v13, v7

    .line 1043
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz v14, :cond_4

    .line 1044
    invoke-static {v9, v10, v13, v2}, Ll/᩻᩺ܳ;->֫(Ll/ۘ۠ۢ;[Ljava/lang/String;Ljava/util/List;I)V

    .line 1046
    :cond_4
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 1058
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 957
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 958
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
