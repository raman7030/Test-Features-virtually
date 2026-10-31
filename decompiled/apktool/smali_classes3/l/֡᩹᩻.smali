.class public Ll/֡᩹᩻;
.super Ll/᩹ܶۢ;
.source "M1ZN"


# static fields
.field public static final synthetic ᩶֫:I


# instance fields
.field public ֡֫:I

.field public ֨֫:J

.field public ۘ֫:Ljava/util/HashSet;

.field public ۚ֫:Ljava/lang/String;

.field public ۠֫:Ljava/util/HashSet;

.field public ܶ֫:Ll/᩸᩶᩻;

.field public ᩴ֫:Ljava/util/ArrayList;

.field public ᩵֫:Ll/֫ۤܳ;

.field public ᩸֫:Ljava/util/Collection;

.field public ᩹֫:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 126
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 127
    new-instance v0, Ll/֫ۤܳ;

    invoke-direct {v0}, Ll/֫ۤܳ;-><init>()V

    iput-object v0, p0, Ll/֡᩹᩻;->᩵֫:Ll/֫ۤܳ;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡᩹᩻;->ᩴ֫:Ljava/util/ArrayList;

    .line 129
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֡᩹᩻;->ۘ֫:Ljava/util/HashSet;

    .line 130
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/֡᩹᩻;->۠֫:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Z)Z
    .locals 4

    .line 262
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v2

    .line 264
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 265
    invoke-direct {p0, v3, p2}, Ll/֡᩹᩻;->֫(Ll/ܶ᩵ܿ;Z)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_4

    if-eqz p2, :cond_2

    .line 271
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 273
    :cond_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    move-result p1

    return p1

    .line 276
    :cond_3
    iget-object v0, p0, Ll/֡᩹᩻;->۠֫:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return v1

    :cond_5
    if-eqz p2, :cond_6

    .line 280
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 282
    :cond_6
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 418
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 419
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 420
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 422
    :cond_0
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 423
    iget-object p1, p0, Ll/֡᩹᩻;->ᩴ֫:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 424
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "zipPath"

    .line 145
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a23

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 140
    sget-object v0, Ll/᩻ܶۢ;->ᩳ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 32

    move-object/from16 v1, p0

    const-string v0, "zipPath"

    .line 157
    invoke-virtual {v1, v0}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v2, "ARG_PATHS"

    .line 141
    invoke-virtual {v1, v2}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const-string v3, "rename"

    .line 159
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Ll/֡᩹᩻;->ۚ֫:Ljava/lang/String;

    const-string v3, "level"

    .line 160
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v3

    const-string v4, "update"

    .line 161
    invoke-virtual {v1, v4}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v4

    const-string v5, "deleteSources"

    .line 162
    invoke-virtual {v1, v5}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "basePath"

    .line 163
    invoke-virtual {v1, v6}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 164
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->ۛ()Ll/ۨۧᩳ;

    move-result-object v7

    const-string v8, "keepApkSigBlock"

    .line 165
    invoke-virtual {v1, v8}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v8

    .line 167
    sget-object v9, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-static {v0, v9}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V

    .line 169
    new-instance v9, Ll/ᩴ᩹᩻;

    invoke-direct {v9, v1}, Ll/ᩴ᩹᩻;-><init>(Ll/֡᩹᩻;)V

    iget-object v10, v1, Ll/֡᩹᩻;->᩵֫:Ll/֫ۤܳ;

    const/4 v11, 0x0

    invoke-virtual {v10, v2, v11, v9}, Ll/֫ۤܳ;->֫([Ljava/lang/String;ZLl/ܰ۫ܳ;)V

    .line 185
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 186
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 187
    :cond_0
    new-instance v9, Ll/ᩳܰۡ;

    invoke-direct {v9, v0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    iput-object v9, v1, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    .line 188
    invoke-virtual {v9}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v9

    iput-object v9, v1, Ll/֡᩹᩻;->᩸֫:Ljava/util/Collection;

    if-eqz v7, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 189
    :goto_0
    invoke-static {v0, v9}, Ll/᩹᩶᩻;->֫(Ll/ܶ᩵ܿ;Z)Ll/᩸᩶᩻;

    move-result-object v9

    iput-object v9, v1, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    .line 190
    invoke-virtual {v9}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v9

    if-nez v7, :cond_2

    if-eqz v8, :cond_2

    .line 191
    iget-object v8, v1, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-virtual {v8}, Ll/ᩳܰۡ;->ܶ()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 192
    iget-object v8, v1, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-virtual {v9, v8}, Ll/ۡܰۡ;->֫(Ll/ᩳܰۡ;)V

    .line 194
    :cond_2
    iget-object v8, v1, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-virtual {v8}, Ll/ᩳܰۡ;->᩸()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 195
    invoke-virtual {v9}, Ll/ۡܰۡ;->ᩳ()V

    .line 197
    :cond_3
    invoke-static {v3, v9}, Ll/ۗ۠ܳ;->֫(ILl/ۡܰۡ;)Z

    move-result v3

    .line 198
    new-instance v8, Ll/ܶܶܽ;

    invoke-direct {v8}, Ll/ܶܶܽ;-><init>()V

    if-eqz v3, :cond_4

    .line 200
    iget-object v11, v1, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-virtual {v8, v11}, Ll/ܶܶܽ;->֫(Ll/ᩳܰۡ;)V

    .line 203
    :cond_4
    iget-object v11, v1, Ll/֡᩹᩻;->۠֫:Ljava/util/HashSet;

    if-eqz v5, :cond_5

    .line 205
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 288
    :cond_5
    iget-object v12, v1, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    invoke-virtual {v12}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v12

    if-nez v4, :cond_6

    const/4 v13, 0x0

    goto :goto_3

    .line 293
    :cond_6
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 294
    iget-object v14, v1, Ll/֡᩹᩻;->᩸֫:Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۗ᩺ۡ;

    .line 295
    invoke-virtual {v15}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v16

    if-nez v16, :cond_7

    move-object/from16 v16, v14

    .line 296
    invoke-virtual {v15}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    move-object/from16 v16, v14

    :goto_2
    move-object/from16 v14, v16

    goto :goto_1

    .line 314
    :cond_8
    :goto_3
    iget-object v14, v1, Ll/֡᩹᩻;->ۚ֫:Ljava/lang/String;

    .line 315
    iget-object v15, v10, Ll/֫ۤܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    move-object/from16 v17, v2

    iget-object v2, v1, Ll/֡᩹᩻;->ۘ֫:Ljava/util/HashSet;

    move/from16 v18, v5

    const-string v5, ")"

    move-object/from16 v19, v0

    const-string v0, "("

    move-object/from16 v20, v7

    const-string v7, "/"

    if-eqz v16, :cond_15

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v21, v15

    move-object/from16 v15, v16

    check-cast v15, Ll/۟۫ܳ;

    .line 316
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v16

    if-eqz v16, :cond_9

    goto/16 :goto_c

    .line 318
    :cond_9
    invoke-virtual {v10}, Ll/֫ۤܳ;->ܿ()V

    move-object/from16 v16, v9

    .line 320
    iget-object v9, v15, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    move-object/from16 v22, v2

    iget-object v2, v15, Ll/۟۫ܳ;->֫:Ll/ܶ᩵ܿ;

    move-object/from16 v23, v0

    iget-wide v0, v15, Ll/۟۫ܳ;->ۢ:J

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    iget-wide v10, v15, Ll/۟۫ܳ;->᩷:J

    .line 321
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v26

    move-object/from16 v27, v5

    const/16 v5, 0x2f

    if-nez v26, :cond_b

    .line 322
    invoke-virtual {v9, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    move-object/from16 v26, v8

    const/4 v8, -0x1

    if-ne v5, v8, :cond_a

    move-object v9, v14

    goto :goto_5

    .line 0
    :cond_a
    invoke-static {v14}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {v5, v9, v8}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_b
    move-object/from16 v26, v8

    .line 329
    :goto_5
    iget-boolean v5, v15, Ll/۟۫ܳ;->ᩳ:Z

    if-eqz v5, :cond_c

    .line 0
    invoke-static {v6, v9, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 331
    new-instance v7, Ll/ۗ᩺ۡ;

    invoke-direct {v7, v5}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 332
    invoke-virtual {v7, v0, v1}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 333
    invoke-virtual {v12, v7}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    move-object/from16 v8, v24

    move-object/from16 v15, v25

    move-object/from16 v28, v26

    move/from16 v24, v3

    move/from16 v25, v4

    move-object/from16 v26, v6

    move-object/from16 v4, p0

    goto/16 :goto_a

    .line 0
    :cond_c
    invoke-static {v6, v9}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_e

    .line 339
    invoke-static {v13}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۗ᩺ۡ;

    if-eqz v8, :cond_e

    const/4 v15, 0x1

    if-ne v4, v15, :cond_d

    .line 342
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v28

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v30

    cmp-long v8, v28, v30

    if-ltz v8, :cond_e

    move-object/from16 v8, v24

    .line 343
    invoke-virtual {v8, v10, v11}, Ll/֫ۤܳ;->֫(J)V

    move-object/from16 v15, v25

    .line 344
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    move-object/from16 v8, v24

    move-object/from16 v15, v25

    .line 348
    invoke-virtual {v8, v10, v11}, Ll/֫ۤܳ;->֫(J)V

    .line 349
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_6
    move-object/from16 v1, p0

    move-object v10, v8

    move-object v11, v15

    move-object/from16 v9, v16

    move-object/from16 v2, v17

    move/from16 v5, v18

    move-object/from16 v0, v19

    move-object/from16 v7, v20

    move-object/from16 v15, v21

    move-object/from16 v8, v26

    goto/16 :goto_4

    :cond_e
    move-object/from16 v8, v24

    move-object/from16 v15, v25

    move/from16 v24, v3

    move/from16 v25, v4

    if-eqz v3, :cond_f

    move-object/from16 v3, v26

    .line 355
    invoke-static {v5, v3}, Ll/᩸ܶܽ;->֫(Ljava/lang/String;Ll/ܶܶܽ;)I

    move-result v4

    invoke-virtual {v12, v4}, Ll/ۡܰۡ;->ۧ(I)V

    goto :goto_7

    :cond_f
    move-object/from16 v3, v26

    .line 356
    :goto_7
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v26, 0x7f120032

    move-object/from16 v28, v3

    invoke-static/range {v26 .. v26}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v23

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ll/֫ۤܳ;->֫()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ll/֫ۤܳ;->ܽ()I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v3, v27

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-virtual {v4, v3}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 357
    invoke-virtual {v4, v5}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 358
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v3

    .line 359
    :try_start_0
    new-instance v7, Ll/ۗ᩺ۡ;

    invoke-direct {v7, v5}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    .line 360
    invoke-virtual {v7, v10, v11}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    .line 361
    invoke-virtual {v7, v0, v1}, Ll/ۗ᩺ۡ;->setTime(J)V

    .line 250
    invoke-virtual {v12, v7}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    const-wide/16 v26, 0x0

    .line 254
    :goto_8
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_11

    move-object/from16 v23, v5

    const/4 v5, 0x0

    .line 255
    invoke-virtual {v12, v0, v5, v1}, Ll/ۡܰۡ;->write([BII)V

    move-object v5, v0

    int-to-long v0, v1

    add-long v0, v26, v0

    move-object/from16 v27, v5

    move-object/from16 v26, v6

    .line 257
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v5

    .line 304
    invoke-virtual {v4, v0, v1, v5, v6}, Ll/᩹ܶۢ;->ܽ(JJ)V

    .line 305
    invoke-virtual {v8}, Ll/֫ۤܳ;->ۧ()J

    move-result-wide v5

    add-long/2addr v5, v0

    move-wide/from16 v29, v0

    invoke-virtual {v8}, Ll/֫ۤܳ;->ᩳ()J

    move-result-wide v0

    invoke-virtual {v4, v5, v6, v0, v1}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_9

    :cond_10
    move-object/from16 v5, v23

    move-object/from16 v6, v26

    move-object/from16 v0, v27

    move-wide/from16 v26, v29

    goto :goto_8

    :cond_11
    move-object/from16 v23, v5

    move-object/from16 v26, v6

    .line 261
    invoke-virtual {v12}, Ll/ۡܰۡ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    :goto_9
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 364
    invoke-virtual {v8, v10, v11}, Ll/֫ۤܳ;->֫(J)V

    move-object/from16 v5, v23

    :goto_a
    move-object/from16 v0, v22

    .line 366
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 367
    invoke-virtual {v15, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    .line 369
    iget v0, v4, Ll/֡᩹᩻;->֡֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Ll/֡᩹᩻;->֡֫:I

    :cond_12
    const/16 v0, 0x2f

    .line 371
    invoke-virtual {v9, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_13

    .line 372
    iget-object v0, v4, Ll/֡᩹᩻;->ᩴ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    move-object v1, v4

    move-object v10, v8

    move-object v11, v15

    move-object/from16 v9, v16

    move-object/from16 v2, v17

    move/from16 v5, v18

    move-object/from16 v0, v19

    move-object/from16 v7, v20

    move-object/from16 v15, v21

    move/from16 v3, v24

    move/from16 v4, v25

    move-object/from16 v6, v26

    move-object/from16 v8, v28

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v3, :cond_14

    .line 358
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_14
    :goto_b
    throw v1

    :cond_15
    :goto_c
    move-object v3, v0

    move-object v4, v1

    move-object v0, v2

    move-object v1, v5

    move-object/from16 v16, v9

    .line 210
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 211
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 378
    :cond_16
    iget-object v2, v4, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    invoke-virtual {v2}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object v2

    .line 379
    iget-object v5, v4, Ll/֡᩹᩻;->᩸֫:Ljava/util/Collection;

    invoke-static {v5}, Ll/᩹᩶᩻;->֫(Ljava/util/Collection;)J

    move-result-wide v5

    .line 381
    new-instance v8, Ll/᩵᩹᩻;

    invoke-direct {v8, v4, v5, v6}, Ll/᩵᩹᩻;-><init>(Ll/֡᩹᩻;J)V

    .line 394
    iget-object v5, v4, Ll/֡᩹᩻;->᩸֫:Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_17
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ᩺ۡ;

    .line 395
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v10

    if-eqz v10, :cond_18

    goto :goto_e

    :cond_18
    add-int/lit8 v6, v6, 0x1

    .line 398
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    .line 399
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v10

    if-nez v10, :cond_17

    .line 400
    iget-wide v10, v4, Ll/֡᩹᩻;->֨֫:J

    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v12

    add-long/2addr v12, v10

    iput-wide v12, v4, Ll/֡᩹᩻;->֨֫:J

    goto :goto_d

    .line 404
    :cond_19
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const v11, 0x7f120ac0

    invoke-static {v11}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v4, Ll/֡᩹᩻;->᩸֫:Ljava/util/Collection;

    .line 405
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 404
    invoke-virtual {v4, v10}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 406
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 407
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v10

    if-eqz v10, :cond_1a

    .line 408
    invoke-virtual {v2, v9}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    goto :goto_d

    .line 410
    :cond_1a
    iget-object v10, v4, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-static {v9, v10, v2, v8}, Ll/᩹᩶᩻;->֫(Ll/ۗ᩺ۡ;Ll/ᩳܰۡ;Ll/ۡܰۡ;Ll/۠᩶᩻;)V

    .line 411
    iget-wide v10, v4, Ll/֡᩹᩻;->֨֫:J

    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v12

    add-long/2addr v12, v10

    iput-wide v12, v4, Ll/֡᩹᩻;->֨֫:J

    goto :goto_d

    .line 215
    :cond_1b
    :goto_e
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 216
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 219
    :cond_1c
    invoke-virtual/range {v16 .. v16}, Ll/ۡܰۡ;->close()V

    if-eqz v20, :cond_1d

    .line 221
    iget-object v0, v4, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    move-object/from16 v1, v20

    invoke-static {v0, v1, v4}, Ll/ۤۗܳ;->֫(Ll/᩸᩶᩻;Ll/ۨۧᩳ;Ll/ۘ۠ۢ;)V

    .line 223
    :cond_1d
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 224
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 226
    :cond_1e
    invoke-static/range {v19 .. v19}, Ll/ᩴܶۡ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 227
    new-instance v0, Ll/ܿ᩵ܿ;

    invoke-direct {v0}, Ll/ܿ᩵ܿ;-><init>()V

    move-object/from16 v1, v19

    .line 228
    invoke-virtual {v0, v1}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 230
    iget-object v2, v4, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    new-instance v3, Ll/ۨ֨ܿ;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v1, v5}, Ll/ۨ֨ܿ;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;I)V

    iget-object v6, v4, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    new-array v7, v5, [Ljava/lang/AutoCloseable;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    invoke-virtual {v2, v1, v3, v7}, Ll/᩸᩶᩻;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;[Ljava/lang/AutoCloseable;)V

    .line 234
    invoke-virtual {v0, v1}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    if-eqz v18, :cond_23

    .line 237
    iget v0, v4, Ll/֡᩹᩻;->֡֫:I

    if-le v0, v5, :cond_1f

    const/4 v0, 0x1

    goto :goto_f

    :cond_1f
    const/4 v0, 0x0

    :goto_f
    if-eqz v0, :cond_20

    const v1, 0x7f12087d

    .line 239
    invoke-virtual {v4, v1}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 240
    invoke-virtual {v4, v8}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 241
    invoke-virtual {v4, v8}, Ll/᩹ܶۢ;->ܺ(I)V

    :cond_20
    move-object/from16 v1, v17

    .line 243
    array-length v2, v1

    const/4 v3, 0x0

    :goto_10
    if-ge v3, v2, :cond_23

    aget-object v5, v1, v3

    new-array v6, v8, [Ljava/lang/String;

    .line 244
    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 245
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v7

    invoke-static {v7}, Ll/ܽۤܳ;->֫(Z)Ll/ܽۤܳ;

    move-result-object v7

    if-eqz v0, :cond_21

    .line 246
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v9

    if-eqz v9, :cond_21

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v9

    if-nez v9, :cond_21

    .line 247
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 249
    :cond_21
    invoke-direct {v4, v6, v0}, Ll/֡᩹᩻;->֫(Ll/ܶ᩵ܿ;Z)Z

    move-result v6

    if-eqz v6, :cond_22

    .line 250
    invoke-virtual {v7, v5}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V

    :cond_22
    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    .line 255
    :cond_23
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 431
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    if-eqz p1, :cond_0

    .line 432
    invoke-virtual {p1}, Ll/᩸᩶᩻;->ۧ()Ll/ۡܰۡ;

    move-result-object p1

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 433
    iget-object p1, p0, Ll/֡᩹᩻;->ܶ֫:Ll/᩸᩶᩻;

    invoke-virtual {p1}, Ll/᩸᩶᩻;->֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 435
    :cond_0
    iget-object p1, p0, Ll/֡᩹᩻;->᩹֫:Ll/ᩳܰۡ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 436
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 150
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 151
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
