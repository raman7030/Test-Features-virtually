.class public final Ll/᩻᩶᩻;
.super Ll/֫ۜܳ;
.source "J1YX"


# direct methods
.method public static ֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ll/ۨۧᩳ;Z)V
    .locals 2

    .line 295
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 296
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 297
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 298
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩳ᩶᩻;

    .line 299
    invoke-static {p3}, Ll/ᩳ᩶᩻;->ᩳ(Ll/ᩳ᩶᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 300
    invoke-static {p3}, Ll/ᩳ᩶᩻;->ܽ(Ll/ᩳ᩶᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 302
    invoke-static {p3}, Ll/ᩳ᩶᩻;->֫(Ll/ᩳ᩶᩻;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    int-to-byte v1, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 305
    :goto_1
    invoke-static {p3}, Ll/ᩳ᩶᩻;->ۧ(Ll/ᩳ᩶᩻;)Z

    move-result p3

    if-eqz p3, :cond_1

    or-int/lit8 p3, v1, 0x2

    int-to-byte v1, p3

    .line 308
    :cond_1
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_0

    .line 310
    :cond_2
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 311
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 312
    invoke-virtual {v0, p3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_2

    .line 314
    :cond_3
    sget p2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance p2, Ll/֨۠ۢ;

    const-class p3, Ll/ܳ᩶᩻;

    invoke-direct {p2, p3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    const-string p3, "zipPath"

    .line 315
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "data"

    .line 316
    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    .line 317
    invoke-virtual {p2, p0}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 318
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {p2, p0, p5}, Ll/֨۠ۢ;->֫(Lbin/mt/plus/Main;Ll/ۨۧᩳ;)V

    const-string p0, "keepApkSigBlock"

    .line 319
    invoke-virtual {p2, p0, p6}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 320
    invoke-virtual {p2}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ll/ۨۧᩳ;Z)V
    .locals 7

    .line 0
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    invoke-static/range {v0 .. v6}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩻᩶᩻;Ll/۬ۗܿ;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۨۧᩳ;Z)V
    .locals 7

    .line 259
    invoke-virtual {p1}, Ll/۬ۗܿ;->ۧ()V

    const-string v2, ""

    move-object v0, p2

    move-object v1, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    .line 260
    invoke-static/range {v0 .. v6}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public static ֫(Ll/᩻᩶᩻;[Landroid/widget/RadioButton;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLbin/mt/plus/Main;Ljava/lang/String;Ll/۬ۗܿ;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;)V
    .locals 12

    move-object v0, p1

    move-object v1, p3

    move-object/from16 v2, p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 224
    :goto_0
    array-length v5, v0

    if-ge v4, v5, :cond_1

    .line 225
    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    move v0, p2

    if-eq v0, v4, :cond_2

    .line 231
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v5, "rcoz"

    int-to-byte v6, v4

    invoke-interface {v0, v6, v5}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 234
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 235
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x1

    if-eqz v4, :cond_8

    if-eq v4, v5, :cond_7

    const/4 v6, 0x2

    if-eq v4, v6, :cond_3

    goto/16 :goto_5

    .line 278
    :cond_3
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 279
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 280
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    const-string v6, ".bak"

    .line 282
    invoke-virtual {p3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 283
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    const/4 v6, 0x1

    .line 287
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " ("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ").bak"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 288
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    move-object v6, v7

    .line 252
    :goto_4
    new-instance v4, Ll/ᩳ᩶᩻;

    invoke-direct {v4, p3, v6, v3, v3}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    new-instance v4, Ll/ᩳ᩶᩻;

    invoke-direct {v4, v2, p3, v3, v5}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 246
    :cond_7
    invoke-virtual {v11, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    new-instance v4, Ll/ᩳ᩶᩻;

    invoke-direct {v4, v2, p3, v3, v5}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 241
    :cond_8
    new-instance v4, Ll/ᩳ᩶᩻;

    invoke-direct {v4, p3, v2, v3, v3}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    new-instance v4, Ll/ᩳ᩶᩻;

    invoke-direct {v4, v2, p3, v3, v5}, Ll/ᩳ᩶᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    if-eqz p6, :cond_9

    .line 258
    new-instance v1, Ll/᩺᩹᩻;

    move-object v5, v1

    move-object v6, p0

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object v10, v0

    invoke-direct/range {v5 .. v11}, Ll/᩺᩹᩻;-><init>(Ll/᩻᩶᩻;Ll/۬ۗܿ;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    move-object/from16 v0, p7

    move-object/from16 v2, p8

    invoke-static {v1, v0, v2}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 263
    :cond_9
    invoke-virtual/range {p9 .. p9}, Ll/۬ۗܿ;->ۧ()V

    const/4 v1, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    move-object/from16 p0, p10

    move-object/from16 p1, p11

    move-object p2, v2

    move-object p3, v0

    move-object/from16 p4, v11

    move-object/from16 p5, v1

    move/from16 p6, v3

    .line 264
    invoke-static/range {p0 .. p6}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 17

    const-string v0, "zip"

    move-object/from16 v12, p1

    .line 79
    invoke-virtual {v12, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 80
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۧۗ᩻;

    .line 81
    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v13, 0x0

    new-array v2, v13, [Ljava/lang/String;

    .line 82
    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 84
    invoke-virtual {v0}, Ll/ۧۗ᩻;->᩷֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f120ab4

    .line 85
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 89
    :cond_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v0

    const/4 v14, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 90
    :cond_1
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v0

    if-nez v0, :cond_2

    .line 91
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    new-array v2, v14, [Ljava/lang/Object;

    aput-object v1, v2, v13

    const v1, 0x7f120b8d

    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 516
    invoke-virtual {v0, v1, v13}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 95
    :cond_2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, v14, :cond_6

    .line 103
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۧۗ᩻;

    .line 104
    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v2

    new-array v3, v13, [Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v10

    .line 105
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v5

    .line 106
    invoke-interface {v5}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v11

    .line 107
    invoke-virtual {v0}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v15

    if-eqz v15, :cond_3

    .line 108
    invoke-static {v10}, Ll/᩹ۨۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    move-object v9, v1

    .line 111
    invoke-interface {v5}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 113
    invoke-interface {v5}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v7, v1, -0x1

    if-eqz v11, :cond_4

    .line 115
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    :goto_1
    move v6, v1

    goto :goto_2

    .line 117
    :cond_4
    invoke-interface {v5}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    add-int/2addr v1, v7

    goto :goto_1

    .line 121
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    goto :goto_1

    .line 123
    :goto_2
    invoke-virtual {v0}, Ll/ۧۗ᩻;->᩶()Ll/᩵ۙ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۙ᩻;->᩶ۧ()Ljava/util/List;

    move-result-object v0

    .line 124
    new-instance v4, Ll/۟᩹᩻;

    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v3

    move-object v1, v4

    move-object/from16 v2, p0

    move-object v13, v4

    move-object v4, v8

    move v14, v6

    move-object v6, v0

    move v0, v7

    move-object/from16 v7, p1

    move-object v12, v8

    move v8, v15

    move-object/from16 v16, v9

    invoke-direct/range {v1 .. v11}, Ll/۟᩹᩻;-><init>(Ll/᩻᩶᩻;Lbin/mt/plus/Main;Ljava/lang/String;Ll/ᩳۜܳ;Ljava/util/List;Ll/ۖۢܳ;ZLjava/lang/String;Ll/ܶ᩵ܿ;Z)V

    const v1, 0x7f1205f9

    .line 167
    invoke-virtual {v13, v1}, Ll/۬ۗܿ;->ۡ(I)V

    .line 168
    invoke-virtual {v13, v12}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x6

    .line 169
    invoke-virtual {v13, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 170
    invoke-virtual {v13}, Ll/۬ۗܿ;->֫()V

    .line 171
    invoke-virtual {v13, v0, v14}, Ll/۬ۗܿ;->֫(II)V

    .line 318
    new-instance v0, Ll/۠ۘ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v13}, Ll/۠ۘ᩷;-><init>(ILjava/lang/Object;)V

    new-instance v1, Ll/᩻۟ܳ;

    invoke-direct {v1, v13}, Ll/᩻۟ܳ;-><init>(Ll/۬ۗܿ;)V

    const v2, 0x104000b

    invoke-virtual {v13, v2, v0, v1}, Ll/۬ۗܿ;->֫(ILandroid/view/View$OnClickListener;Ll/᩻۟ܳ;)V

    const/4 v0, 0x1

    .line 205
    invoke-virtual {v13, v0}, Ll/۬ۗܿ;->ۧ(Z)V

    if-eqz v15, :cond_8

    .line 175
    invoke-virtual {v13}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    .line 176
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/high16 v2, 0x40800000    # 4.0f

    .line 177
    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    .line 393
    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const v2, 0x7f0d01d0

    .line 394
    invoke-virtual {v1, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    .line 395
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v16

    .line 396
    invoke-static {v1, v2, v0}, Ll/ۤۗܳ;->֫(Ll/ۗܺ᩷;Landroid/widget/CompoundButton;Ljava/lang/String;)V

    .line 179
    invoke-virtual {v13}, Ll/۬ۗܿ;->ᩳ()Ll/֡ۚۢ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void

    .line 98
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 324
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v7

    .line 325
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll/ۧۗ᩻;

    .line 326
    invoke-virtual {v8}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v11

    .line 327
    invoke-virtual {v8}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 328
    invoke-static {v11}, Ll/᩹ۨۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v1

    :cond_7
    move-object v12, v1

    .line 329
    new-instance v13, Ll/ܽ᩶᩻;

    move-object v1, v13

    move-object/from16 v2, p0

    move-object v3, v7

    move-object v4, v6

    move-object/from16 v5, p1

    move v9, v0

    move-object v10, v12

    invoke-direct/range {v1 .. v11}, Ll/ܽ᩶᩻;-><init>(Ll/᩻᩶᩻;Lbin/mt/plus/Main;Ljava/util/ArrayList;Ll/ۖۢܳ;Ljava/util/ArrayList;Lbin/mt/plus/Main;Ll/ۧۗ᩻;ZLjava/lang/String;Ll/ܶ᩵ܿ;)V

    .line 401
    invoke-virtual {v13}, Ll/ۚ۠ܳ;->ۡ()V

    if-eqz v0, :cond_8

    .line 403
    invoke-virtual/range {p1 .. p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v13}, Ll/ۚ۠ܳ;->ۧ()Ll/ۗۘ;

    move-result-object v1

    invoke-static {v0, v1, v12}, Ll/ۤۗܳ;->֫(Ll/ۗܺ᩷;Landroid/widget/CompoundButton;Ljava/lang/String;)V

    .line 404
    invoke-virtual {v13}, Ll/ۚ۠ܳ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    :cond_8
    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "zip"

    .line 74
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
